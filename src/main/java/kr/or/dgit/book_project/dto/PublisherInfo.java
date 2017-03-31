package kr.or.dgit.book_project.dto;

public class PublisherInfo {
	private String pCode;			// 출판사코드
	private String publisher;		// 출판사명
	private String pName;			// 담당자 명
	private String pTel;			// 연락처
	private int pZipCode;			// 우편번호
	private String pAddress;		// 주소
	
	public PublisherInfo() {	}

	public PublisherInfo(String pCode, String publisher, String pName, String pTel, int pZipCode, String pAddress) {
		this.pCode = pCode;
		this.publisher = publisher;
		this.pName = pName;
		this.pTel = pTel;
		this.pZipCode = pZipCode;
		this.pAddress = pAddress;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpTel() {
		return pTel;
	}

	public void setpTel(String pTel) {
		this.pTel = pTel;
	}

	public int getpZipCode() {
		return pZipCode;
	}

	public void setpZipCode(int pZipCode) {
		this.pZipCode = pZipCode;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s", pCode, publisher, pName, pTel, pZipCode, pAddress);
	}
	
}
