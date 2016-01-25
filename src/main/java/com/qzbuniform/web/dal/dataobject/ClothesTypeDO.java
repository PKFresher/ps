package com.qzbuniform.web.dal.dataobject;

import java.io.Serializable;

/**
 * ClothesTypeDO
 *
 * User: haha
 * Date: 2016-01-25 06:57:05
 * Generate by autoDO
 * Powered by duxing@Taobao
 */

public class ClothesTypeDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * id
     */
    private Long id;
    /**
     * 号/型
     */
    private String size;
    /**
     * 袖长  sleave length
     */
    private Long sleaveLength;
    /**
     * 肩宽 shoulder width
     */
    private Long shoulderWidth;
    /**
     * 胸围 bust
     */
    private Long bust;
    /**
     * center of back 后中长
     */
    private Long centerOfBack;
    /**
     * 体重
     */
    private Long weigth;
    /**
     * 男|女
     */
    private Integer sexType;
    /**
     * 衣服种类
     */
    private Long categoryId;
    /**
     * 衣服名称
     */
    private String categoryName;

    /**
     * id getter & setter
     */
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    /**
     * size getter & setter
     */
    public String getSize() {
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    /**
     * sleaveLength getter & setter
     */
    public Long getSleaveLength() {
        return sleaveLength;
    }
    public void setSleaveLength(Long sleaveLength){
        this.sleaveLength = sleaveLength;
    }

    /**
     * shoulderWidth getter & setter
     */
    public Long getShoulderWidth() {
        return shoulderWidth;
    }
    public void setShoulderWidth(Long shoulderWidth){
        this.shoulderWidth = shoulderWidth;
    }

    /**
     * bust getter & setter
     */
    public Long getBust() {
        return bust;
    }
    public void setBust(Long bust){
        this.bust = bust;
    }

    /**
     * centerOfBack getter & setter
     */
    public Long getCenterOfBack() {
        return centerOfBack;
    }
    public void setCenterOfBack(Long centerOfBack){
        this.centerOfBack = centerOfBack;
    }

    /**
     * weigth getter & setter
     */
    public Long getWeigth() {
        return weigth;
    }
    public void setWeigth(Long weigth){
        this.weigth = weigth;
    }

    /**
     * sexType getter & setter
     */
    public Integer getSexType() {
        return sexType;
    }
    public void setSexType(Integer sexType){
        this.sexType = sexType;
    }

    /**
     * categoryId getter & setter
     */
    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
    }

    /**
     * categoryName getter & setter
     */
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

}