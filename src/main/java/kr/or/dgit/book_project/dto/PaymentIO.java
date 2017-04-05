package kr.or.dgit.book_project.dto;

import java.util.Date;

public class PaymentIO {

	private int no; // 출납번호
	private BookInfo bookInfo; // 도서코드
	private MemberInfo memberInfo; // 회원코드
	private String lendDate; // 대여일
	private String returnDate; // 반납일

	public PaymentIO() {
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public BookInfo getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %s", no, bookInfo, memberInfo, lendDate, returnDate);
	}

}
