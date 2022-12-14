package com.ecommerce.controller.admin.review;

import com.ecommerce.service.ReviewService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ListReviewServlet", value = "/admin/list_review")
public class ListReviewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ReviewService reviewService = new ReviewService(request, response);
        reviewService.listReview();
    }

}
