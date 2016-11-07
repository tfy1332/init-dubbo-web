package com.zhl.mall.user;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.container.Container;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProvider {
	public static final String CONTAINER_KEY = "dubbo.container";
    public static final String SHUTDOWN_HOOK_KEY = "dubbo.shutdown.hook";
    public static final String APP_NAME = "mall-data-provider";
    private static final Logger logger = LoggerFactory.getLogger(UserProvider.class);
    private static final ExtensionLoader<Container> loader = ExtensionLoader.getExtensionLoader(Container.class);
    private static volatile boolean running = true;
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
    				new String[] {"applicationContext.xml"});
        	context.start();
        	logger.info("Dubbo " + APP_NAME + "!");
            System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date()) + " Dubbo " + APP_NAME + " started!");
        } catch (RuntimeException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            System.exit(1);
        }
        synchronized (UserProvider.class) {
            while (running) {
                try {
                	UserProvider.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }
}
