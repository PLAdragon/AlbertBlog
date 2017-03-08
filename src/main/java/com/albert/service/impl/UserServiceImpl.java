/**
 * 
 */
package com.albert.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.albert.dao.UserMapper;
import com.albert.domain.table.Users;
import com.albert.service.UserService;

/** 
* @ClassName: UserServiceImpl 
* @Description: 
* @author albert
* @date 2017年3月6日 下午7:45:56 
*  
*/
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	public Users findById(Integer uid) {
		return userMapper.findById(uid);
	}

}
