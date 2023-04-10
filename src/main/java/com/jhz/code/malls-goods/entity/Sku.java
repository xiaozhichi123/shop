package com.jhz.code.malls-goods.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author xiaozhi
 * @since 2023-04-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * SKU名称
     */
    private String name;

    /**
     * 价格（分）
     */
    private Integer price;

    /**
     * 库存数量
     */
    private Integer num;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品图片列表
     */
    private String images;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * SPUID
     */
    private String spuId;

    /**
     * 类目ID
     */
    private Integer categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 规格
     */
    private String skuAttribute;

    /**
     * 商品状态 1-正常，2-下架，3-删除
     */
    private Integer status;


}
