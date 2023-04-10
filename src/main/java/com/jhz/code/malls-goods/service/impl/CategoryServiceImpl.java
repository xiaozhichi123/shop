package com.jhz.code.malls-goods.service.impl;

import com.jhz.code.malls-goods.entity.Category;
import com.jhz.code.malls-goods.mapper.CategoryMapper;
import com.jhz.code.malls-goods.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目 服务实现类
 * </p>
 *
 * @author xiaozhi
 * @since 2023-04-07
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
