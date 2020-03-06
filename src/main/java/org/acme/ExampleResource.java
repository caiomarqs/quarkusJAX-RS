package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bean.Produto;
import org.dao.ProdutoDAO;

@Path("/prod={id}")
public class ExampleResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Produto getPedidoById(@PathParam("id") int id){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.findProdutoById(id);
		return produto;
	}
}