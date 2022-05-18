package br.com.ifce.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;

public class FilmeRepository {
	
	public void salvar(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.save(filme);
		
		transacao.commit();
	}
	
	public void atualizar(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.saveOrUpdate(filme);
		
		transacao.commit();
	}
	
	public void remover(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		session.remove(filme);
		
		transacao.commit();
	}
	
	/*
	public void listar(Filme filme) {
		System.out.print(Filme.class);
	}*/
	
	public Filme buscarPorId(Long codigo) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		transacao = session.beginTransaction();
		
		Filme filme = session.get(Filme.class, codigo);
		
		transacao.commit();
		
		System.out.println(filme);
		
		return filme;
	}

}
