package com.zhl.mall.user.service;


import com.zhl.mall.user.model.User;

import java.util.List;

/**
 * 用户 Service
 * by tanfy 2016-07-06
 */
public interface IUserService {

	/**
	 * 通过主键ID值获取User对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	User getById(String id) throws Exception;
	/**
	 * 保存一个user对象
	 * @param user
	 * @return User
	 * @throws Exception
	 */
	User save(User user) throws Exception;
	/**
	 * 删除一个user对象
	 * @param user
	 * @return
	 * @throws Exception
	 */
	void remove(User user) throws Exception;
	/**
	 * 获取全部的User列表
	 * @param
	 * @return List<User>
	 * @throws Exception
	 */
	List<User> listAll() throws Exception;

}
