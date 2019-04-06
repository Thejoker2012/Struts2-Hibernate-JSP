package br.com.unisys.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaDAO {

	// Atributos de conex�o
	private Connection cn;

	// Contrutor vazio
	public CategoriaDAO() throws SQLException {

		try {
			this.cn = ConnectionFactory.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// M�todos Adiciona
	public void Adiciona(Categoria categoria) {

		String sql = "insert into web2.Categoria(id_categoria, nome_categoria, descricao) values (web2.seq_categoria.nextval, ?, ?)";

		try {
			// PreparedStatement para a inser��o de dados no Banco
			PreparedStatement stmt = this.cn.prepareStatement(sql);

			// Seta os valores
			stmt.setString(1, categoria.getNomeCategoria());
			stmt.setString(2, categoria.getDescricao());

			// Comandos para executar
			stmt.execute();
			stmt.close();

			System.out.println("Gravado com Sucesso!");
			cn.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
