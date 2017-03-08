/**
 * 
 */
package com.albert.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.albert.TestSupport;
import com.albert.domain.table.Users;
import com.albert.service.UserService;

/** 
* @ClassName: ServiceTest 
* @Description: Service层测试
* @author albert
* @date 2017年3月7日 下午8:58:52 
*  
*/
public class ServiceTest extends TestSupport {
	@Resource
	private UserService service;
	@Test
	public void test(){
		Users users = service.findById(1);
		logger.info("结果:"+users);
	}
}
