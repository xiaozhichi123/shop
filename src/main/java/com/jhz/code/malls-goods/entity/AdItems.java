package com.jhz.code.malls-goods.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaozhi
 * @since 2023-04-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AdItems implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    /**
     * 分类，1首页推广,2列表页推广
     */
    private Integer type;

    /**
     * 展示的产品
     */
    private String skuId;

    /**
     * 排序
     */
    private Integer sort;


}
