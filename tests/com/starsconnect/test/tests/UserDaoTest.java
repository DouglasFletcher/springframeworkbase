package com.starsconnect.test.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.starsconnect.dao.UsersDao;

@ActiveProfiles("dev")
@ContextConfiguration(locations = {
	"classpath:com/starsconnect/config/dao-context.xml",	
	"classpath:com/starsconnect/test/config/datasource.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest<User> {

	@Autowired
	private UsersDao usersDao;
	
	@Before
	public void init(){
	}
	
	@Test
	public void testUsers(){
		
			
		assertEquals("dummy test", 1, 1);
	}
}
