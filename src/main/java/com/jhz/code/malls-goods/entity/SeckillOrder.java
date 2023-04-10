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
public class SeckillOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 秒杀商品ID
     */
    private String seckillGoodsId;

    /**
     * 支付金额
     */
    private Integer money;

    /**
     * 用户
     */
    private String username;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 状态，0未支付，1已支付
     */
    private Integer status;

    /**
     * 交易流水
     */
    private String weixinTransactionId;


}
