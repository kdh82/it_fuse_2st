package kr.or.dgit.book_project.service;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dao.CodenMapper;
import kr.or.dgit.book_project.dao.CodenMapperImpl;
import kr.or.dgit.book_project.dto.Coden;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class CodenService {
	
	public static int insertCoden(Coden coden){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			CodenMapper codenMapper = new CodenMapperImpl(sqlSession);
			int res = codenMapper.insertCoden(coden);
			sqlSession.commit();
		return res;
		}
	}
		public static int updateCoden(Coden coden){
			try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
				CodenMapper codenMapper = new CodenMapperImpl(sqlSession);
				int res = codenMapper.updateCoden(coden);
				sqlSession.commit();
			return res;
			
		}
	}
}