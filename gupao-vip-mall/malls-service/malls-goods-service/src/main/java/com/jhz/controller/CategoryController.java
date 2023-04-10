package com.jhz.controller;

import com.jhz.mall.goods.model.Category;
import com.jhz.mall.util.RespResult;
import com.jhz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*****
 * @Author: 波波
 * @Description: 云商城
 ****/
@RestController
@RequestMapping(value = "/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /****
     * 根据分类父ID查询子分类
     */
    @GetMapping(value = "/parent/{id}")
    public RespResult<List<Category>> findByParentId(@PathVariable("id")Integer id){
        return RespResult.ok(categoryService.findByParentId(id));
    }

}
