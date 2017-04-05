package kr.or.dgit.book_project;

import java.util.List;

import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dao.PublisherInfoMapper;
import kr.or.dgit.book_project.dao.PublisherInfoMapperImpl;
import kr.or.dgit.book_project.dto.PublisherInfo;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class PublisherInfoService {

	public int insertPubliherShort(PublisherInfo publisherInfo) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession);
			int cnt = selectCountAll();
			String pCode = String.format("P%03d", cnt + 1);
			publisherInfo.setpCode(pCode);
			int res = publisherInfoMapper.insertPubliherShort(publisherInfo);
			sqlSession.commit();
			JOptionPane.showMessageDialog(null, "추가되었습니다.");
			return res;
		}
	}

	public int selectCountAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession);
			return publisherInfoMapper.selectCountAll();
		}
	}

	public List<PublisherInfo> selectByAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession);
			return publisherInfoMapper.selectByAll();
		}
	}

	public List<PublisherInfo> insertAndselectByAll(String publisher) {
		// 추가후 추가된 목록 call
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			PublisherInfoMapper publisherInfoMapper = new PublisherInfoMapperImpl(sqlSession);
			PublisherInfo publisherInfo = new PublisherInfo();
			int cnt = selectCountAll();
			String pCode = String.format("P%03d", cnt + 1);
			publisherInfo.setpCode(pCode);
			publisherInfo.setPublisher(publisher);

			publisherInfoMapper.insertPubliherShort(publisherInfo);
			sqlSession.commit();
			JOptionPane.showMessageDialog(null, "추가되었습니다.");
			return publisherInfoMapper.selectByAll();
		}

	}

}
