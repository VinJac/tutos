import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.UsersDao;
import com.entities.Users;

public class UsersTest {
	
	private static ClassPathXmlApplicationContext context;
	private static UsersDao usersDao;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		usersDao = (UsersDao)context.getBean("UsersDao");
	}

	@After
	public void tearDown() throws Exception {
		 context.close();
	}

	@Test
	public void testSaveOrUpdate() {
		Users newUser = new Users();
		newUser.setUserName("ALLAM");
		newUser.setEmail("allam@gmail.com");
		usersDao.saveOrUpdate(newUser);
	}
}
