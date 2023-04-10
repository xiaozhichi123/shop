package com.jhz.code.malls-goods.entity;

import java.time.LocalDateTime;
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
public class SeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * spu ID
     */
    private String supId;

    /**
     * sku ID
     */
    private String skuId;

    /**
     * 标题
     */
    private String name;

    /**
     * 商品图片
     */
    private String images;

    /**
     * 原价格
     */
    private Integer price;

    /**
     * 秒杀价格
     */
    private Double seckillPrice;

    /**
     * 添加日期
     */
    private LocalDateTime createTime;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 秒杀商品数
     */
    private Integer num;

    /**
     * 剩余库存数
     */
    private Integer storeCount;

    /**
     * 描述
     */
    private String content;


}
