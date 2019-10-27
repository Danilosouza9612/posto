package DAO;

import java.util.Iterator;

import model.Faturamento;

public interface PostoDAO {
	public Iterator<Faturamento> listarFaturamentos() throws Exception;
}
