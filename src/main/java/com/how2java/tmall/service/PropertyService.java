package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.util.Page4Navigator;

public interface PropertyService {
	void add(Property bean);

	void delete(int id);

	Property get(int id);

	void update(Property bean);

	List<Property> listByCategory(Category category);

	Page4Navigator<Property> list(int cid, int start, int size,int navigatePages);
}