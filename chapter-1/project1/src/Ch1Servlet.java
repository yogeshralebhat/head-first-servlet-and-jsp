import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	Date today = new Date();
	PrintWriter out = response.getWriter();
	out.println("<html>" +
			"<body>" +
			"<h1 align=center>HF\'s Chapter1 Servlet</h1>" +
			"<br>" + today + "<body>" + "<html>");
    }    
}
