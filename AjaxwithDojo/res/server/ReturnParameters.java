
package testing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: ReturnParameters
 * 
 */
public class ReturnParameters extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ReturnParameters() {
		super();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = "";
		String name = "";
		boolean check = true;
		url = request.getParameter("url");
		name = request.getParameter("name");
		if (url==null|| name == null){
			check=false;
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<head><title>Response</title>");
		if (check == false) {
			out.println("Missing Parameters");
		} else {
			out.println("You name is " + name + " and the supplied URL is "
					+ url + ".");
		}
		out.println("</head>");
		out.println("");
	}
}
