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
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 省
     */
    private String provinceid;

    /**
     * 市
     */
    private String cityid;

    /**
     * 县/区
     */
    private String areaid;

    /**
     * 电话
     */
    private String phone;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 是否是默认 1默认 0否
     */
    private Integer isDefault;


}
