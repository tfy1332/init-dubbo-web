package com.zhl.mall.tools;

import org.apache.log4j.Logger;

/**
 * 记录日志工具类
 * @author tanfy 2016-07-06
 *
 */
public class LogUtil {
	private Logger _log = null;
	
	public LogUtil(Class<?> clazz){
		_log = Logger.getLogger(clazz);
	}
	  
    public void debug(String message) {  
        if (_log.isDebugEnabled()) {  
        	_log.debug(message);  
        }  
    }  
    public void info( String message) {  
        if (_log.isInfoEnabled()) {  
        	_log.info(message);  
        }  
    }  
    public void error( String message) {  
        _log.error(message);  
    } 
}
