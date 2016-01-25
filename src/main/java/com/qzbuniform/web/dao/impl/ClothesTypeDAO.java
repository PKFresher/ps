package com.qzbuniform.web.dao.impl;

import com.sun.xml.internal.fastinfoset.vocab.ParserVocabulary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by pengs01 on 2016/1/25.
 */
@Component
public class ClothesTypeDAO extends BaseDaoImpl {

    public  ClothesTypeDAO(){

        setNs("clothesTypeMapper");
    }

    //查询sex  男西服 sex =1 category=2
    @Override
    public List find(Map map) {
        return super.find(map);
    }
}
