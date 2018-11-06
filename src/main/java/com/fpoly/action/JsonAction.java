package com.fpoly.action;

import java.util.List;

import com.fpoly.entities.Category;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import com.fpoly.dao.CategoryDAOImpl;

@ParentPackage("json-default")
public class JsonAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<Category> categories;

	public JsonAction() {
		categories = new CategoryDAOImpl().findAll();
	}

	@Action(value = "/json/category", results = {
			@Result(name = SUCCESS, type = "json")
	})
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
}
