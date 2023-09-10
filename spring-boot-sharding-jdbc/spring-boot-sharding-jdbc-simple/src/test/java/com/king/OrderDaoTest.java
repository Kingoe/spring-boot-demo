package com.king;

import com.king.dao.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingJdbcSimple.class})
public class OrderDaoTest {

    @Autowired
    OrderDao orderDao;

    @Test
    public void InsertOrderTest() {
        for (int i = 1; i<=10;i++) {
            orderDao.insertOrder(new BigDecimal(i), 12L, "success");
        }
    }

    @Test
    public void getListTest() {
        orderDao.getList(Arrays.asList(907580261611339776L,907592879461892097L));
    }

}
