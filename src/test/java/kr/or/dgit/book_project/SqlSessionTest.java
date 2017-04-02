package kr.or.dgit.book_project;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;


public class SqlSessionTest {
	private static SqlSessionFactory SqlSessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		SqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		SqlSessionFactory = null;
	}

	@Test
	public void testSqlSession() {
		Assert.assertNotNull(SqlSessionFactory.openSession());
	}

}
