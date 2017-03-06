/**
 * 
 */
package com.albert.dao;

import java.util.List;

import com.albert.domain.table.Users;

/** 
* @ClassName: UserMapper 
* @Description: 
* @author albert
* @date 2017年3月6日 下午7:30:41 
*  
*/
public interface UserMapper {
	void save(Users user);
	void update(Users user);
	void delete(Integer id);
	Users findById(Integer id);
	List<Users> findAll();
}
