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
public class TestSupport extends AbstractJUnit4SpringContextTests {
    protected static long startTime;
    protected static long endTime;

    /**
     * 记录 开始运行时间
     *
     * @return
     */
    @BeforeClass
    public static void start() {
    	startTime = System.currentTimeMillis();
        System.out.println("开始时间："+startTime);
    }

    /**
     * 记录 结束运行时间
     *
     * @return
     */
    @AfterClass
    public static void end() {
        endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime - startTime));
    }

    /**
     * 输出记录
     */
    protected void log() {
        String text = "\n开始时间 : " + this.startTime + "\n结束时间 : " + this.endTime + "\n执行时间 : " + (this.endTime - this.startTime);
        logger.info(text);
    }
}