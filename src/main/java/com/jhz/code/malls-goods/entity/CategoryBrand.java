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
public class CategoryBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    private Integer categoryId;

    /**
     * 品牌ID
     */
    private Integer brandId;


}
