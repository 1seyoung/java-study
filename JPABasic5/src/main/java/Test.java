import config.MyPersistenceUnitInfo;
import entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.jpa.HibernatePersistenceProvider;

public class Test {
	public static void main(String[] args) {
		Map<String, String> props = new HashMap<>();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "create"); // create : drop & create, update : 있으면 안 만들고 유지

		EntityManagerFactory emf = new HibernatePersistenceProvider().createContainerEntityManagerFactory(
				new MyPersistenceUnitInfo(), props
		);
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee emp = new Employee();
		emp.setName("홍길동");
		emp.setAddress("서울 어디");

		em.persist(emp);

		em.getTransaction().commit(); // 이 시점에 테이블에 반영된다.
		em.close();
	}
}