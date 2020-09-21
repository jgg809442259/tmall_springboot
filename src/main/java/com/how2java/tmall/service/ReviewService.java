package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.Review;

public interface ReviewService {
    void add(Review review);

    List<Review> list(Product product);

    int getCount(Product product);
}