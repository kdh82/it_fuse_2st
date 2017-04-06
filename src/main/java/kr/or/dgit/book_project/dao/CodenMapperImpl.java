package kr.or.dgit.book_project.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dto.Coden;

public class CodenMapperImpl implements CodenMapper {
	protected String namespace = "kr.or.dgit.book_project.dao.CodenMapper.";
	private static final Log log = LogFactory.getLog(CodenMapper.class);
	private SqlSession sqlSession;
	
	public CodenMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public int insertCoden(Coden coden) {
		log.debug("insertCoden()");
		return sqlSession.insert(namespace + "insertCoden", coden);
	}
	@Override
	public int updateCoden(Coden coden) {
		log.debug("updateCoden()");
		return sqlSession.insert(namespace + "updateCoden", coden);
	}
}
