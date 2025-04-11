import config.MyPersistenceUnitInfo;
import entity.Employee;
import entity.Product;
import entity.Student;
import entity.key.ProductKey;
import entity.key.StudentKey;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.jpa.HibernatePersistenceProvider;

public class Test2 {
	public static void main(String[] args) {
		Map<String, String> props = new HashMap<>();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "create"); // create: drop & create, update: 있으면 안 건드리고 없으면 만든다.

		EntityManagerFactory emf = new HibernatePersistenceProvider()
				.createContainerEntityManagerFactory(new MyPersistenceUnitInfo(), props);
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// @IdClass()
//		{
//			Product p  = new Product();
//			p.setCode("uplus");
//			p.setNumber(1);
//			p.setColor("blue");
//
//			em.persist(p);
//			ProductKey key = new ProductKey();
//			key.setCode("uplus");
//			key.setNumber(1);
//			Product p = em.find(Product.class,em);
//			System.out.println(p);
//		}

		{
			StudentKey key = new StudentKey();
			key.setCode("uplus");
			key.setNumber(1);

			Student s = new Student();
			s.setId(key);
			s.setName("홍길동");

			em.persist(s);

		}

		em.getTransaction().commit();  // 이 시점에 테이블에 반영한다.
		em.close();
	}
}