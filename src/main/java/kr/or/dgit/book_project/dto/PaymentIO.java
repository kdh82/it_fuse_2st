package kr.or.dgit.book_project.dto;

import java.util.Date;

public class PaymentIO {
	private int no;					// 출납번호
	private BookInfo bCode; 		// 도서코드
	private BookInfo bSubCode;		// 도서중복코드
	private MemberInfo mCode;		// 회원코드
	private Date lendDate;			// 대여일
	private Date returnDate;		// 반납일
	
	public PaymentIO() {	}

}
