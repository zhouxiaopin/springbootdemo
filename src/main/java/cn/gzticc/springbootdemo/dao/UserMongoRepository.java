package cn.gzticc.springbootdemo.dao;

import cn.gzticc.springbootdemo.pojo.UserMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends MongoRepository<UserMongo,Long> {
}
