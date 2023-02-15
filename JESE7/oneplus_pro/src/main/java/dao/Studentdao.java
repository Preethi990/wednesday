package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Studentdao {
EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("abc");
EntityManager entityManager = entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction = entityManager.getTransaction();

public void insert(Student student){
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
}
}
