package controller;

import java.util.Iterator;

import DAO.PostoDAO;
import DAO.PostoDAOFactory;
import model.Faturamento;

public class PostoController {
	private PostoDAO context;
	
	public PostoController(){
		this.context = new PostoDAOFactory().getInstance();
	}
	
	public Iterator<Faturamento> listarFaturamentos() throws Exception{
		return this.context.listarFaturamentos();
	}
}
