package com.zhl.mall.user.service.impl;

import com.zhl.mall.user.dao.IUserDao;
import com.zhl.mall.user.model.User;
import com.zhl.mall.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户Service 实现
 * by tanfy 2016-07-06
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public User getById(String id) throws Exception {
		return userDao.selectById(id);
	}

	public List<User> listAll() throws Exception {
		return userDao.selectAll();
	}

	public void remove(User user) throws Exception {
		userDao.delete(user);
	}

	public User save(User user) throws Exception {
		return userDao.insert(user);
	}


}
