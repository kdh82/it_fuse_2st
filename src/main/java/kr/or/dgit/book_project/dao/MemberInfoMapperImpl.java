package kr.or.dgit.book_project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dto.MemberInfo;

public class MemberInfoMapperImpl implements MemberInfoMapper {
	private String namespace="kr.or.dgit.book_project.dao.MemberInfoMapper.";
	private static final Log log = LogFactory.getLog(MemberInfoMapper.class);
	private SqlSession sqlSession;	
	
	public MemberInfoMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public int selectCountAll() {
		log.debug("selectCountAll()");		
		return sqlSession.selectOne(namespace+"selectCountAll");
	}

	@Override
	public int insertMemberInfo(MemberInfo memberInfo) {
		log.debug("insertMemberInfo()");
		return sqlSession.insert(namespace+"insertMemberInfo", memberInfo);
	}

	@Override
	public List<MemberInfo> selectMemberByAll() {
		log.debug("selectMemberByAll()");
		return sqlSession.selectList(namespace+"selectMemberByAll");
	}

	@Override
	public MemberInfo FindMemberInfoByCode(MemberInfo code) {
		log.debug("findMemberInfoByCode()");
		return sqlSession.selectOne(namespace+"findMemberInfoByCode", code);
	}
	

	
}
