package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Logar")
public class LogarServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recebendo os dados do formulario via parametro
		String l = "Renato";
		String s = "123";

		if (l.equals(request.getParameter("login")) && (s.equals(request.getParameter("senha")))) {
			response.sendRedirect("read.jsp");

		} else {
			response.sendRedirect("login.html");
		}

	}

}
