<%@page import="br.com.agendaConsulta.Paciente"%>
<%@include file="WEB-INF/jspf/header.jspf" %>   
<div class="container mt-5 mb-5">
    <h2>Pacientes</h2>
    <% if( Paciente.getPaciente().size() > 0) { %>
        <table class="table mt-5">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>RG</th>
                <th>Celular</th>
                <th>Telefone</th>
                <th>E-mail</th>
                <th>Endereço</th>
                <th>&nbsp;</th>
            </tr>

            <% for (Paciente c : Paciente.getPaciente()) {%>
                <% int i = c.getId();%>

                <tr>
                    <td><%=i%></td>
                    <td><%=c.getNome()%></td>
                    <td><%=c.getCpf()%></td>
                    <td><%=c.getRg()%></td>
                    <td><%=c.getCelular()%></td>
                    <td><%=c.getTelefone()%></td>
                    <td><%=c.getEmail()%></td>
                    <td><%=c.getEndereco()%></td>
                    <td>
                        <a href="paciente.jsp?id=<%=i%>"><i class="fa fa-edit"></i></a>
                        <a href="deletePaciente.jsp?id=<%=i%>"><i class="fa fa-trash"></i></a>
                        <a href="agendarConsulta.jsp?id=<%=i%>"><i class="fa fa-plus"></i></a>
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