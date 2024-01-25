package dao;

import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl{

	@PersistenceContext(unitName = "postgresDB")
	private EntityManager entityManager;


	@Transactional
	public void saveStudent(Student student)
	{
		this.entityManager.persist(student);
		System.out.println("record inserted!!!");
	}
}
