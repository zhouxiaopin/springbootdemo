package cn.gzticc.springbootdemo;

import cn.gzticc.springbootdemo.dao.UserMongoRepository;
import cn.gzticc.springbootdemo.pojo.UserMongo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMongoRepositoryTests {

	@Autowired
	UserMongoRepository userRepository;
	@Test
	public void save() {
		UserMongo user = new UserMongo();
		user.setUserId(1L);
		user.setUserName("haha");
		user.setPassword("123465");
		userRepository.save(user);
	}

	@Test
	public void get() {
		List<UserMongo> users = userRepository.findAll();
		for (UserMongo user : users){
			System.out.println(user.getUserId());
		}
	}

}
