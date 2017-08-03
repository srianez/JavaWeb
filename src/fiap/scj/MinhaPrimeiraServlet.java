package fiap.scj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MinhaPrimeiraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, 
			             HttpServletResponse resp) 
			            		 throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();     
		out.append("<h1> Minha primeira Servlet</h1>");
		
		//forward repassa a msg pra outra servlet
		//req.getRequestDispatcher("/sucesso").forward(req, resp);
		
		//include adiciona a mensagem da servlet abaixo... incrementa...
		//req.getRequestDispatcher("/sucesso").include(req, resp);
		
		HttpSession session = req.getSession(true);
		out.append("Seu id session é " + session.getAttribute("id"));
		
		
		
	}

}
