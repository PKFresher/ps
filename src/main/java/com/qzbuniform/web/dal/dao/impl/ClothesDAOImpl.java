package com.qzbuniform.web.dal.dao.impl;

import java.util.List;
import com.qzbuniform.web.dal.dataobject.ClothesDO;
import com.qzbuniform.web.dal.dao.ClothesDAO;
import com.qzbuniform.web.dal.query.ClothesQuery;
import com.qzbuniform.web.dal.dao.BaseDAO;

/**
 * ClothesDAOImpl
 *
 * User: haha
 * Date: 2016-01-21 11:30:41
 * Generate by autoDAOImpl
 * Powered by duxing@Taobao
 */

public class ClothesDAOImpl extends BaseDAO implements ClothesDAO{

    private static final String NAMESPACE = "ClothesDAO.";

    /**
     * insert one data
     *
     * @param clothesDO object
     * @return primaryKey Long
     * @throws Exception exception
     */
     public Long insert(ClothesDO clothesDO) throws Exception{
        Long id = this.getNextId("clothes");
        clothesDO.setId(id);
        insert(NAMESPACE + "insert", clothesDO);
        return id;
     }

    /**
     * update data
     *
     * @param clothesDO object
     * @return update num
     * @throws Exception exception
     */
    public int update(ClothesDO clothesDO) throws Exception{
        return update(NAMESPACE + "update", clothesDO);
    }
    /**
     * get an obj
     *
     * @param id key
     * @return do obj
     * @throws Exception exception
     */
    public ClothesDO get(Long id) throws Exception{
        return (ClothesDO) queryForObject(NAMESPACE + "select", id);
    }

    /**
     * query a list
     *
     * @param clothesQuery query
     * @return List
     * @throws Exception exception
     */
    @SuppressWarnings("unchecked")
    public List<ClothesDO> getList(ClothesQuery clothesQuery) throws Exception{
        return (List<ClothesDO>) queryForList(NAMESPACE + "queryList", clothesQuery);
    }

    /**
     * query count
     *
     * @param clothesQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(ClothesQuery clothesQuery) throws Exception{
        return (Integer) queryForObject(NAMESPACE + "queryCount", clothesQuery);
    }

    /**
     * logically delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception{
        return update(NAMESPACE + "delete", id);
    }

}