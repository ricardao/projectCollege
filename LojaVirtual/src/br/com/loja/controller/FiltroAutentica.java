package br.com.loja.controller;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter(dispatcherTypes = {

		DispatcherType.REQUEST, DispatcherType.FORWARD
		

}
					 ,urlPatterns = { "/*" })


public class FiltroAutentica implements Filter {

    public FiltroAutentica() {
       
    }

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Passou pelo filtro");
		
		
		//Casting do HttpServlet Request (o Filter � a classe principal e nao tem o metodos que vamos usar 'session'
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		String url = httpServletRequest.getRequestURI();
		
		//Capturando a sessao
		HttpSession sessao = httpServletRequest.getSession();
		//HttpSession sessao = ((HttpServletRequest) request).getSession();		
		
//Est� logado?		
if(sessao.getAttribute("cliAutenticado")!=null || url.lastIndexOf("Login.jsp")>-1 || url.lastIndexOf("ControllerLoginDao")>-1 || url.lastIndexOf("Cadastro.jsp")>-1  || url.lastIndexOf("controllerDao")>-1 || url.lastIndexOf("css")>-1 || url.lastIndexOf("imagens")>-1  ){
			
			chain.doFilter(request, response); //Permite o fluxo da requisi��o
			
		}else{
			//Redireciona para login
			((HttpServletResponse) response).sendRedirect("Login.jsp");			
		}
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
		
		
		
		
	}

}
