package com.fpoly.dao;

import java.util.List;

import com.fpoly.entities.DetailImg;

public interface DetailImgDAO {

	List<DetailImg> findAll();

	DetailImg findOne(int id);

	boolean insert(DetailImg detailImg);

	boolean update(DetailImg detailImg);

	boolean delete(int id);
}
