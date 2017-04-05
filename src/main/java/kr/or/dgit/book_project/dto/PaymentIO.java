package kr.or.dgit.book_project.dto;

import java.util.Date;

public class PaymentIO {

	private int no; // 출납번호
	private String bCode; // 도서코드
	private String bSubCode; // 도서중복코드
	private String mCode; // 회원코드
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

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbSubCode() {
		return bSubCode;
	}

	public void setbSubCode(String bSubCode) {
		this.bSubCode = bSubCode;
	}

	public String getmCode() {
		return mCode;
	}

	public void setmCode(String mCode) {
		this.mCode = mCode;
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
		return String.format("%s %s %s %s %s %s", no, bCode, bSubCode, mCode, lendDate, returnDate);
	}

}
