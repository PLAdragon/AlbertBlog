package com.albert.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.albert.TestSupport;
import com.albert.dao.UserMapper;
import com.albert.domain.table.Users;

/** 
* @ClassName: DaoTest 
* @Description: 测试DAO层
* @author albert
* @date 2017年3月6日 下午7:50:36 
*  
*/
public class DaoTest extends TestSupport{
	@Resource
	private UserMapper userMapper;
	@Test
	public void test(){
		Users u = userMapper.findById(1);
		logger.info("结果："+u);
		
	}
}
