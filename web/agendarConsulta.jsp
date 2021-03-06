<%@include file="WEB-INF/jspf/header.jspf" %>   
<% 
    String msg = null;
    try{
        if(request.getParameter("frmpasciente") != null){
           String nome = request.getParameter("nome");
           String rg = request.getParameter("rg");
           String cpf = request.getParameter("cpf");
           String email = request.getParameter("email");
           String telefone = request.getParameter("telefone");
           String celular = request.getParameter("celular");
           String endereco = request.getParameter("endereco");

           Agenda.addAgenda(nome, rg, cpf, email, telefone, celular, endereco);
           response.sendRedirect("listarPaciente.jsp");
        }   
    }catch (Exception e){
        msg = "Falha ao salvar Paciente " + e.getMessage();
        out.print(msg);
    }
%>


<div class="container mt-5 mb-5">
    <div class="row">
        <div class="col-md-12">
            <form class="jumbotron" method="post">
                <h1 class="display-4">Cadastar Paciente</h1>
                <hr />
                <div class="form-group">
                    <label>Data</label> <input class="form-control" type="text" name="data" />    
                </div>
                <div class="form-group">
                    <label>Paciente</label> <input class="form-control" type="text" name="paciente" />
                    <input type="hidden" name="id" values="">
                </div>
                <div class="form-group">
                    <label>Medico</label> <input class="form-control" type="text" name="email"/>    
                </div>
                <button type="submit" class="btn btn-primary" name="frmpasciente" value="salvar">Salvar</button>    
            </form>  
        </div>
    </div>
</div>
<%@include file="WEB-INF/jspf/footer.jspf" %>
