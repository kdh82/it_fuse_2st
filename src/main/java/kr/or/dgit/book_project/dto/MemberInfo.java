package kr.or.dgit.book_project.dto;

public class MemberInfo {
	private String mCode;		// 회원코드
	private String mPass;		// 비밀번호
	private String mName;		// 성명
	private String mTel;		// 연락처
	private int mZipCode;		// 우편번호
	private String mAddress;	// 주소
	private char mGroup;		// A/B/C : 관리자/사서/일반회원
	private boolean isSecsn;	// 탈퇴여부
	
	public MemberInfo() {	}

	public MemberInfo(String mCode, String mPass, String mName, String mTel,
						int mZipCode, String mAddress, char mGroup, boolean isSecsn) {
		this.mCode = mCode;
		this.mPass = mPass;
		this.mName = mName;
		this.mTel = mTel;
		this.mZipCode = mZipCode;
		this.mAddress = mAddress;
		this.mGroup = mGroup;
		this.isSecsn = isSecsn;
	}

	public String getmCode() {
		return mCode;
	}

	public void setmCode(String mCode) {
		this.mCode = mCode;
	}

	public String getmPass() {
		return mPass;
	}

	public void setmPass(String mPass) {
		this.mPass = mPass;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmTel() {
		return mTel;
	}

	public void setmTel(String mTel) {
		this.mTel = mTel;
	}

	public int getmZipCode() {
		return mZipCode;
	}

	public void setmZipCode(int mZipCode) {
		this.mZipCode = mZipCode;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public char mGroup() {
		return mGroup;
	}

	public void setManager(char mGroup) {
		this.mGroup = mGroup;
	}

	public boolean isSecsn() {
		return isSecsn;
	}

	public void setSecsn(boolean isSecsn) {
		this.isSecsn = isSecsn;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s, %s, %s", 
							mCode, mPass, mName, mTel, mZipCode, mAddress, mGroup, isSecsn);
	}
}
