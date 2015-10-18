<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Clientes</title>
</head>
<body>

 <div id="main" class="container-fluid">
  
  <h3 class="page-header">Cadastre-se</h3>
  
  
<form method="post" action="controllerDao">
  	<div class="row">
  	  <div class="form-group col-md-4">
  	  	<label for="exampleInputEmail1">Email</label>
  	  	<input type="email"  name="email" class="form-control" id="exampleInputEmail1" placeholder="Qual seu email?">
  	  </div>
	  <div class="form-group col-md-4">
  	  	<label for="exampleInputEmail1">Nome</label>
  	  	<input type="text"  name="nome" class="form-control" id="exampleInputEmail1" placeholder="Qual seu nome?">
  	  </div>
	 
	</div>
	
	<div class="row">
  	  <div class="form-group col-md-3">
  	  	<label for="exampleInputEmail1">Rua</label>
  	  	<input type="text" name="rua" class="form-control" id="exampleInputEmail1" placeholder="Onde voce mora?">
  	  </div>
	  <div class="form-group col-md-3">
  	  	<label for="exampleInputEmail1">Bairro</label>
  	  	<input type="text"  name="bairro" class="form-control" id="exampleInputEmail1" placeholder="Qual o seu bairro?">
  	  </div>
	  <div class="form-group col-md-3">
  	  	<label for="exampleInputEmail1">Complemento</label>
  	  	<input type="text"  name="complemento" class="form-control" id="exampleInputEmail1" placeholder="Seu endereco possui complemento?">
  	  </div>
	  <div class="form-group col-md-3">
  	  	<label for="exampleInputEmail1">Numero</label>
  	  	<input type="text"  name="numero" class="form-control" id="exampleInputEmail1" placeholder="Numero de sua residencia">
  	  </div>
	</div>
	
	<div class="row">
  	  <div class="form-group col-md-2">
  	  	<label for="exampleInputEmail1">Cep</label>
  	  	<input type="text" name="cep" class="form-control" id="exampleInputEmail1" placeholder="Qual seu cep?">
  	  </div>
	  <div class="form-group col-md-2">
  	  	<label for="exampleInputEmail1">Telefone</label>
  	  	<input type="text" name="telefone" class="form-control" id="exampleInputEmail1" placeholder="Qual seu telefone?">
  	  </div>
	</div>
	
	<div class="row">
  	  <div class="form-group col-md-3">
  	  	<label for="exampleInputEmail1">Crie sua senha</label>
  	  	<input type="password" name="senha" class="form-control" id="exampleInputEmail1" placeholder="Digite sua senha">
  	  </div>
	  <div class="form-group col-md-3">
  	  	<label for="exampleInputEmail1">Confirme sua senha</label>
  	  	<input type="password" name="ConfSenha" class="form-control" id="exampleInputEmail1" placeholder="Confirme senha criada">
  	  </div>
	 
	  
</div>
	 
	 
	  
</div>
	
	<hr />
	
	<div class="row">
	  <div class="col-md-12">
	  	<button type="submit"  name="Gravar" class="btn btn-primary">Salvar</button>
	
		<button  type="reset"value="Reset" class="btn">Limpar</button>
	  </div>
	</div>

 

 </form>

 <script src="js/jquery.min.js"></script>
 <script src="js/bootstrap.min.js"></script>

</body>
</html>