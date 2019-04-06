package br.com.unisys.action;

import java.sql.SQLException;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.com.unisys.model.Categoria;
import br.com.unisys.model.CategoriaDAO;

public class CategoriaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Categoria categoria = new Categoria();

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Action(value="adicionaCategoria",
			results= {@Result(name="OK", location="/cadastro_ok.jsp"),
					  @Result(name="ERRO",location="/cadastro_erro.jsp")})
	public String execute() throws ClassNotFoundException,SQLException {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.adiciona(categoria);
	}

}
