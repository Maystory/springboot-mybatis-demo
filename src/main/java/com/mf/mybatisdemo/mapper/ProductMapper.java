package com.mf.mybatisdemo.mapper;

import com.mf.mybatisdemo.bean.Products;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    @Select("select * from products")
    List<Products> findAll();

    Products findByPrice(Integer price);
}
