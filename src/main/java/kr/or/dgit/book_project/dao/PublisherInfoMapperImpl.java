package kr.or.dgit.book_project.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dto.PublisherInfo;

public class PublisherInfoMapperImpl implements PublisherInfoMapper {
	protected String namespace="kr.or.dgit.book_project.dao.PublisherInfoMapper.";
	private static final Log log = LogFactory.getLog(PublisherInfoMapper.class);	
	private SqlSession sqlSession;
	
	public PublisherInfoMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public PublisherInfo selectPublisherInfo(PublisherInfo publisherinfo) {
		log.debug("selectPublisherInfo()");
		return sqlSession.selectOne(namespace+"selectPublisherInfo",publisherinfo);
	}

	@Override
	public int insertAllPublisherInfo(PublisherInfo publisherInfo) {
		log.debug("insertAllPublisherInfo()");
		return sqlSession.insert(namespace+"insertAllPublisherInfo", publisherInfo);
	}

	@Override
	public int updateSetPublisherInfo(PublisherInfo publisherInfo) {
		log.debug("updateSetPublisherInfo()");
		return sqlSession.update(namespace+"updateSetPublisherInfo", publisherInfo);
	}

	@Override
	public List<PublisherInfo> selectPublisherInfoByAll(RowBounds rowBounds) {
		log.debug("selectPublisherInfoByAll()");
		return sqlSession.selectList(namespace+"selectPublisherInfoByAll", null, rowBounds);
	}
}
