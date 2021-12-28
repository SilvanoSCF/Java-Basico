package com.modelo.Model.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.modelo.Domain.Cadastro.pessoa;
import br.com.modelo.Persistencia.JDBC.ConexaoFactory;

/**
 * PessoaDAO persistencia de pessoa!!!
 * @author Silvano filho
 * 
 */
public class PessoaDAO extends GenericDAO<pessoa> {
	
	
	private Connection con = ConexaoFactory.getConnection();
	
	
	/**
	 * Método utilizado para salvar em banco sem o hibernate, mas com a mesma finalidade do metodo salvar do GenericDao
	 * @param usu Objeto pessoa 
	 */
	public void salvar02(pessoa usu){
		
		String sql = "insert into pessoa(nome, cidade, bairro) values (?,?,?)";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getCidade());
			preparador.setString(3, usu.getBairro());
			//System.out.println("");
			
			preparador.execute();
			
			System.out.println("Insert sem Hibernate.");
			System.out.println("Dado inserido com sucesso !!!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Método para alterar dados em pessoa sem a utilização de Hibernate!!!
	 * @param p1 objeto pessoa a ser alterada.
	 */
	public void alterar2(pessoa p1) {
		
		String sql = "update pessoa set nome=?, cidade=?, bairro=? where codigo=?"; 
		
			try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setString(1, p1.getNome()); 
			preparador.setString(2, p1.getCidade());
			preparador.setString(3, p1.getBairro());
			preparador.setLong(4, p1.getCodigo());
			
			preparador.execute();
			
			System.out.println(p1);
			System.out.println("Update sem Hibernate.");
			System.out.println("Alterado com sucesso!");
			
			} catch (SQLException ex) { 
				throw
			new RuntimeException(ex);
			}
		}

	/**
	 * Método para fazer a exclusão de pessoa sem a utilização de Hibernate !!!
	 * @param p1 objeto pessoa a ser excluido.
	 */
	public void excluir2(pessoa p1){
			
		String sql = "delete from pessoa where codigo=?";
			try (PreparedStatement preparador = con.prepareStatement(sql)){
			preparador.setLong(1, p1.getCodigo());
			
			preparador.execute();
				
			}catch (SQLException e){
				e.printStackTrace();
			}
			
	}
	
	/**
	 * Método para verificação, caso algum codigo for apresentado, será chamado o netodo alterar2, senão será incluidoum registro utilizando o metodo sava002, ambos sem a utilização do hibernate!!!
	 * @param p1 Objeto pessoa a ser feito verificação de inclusão ou alteração.
	 */
	public void salvamentoGenerico2(pessoa p1){
		
		if(p1.getCodigo()!=null &&p1.getCodigo()>0){
			alterar2(p1);
		}else{
			salvar02(p1);
		}
		
		
	}
	
	/**
	 * Método para realizar busca em pessoa pelo codigo sem a utilização do Hibernate!!!
	 * @param codigo atributo chave primaria de pessoa a pesquisa será feita por este atributo.
	 * @return resultado de uma pesquisa trazendo apenas um registro que sera buscado pelo campo codigo do objeto pessoa.
	 */
	//@SuppressWarnings("null")
	public pessoa buscaPorCodigo2(Long codigo) {
		// Objeto de retorno do método
		pessoa usuRetorno = null;
		String sql = "select * from pessoa where codigo=?";
		try ( PreparedStatement preparador = con.prepareStatement(sql)){ 
		preparador.setLong(1, codigo);
		// Retorno da consulta em Resultset
		ResultSet resultado = preparador.executeQuery();
		// Se tem registro
		if
		(resultado.next())
		{
		//Instancia o objeto pessoa
		usuRetorno = new pessoa();
		usuRetorno.setCodigo(resultado.getLong("codigo"));
		usuRetorno.setNome(resultado.getString("nome"));
		usuRetorno.setCidade(resultado.getString("cidade"));
		usuRetorno.setBairro(resultado.getString("bairro"));
		}
		System.out.println("Encontrado com sucesso!");
		} catch (SQLException ex) { throw new
		RuntimeException(ex);
		}
		return usuRetorno;
		}

	/**
	 * Método para buscar todos os registros de pessoa sem utilização do hibernate
	 * @return retorno detodos os registros de pessoa registradas
	 */
	public List<pessoa> buscaTodos2(){
		//Objeto de retorno do método
		List<pessoa> listaRetorno = new ArrayList<pessoa>();
		String sql = "select * from pessoa order by codigo";
		try (PreparedStatement preparador = con.prepareStatement(sql)){
		//Retorno da consulta em Resultset
		ResultSet resultado = preparador.executeQuery();
		//Navegada nos registros
		while(resultado.next()){
		//instancia o objeto pessoa
		pessoa usu = new pessoa();
		//Carga de dados no usuário
			usu.setCodigo(resultado.getLong("codigo"));
			usu.setNome(resultado.getString("nome"));
			usu.setBairro(resultado.getString("bairro"));
			usu.setCidade(resultado.getString("cidade"));
		//adiciona na lista
		listaRetorno.add(usu);
		}
		System.out.println("Busca com sucesso!");
		} catch (SQLException ex) { throw
		new RuntimeException(ex);
		}
		return listaRetorno;
		}
	
	
	/**
	 * Metodo para buscar registros de pessoa, filtrando por codico inicial e final sem utilização de Hibernate!!!
	 * @param codigo1 referencia ao valor inicial do codigo, filtro de consulta.
	 * @param codigo2 referencia ao valor final do codigo.
	 * @return
	 */
	public List<pessoa> buscaParcial2(Long codigo1, Long codigo2) {
		// Objeto de retorno do método
		List<pessoa> listaRetorno = new ArrayList<pessoa>();
		String sql = "select * from pessoa where codigo between ? and ?";
		try ( PreparedStatement preparador = con.prepareStatement(sql)){ 
		preparador.setLong(1, codigo1);
		preparador.setLong(2, codigo2);
		// Retorno da consulta em Resultset
		ResultSet resultado = preparador.executeQuery();
		// Se tem registro
		while(resultado.next()){
			//instancia o objeto pessoa
			pessoa usu = new pessoa();
			//Carga de dados no usuário
				usu.setCodigo(resultado.getLong("codigo"));
				usu.setNome(resultado.getString("nome"));
				usu.setBairro(resultado.getString("bairro"));
				usu.setCidade(resultado.getString("cidade"));
			//adiciona na lista
			listaRetorno.add(usu);
			
			}
						
			System.out.println("Busca com sucesso!");
			
			} catch (SQLException ex) { throw
			new RuntimeException(ex);
			}
				return  listaRetorno;
			}
	
	
	
	public pessoa autenticar2(pessoa usuConsulta){
		//Objeto de retorno do método
		
		pessoa usuRetorno = null;
		String sql = "select * from pessoa where nome=? and cidade=?"; 
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){
		preparador.setString(1, usuConsulta.getNome());
		preparador.setString(2, usuConsulta.getCidade());
		//Retorno da consulta em Resultset
		ResultSet resultado = preparador.executeQuery();
		//Se tem registro
		if(resultado.next()){
		//instancia o objeto pessoa
		usuRetorno = new pessoa();
		usuRetorno.setCodigo(resultado.getLong("codigo"));
		usuRetorno.setNome(resultado.getString("nome"));
		usuRetorno.setCidade(resultado.getString("cidade"));
		usuRetorno.setBairro(resultado.getString("bairro"));
		System.out.println("Usuário Autenticado");
		}
		} catch (SQLException ex) {
		throw new
		RuntimeException(ex);
		}
		return usuRetorno;
		}

	
	
	

}
