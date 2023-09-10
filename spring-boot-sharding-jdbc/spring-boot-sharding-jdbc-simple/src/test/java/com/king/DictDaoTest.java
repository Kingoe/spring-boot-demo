package com.king;

import com.king.dao.DictDao;
import com.king.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingJdbcSimple.class})
public class DictDaoTest {


    @Autowired
    DictDao dictDao;

    @Test
    public void InsertOrderTest() {
        for (int i = 1; i<=10;i++) {
            dictDao.insert("姓名" + i, 12);
        }
    }

}
