package com.ecommerce.controller.shop.order;

import com.ecommerce.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowOrderDetailServlet", value = "/show_order_detail")
public class ShowOrderDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OrderService orderService = new OrderService(request, response);
        orderService.showOrderDetailForCustomer();
    }

}
