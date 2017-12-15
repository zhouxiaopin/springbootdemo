package cn.gzticc.springbootdemo;

import cn.gzticc.springbootdemo.pojo.User;
import cn.gzticc.springbootdemo.repository.UserJapRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJpaRepositoryTests {

	@Autowired
	UserJapRepository userJapRepository;
	@Test
	public void save() {
		User user = new User();
		user.setUserName("pin");
		user.setPassword("123465");
		userJapRepository.save(user);
	}

	@Test
	public void get() {
		System.out.println(userJapRepository.findAll());
	}

}
