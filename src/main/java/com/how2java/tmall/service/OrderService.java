package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;
import com.how2java.tmall.pojo.User;
import com.how2java.tmall.util.Page4Navigator;

public interface OrderService {
	String waitPay = "waitPay";
	String waitDelivery = "waitDelivery";
	String waitConfirm = "waitConfirm";
	String waitReview = "waitReview";
	String finish = "finish";
	String delete = "delete";

	List<Order> listByUserWithoutDelete(User user);

	List<Order> listByUserAndNotDeleted(User user);

	void update(Order bean);

	Page4Navigator<Order> list(int start, int size, int navigatePages);

	void add(Order order);

	float add(Order order, List<OrderItem> ois);

	Order get(int oid);

	void cacl(Order o);

	void removeOrderFromOrderItem(List<Order> orders);

	void removeOrderFromOrderItem(Order order);
}