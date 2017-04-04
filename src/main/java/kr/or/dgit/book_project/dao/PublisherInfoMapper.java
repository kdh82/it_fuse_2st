package kr.or.dgit.book_project.dao;

import java.util.List;

import kr.or.dgit.book_project.dto.PublisherInfo;

public interface PublisherInfoMapper {
	int insertPubliherShort(PublisherInfo publisherInfo);
	int selectCountAll();
	List<PublisherInfo> selectByAll();
}
