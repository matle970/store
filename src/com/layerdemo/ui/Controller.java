package com.layerdemo.ui;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpSession;

import com.layerdemo.domain.Customer;
import com.layerdemo.service.CustomerService;
import com.layerdemo.service.imp.CustomerServiceImp;

@javax.servlet.annotation.WebServlet(name = "Controller", urlPatterns = { "/Controller" })
public class Controller extends javax.servlet.http.HttpServlet {

	CustomerService customerService = new CustomerServiceImp();

	protected void doPost(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		// 操作action記號
		String action = request.getParameter("action");

		if ("search".equalsIgnoreCase(action)) {
			// TODO
		} else if ("reg".equalsIgnoreCase(action)) {
			// TODO
		} else if ("login".equalsIgnoreCase(action)) {

			String userid = request.getParameter("userid");
			String userpwd = request.getParameter("userpwd");

			Customer customer = new Customer();
			customer.setId(userid);
			customer.setPassword(userpwd);

			if (customerService.login(customer)) {
				// 登陸成功
				HttpSession session = request.getSession();
				session.setAttribute("customer", customer);
				request.getRequestDispatcher("login_success.jsp").forward(request, response);
			} else {
				// 登入失敗
				request.getRequestDispatcher("login.html").forward(request, response);
			}

		}

	}
}
