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
        <title>Cadastro de Consultas</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
    </head>
    <body><center>
        <%@include file="WEB-INF/jspf/header1.jspf"  %>
<br>
            
            
        <form method='post' action="test.jsp">
            <br><br>
            <table>
                <tr>
                    <td>Usuário: <input type="text" name="usuario"  required><br></td>
                    <td><input type='hidden'  name='idsessao' value='<%= session.getId() %>' ></td>
                    <td><button type='submit' class="btn btn-success">Iniciar teste</button></td>
                </tr>
            </table> 
                    <br><br><br>

        </form><br><br>
        

    </center></body>
    <%@include file="WEB-INF/jspf/footer.jspf" %>
</html>
