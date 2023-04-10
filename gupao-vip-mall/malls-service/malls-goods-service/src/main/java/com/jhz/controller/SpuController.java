package com.jhz.controller;

import com.jhz.mall.goods.model.Product;
import com.jhz.mall.util.RespResult;
import com.jhz.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*****
 * @Author: 波波
 * @Description: 云商城
 ****/
@RestController
@RequestMapping(value = "/spu")
@CrossOrigin
public class SpuController {

    @Autowired
    private SpuService spuService;

    /*****
     * 产品保存
     */
    @PostMapping(value = "/save")
    public RespResult save(@RequestBody Product product){
        spuService.saveProduct(product);
        return RespResult.ok();
    }
}
