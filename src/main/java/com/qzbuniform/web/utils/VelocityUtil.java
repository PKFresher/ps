package com.qzbuniform.web.utils;

import org.apache.velocity.tools.config.DefaultKey;

import java.util.Collection;

@DefaultKey("utils")
public class VelocityUtil {
    public boolean isNull(Object value) {
        return value == null;
    }

    public boolean notNull(Object value) {
        return !isNull(value);
    }

    @SuppressWarnings("rawtypes")
    public boolean isEmpty(Object value) {
        if (value == null)
            return true;
        if (value.getClass().equals(String.class))
            return String.valueOf(value).isEmpty();
        if (Collection.class.isAssignableFrom(value.getClass()))
            return ((Collection) value).isEmpty();
        return false;
    }

    public boolean notEmpty(Object value) {
        return !isEmpty(value);
    }

    /**
     * 判断两个对象是否相等。
     * @param v1
     * @param v2
     * @return
     */
    public boolean eq(String v1, String v2) {
        if (v1 == null && v2 == null)
            return true;
        if (v1 == null || v2 == null)
            return false;
        return v1.equals(v2);
    }

    /**
     * 判断两个对象是否不等。
     * @param v1
     * @param v2
     * @return
     */
    public boolean neq(String v1, String v2) {
        return !this.eq(v1, v2);
    }

    public String doubleFormat(double value) {
    	
        return new java.text.DecimalFormat("#0.00").format(value);
    }

}