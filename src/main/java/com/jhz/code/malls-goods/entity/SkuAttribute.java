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
public class SkuAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性选项
     */
    private String options;

    /**
     * 排序
     */
    private Integer sort;


}
