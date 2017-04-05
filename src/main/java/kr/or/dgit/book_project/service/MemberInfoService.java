package kr.or.dgit.book_project.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dao.MemberInfoMapper;
import kr.or.dgit.book_project.dao.MemberInfoMapperImpl;
import kr.or.dgit.book_project.dto.MemberInfo;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class MemberInfoService {
	
	public int selectCountAll(){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			MemberInfoMapper memberInfoMapper = new MemberInfoMapperImpl(sqlSession);
			int res = memberInfoMapper.selectCountAll();
			return res;
		}
	}
	
	public int insertMemberInfo(MemberInfo memberInfo){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			MemberInfoMapper memberInfoMapper = new MemberInfoMapperImpl(sqlSession);
			int res = memberInfoMapper.insertMemberInfo(memberInfo);
			sqlSession.commit();
			return res;
		}				
	}
	
	public List<MemberInfo> selectMemberByAll(){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			MemberInfoMapper memberInfoMapper = new MemberInfoMapperImpl(sqlSession);
			return memberInfoMapper.selectMemberByAll();
		}				
	}
	
	public MemberInfo findMemberInfoByCode(MemberInfo code){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			MemberInfoMapper memberInfoMapper = new MemberInfoMapperImpl(sqlSession);
			return memberInfoMapper.FindMemberInfoByCode(code);
		}
	}
	
	
}



