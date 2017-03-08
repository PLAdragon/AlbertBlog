/**
 * 
 */
package com.albert.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/** 
* @ClassName: ServiceFactory 
* @Description: service工厂
* @author albert
* @date 2017年3月7日 下午10:43:38 
*  
*/
@Component
public class ServiceFactory {
	@Resource
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
