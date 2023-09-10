package com.king.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface OrderDao {

    @Insert("insert into t_order(price,user_id,status)values(#{price},#{userId},#{status})")
    int insertOrder(@Param("price")BigDecimal price, @Param("userId")Long userId, @Param("status")String status);

    @Select("<script> select * from t_order where order_id in <foreach collection='ids' separator=',' open='(' close=')' item='id'> #{id} </foreach> </script>")
    List<Map> getList(@Param("ids") List<Long> orderIds);
}
