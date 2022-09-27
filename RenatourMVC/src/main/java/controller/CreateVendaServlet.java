package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Venda;
import model.VendaDAO;

@SuppressWarnings("serial")
@WebServlet("/Inserir")
public class CreateVendaServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeCliente = request.getParameter("nomeCliente");

		String email = request.getParameter("email");

		String telefone = request.getParameter("telefone");

		String cidade = request.getParameter("cidade");

		String estado = request.getParameter("estado");

		String cep = request.getParameter("cep");

		String numCC = request.getParameter("numCC");

		String dataIda = request.getParameter("dataIda");

		String dataRet = request.getParameter("dataRet");

		String promoOZ = request.getParameter("promoOZ");

		String promoNZ = request.getParameter("promoNZ");

		String Perth = request.getParameter("Perth");

		String GC = request.getParameter("GC");

		String Auckland = request.getParameter("Auckland");

		String Queenstown = request.getParameter("Queenstown");

		Date dataCompra = new Date();

		Venda objVenda = new Venda();

		objVenda.setNomeCliente(nomeCliente);

		objVenda.setEmail(email);

		objVenda.setTelefone(telefone);

		objVenda.setCidade(cidade);

		objVenda.setEstado(estado);

		objVenda.setCep(cep);

		objVenda.setNumCC(numCC);

		objVenda.setDataIda(dataIda);

		objVenda.setDataRet(dataRet);

		objVenda.setPromoOZ(promoOZ);

		objVenda.setPromoNZ(promoNZ);

		objVenda.setPerth(Perth);

		objVenda.setGC(GC);

		objVenda.setAuckland(Auckland);

		objVenda.setQueenstown(Queenstown);

		objVenda.setDataCompra(dataCompra);

		VendaDAO vdao = new VendaDAO();
		vdao.create(objVenda);

		response.sendRedirect("index.html");

	}

}
