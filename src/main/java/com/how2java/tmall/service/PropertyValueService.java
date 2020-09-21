package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.pojo.PropertyValue;

public interface PropertyValueService  {
	void update(PropertyValue bean);

	void init(Product product);

	PropertyValue getByPropertyAndProduct(Product product, Property property);

	List<PropertyValue> list(Product product);
}