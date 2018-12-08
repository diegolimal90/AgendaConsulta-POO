<%@page import="br.com.agendaConsulta.Medico"%>
<%@include file="WEB-INF/jspf/header.jspf" %>   
<div class="container mt-5 mb-5">
    <h2>Medicos</h2>
    <% if( Medico.getMedico().size() > 0) { %>
        <table class="table mt-5">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CRM</th>
                <th>Telefone</th>
                <th>Especialidade</th>
                <th>Endereco</th>
                <th>&nbsp;</th>
            </tr>

            <% for (Medico c : Medico.getMedico()) {%>
                <% int i = c.getId();%>

                <tr>
                    <td><%=i%></td>
                    <td><%=c.getNome()%></td>
                    <td><%=c.getCrm()%></td>
                    <td><%=c.getTelefone()%></td>
                    <td><%=c.getEspecialidade()%></td>
                    <td><%=c.getEndereco()%></td>
                    <td>
                        <a href="medico.jsp?id=<%=i%>"<button class="btn btn-primary">Alterar</button></a>
                        <a href="deleteMedico.jsp?id=<%=i%>"<button class="btn btn-danger">Excluir</button></a>
                    </td>
                </tr>
            <%}%>                
        </table>
    <%} else {%>
        <div class="jumbotron mt-3">
            <h4>Não há dados cadastrados!</h4>
        </div>
    <%}%>
</div>   
<%@include file="WEB-INF/jspf/footer.jspf" %>