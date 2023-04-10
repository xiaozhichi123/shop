package com.jhz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jhz.mall.goods.model.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName BrandMapper
 * @Description TODO
 * @Author JHZ
 * @Date 2023/3/29 23:32
 * @Version 1.0
 */
public interface BrandMapper extends BaseMapper<Brand> {
    /****
     * 1、根据分类ID查询品牌ID集合
     */
    @Select("SELECT brand_id FROM category_brand WHERE category_id=#{id}")
    List<Integer> queryBrandIds(Integer id);
}
