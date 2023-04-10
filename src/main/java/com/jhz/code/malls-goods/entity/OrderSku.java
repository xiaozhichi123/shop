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
public class OrderSku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 1级分类
     */
    private Integer categoryOneId;

    /**
     * 2级分类
     */
    private Integer categoryTwoId;

    /**
     * 3级分类
     */
    private Integer categoryThreeId;

    /**
     * SPU_ID
     */
    private String spuId;

    /**
     * SKU_ID
     */
    private String skuId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 单价
     */
    private Integer price;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 总金额
     */
    private Integer money;

    /**
     * 图片地址
     */
    private String image;


}
