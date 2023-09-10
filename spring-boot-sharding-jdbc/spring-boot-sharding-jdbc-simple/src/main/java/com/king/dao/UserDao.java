package com.king.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserDao {

    @Insert("insert into t_user(user_id,full_name)values(#{userId},#{fullName})")
    int insert(@Param("userId") Integer userId, @Param("fullName") String fullName);

    @Select("<script> select * from t_user where user_id in <foreach collection='ids' separator=',' open='(' close=')' item='id'> #{id} </foreach> </script>")
    List<Map> getList(@Param("ids") List<Integer> userIds);

}
