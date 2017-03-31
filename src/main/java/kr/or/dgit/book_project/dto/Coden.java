package kr.or.dgit.book_project.dto;

public class Coden {
	private String cName;		// 분류
	private String cCode;		// 코드
	
	public Coden() {	}

	public Coden(String cName, String cCode) {
		this.cName = cName;
		this.cCode = cCode;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCode() {
		return cCode;
	}

	public void setcCode(String cCode) {
		this.cCode = cCode;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", cName, cCode);
	}

	
	
	
}
