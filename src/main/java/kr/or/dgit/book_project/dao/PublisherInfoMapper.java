package kr.or.dgit.book_project.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import kr.or.dgit.book_project.dto.PublisherInfo;


public interface PublisherInfoMapper {
	int insertPubliherShort(PublisherInfo publisherInfo);

	int selectCountAll();

	List<PublisherInfo> selectByAll();

	PublisherInfo selectPublisherInfo(PublisherInfo publisherinfo);

	int insertAllPublisherInfo(PublisherInfo publisherInfo);

	int updateSetPublisherInfo(PublisherInfo publisherInfo);

	List<PublisherInfo> selectPublisherInfoByAll(RowBounds rowBounds);
}
