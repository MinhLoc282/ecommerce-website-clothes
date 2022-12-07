package com.ecommerce.controller.admin.category;

import com.ecommerce.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateCategoryServlet", value = "/admin/create_category")
public class CreateCategoryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryService categoryService = new CategoryService(request, response);
        categoryService.createCategory();
    }

}