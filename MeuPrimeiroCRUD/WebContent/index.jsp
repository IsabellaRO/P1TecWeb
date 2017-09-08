  <!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
    
    <!--NavBar-->
        <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo left"> .  Ever Isabella's Note</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
      </ul>
    </div>
  </nav>
  <!-- fim da navbar -->
   <!-- Page Layout here -->
    <div class="row">

      <div class="col s3">
        <!-- Grey navigation panel -->
	 <div class="container">
	 	<br>
	 	<br>
 		<form action="/MeuPrimeiroCRUD/cria">
			<!-- <button style="color:white; background-color:LIGHTSEAGREEN" type="submit">Criar uma nota</button> -->
		    <a class="waves-effect waves-light btn" href="cria">Criar uma nota</a>
		</form>
		<br>
		<br>
 		<form action="/MeuPrimeiroCRUD/atualiza">
			<!-- <button style="color:white; background-color:LIGHTSEAGREEN" type="submit">Alterar uma nota</button> -->
			<a class="waves-effect waves-light btn" href="atualiza">Alterar uma nota</a>
		</form>
		<br>
		<br>
 		<form action="/MeuPrimeiroCRUD/remove">
			<!-- <button style="color:white; background-color:LIGHTSEAGREEN" type="submit">Remover uma nota</button> -->
			<a class="waves-effect waves-light btn" href="remove">Remover uma nota</a>
		</form>
		</div>
		</div>
		
      <div class="col s9">
        <!-- Teal page content  -->
        <div class="row container" id="cont_card">
        <br><br>
        <%@ page import="java.util.*,meuPacote.*" %>
        <% DAO dao = new DAO();
		 List<Posts> posts = dao.getLista();
		 for (Posts post : posts ) { %>
		 
		 	<div class="col s10 m5">
			    <div class="white-text card teal z-depth-3 hoverable">
			    <div class="card-content" id = "content" >
			    
			      <%=post.getContent()%>
			      
		
			    </div>
			    	<div class="s3 m3 l3  right-align" style="width=40%">
 			    		<a role="button"  class=" material-icons" style="font-size:20px; padding-right:1%">heart</a>	
			    		<a class=" material-icons delete_button " style="font-size:20px; padding-right:1%" href="remove?id=<%=post.getPost_id()%>">heart</a>
			    		<a class=" material-icons delete_button " style="font-size:20px; padding-right:1%" href="atualiza?id=<%=post.getPost_id()%>">heart</a>		 		 </div>
		    </div>   	             
		    </div>
		    
		   
		 
		<% } %>
		
		
        </div>
      </div>

    </div>

</body>
</html>