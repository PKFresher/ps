package com.qzbuniform;

import com.qzbuniform.web.dao.impl.ClothesTypeDAO;
import com.qzbuniform.web.pojo.ClothesType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pengs01 on 2016/1/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config/beans.xml")
public class DAOTest {
    @Autowired
    ClothesTypeDAO clothesTypeDAO;

    @Test
    public  void  ClothesTypeDAOTest(){
        ClothesType o = clothesTypeDAO.get(1);
    }

}
