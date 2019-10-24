package com.joe.tmall.service;

import com.joe.tmall.pojo.Category;
import com.joe.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
