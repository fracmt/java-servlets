package org.study.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewOfficeServlet
 */
@WebServlet("/newOffice")
public class NewOfficeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("New office saved");

		String officeName = req.getParameter("name");
		
		Office office = new Office();
		office.setName(officeName);
		
		Database db = new Database();
		db.add(office);
		
		//PrintWriter out = resp.getWriter();
		//out.println("<html><body>New Office " + office.getName() + " saved!</body></html>");
		
		//call the JSP
        RequestDispatcher rd = req.getRequestDispatcher("/newOfficeAdded.jsp");
        req.setAttribute("nameOffice", office.getName());
        rd.forward(req, resp);
		
	}
}
