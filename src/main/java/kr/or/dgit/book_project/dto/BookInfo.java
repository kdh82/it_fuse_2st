package kr.or.dgit.book_project.dto;

import java.util.List;

public class BookInfo { // 도서
	private BookLend bookLend;
	private String bName; // 도서명
	private String author; // 저자
	private int price; // 가격
	private String insertDate; // 도서등록일
	private boolean isDel; // 도서폐기여부
	private Coden coden; // 분류
	private PublisherInfo publisherInfo; // 출판사 코드
	private List<PaymentIO> bookPaymentIO;

	public BookInfo() {
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public boolean isDel() {
		return isDel;
	}

	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}

	public Coden getCoden() {
		return coden;
	}

	public void setCoden(Coden coden) {
		this.coden = coden;
	}

	public PublisherInfo getPublisherInfo() {
		return publisherInfo;
	}

	public void setPublisherInfo(PublisherInfo publisherInfo) {
		this.publisherInfo = publisherInfo;
	}

	public List<PaymentIO> getBookPaymentIO() {
		return bookPaymentIO;
	}

	public void setBookPaymentIO(List<PaymentIO> bookPaymentIO) {
		this.bookPaymentIO = bookPaymentIO;
	}

	public BookLend getBookLend() {
		return bookLend;
	}

	public void setBookLend(BookLend bookLend) {
		this.bookLend = bookLend;
	}

	@Override
	public String toString() {
		return String.format(
				"%s %s %s %s %s %s %s %s %s",
				bookLend, bName, author, price, insertDate, isDel, coden, publisherInfo, bookPaymentIO);
	}

	
	
}
