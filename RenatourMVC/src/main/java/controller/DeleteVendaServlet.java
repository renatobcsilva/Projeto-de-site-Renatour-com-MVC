package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VendaDAO;

@SuppressWarnings("serial")
@WebServlet("/Excluir")
public class DeleteVendaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idVenda = Integer.parseInt(req.getParameter("idVenda"));
		/*
		 * Venda vendaExcluida = new Venda(); vendaExcluida.setIdVenda(idVenda);
		 */

		VendaDAO vdao = new VendaDAO();

		vdao.deleteById(idVenda);

		resp.sendRedirect("home");
	}

}