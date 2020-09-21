package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.util.Page4Navigator;
import java.util.List;

public interface ProductService  {
	void add(Product bean);

	void delete(int id);

	Product get(int id);

	void update(Product bean);

	Page4Navigator<Product> list(int cid, int start, int size,int navigatePages);

	void fill(List<Category> categorys);

	List<Product> listByCategory(Category category);

	void fill(Category category);

	void fillByRow(List<Category> categorys);

	void setSaleAndReviewNumber(Product product);

	void setSaleAndReviewNumber(List<Product> products);

	List<Product> search(String keyword, int start, int size);
}