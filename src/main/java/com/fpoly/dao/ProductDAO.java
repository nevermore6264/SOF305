package com.fpoly.dao;

import java.util.List;

import com.fpoly.entities.Product;

public interface ProductDAO {

	List<Product> findAll();

	Product findOne(int id);

	boolean insert(Product product);

	boolean update(Product product);

	boolean delete(int id);
}
