package kr.or.dgit.book_project.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.book_project.dto.MemberInfo;

public interface MemberInfoMapper {
	int selectCountAll();								//회원 수 
	int insertMemberInfo(MemberInfo memberInfo);		//회원삽입
	List<MemberInfo> selectMemberByAll();				//목록출력
	MemberInfo FindMemberInfoByCode(MemberInfo code);	//회원검색

}
