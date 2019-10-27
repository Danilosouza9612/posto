package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Faturamento;
import model.Posto;

public class PostoSQL implements PostoDAO{

	@Override
	public Iterator<Faturamento> listarFaturamentos() throws Exception {
		String sql = "SELECT p.nome_fantasia, (sum(a.preco)*sum(a.qtd_litros)) as faturamento FROM ABASTECIMENTO as a\n" + 
				"INNER JOIN BOMBA as b " + 
				"ON b.id = a.BOMBA_id " + 
				"INNER JOIN POSTO as p " + 
				"ON p.id = b.POSTO_id " + 
				"GROUP BY p.id";
		
		Connection connection = new ConexaoSQL().getConnection();
		List<Faturamento> faturamentos = new ArrayList<Faturamento>();
		Faturamento faturamento;
		Posto posto;
		ResultSet result = connection.prepareStatement(sql).executeQuery();
		
		while(result.next()) {
			posto = new Posto();
			posto.setNomeFantasia(result.getString("nome_fantasia"));
			faturamento = new Faturamento();
			faturamento.setPosto(posto);
			faturamento.setFaturamento(result.getFloat("faturamento"));
			
			faturamentos.add(faturamento);
		}
		
		return faturamentos.iterator();
	}
}
