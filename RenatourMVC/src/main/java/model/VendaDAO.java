package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void create(Venda info) {

		String sql = "INSERT INTO venda (nomeCliente, email, telefone, cidade, estado, cep, numCC,"
				+ " dataIda, dataRet, promoOZ, promoNZ, Perth, GC, Auckland, Queenstown, dataCompra)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {

			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, info.getNomeCliente());
			pstm.setString(2, info.getEmail());
			pstm.setString(3, info.getTelefone());
			pstm.setString(4, info.getCidade());
			pstm.setString(5, info.getEstado());
			pstm.setString(6, info.getCep());
			pstm.setString(7, info.getNumCC());
			pstm.setString(8, info.getDataIda());
			pstm.setString(9, info.getDataRet());
			pstm.setString(10, info.getPromoOZ());
			pstm.setString(11, info.getPromoNZ());
			pstm.setString(12, info.getPerth());
			pstm.setString(13, info.getGC());
			pstm.setString(14, info.getAuckland());
			pstm.setString(15, info.getQueenstown());
			pstm.setDate(16, new Date(info.getDataCompra().getTime()));

			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public List<Venda> read() {

		String sql = "SELECT * FROM venda";

		List<Venda> vendas = new ArrayList<Venda>();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Venda info = new Venda();

				info.setIdVenda(rset.getInt("idVenda"));
				info.setNomeCliente(rset.getString("nomeCliente"));
				info.setEmail(rset.getString("email"));
				info.setTelefone(rset.getString("telefone"));
				info.setCidade(rset.getString("cidade"));
				info.setEstado(rset.getString("estado"));
				info.setCep(rset.getString("cep"));
				info.setNumCC(rset.getString("numCC"));
				info.setDataIda(rset.getString("dataIda"));
				info.setDataRet(rset.getString("dataRet"));
				info.setPromoOZ(rset.getString("promoOZ"));
				info.setPromoNZ(rset.getString("promoNZ"));
				info.setPerth(rset.getString("Perth"));
				info.setGC(rset.getString("GC"));
				info.setAuckland(rset.getString("Auckland"));
				info.setQueenstown(rset.getString("Queenstown"));
				info.setDataCompra(rset.getDate("dataCompra"));

				vendas.add(info);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {

				if (rset != null) {

					rset.close();
				}

				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return vendas;
	}

	public void update(Venda info) {

		String sql = "UPDATE venda SET nomeCliente=?, email=?, telefone=?, "
				+ "cidade=?, estado=?, cep=?, numCC=?, dataIda=?,"
				+ "dataRet=?, promoOZ=?, promoNZ=?, Perth=?, GC=?, Auckland=?," + "Queenstown=?, dataCompra = ?"
				+ " WHERE id = ?";

		try {

			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, info.getNomeCliente());
			pstm.setString(2, info.getEmail());
			pstm.setString(3, info.getTelefone());
			pstm.setString(4, info.getCidade());
			pstm.setString(5, info.getEstado());
			pstm.setString(6, info.getCep());
			pstm.setString(7, info.getNumCC());
			pstm.setString(9, info.getDataIda());
			pstm.setString(10, info.getDataRet());
			pstm.setString(11, info.getPromoOZ());
			pstm.setString(12, info.getPromoNZ());
			pstm.setString(13, info.getPerth());
			pstm.setString(14, info.getGC());
			pstm.setString(15, info.getAuckland());
			pstm.setString(16, info.getQueenstown());
			pstm.setDate(17, new Date(info.getDataCompra().getTime()));

			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			// Fecha as conexões

			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void deleteById(int idVenda) {

		String sql = "DELETE FROM venda WHERE idVenda = ?";

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, idVenda);

			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public Venda getVendaById(int id) {

		String sql = "SELECT * FROM venda where idVenda = ?";
		Venda info = new Venda();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			rset.next();

			info.setIdVenda(rset.getInt("idVenda"));
			info.setNomeCliente(rset.getString("nomeCliente"));
			info.setEmail(rset.getString("email"));
			info.setTelefone(rset.getString("telefone"));
			info.setCidade(rset.getString("cidade"));
			info.setEstado(rset.getString("estado"));
			info.setCep(rset.getString("cep"));
			info.setNumCC(rset.getString("numCC"));
			info.setDataIda(rset.getString("dataIda"));
			info.setDataRet(rset.getString("dataRet"));
			info.setPromoOZ(rset.getString("promoOZ"));
			info.setPromoNZ(rset.getString("promoNZ"));
			info.setPerth(rset.getString("Perth"));
			info.setGC(rset.getString("GC"));
			info.setAuckland(rset.getString("Auckland"));
			info.setQueenstown(rset.getString("Queenstown"));
			info.setDataCompra(rset.getDate("dataCompra"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return info;
	}
}
