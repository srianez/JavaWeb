package fiap.scj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, 
			              HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		FileWriter arq = new FileWriter("d:\\silas\\teste.txt");
		
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf(login + " / " + senha);
		
		arq.close();
			
		PrintWriter out = resp.getWriter();     
//		out.append(login + senha);
		
		out.append("Arquivo gerado!");		
	}
	
}
