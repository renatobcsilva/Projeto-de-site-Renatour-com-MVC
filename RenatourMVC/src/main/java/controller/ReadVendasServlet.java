package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Venda;
import model.VendaDAO;

@SuppressWarnings("serial")
@WebServlet("/home")
public class ReadVendasServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Venda> vendas = new ArrayList<Venda>();
		VendaDAO vdao = new VendaDAO();		
		vendas = vdao.read();		
		req.setAttribute("listaVendas", vendas);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("vendas.jsp");
		dispatcher.forward(req, resp);
	}

}
