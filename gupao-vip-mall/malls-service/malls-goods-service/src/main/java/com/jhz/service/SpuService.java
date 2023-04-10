package com.jhz.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jhz.mall.goods.model.Product;
import com.jhz.mall.goods.model.Spu;

/*****
 * @Author: 波波
 * @Description: 云商城
 ****/
public interface SpuService extends IService<Spu> {

    /****
     * 产品保存
     */
    void saveProduct(Product product);
}
