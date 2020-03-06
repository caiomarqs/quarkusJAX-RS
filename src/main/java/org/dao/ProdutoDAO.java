package org.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bean.Produto;
import org.conn.ConnectionFactory;

public class ProdutoDAO {
	
	public Produto findProdutoById(int id){
		Connection conn = new ConnectionFactory().getConnection();
		String sqlQuerry = "SELECT * FROM TB_PRODUTO WHERE ID_PROD=\""+id+"\";";
		Statement pdst;
		ResultSet resultSet;
		Produto produto = null;
		try {
			pdst = conn.createStatement();
			resultSet = pdst.executeQuery(sqlQuerry);
			if (resultSet.next()) {
				produto = new Produto(resultSet.getInt("ID_PROD"), 
						  	          resultSet.getString("NOME_PROD"), 
						  	          resultSet.getDouble("PRECO_PROD"));	
			}
			else {
				produto = new Produto();
				produto.setNomeProduto("Produto Inexistente");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produto;
	}
	
}
