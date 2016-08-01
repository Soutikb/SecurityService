package com.secure.clientconference;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConferenceBooking
 */
@WebServlet("/ConferenceBooking")
public class ConferenceBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String StrFName = "";
	public String StrLname = "";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConferenceBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServletdoGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			StrFName = request.getParameter("fname");
			StrLname =  request.getParameter("lname");
		}
		catch(Throwable theexception)
		{
			System.out.println(theexception);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
			StrFName = request.getParameter("fname");
			StrLname =  request.getParameter("lname");
			response.setContentType("text/html");
	}

}
