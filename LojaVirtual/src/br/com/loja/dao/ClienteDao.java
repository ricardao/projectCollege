package br.com.loja.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import br.com.loja.entidade.Cliente;

public class ClienteDao {
	private Connection con = Conexao.getConnection();

	public void cadastrar(Cliente cliente) {

		// Monta SQL
		String sql = "INSERT INTO CLIENTE (email,nome,rua,bairro,numero,cep,telefone,senha,complemento) VALUES  (?,?,?,?,?,?,?,?,?)";
		

		try {
			
			
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setString(1, cliente.getEmail());
			preparador.setString(2, cliente.getNome());
			preparador.setString(3, cliente.getRua());
			preparador.setString(4, cliente.getBairro());
			preparador.setString(5, cliente.getNumero());
			preparador.setString(6, cliente.getCep());
			preparador.setString(7, cliente.getTelefone());
			preparador.setString(8, cliente.getSenha());
			preparador.setString(9, cliente.getComplemento());
			

			preparador.execute();
			preparador.close();

			System.out.println("Cliente cadastrado");
			System.out.println("");

		} catch (SQLException e) {

			System.out.println("Erro de cadastro: " + e.getMessage());

		}
	}

	public void alterar(Cliente cliente) {

		// Monta SQL
		String sql = "UPDATE CLIENTE SET nome=?,rua=?,bairro=?,numero=?,cep=?,telefone=?,senha=?,complemento=?  WHERE EMAIL=?";
		// Constroi PreparedeStatement com o SQL.

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			
			preparador.setString(1, cliente.getNome());
			preparador.setString(2, cliente.getRua());
			preparador.setString(3, cliente.getBairro());
			preparador.setString(4, cliente.getNumero());
			preparador.setString(5, cliente.getCep());
			preparador.setString(6, cliente.getTelefone());
			preparador.setString(7, cliente.getSenha());
			preparador.setString(8, cliente.getComplemento());
			preparador.setString(9, cliente.getEmail());

			preparador.execute();
			preparador.close();

			System.out.println("Usuario alterado");
			System.out.println("");

		} catch (SQLException e) {

			System.out.println("Erro na alteração: " + e.getMessage());

		}
	}
	
	
	public Cliente autenticar(Cliente cliente) {

		String sql = "SELECT * FROM CLIENTE WHERE email=? AND senha=?";
		
		Cliente clienteRetorno = null;

		try {
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, cliente.getEmail());
			preparador.setString(2, cliente.getSenha());

			ResultSet resultado = preparador.executeQuery();

			if (resultado.next()) { // Se foi para o proximo

				clienteRetorno = new Cliente();
				
				
				clienteRetorno.setEmail(resultado.getString("email"));
				clienteRetorno.setSenha(resultado.getString("senha"));
				
				System.out.println("Usuario autenticado");
			}
			//preparador.close();

		
			//System.out.println("");

		} catch (SQLException e) {

			System.out.println("Não foi possivel localizar o LOGIN" + e.getMessage());
		}

		return clienteRetorno;
	}
	
}
	
	
	
	/*
	public void salvar (Usuario usuario){
		
		if(usuario.getId()!=null){
			
			alterar(usuario);
			
			}else{ 
				
				cadastrar(usuario);
			
			
			}
	}

	public void excluir(Usuario usuario) {

		// Monta SQL
		String sql = "DELETE FROM USUARIO WHERE ID=?";
		// Constroi PreparedeStatement com o SQL.

		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			preparador.setInt(1, usuario.getId());

			preparador.execute();
			preparador.close();

			System.out.println("Usuario excluido");
			System.out.println("");

		} catch (SQLException e) {

			System.out.println("Erro na exclusão: " + e.getMessage());

		}
	}

	public List<Usuario> Consulta() {

		String sql = "SELECT*FROM USUARIO";

		List<Usuario> lista = new ArrayList<Usuario>();

		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			ResultSet resultado = preparador.executeQuery();

			while (resultado.next()) {

				Usuario usu = new Usuario();

				usu.setId(resultado.getInt("id"));
				usu.setLogin(resultado.getString("login"));
				usu.setNome(resultado.getString("nome"));
				usu.setSenha(resultado.getString("senha"));

				lista.add(usu);
			}

			preparador.close();

			System.out.println("Consulta concluida");
			System.out.println("");

		} catch (SQLException e) {

			System.out.println("Erro na consulta: " + e.getMessage());

		}
		return lista;
	}

	public Usuario buscarPorId(int id) {

		Usuario usuario = null;

		String sql = "SELECT * FROM Usuario WHERE ID=?";

		try {

			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, id);

			ResultSet resultado = preparador.executeQuery();

			if (resultado.next()) {          //Se foi para o proximo

				usuario = new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
			}
			
			preparador.close();

			System.out.println("Consulta ID concluida");
			System.out.println("");


		} catch (SQLException e) {

			System.out.println("Não foi possivel localizar ID" + e.getMessage());
		}

		return usuario;
	}

	public List<Usuario> buscarPorNome(String nome) { 
		
		String sql = "SELECT*FROM Usuario WHERE nome like ?";
		List<Usuario> lista = new ArrayList<Usuario>();

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, "%" + nome + "%");

			ResultSet resultado = preparador.executeQuery();

			while (resultado.next()) {

				Usuario usuario = new Usuario();
				usuario.setId(resultado.getInt("id"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setSenha(resultado.getString("senha"));
				lista.add(usuario);
			}
			
			preparador.close();

			System.out.println("Consulta NOME concluida");
			System.out.println("");

		} catch (SQLException e) {

			System.out.println("Não foi possivel localizar NOME" + e.getMessage());
		}
		return lista;

	}

	

	public Boolean existeUsuario(Usuario usuario) {
	

		String sql = "SELECT * FROM Usuario WHERE login=? AND senha=?";

		try {

			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getLogin());
			preparador.setString(2, usuario.getSenha());

			ResultSet resultado = preparador.executeQuery();

			return resultado.next();
			
			

		} catch (SQLException e){
			
			System.out.println("Não foi possivel localizar o LOGIN" + e.getMessage());
		}
    return false;
	}*/

