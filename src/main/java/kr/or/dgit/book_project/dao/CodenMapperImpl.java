package kr.or.dgit.book_project.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

public class CodenMapperImpl implements CodenMapper {
	protected String namespace = "kr.or.dgit.book_project.dao.CodenMapper.";
	private static final Log log = LogFactory.getLog(CodenMapper.class);
	private SqlSession sqlSession;
}
