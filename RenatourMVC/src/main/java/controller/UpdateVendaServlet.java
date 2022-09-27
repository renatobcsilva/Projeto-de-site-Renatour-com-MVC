package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Venda;
import model.VendaDAO;

@SuppressWarnings("serial")
@WebServlet("/Editar")
public class UpdateVendaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idVenda = Integer.parseInt(req.getParameter("idVenda"));
		VendaDAO vdao = new VendaDAO();
		Venda vendaSelecionada = vdao.getVendaById(idVenda);

		req.setAttribute("venda", vendaSelecionada);

		RequestDispatcher rd = req.getRequestDispatcher("/alterarVenda.jsp");

		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Venda vendaAlterada = new Venda();
		vendaAlterada.setNomeCliente(req.getParameter("nomeCliente"));
		vendaAlterada.setEmail(req.getParameter("email"));
		vendaAlterada.setTelefone(req.getParameter("telefone"));
		vendaAlterada.setCidade(req.getParameter("cidade"));
		vendaAlterada.setEstado(req.getParameter("estado"));
		vendaAlterada.setCep(req.getParameter("cep"));
		vendaAlterada.setNumCC(req.getParameter("numCC"));
		vendaAlterada.setDataIda(req.getParameter("dataIda"));
		vendaAlterada.setDataRet(req.getParameter("dataRet"));
		vendaAlterada.setPromoOZ(req.getParameter("promoOZ"));
		vendaAlterada.setPromoNZ(req.getParameter("promoNZ"));
		vendaAlterada.setPerth(req.getParameter("Perth"));
		vendaAlterada.setGC(req.getParameter("GC"));
		vendaAlterada.setAuckland(req.getParameter("Auckland"));
		vendaAlterada.setQueenstown(req.getParameter("Queenstown"));
		vendaAlterada.setDataCompra(new Date());
		
		VendaDAO va = new VendaDAO();
		va.update(vendaAlterada);
		resp.sendRedirect("home");
	}

}