import java.util.HashMap;

import org.hibernate.jpa.HibernatePersistenceProvider;

import config.MyPersistenceUnitInfo;
import entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test {

	public static void main(String[] args) {
		// EntityManager <= EntityManagerFactory
		// src/main/resources/META-INF/persitence.xml
		EntityManagerFactory emf = new HibernatePersistenceProvider().createContainerEntityManagerFactory(
				new MyPersistenceUnitInfo(), new HashMap<>()
		); // my persistence unit
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		// persistence 작업
		// class   - table 
		// Employee - employee
		
		// #1. persist
		// 현재 테이블에 없는 객체를 생성한 후 객체의 내용을 테이블에 반영 (insert)
//		{
//			Employee e = new Employee();
//			e.setId(2);
//			e.setName("이길동");
//			e.setAddress("서울 어디");
//			
//			em.persist(e); // 영속화 ( 이 시점에 insert 되지 않는다. )
//			
//			e.setAddress("경기 어디");
//		}

		// #2. find
		// 현재 테이블에 있는 데이터를 객체로 전환 (select) 영속화 
		{
			Employee e = em.find(Employee.class, 1); // id 가 1
			System.out.println(e);
			e.setAddress("여수 어디");  // 이 시점에 update X, 영속화 된 객체의 필드값을 변경하면 DB 반영된다.
			System.out.println(e);
		}
		
		em.getTransaction().commit();  // 이 시점에 테이블에 반영한다.
		
		em.close();
	}

}
