package com.king.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DictDao {

    @Insert("insert into t_dict(name,user_id)values(#{name},#{userId})")
    int insert(@Param("name") String name, @Param("userId") Integer userId);

}
