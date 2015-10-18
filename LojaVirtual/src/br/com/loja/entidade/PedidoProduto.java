package br.com.loja.entidade;

public class PedidoProduto {
	
	
	String codigo;
	String email;
	String DataPedido;
	String preco;
	String quantidade;
	
	
	public PedidoProduto() {
		
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDataPedido() {
		return DataPedido;
	}


	public void setDataPedido(String dataPedido) {
		DataPedido = dataPedido;
	}


	public String getPreco() {
		return preco;
	}


	public void setPreco(String preco) {
		this.preco = preco;
	}


	public String getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	

}
