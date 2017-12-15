package cn.gzticc.springbootdemo;

import cn.gzticc.springbootdemo.pojo.User;
import cn.gzticc.springbootdemo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTests {

	@Autowired
	IUserService userService;

	@Test
	public void getObjectById() {
		User user = userService.getObjectById(1L);
		System.out.println(user.toString());
	}
	@Test
	public void getObjById() {
		User user = userService.getObjById(1L);
		System.out.println(user.toString());
	}


}
