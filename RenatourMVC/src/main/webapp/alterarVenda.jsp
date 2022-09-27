<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Alteração do contato ${contato.nome}</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>

</head>
<body>
<p>Id:<%request.getParameter("idVenda");%></p>
	<div class="container">
		<h5>Alteração do contato ${vendas.nomeCliente}</h5>
		<form action="Editar" method="post" class="form-control">

			<div class="row mb-3">
			
						<div class="col-12 mb-3">
							<label for="nomeCliente" class="form-label">Nome completo</label>
							<input type="text" class="form-control" id="nomeCliente"
								name="nomeCliente" placeholder="Nome completo">
						</div>

					</div>
					<div class="row mb-3">
						<div class="col-lg-8 mb-3">
							<label for="email" class="form-label">Endereço de Email</label> <input
								type="email" class="form-control" id="email" name="email"
								placeholder="nome@exemplo.com">
						</div>
						<div class="col-lg-4 col-sm-12">
							<label for="telefone" class="form-label">Telefone</label> <input
								type="tel" class="form-control" id="telefone" name="telefone">
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-lg-6 col-sm-12 mb-3">
							<label for="cidade" class="form-label">Cidade</label> <input
								type="text" class="form-control" id="cidade" name="cidade">
						</div>
						<div class="col-lg-2 col-sm-12 mb-3">
							<label for="estado" class="form-label">Estado</label> <input
								type="text" class="form-control" id="estado" name="estado">
						</div>
						<div class="col-lg-4 col-sm-12">
							<label for="cep" class="form-label">CEP</label> <input
								type="number" class="form-control" id="cep" name="cep">
						</div>
					</div>
					<div class="mb-3">
						<h4>Dados da Compra</h4>
					</div>
					<div class="row mb-3">
						<div class="col-10 mb-3">
							<label for="ncartao" class="form-label">Número do cartão</label>
							<input type="number" class="form-control" id="ncartao"
								name="numCC" placeholder="0000 0000 0000 0000">
						</div>
						<div class="col-lg-2 col-sm-12">
							<label for="cvv" class="form-label">CVV</label> <input
								type="number" class="form-control" id="cvv" placeholder="000">
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-lg-8 col-sm-12 mb-3">
							<label for="nomecartao" class="form-label">Nome como está
								no cartão</label> <input type="text" class="form-control"
								id="nomecartao">
						</div>
						<div class="col-lg-4 col-sm-12">
							<label for="data" class="form-label">Data de validade</label> <input
								type="datetime" class="form-control" id="data"
								placeholder="00/00/0000">
						</div>
					</div>
					<label for="opt" class="form-label">Escolha o(s) destino(s)</label>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="promoOZ"
							value=8850 id="flexCheckChecked1"> <label
							class="form-check-label" for="flexCheckChecked1"> Pacote
							Promocional Austrália R$ 8.850,00 </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="promoNZ"
							value=8450 id="flexCheckChecked2"> <label
							class="form-check-label" for="flexCheckChecked2"> Pacote
							Promocional Nova Zelândia R$ 8.450,00 </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="Perth"
							value=4500 id="flexCheckChecked3"> <label
							class="form-check-label" for="flexCheckChecked3"> Perth
							R$ 4.500,00 </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="GC"
							value=5500 id="flexCheckChecked4"> <label
							class="form-check-label" for="flexCheckChecked4"> Gold
							Coast R$ 5.500,00 </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="Auckland"
							value=4300 id="flexCheckChecked5"> <label
							class="form-check-label" for="flexCheckChecked5">
							Auckland R$ 4.300,00 </label>
					</div>
					<div class="form-check mb-5">
						<input class="form-check-input" type="checkbox" name="Queenstown"
							value=5300 id="flexCheckChecked6"> <label
							class="form-check-label" for="flexCheckChecked6">
							Queenstown R$ 5.300,00 </label>
					</div>
					<div class="mb-3">
						<h6>*Digite as datas preferenciais de ida e retorno logo
							abaixo, nosso time irá avaliar a disponibilidade e retornaremos
							por email o quanto antes.</h6>
					</div>
					<div class="row mb-3">
						<div class="col-lg-4 col-sm-12 mb-3">
							<label for="dataIda" class="form-label">Data de Ida</label> <input
								type="text" class="form-control" id="dataIda" name="dataIda"
								placeholder="00/00/0000">
						</div>
						<div class="col-lg-4 col-sm-12">
							<label for="dataRet" class="form-label">Data de Retorno</label> <input
								type="text" class="form-control" id="dataVolta" name="dataRet"
								placeholder="00/00/0000">
						</div>
					</div>
			<button type="submit" class="btn btn-success">Atualizar</button>
		</form>
	</div>
</body>
</html>