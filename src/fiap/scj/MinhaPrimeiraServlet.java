package fiap.scj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MinhaPrimeiraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, 
			             HttpServletResponse resp) 
			            		 throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();     
		out.append("<h1> Minha primeira Servlet</h1>");
		
	}

}
