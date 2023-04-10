package com.jhz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jhz.mall.goods.model.SkuAttribute;
import com.jhz.mapper.SkuAttributeMapper;
import com.jhz.service.SkuAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*****
 * @Author: 波波
 * @Description: 云商城
 ****/
@Service
public class SkuAttributeServiceImpl extends ServiceImpl<SkuAttributeMapper,SkuAttribute> implements SkuAttributeService {

    @Autowired
    private SkuAttributeMapper skuAttributeMapper;

    /*****
     * 根据分类ID查询属性集合
     * @param id
     * @return
     */
    @Override
    public List<SkuAttribute> queryList(Integer id) {
        return skuAttributeMapper.queryByCategoryId(id);
    }
}
