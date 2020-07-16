package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.User;

public interface OrderItemService {
	void fill(List<Order> orders);

	void update(OrderItem orderItem);

	void fill(Order order);

	void add(OrderItem orderItem);

	OrderItem get(int id);

	void delete(int id);

	int getSaleCount(Product product);

	List<OrderItem> listByUser(User user);

	List<OrderItem> listByProduct(Product product);

	List<OrderItem> listByOrder(Order order);
}