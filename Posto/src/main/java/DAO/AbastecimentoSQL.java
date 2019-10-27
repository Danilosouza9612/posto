package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.sql.Date;
import model.Abastecimento;
import model.Bomba;
import model.Cliente;
import model.Combustivel;

public class AbastecimentoSQL implements AbastecimentoDAO{
		
	@Override
	public void novoAbastecimento(Abastecimento abastecimento) throws SQLException {
		Connection connection = new ConexaoSQL().getConnection();
		String sql = "CALL novo_abastecimento(?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setDate(1, new Date(abastecimento.getData().getTime()));
		statement.setFloat(2, abastecimento.getQtdLitros());
		statement.setInt(3, abastecimento.getBomba().getId());
		statement.setString(4, abastecimento.getCliente().getCpf());
		statement.setString(5, abastecimento.getCliente().getNome());
		
		statement.execute();
		statement.close();
		connection.close();
	}

	@Override
	public Iterator<Abastecimento> listarAbastecimentos(java.util.Date data, int postoId) throws Exception {
		Connection connection = new ConexaoSQL().getConnection();
		ResultSet result;
		Abastecimento abastecimento;
		List<Abastecimento> abastecimentos = new ArrayList<Abastecimento>();
		Combustivel combustivel;
		Cliente cliente;
		Bomba bomba;
		String sql = "SELECT c.nome as cliente_nome, "
				+ "c.cpf as cliente_cpf, "
				+ "cb.nome as combustivel_nome, "
				+ "a.qtd_litros as quantidade_litros, "
				+ "a.preco as preco_combustivel "
				+ "FROM COMBUSTIVEL as cb " + 
				"INNER JOIN BOMBA as b on cb.id = b.COMBUSTIVEL_id " + 
				"INNER JOIN ABASTECIMENTO as a on b.id = a.BOMBA_id " + 
				"INNER JOIN CLIENTE as c on a.CLIENTE_id = c.id " + 
				"WHERE DATE(a.data) = ? AND b.POSTO_ID = ? ";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setDate(1, new Date(data.getTime()));
		statement.setInt(2, postoId);
				
		result = statement.executeQuery();
		
		while(result.next()) {
			cliente = new Cliente();
			cliente.setNome(result.getString("cliente_nome"));
			cliente.setCpf(result.getString("cliente_cpf"));
			
			combustivel = new Combustivel();
			combustivel.setDescricao(result.getString("combustivel_nome"));
			
			bomba = new Bomba();
			bomba.setCombustivel(combustivel);
			
			abastecimento = new Abastecimento();
			abastecimento.setCliente(cliente);
			abastecimento.setBomba(bomba);
			abastecimento.setQtdLitros(result.getFloat("quantidade_litros"));
			abastecimento.setPreco(result.getFloat("preco_combustivel"));
			
			abastecimentos.add(abastecimento);
			
		}
		
		result.close();
		connection.close();
		return abastecimentos.iterator();
		
	}
}
