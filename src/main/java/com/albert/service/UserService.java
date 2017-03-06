/**
 * 
 */
package com.albert.service;

import com.albert.domain.table.Users;

/** 
* @ClassName: UserService 
* @Description: 
* @author albert
* @date 2017年3月6日 下午7:45:08 
*  
*/
public interface UserService {
	Users findById(Integer uid);
}
