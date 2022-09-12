package org.study.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListOfficeServlet
 */
@WebServlet("/listOffice")
public class ListOfficeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Database db = new Database();
		List<Office> list = db.getOffices();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<ul>");
		for(Office office: list) {
			out.println("<li>" + office.getName() + "</li>");
		}
		out.print("</ul>");
		out.println("</body></html>");
		
	}

}
