package com.qzbuniform.web.dal.dao;

import java.util.List;
import com.qzbuniform.web.dal.dataobject.AppModelDO;
import com.qzbuniform.web.dal.query.AppModelQuery;

/**
 * AppModelDAO
 *
 * User: haha
 * Date: 2016-01-25 08:04:51
 * Generate by autoDAO
 * Powered by duxing@Taobao
 */

public interface AppModelDAO{


    /**
     * insert one data
     *
     * @param appModelDO object
     * @return primaryKey Long
     * @throws Exception exception
     */
     public Long insert(AppModelDO appModelDO) throws Exception;

    /**
     * update data
     *
     * @param appModelDO object
     * @return update num
     * @throws Exception exception
     */
    public int update(AppModelDO appModelDO) throws Exception;

    /**
     * get an obj
     *
     * @param id key
     * @return obj obj
     * @throws Exception exception
     */
    public AppModelDO get(Long id) throws Exception;

    /**
     * query a list
     *
     * @param appModelQuery query
     * @return List
     * @throws Exception exception
     */
    public List<AppModelDO> getList(AppModelQuery appModelQuery) throws Exception;

    /**
     * query count
     *
     * @param appModelQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(AppModelQuery appModelQuery) throws Exception;

    /**
     * logically delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception;

}