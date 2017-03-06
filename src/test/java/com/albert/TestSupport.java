package com.albert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
* @ClassName: TestSupport 
* @Description: junit 测试
* @author albert
* @date 2017年3月6日 下午11:11:17 
*
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public abstract class TestSupport extends AbstractJUnit4SpringContextTests {
   
    @BeforeClass
    public static void start() {
    	System.out.println("测试前置处理");
    }

   
    @AfterClass
    public static void end() {
    	System.out.println("测试后置处理");
    }

    /**
     * 输出记录
     */
    protected void log() {
        logger.info("测试");
    }
}