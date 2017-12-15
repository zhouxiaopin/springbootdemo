package cn.gzticc.springbootdemo.mapper;

import cn.gzticc.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Select("select * from user where userId = #{userId}")
    User getObjectById(@Param("userId") Long userId);


    User getObjById(Long userId);
}
