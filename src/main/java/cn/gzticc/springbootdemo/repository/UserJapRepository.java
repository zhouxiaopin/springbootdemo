package cn.gzticc.springbootdemo.repository;

import cn.gzticc.springbootdemo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJapRepository extends JpaRepository<User,Long> {
}
