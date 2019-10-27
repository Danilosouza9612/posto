package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Bomba;
import model.Combustivel;
import model.Posto;

public class BombaSQL implements BombaDAO {

	@Override
	public Iterator<Bomba> bombasComPoucaQuantidade() throws Exception {
		Connection connection = new ConexaoSQL().getConnection();
		String sql = "select b.preco as preco, "
				+ "b.qtd_restante as qtd_restante, "
				+ "p.nome_fantasia as nome_fantasia, "
				+ "c.nome as nome_combustivel from POSTO as p " + 
				"inner join BOMBA as b on p.id = b.POSTO_id " + 
				"inner join COMBUSTIVEL as c on b.COMBUSTIVEL_id = c.id " + 
				"where b.qtd_restante < 1000";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		Posto posto;
		Bomba bomba;
		Combustivel combustivel;
		List<Bomba> bombas = new ArrayList<Bomba>();
		
		
		while(result.next()) {
			posto = new Posto();
			posto.setNomeFantasia(result.getString("nome_fantasia"));
			
			combustivel = new Combustivel();
			combustivel.setDescricao(result.getString("nome_combustivel"));
			
			bomba = new Bomba();
			bomba.setCombustivel(combustivel);
			bomba.setPosto(posto);
			bomba.setPreco(result.getFloat("preco"));
			bomba.setQtdRestante(result.getFloat("qtd_restante"));
			
			bombas.add(bomba);
		}
		
		return bombas.iterator();
	}

}
