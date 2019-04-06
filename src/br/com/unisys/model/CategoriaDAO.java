package br.com.unisys.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaDAO {

	// Atributos de conex�o
	private Connection cn;

	// Construtor de conex�o
	public CategoriaDAO() throws SQLException, ClassNotFoundException {
		new ConnectionFactory();
		cn = ConnectionFactory.getConnection();
	}

	// M�todos Adiciona
	public String adiciona(Categoria categoria) {
		String msg = "OK";
		// Monta o comando SQL
		String sql;
		sql = "insert into";
		sql += " web2.Categoria(ID_CATEGORIA, NOME_CATEGORIA, DESCRICAO)";
		sql += "values (web2.seq_categoria.nextval, ?, ?)";
		// Passa os par�metros para o preparedStatement
		try {
			// PreparedStatement para a inser��o de dados no Banco
			PreparedStatement stmt = cn.prepareStatement(sql);

			// Seta os valores
			stmt.setString(1, categoria.getNomeCategoria());
			stmt.setString(2, categoria.getDescricao());

			// Executa o comando sql
			stmt.execute();
			stmt.close();
			cn.close();

		} catch (SQLException e) {
			msg = e.toString();
		}

		return msg;
	}
}
