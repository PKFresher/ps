package com.qzbuniform.web.manager.impl;

import java.util.List;
import com.qzbuniform.web.manager.ClothesManager;
import com.qzbuniform.web.dal.dao.ClothesDAO;
import com.qzbuniform.web.dal.query.ClothesQuery;
import com.qzbuniform.web.bo.ClothesBO;
import com.qzbuniform.web.transfer.ClothesTransfer;

/**
 * ClothesManagerImpl
 *
 * User: haha
 * Date: 2016-01-21 11:30:45
 * Generate by autoManagerImpl
 * Powered by duxing@Taobao
 */

public class ClothesManagerImpl implements ClothesManager{

    private ClothesDAO clothesDAO;

    public void setClothesDAO(ClothesDAO clothesDAO) {
        this.clothesDAO = clothesDAO;
    }

    /**
     * insert one data
     *
     * @param clothesBO object
     * @return primaryKey Long
     * @throws Exception exception
     */
    public Long insert(ClothesBO clothesBO) throws Exception{
        return clothesDAO.insert(ClothesTransfer.toDO(clothesBO));
    }

    /**
     * update data
     *
     * @param clothesBO object
     * @return update num
     * @throws Exception exception
     */
    public int update(ClothesBO clothesBO) throws Exception{
        return clothesDAO.update(ClothesTransfer.toDO(clothesBO));
    }

    /**
     * get an obj
     *
     * @param id key
     * @return do obj
     * @throws Exception exception
     */
    public ClothesBO get(Long id) throws Exception{
        return ClothesTransfer.toBO(clothesDAO.get(id));
    }

    /**
     * query a list
     *
     * @param clothesQuery query
     * @return List
     * @throws Exception exception
     */
    public List<ClothesBO> getList(ClothesQuery clothesQuery) throws Exception{
        return ClothesTransfer.toBOList(clothesDAO.getList(clothesQuery));
    }

    /**
     * query count
     *
     * @param clothesQuery query
     * @return Integer
     * @throws Exception exception
     */
    public Integer getCount(ClothesQuery clothesQuery) throws Exception{
        return clothesDAO.getCount(clothesQuery);
    }

    /**
     * logic delete one line
     *
     * @param id key
     * @return delete num
     * @throws Exception exception
     */
    public int delete(Long id) throws Exception{
        return clothesDAO.delete(id);
    }

}