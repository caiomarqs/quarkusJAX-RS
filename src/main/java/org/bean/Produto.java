package org.bean;
 		
import javax.json.bind.annotation.JsonbDateFormat;

@JsonbDateFormat
public class Produto {
	private int idProduto = 0;
	private String nomeProduto = "";
	private Double precoProduto = 0.00;
	
	public Produto() {}
	
	public Produto(int idProduto, String nomeProduto, Double precoProduto) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
}
