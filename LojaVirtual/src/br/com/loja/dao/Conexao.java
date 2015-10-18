package br.com.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {

	
	 public static Connection getConnection(){
		 
		 Connection con = null;
		 
		 try{	
		 Class.forName("org.postgresql.Driver");	 
		 con = DriverManager.getConnection("jdbc:postgresql://node66885-env-3760100.jelasticlw.com.br/postgres","webadmin","CDLprp71867");
		 System.out.println("Conectado com sucesso");
		 } catch (SQLException e){
			 
			 System.out.println("Nao pode conectar"+e.getMessage());
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver não encontrado");
		}
		 
		 return con;
	 } 
	 
		
	}
