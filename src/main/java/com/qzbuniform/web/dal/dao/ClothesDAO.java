package com.qzbuniform.web.dal.dao;

import java.util.List;
import com.qzbuniform.web.dal.dataobject.ClothesDO;
import com.qzbuniform.web.dal.query.ClothesQuery;

/**
 * ClothesDAO
 *
 * User: haha
 * Date: 2016-01-21 11:30:38
 * Generate by autoDAO
 * Powered by duxing@Taobao
 */

public interface ClothesDAO{


    /**
     * insert one data
     *
     * @param clothesDO object
     * @return primaryKey Long
     * @throws Exception exception
     */
     public Long insert(ClothesDO clothesDO) throws Exception;

    /**
     * update data
     *
     * @param clothesDO object
     * @return update num
     * @throws Exception exception
     */
    public int update(ClothesDO clothesDO) throws Exception;

    /**
     * get an obj
     *
     * @param id key
     * @return obj obj
     * @throws Exception exception
     */
    public ClothesDO get(Long id) throws Exception;

    /**
     * query a list
     *
     * @param clothesQuery query
     * @return List
     * @throws Exception exception
     */
    public List<ClothesDO> getList(ClothesQuery clothesQuery) throws Exception;

    /**
     * query count
     *
     * @param clothesQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(ClothesQuery clothesQuery) throws Exception;

    /**
     * logically delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception;

}