package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page4Navigator;

public interface CategoryService {
	void add(Category bean);

	void delete(int id);

	Category get(int id);

	void update(Category bean);

	Page4Navigator<Category> list(int start, int size, int navigatePages);

	List<Category> list();

	void removeCategoryFromProduct(List<Category> cs);

	void removeCategoryFromProduct(Category category);
}