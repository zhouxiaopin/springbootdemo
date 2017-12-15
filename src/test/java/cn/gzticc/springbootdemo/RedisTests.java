package cn.gzticc.springbootdemo;

import cn.gzticc.springbootdemo.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTests {

	@Autowired
	RedisUtil redisUtil;

	@Test
	public void get() {
		System.out.println(redisUtil.get("yin"));
	}


}
