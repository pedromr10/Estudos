package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		//inserindo id como null pq colocamos que seria autoincrement
		/*depois de adicionados (persist e commit), ja foram adicionados no banco
		Pessoa p1 = new Pessoa(null, "Pedro", "pedro@gmail.com");
		Pessoa p2 = new Pessoa(null, "Alessandra", "alessandra@gmail.com");
		Pessoa p3 = new Pessoa(null, "Zeca", "zeca@gmail.com");*/
		
		//Pense nele como uma fábrica de conexões com o banco.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//O EntityManager é o objeto que faz as operações no banco.
		EntityManager em = emf.createEntityManager();
		
		//salvando no banco:
		em.getTransaction().begin(); //quando nao vai apenas fazer leitura, usar o getransaction para realizar uma transacao com o banco
		/*
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);*/
		
		//buscando pelo id:
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		//removendo pelo id:
		Pessoa pp = em.find(Pessoa.class, 2); //tem q buscar o objeto antes de remover
		em.remove(pp);
		
		em.getTransaction().commit();//confirmando as alteracoes feitas
		System.out.println("Pronto");
		em.close();
		emf.close();

	}

}
