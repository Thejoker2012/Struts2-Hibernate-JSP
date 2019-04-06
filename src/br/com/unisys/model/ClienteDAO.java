package br.com.unisys.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

	private Connection cn;

	// Método construtor
	public ClienteDAO() throws SQLException, ClassNotFoundException {
		new ConnectionFactory();
		cn = ConnectionFactory.getConnection();
	}

	// Método Adiciona
	public String adiciona(Cliente cliente) {
		String msg = "OK";
		// Monta o comando SQL
		String sql;
		sql = "insert into ";
		sql += "web2.Cliente(ID_CLIENTE,NOME_CLIENTE,CPF,DATA_NASC,SEXO,TELEFONE)";
		sql += "values(web2.seq_cliente.nextval,?,?,?,?,?)";
		// Passa os parâmetros para o preparedStatement
		try {
			PreparedStatement stmt = cn.prepareStatement(sql);
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getDataNasc());
			stmt.setString(4, cliente.getSexo());
			stmt.setString(5, cliente.getTelefone());

			// Executa o comando
			stmt.execute();
		} catch (SQLException e) {
			msg = e.toString();
		}
		return msg;
	}
}
