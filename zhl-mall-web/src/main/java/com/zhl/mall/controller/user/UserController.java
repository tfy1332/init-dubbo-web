package com.zhl.mall.controller.user;

import com.zhl.mall.tools.LogUtil;
import com.zhl.mall.user.model.User;
import com.zhl.mall.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 *用户控制器
 * by tanfy 2016-07-05
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private LogUtil _logger = new LogUtil(UserController.class);
    @Autowired
    private IUserService userService;
    private final String  prefix="/user";
    @RequestMapping("/register")
    public String toRegister(){
        return prefix+"/register";
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute User user, final HttpServletRequest request){
        try {
            userService.save(user);
        } catch (Exception e) {
            _logger.info("==saveUser===保存用户信息出错:"+e.getMessage());
        }
        return prefix+"/list";
    }
    @RequestMapping("/toMain")
    public String toMain(){
        return prefix+"/dataMain";
    }




}
