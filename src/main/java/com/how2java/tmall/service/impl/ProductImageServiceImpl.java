package com.how2java.tmall.service.impl;

import java.util.List;

import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.service.ProductImageService;
import com.how2java.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.how2java.tmall.dao.ProductImageDAO;
import com.how2java.tmall.pojo.OrderItem;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.ProductImage;
import com.how2java.tmall.util.SpringContextUtil;

@Service
@CacheConfig(cacheNames="productImages")
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired
    ProductImageDAO productImageDAO;

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Cacheable(key="'productImages-one-'+ #p0")
    public ProductImage get(int id) {
        return productImageDAO.findOne(id);
    }

    public void setFirstProductImage(Product product) {
        ProductImageService productImageService = SpringContextUtil.getBean(ProductImageService.class);
        List<ProductImage> singleImages = productImageService.listSingleProductImages(product);
        if(!singleImages.isEmpty())
            product.setFirstProductImage(singleImages.get(0));
        else
            product.setFirstProductImage(new ProductImage());
    }

    @CacheEvict(allEntries=true)
    public void add(ProductImage bean) {
        productImageDAO.save(bean);

    }

    @CacheEvict(allEntries=true)
    public void delete(int id) {
        productImageDAO.delete(id);
    }

    @Cacheable(key="'productImages-single-pid-'+ #p0.id")
    public List<ProductImage> listSingleProductImages(Product product) {
        return productImageDAO.findByProductAndTypeOrderByIdDesc(product, type_single);
    }

    @Cacheable(key="'productImages-detail-pid-'+ #p0.id")
    public List<ProductImage> listDetailProductImages(Product product) {
        return productImageDAO.findByProductAndTypeOrderByIdDesc(product, type_detail);
    }

    public void setFirstProductImages(List<Product> products) {
        for (Product product : products)
            setFirstProductImage(product);
    }

    public void setFirstProductImagesOnOrderItems(List<OrderItem> ois) {
        for (OrderItem orderItem : ois) {
            setFirstProductImage(orderItem.getProduct());
        }
    }
}