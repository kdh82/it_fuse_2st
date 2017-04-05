package kr.or.dgit.book_project.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.book_project.dao.PaymentIOMapper;
import kr.or.dgit.book_project.dao.PaymentIOMapperImpl;
import kr.or.dgit.book_project.dto.PaymentIO;
import kr.or.dgit.book_project.util.MybatisSqlSessionFactory;

public class PaymentIOService {
	
	public List<PaymentIO> selectAllPaymentIOInfo(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			PaymentIOMapper paymentIOMapper = new PaymentIOMapperImpl(sqlSession);
			return paymentIOMapper.selectAllPaymentIOInfo(param);
		}
	}
}
