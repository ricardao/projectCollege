package br.com.loja.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.loja.dao.ClienteDao;
import br.com.loja.entidade.Cliente;


@WebServlet("/ControllerLoginDao")
public class ControllerLoginDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ControllerLoginDao() {
       
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession sessao=request.getSession(false);
		
		if(sessao!=null){
			
			//Destroe a sessao
			sessao.invalidate();
			
			
		}
		
		response.sendRedirect("Login.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
				
		
		Cliente cliente = new Cliente();		
		cliente.setEmail(email);
		cliente.setSenha(senha);
		
		
		
		ClienteDao clienteDao = new ClienteDao();	
		
		Cliente cliAutenticado = clienteDao.autenticar(cliente);
		
		if(cliAutenticado!=null){
			
			//Criando sessao e colocando o objeto cliente dentro da sessão
			HttpSession sessao = request.getSession();
			sessao.setAttribute("cliAutenticado", cliAutenticado);
			
			//Encaminhando ao index ??? Seria sessão de produtos?
			request.getRequestDispatcher("Produtos.jsp").forward(request,response);
			
		}else {
			
			//Redireciona para a pagina principal.jsp caso o usuario não esteja cadastrado
			//response.sendRedirect("Principal.jsp");
			//Exibe mensagem javascript na tela informando que o usuario não foi autenticado e encaminha para a pagina
			//de login.
			response.getWriter().print("<script>window.alert('Não autenticado!');location.href='Login.jsp';</script>");
		}		
		
		
	}

}
