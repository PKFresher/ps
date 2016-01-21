package com.qzbuniform.web.manager;

import java.util.List;
import com.qzbuniform.web.dal.query.ClothesQuery;
import com.qzbuniform.web.bo.ClothesBO;

/**
 * ClothesManager
 *
 * User: haha
 * Date: 2016-01-21 11:30:43
 * Generate by autoManager
 * Powered by duxing@Taobao
 */

public interface ClothesManager{

    /**
     * insert one data
     *
     * @param clothesBO object
     * @return primaryKey Long
     * @throws Exception exception
     */
     public Long insert(ClothesBO clothesBO) throws Exception;

    /**
     * update data
     *
     * @param clothesBO object
     * @return update num
     * @throws Exception exception
     */
    public int update(ClothesBO clothesBO) throws Exception;

    /**
     * get an obj
     *
     * @param id key
     * @return obj obj
     * @throws Exception exception
     */
    public ClothesBO get(Long id) throws Exception;

    /**
     * query a list
     *
     * @param clothesQuery query
     * @return List
     * @throws Exception exception
     */
    public List<ClothesBO> getList(ClothesQuery clothesQuery) throws Exception;

    /**
     * query count
     *
     * @param clothesQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(ClothesQuery clothesQuery) throws Exception;

    /**
     * logic delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception;

}