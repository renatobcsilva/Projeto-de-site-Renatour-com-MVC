function mensagem() {

	nome = document.getElementById("formGroupExampleInput").value

	document.getElementById("formGroupExampleInput").value = ""
	document.getElementById("formGroupExampleInput2").value = ""
	document.getElementById("exampleFormControlInput1").value = ""
	document.getElementById("exampleFormControlTextarea1").value = ""
	alert(`${nome}, sua mensagem foi enviada!`)
}

function comprar() {

	let soma = 0;
	let items = [];
	let checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');

	checkboxes.forEach((checkbox) => {
		soma = soma + (parseFloat(checkbox.value));
		items.push(checkbox.name);
	});

	if (confirm(`Destino(s): ${items}\nTotal: R\$ ${soma},00 \nConfirma a compra?`)) {
		alert("Sua compra foi confirmada!")
	} else {
		alert("Sua compra foi cancelada!")


		document.getElementById("nomeCliente").value = ""
		document.getElementById("email").value = ""
		document.getElementById("telefone").value = ""
		document.getElementById("ncartao").value = ""
		document.getElementById("cvv").value = ""
		document.getElementById("nomecartao").value = ""
		document.getElementById("data").value = ""
		document.getElementById("cidade").value = ""
		document.getElementById("estado").value = ""
		document.getElementById("cep").value = ""
		document.getElementById("flexCheckChecked1").checked = false
		document.getElementById("flexCheckChecked2").checked = false
		document.getElementById("flexCheckChecked3").checked = false
		document.getElementById("flexCheckChecked4").checked = false
		document.getElementById("flexCheckChecked5").checked = false
		document.getElementById("flexCheckChecked6").checked = false
		document.getElementById("dataIda").value = ""
		document.getElementById("dataVolta").value = ""
	}
}

function cancelar() {


	alert("Sua compra foi cancelada!")
}