package br.com.danilo.repository;

import br.com.danilo.domain.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutoRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtoPU");

    public void save(Produto produto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }
}
