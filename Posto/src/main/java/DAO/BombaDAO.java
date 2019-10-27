package DAO;

import java.util.Iterator;

import model.Bomba;

public interface BombaDAO {
	public Iterator<Bomba> bombasComPoucaQuantidade() throws Exception;
}
