package kr.or.dgit.book_project.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

public class BookLendMapperImpl implements BookLendMapper {
	private String namespace="kr.or.dgit.book_pjt.dao.BookLendMapper.";
	private static final Log log = LogFactory.getLog(BookInfoMapper.class);
	private SqlSession sqlSession;	
	public BookLendMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
}
