package kr.or.dgit.book_project.service;

import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import kr.or.dgit.book_project.dao.PublisherInfoMapper;
import kr.or.dgit.book_project.dao.PublisherInfoMapperImpl;
import kr.or.dgit.book_project.dto.PublisherInfo;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class PublisherInfoService {
	
	public static int insertAllPublisherInfo(PublisherInfo publisherInfo){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession); 
			int res = publisherInfoMapper.insertAllPublisherInfo(publisherInfo);
			sqlSession.commit();
			return res;
		}
	}
	public static int updateSetPublisherInfo(PublisherInfo publisherInfo){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession);
			int res = publisherInfoMapper.updateSetPublisherInfo(publisherInfo);
			sqlSession.commit();
			return res;
		}
	}
	public List<PublisherInfo> selectPublisherInfoByAll(RowBounds rowBounds){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession);
		return 	publisherInfoMapper.selectPublisherInfoByAll(rowBounds);	
		}	
	}
	public static PublisherInfo selectPublisherInfo(PublisherInfo publisherinfo) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession);
		return publisherInfoMapper.selectPublisherInfo(publisherinfo);
	}
}
}
