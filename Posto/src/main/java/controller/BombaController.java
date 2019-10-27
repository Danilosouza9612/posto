package controller;

import java.util.Iterator;

import DAO.BombaDAO;
import DAO.BombaDAOFactory;
import model.Bomba;

public class BombaController {
	private BombaDAO context;
	
	public BombaController() {
		this.context = new BombaDAOFactory().getInstance();
	}
	public Iterator<Bomba> bombasComPoucaQuantidade() throws Exception{
		return this.context.bombasComPoucaQuantidade();
	}
	
}
