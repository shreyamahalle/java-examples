package com.ecommerce.practice.rating.system;

import com.ecommerce.practice.rating.system.model.Product;
import com.ecommerce.practice.rating.system.model.Review;
import com.ecommerce.practice.rating.system.model.User;
import com.ecommerce.practice.rating.system.service.ProductService;
import com.ecommerce.practice.rating.system.service.ReviewService;
import com.ecommerce.practice.rating.system.service.UserService;

public class ReviewSystemDemo {
    public static void main(String[] args) {
        System.out.println("E-Commerce Review System");

        UserService us = new UserService();
        User u = us.acceptUserData();

        ProductService ps = new ProductService();
        Product p = ps.acceptProductData();

        ReviewService rs = new ReviewService();
        Review r = rs.acceptReviewData();

        System.out.println("User details are " + u);
        System.out.println("product details are " + p);
        System.out.println("Review details are " + r);


    }
}
