package com.authentications;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/login")
public class LoginFilter implements Filter {
	
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest request1 = (HttpServletRequest) request;
		HttpServletResponse response1 = (HttpServletResponse) response;
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(!email.isEmpty() && !password.isEmpty() ) {
			if(email.equals("regis@gmail.com") && password.equals("regis")) {
//				chain.doFilter(request1, response1);
				request.getRequestDispatcher("HomePage.jsp").forward(request, response);
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("ForgetPage.jsp");
				rd.forward(request1, response1);
				response1.sendRedirect("forget.jsp?name="+email+" &password="+password+" ");
			}
		}

		// pass the request along the filter chain
//		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
			}
	
	
}
