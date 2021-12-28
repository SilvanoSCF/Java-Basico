package com.modelo.Model.DAO;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.modelo.Model.Util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;



public class GenericDAO<Entidade> {
	

		
		private Class<Entidade> classe; 

	
		@SuppressWarnings("unchecked")
		public GenericDAO() {
			this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass())
					.getActualTypeArguments()[0];
		}
	
	/**
	 * Metodo Generico para salvar entidades utilizando Hibernate !!!
	 * @param entidade referencia a todo objeto generico a ser inserido no banco
	 */
	public void salvar(Entidade entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	/**
	 * M�todo Generico para verificar se uma entidade esta� sendo alterado ou salvo, utilizando hibernate !!!
	 * @param entidade referencia a todo objeto generico a ser inserido ou alterado no banco
	 */
	public void merge(Entidade entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.merge(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	/**
	 * M�todo para listar entidade generico, utilizando hibernate!!!
	 * @return resultado generico de uma consulta de todos os atributos registrados.
	 */
	@SuppressWarnings("unchecked")
	public List<Entidade> listar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(classe);
			List<Entidade> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	/**
	 * M�todo para listar entidade generico, por ordena��o de atributo nome,  utilizando hibernate!!!
	 * @return resultado generico de uma consulta de todos os atributos registrados.
	 */
	@SuppressWarnings("unchecked")
	public List<Entidade> listar(String campoOrdenacao) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(classe);
			consulta.addOrder(Order.asc(campoOrdenacao));
			List<Entidade> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	
	
	/**
	 * M�todo gnerico para busca de entidade por codigo  utilizando hibernate!!!
	 * @param codigo chave primaria de entidade, atributo referenciado para pesquisar algum registro generico.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Entidade buscar(Long codigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(classe);
			consulta.add(Restrictions.idEq(codigo));
			Entidade resultado = (Entidade) consulta.uniqueResult();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	/**
	 * M�todo Generico para fazer a exclus�o de entidade, utilizando Hibernate!!!
	 * @param entidade refer�ncia a todo objeto generico a ser retirado do banco
	 */
	public void excluir(Entidade entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.delete(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	/**
	 * M�todo generico para alterar entidade, utilizando Hibernate!!!
	 * @param entidade refer�ncia a todo objeto generico a ser alterado do banco
	 */
	public void editar(Entidade entidade) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.update(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	
	


	
}