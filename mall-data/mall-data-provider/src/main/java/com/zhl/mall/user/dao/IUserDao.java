package com.zhl.mall.user.dao;


import com.zhl.mall.user.model.User;

import java.util.List;

/**
 * 用户 DAO
 * by tanfy 2016-07-06
 */
public interface IUserDao {
	User selectById(String id) throws Exception;
	User insert(User user) throws Exception;
	void delete(User user) throws Exception;
	List<User> selectAll() throws Exception;
}
