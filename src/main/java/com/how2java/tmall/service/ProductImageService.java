package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.OrderItem;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.ProductImage;

public interface ProductImageService   {
	String type_single = "single";
	String type_detail = "detail";

	ProductImage get(int id);

	void setFirstProductImage(Product product);

	void add(ProductImage bean);

	void delete(int id);

	List<ProductImage> listSingleProductImages(Product product);

	List<ProductImage> listDetailProductImages(Product product);

	void setFirstProductImages(List<Product> products);

	void setFirstProductImagesOnOrderItems(List<OrderItem> ois);
}