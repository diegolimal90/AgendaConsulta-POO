<%@page import="br.com.agendaConsulta.Medico"%>
<%@include file="WEB-INF/jspf/header.jspf" %>   

<% 
    String msg = null;
    
    
    try{
        if(request.getParameter("frmmedico") != null){
           String nome = request.getParameter("nome");
           String crm = request.getParameter("crm");
           String email = request.getParameter("email");
           String especialidade = request.getParameter("especialidade");
           String telefone = request.getParameter("telefone");
           String endereco = request.getParameter("endereco");

           Medico.addMedico(nome, telefone, endereco, crm, especialidade);
           response.sendRedirect("listarMedico.jsp");
        }   
    }catch (Exception e){
        msg = "Falha ao salvar Medico " + e.getMessage();
        out.print(msg);
    }
%>

<div class="container mt-5 mb-5">
    <div class="row">
        <div class="col-md-12">
            <form class="jumbotron">
                <h1 class="display-4">Cadastar Medico</h1>
                <hr />
                <div class="form-group">
                    <label>Nome</label> <input class="form-control" type="text" name="nome" />    
                </div>
                <div class="form-group">
                    <label>Telefone</label> <input class="form-control" type="text" name="telefone"/>    
                </div>
                <div class="form-group">
                    <label>CRM</label> <input class="form-control" type="text" name="crm"/>    
                </div>
                <div class="form-group">
                    <label>Especialidade</label> <input class="form-control" type="text" name="especialidade"/>    
                </div>
                <div class="form-group">
                    <label>E-mail</label> <input class="form-control" type="text" name="email"/>    
                </div>
                <div class="form-group">
                    <label>Endereço</label> <input class="form-control" type="text" name="endereco"/>    
                </div>
                <button type="submit" class="btn btn-primary" name="frmmedico" value="salvar">Salvar</button>   
            </form>  
        </div>
    </div>
</div>
<%@include file="WEB-INF/jspf/footer.jspf" %>