package kr.or.dgit.book_project;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dao.BookInfoMapper;
import kr.or.dgit.book_project.dao.BookInfoMapperImpl;
import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class BookInfoService {

	public int insertBookInfo(BookInfo bookInfo) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			BookInfoMapper bookInfoMapper = new BookInfoMapperImpl(sqlSession);
			int res = bookInfoMapper.insertBookInfo(bookInfo);
			sqlSession.commit();
			return res;
		}
	}

	public int delBookInfo(BookInfo bookInfo) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			BookInfoMapper bookInfoMapper = new BookInfoMapperImpl(sqlSession);
			int res = bookInfoMapper.delBookInfo(bookInfo);
			sqlSession.commit();
			return res;
		}
	}

	public int updateBookInfo(BookInfo bookInfo) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			BookInfoMapper bookInfoMapper = new BookInfoMapperImpl(sqlSession);
			int res = bookInfoMapper.updateBookInfo(bookInfo);
			sqlSession.commit();
			return res;
		}
	}

	public List<BookInfo> selectBookInfo(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			BookInfoMapper bookInfoMapper = new BookInfoMapperImpl(sqlSession);
			return bookInfoMapper.selectBookInfo(param);
		}

	}

	public List<BookInfo> selectBookInfoByAllBook(Boolean isDel) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			BookInfoMapper bookInfoMapper = new BookInfoMapperImpl(sqlSession);
			return bookInfoMapper.selectBookInfoByAllBook(isDel);
		}
	}

	public int selectBookInfoCountBy(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			BookInfoMapper bookInfoMapper = new BookInfoMapperImpl(sqlSession);
			return bookInfoMapper.selectBookInfoCountBy(param);
		}
	}

	public BookInfo selectBookInfoOne(BookInfo bookInfo) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			BookInfoMapper bookInfoMapper = new BookInfoMapperImpl(sqlSession);
			return bookInfoMapper.selectBookInfoOne(bookInfo);
		}
	}

}
