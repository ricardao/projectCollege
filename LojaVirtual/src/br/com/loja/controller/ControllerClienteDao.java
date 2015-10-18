package br.com.loja.controller;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.loja.dao.ClienteDao;
import br.com.loja.entidade.Cliente;


@WebServlet("/controllerDao")
public class ControllerClienteDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControllerClienteDao() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Chamando o metodo POST");
	
	String email = request.getParameter("email");
	String nome = request.getParameter("nome");
	String rua = request.getParameter("rua");
	String bairro = request.getParameter("bairro");
	String numero = request.getParameter("numero");
	String complemento = request.getParameter("complemento");
	String cep = request.getParameter("cep");
	String telefone = request.getParameter("telefone");
	String senha = request.getParameter("senha");
	//String confSenha = request.getParameter("ConfSenha");

		
	
	
	Cliente cliente = new Cliente();
	
	cliente.setBairro(bairro);
	cliente.setCep(cep);
	cliente.setComplemento(complemento);
	cliente.setEmail(email);
	cliente.setNome(nome);
	cliente.setNumero(numero);
	cliente.setRua(rua);
	cliente.setSenha(senha);
	cliente.setTelefone(telefone);
	
	ClienteDao clienteDao = new ClienteDao();
	
	clienteDao.cadastrar(cliente);	
	
	
	response.getWriter().print("<script>window.alert('Cliente Cadastrado!');location.href='Login.jsp';</script>");
	
	
	
	}

}
