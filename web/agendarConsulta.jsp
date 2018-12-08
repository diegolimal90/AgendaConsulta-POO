<%@page import="br.com.agendaConsulta.Agenda"%>

<%@page import="br.com.agendaConsulta.DataBase"%>
<%@page import="br.com.agendaConsulta.Medico"%>
<%@page import="br.com.agendaConsulta.Paciente"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body><center><br>
        <%@include file="WEB-INF/jspf/header.jspf" %> 
        <form>  
            Nome <input type="text" name="Nome"/><br>
       Telefone <input type="text" name="nome"/><br>
       CPF <input type="text" name="cpf"/><br>
       E-mail <input type="text" name="email"/><br>
       Celular <input type="text" name="celular"/><br>
       Endereço <input type="text" name="endereco"/><br>
       RG <input type="text" name="rg"/><br>
        <input type="submit" value="Enviar"/><br>    
       </form> 
        
        <div><bottom>
            
            </bottom>
               
           </div>
</body>
<%@include file="WEB-INF/jspf/footer.jspf" %>

</html>
