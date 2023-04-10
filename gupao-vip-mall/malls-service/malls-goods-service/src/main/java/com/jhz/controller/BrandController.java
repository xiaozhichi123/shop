package com.jhz.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jhz.mall.goods.model.Brand;
import com.jhz.mall.util.RespResult;
import com.jhz.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName BrandController
 * @Description TODO
 * @Author JHZ
 * @Date 2023/3/31 10:38
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;

    /***
    * @MethodName add
    * @Description   增加方法
     * @return: com.jhz.mall.util.RespResult
    * @Author JHZ
    * @Date 10:42 2023/3/31
    */
    @PostMapping
    public RespResult add(@RequestBody Brand brand){
        brandService.save(brand);
        return RespResult.ok();
    }
    /***
    * @MethodName update
    * @Description  修改方法
     * @param: brand
     * @return: com.jhz.mall.util.RespResult
    * @Author JHZ
    * @Date 10:47 2023/3/31
    */
    @PutMapping
    public RespResult update(@RequestBody Brand brand){
        brandService.updateById(brand);
        return RespResult.ok();
    }
    /***
    * @MethodName delete
    * @Description  删除方法
     * @param: id
     * @return: com.jhz.mall.util.RespResult
    * @Author JHZ
    * @Date 11:02 2023/3/31
    */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id")String id){
        brandService.removeById(id);
        return RespResult.ok();
    }
    /***
    * @MethodName queryList
    * @Description 条件查询
     * @param: brand
     * @return: com.jhz.mall.util.RespResult<java.util.List<com.jhz.mall.goods.model.Brand>>
    * @Author JHZ
    * @Date 13:34 2023/3/31
    */
    @PostMapping(value = "/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand){
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }
    /***
    * @MethodName queryPageList
    * @Description  条件查询
     * @param: page
     * @param: size
     * @param: brand
     * @return: com.jhz.mall.util.RespResult<com.baomidou.mybatisplus.extension.plugins.pagination.Page<com.jhz.mall.goods.model.Brand>>
    * @Author JHZ
    * @Date 13:41 2023/3/31
    */
    @PostMapping(value = "/search/{page}/{size}")
    public RespResult<Page<Brand>> queryPageList(
            @PathVariable(value = "page")Long page,
            @PathVariable(value = "size")Long size,
            @RequestBody Brand brand){
        Page<Brand> pageInfo = brandService.queryPageList(brand,page,size);
        return RespResult.ok(pageInfo);
    }
    /****
     * 根据分类ID查询品牌集合
     */
    @GetMapping(value = "/category/{pid}")
    public RespResult<List<Brand>>  categoryBrands(@PathVariable(value = "pid")Integer pid){
        List<Brand> brands = brandService.queryByCategoryId(pid);
        return RespResult.ok(brands);
    }
}
