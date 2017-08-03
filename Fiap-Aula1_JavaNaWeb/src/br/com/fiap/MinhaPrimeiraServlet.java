package br.com.fiap;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/minhaservlet")
public class MinhaPrimeiraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MinhaPrimeiraServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("campoNome");
		String telefone = request.getParameter("campoTelefone");
		String email = request.getParameter("campoEmail");

		try (FileWriter fw = new FileWriter("D:\\Temp\\registro.csv", true); PrintWriter out = new PrintWriter(fw);) {
			out.print(nome);
			out.print(",");
			out.print(telefone);
			out.print(",");
			out.print(email);
			out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		response.getWriter().append("<h1>Nome: " + nome + "</h1>").append("<h1>Telefone: " + telefone + "</h1>").append("<h1>Email: " + email + "</h1>");
		
//		request.getRequestDispatcher("/sucesso").forward(request, response);
		request.getRequestDispatcher("/sucesso").include(request, response);
		
//		response.sendRedirect("/sucesso");
	}

}
