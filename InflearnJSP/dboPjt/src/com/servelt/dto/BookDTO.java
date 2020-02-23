package com.servelt.dto;

public class BookDTO {
	
	String memberId;
	String memberPW;
	String memberName;
	String memberPhone;
	
	public BookDTO(String memberId, String memberPW, String memberName, String memberPhone) {
		this.memberId = memberId;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}


}
