package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    List<Category> list();

    void add(Category category);

    void deleteByPrimaryKey(Integer id);

    Category selectByPrimaryKey(Integer id);

    void update(Category category);
}