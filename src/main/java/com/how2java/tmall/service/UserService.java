package com.how2java.tmall.service;

import com.how2java.tmall.pojo.User;
import com.how2java.tmall.util.Page4Navigator;

public interface UserService {
	boolean isExist(String name);

	User getByName(String name);

	User get(String name, String password);

	Page4Navigator<User> list(int start, int size, int navigatePages);

	void add(User user);
}