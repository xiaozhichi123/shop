package com.jhz.code.malls-goods.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 省份信息表
 * </p>
 *
 * @author xiaozhi
 * @since 2023-04-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Provinces implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 省份ID
     */
    private String provinceid;

    /**
     * 省份名称
     */
    private String province;


}
