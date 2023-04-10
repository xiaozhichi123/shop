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
public class CategoryAttr implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer categoryId;

    /**
     * 属性分类表
     */
    private Integer attrId;


}
