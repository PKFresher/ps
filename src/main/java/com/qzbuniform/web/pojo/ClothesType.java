package com.qzbuniform.web.pojo;

import java.io.Serializable;

/**
 * ClothesTypeDO
 *
 * User: haha
 * Date: 2016-01-25 06:11:31
 * Generate by autoDO
 * Powered by duxing@Taobao
 */

public class ClothesType  implements  Serializable{
    /**
     * id
     */
    private Long id;
    /**
     * size 型号
     */
    private String size;
    /**
     * 袖长 sleave length
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
     * weigth 体重
     */
    private Long weigth;
    /**
     * sex_type
     */
    private Integer sexType;
    /**
     * category_id 种类
     */
    private Long categoryId;
    /**
     * category_name 种类名称
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