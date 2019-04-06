package br.com.unisys.action;

import java.sql.SQLException;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.com.unisys.model.Cliente;
import br.com.unisys.model.ClienteDAO;

public class ClienteAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Cliente cliente = new Cliente();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
	@Action(value="adicionaCliente",
			results={@Result(name="OK",location="/cadastro_ok.jsp"),
			         @Result(name="ERRO",location="/cadastro_erro.jsp")})
	public String execute() throws ClassNotFoundException, SQLException{
		ClienteDAO dao = new ClienteDAO();
		return dao.adiciona(cliente);
	}
	
}
