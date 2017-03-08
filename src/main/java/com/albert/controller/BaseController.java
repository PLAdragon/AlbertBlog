/**
 * 
 */
package com.albert.controller;

import javax.annotation.Resource;

import com.albert.service.ServiceFactory;

/** 
* @ClassName: BaseController 
* @Description: 所有控制层父类
* @author albert
* @date 2017年3月7日 下午10:37:30 
*  
*/
public abstract class BaseController {
	@Resource
	private ServiceFactory serviceFactory;

	public ServiceFactory getServiceFactory() {
		return serviceFactory;
	}

	public void setServiceFactory(ServiceFactory serviceFactory) {
		this.serviceFactory = serviceFactory;
	}
	
	
}
