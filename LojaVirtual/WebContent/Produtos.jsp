<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produtos</title>
<meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title> Produtos</title>
 
 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">
</head>
<body>

<div id="main" class="container-fluid"> 

 <h3 class="page-header">Escolha seus produtos</h3>
 
 <div id="top" class="row">
    <div class="col-md-3">
        <h2>Itens</h2>
    </div>
 
    <div class="col-md-6">
        <div class="input-group h2">
            <input name="data[search]" class="form-control" id="search" type="text" placeholder="Pesquisar Itens">
            <span class="input-group-btn">
                <button class="btn btn-primary" type="submit">
                    <span class="glyphicon glyphicon-search"></span>
                </button>
            </span>
        </div>
    </div>
 
    <div class="col-md-3">
        <a href="add.html" class="btn btn-primary pull-right h2">Novo Item</a>
    </div>
</div> <!-- /#top -->               

            <hr/>
                         <div id="list" class="row">
						 <div class="table-responsive col-md-12">
        <table class="table table-striped" cellspacing="0" cellpadding="0">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Descricao</th>
                    <th>Preco</th>
                    <th>Quantidade</th>
                    <th class="actions">A��es</th>
                 </tr>
            </thead>
            <tbody>
 
                <tr>
                    <td>1001</td>
                    <td>Camisa polo</td>
                    <td>R$50,00</td>
                    <td>01</td>
                    <td class="actions">
                        <a class="btn btn-success btn-xs" href="view.html">Visualizar</a>
                        <a class="btn btn-warning btn-xs" href="edit.html">Editar</a>
                        <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                    </td>
                </tr>
 
            </tbody>
         </table>
 
     </div>
                                </div><!--#list-->
  
                         <div id="bottom" class="row">
						  <div class="col-md-12">
         
        <ul class="pagination">
            <li class="disabled"><a>&lt; Anterior</a></li>
            <li class="disabled"><a>1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li class="next"><a href="#" rel="next">Pr�ximo &gt;</a></li>
        </ul><!-- /.pagination -->
 
    </div>
						 
						 
                          </div> <!--/bottom-->
  
 
 </div>
 <script src="js/jquery.min.js"></script>


</body>
</html>