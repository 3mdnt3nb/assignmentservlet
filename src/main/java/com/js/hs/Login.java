package com.js.hs;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/login") // if we want to provide the action 
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {								
		//pass the key value i.e name=email name=password
		String n = req.getParameter("name");  // type=name which is key
		int p = Integer.parseInt(req.getParameter("password"));
		
		if(n.equals("praj@gmail") && p==123) {
//		if(n=="praj@gmail" && p==123) {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			// if we want add something from servlet class to jsp file then call setAttribute method
			req.setAttribute("message sent", "common here message");
			// forward to result.jsp in the form of key value pair
			rd.forward(req, resp);	
		}
	}
}
