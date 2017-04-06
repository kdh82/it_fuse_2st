package kr.or.dgit.book_project.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.dto.PaymentIO;

public interface PaymentIOMapper {
	
	List<PaymentIO> selectAllPaymentIOInfo(Map<String, Object> param);
	
	int getbcode(BookInfo bookinfo);
	int insertPaymentIO(Map<String, Object> param);
	
}
