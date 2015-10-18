package br.com.loja.teste;

import java.util.List;

import br.com.loja.dao.ClienteDao;
import br.com.loja.dao.ProdutoDao;
import br.com.loja.entidade.Cliente;
import br.com.loja.entidade.Produto;

public class TestClienteDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testBuscar();
		//testCadastrar();
		//testAlterar();	
		//testAutenticar();

	}

	
	private static void testCadastrar() {
		
		Cliente cliente=new Cliente();

		cliente.setBairro("Candeias");
		cliente.setCep("54440290");
		cliente.setComplemento("Apartamento01");
		cliente.setEmail("ricardos@gmail.com");
        cliente.setNome("Ricardo");
        cliente.setNumero("956");
        cliente.setRua("ProfessorSilvio");
        cliente.setSenha("123");
        cliente.setTelefone("88199493");
        
		ClienteDao usuDao = new ClienteDao();

		usuDao.cadastrar(cliente);
	}
	
	private static void testAlterar() {

		Cliente cliente=new Cliente();

		cliente.setBairro("Olinda");
		cliente.setCep("54440290");
		cliente.setComplemento("Apartamento10");
		cliente.setEmail("ricardos@gmail.com");
        cliente.setNome("Antonio");
        cliente.setNumero("956");
        cliente.setRua("Professor");
        cliente.setSenha("123");
        cliente.setTelefone("88199493");
        
		ClienteDao usuDao = new ClienteDao();

		usuDao.alterar(cliente);

	}
	
	
	private static void testAutenticar() {

		Cliente cliente = new Cliente();
		
		cliente.setEmail("ricardos@gmail.com");
        cliente.setSenha("123");
        
	  ClienteDao usuDao = new ClienteDao();

	 System.out.println(usuDao.autenticar(cliente));
   //  System.out.println(cliente.getNome());
     
	}
	
	private static void testBuscar() {

		ProdutoDao produtoDao = new ProdutoDao();

		List<Produto> listaResultado = produtoDao.Consulta();
		
		for (Produto produto : listaResultado) {
			
			System.out.println("Codigo:"+produto.getCodigo()+ "-"+"Descricao:"+produto.getDescricao()+ "-"+"Preco:"+produto.getPreco());
			
		}
		
		

	}	
	
}
