package com.yzh.boot_dubbo_api.api;

import java.util.List;

import com.yzh.boot_dubbo_api.entity.User;

public interface IUserService {
	
	int insertUser(User user);

	List<User> findByName(String name);
}
