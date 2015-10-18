package br.com.loja.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loja.dao.ProdutoDao;
import br.com.loja.entidade.Produto;


@WebServlet("/ControllerProdutoDao")
public class ControllerProdutoDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ControllerProdutoDao() {
      
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando o metodo GET");
		
		ProdutoDao produtoDao = new ProdutoDao();
	    List<Produto> lista = produtoDao.Consulta();  
	    
	   
	    
		    
		  	// Engavetar a lista ( a lista foi colocada no request com nome de "lista" e  objeto lista.
		  request.setAttribute("lista", lista);
		  request.setAttribute("nome", "Ricardo");
		    
		    // Encaminhar para o JSP 
		    
		    RequestDispatcher saida = request.getRequestDispatcher("ListaProdutos.jsp");
		    saida.forward(request, response);
		    
			} 
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
