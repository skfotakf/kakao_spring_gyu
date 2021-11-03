package com.spring.kakao.model.json;

public class SignUpVo {

	private String signUpEmail;
	private int emailFlag;
	private String signUppassword;
	private String signUpName;
	private String signUpPhone;
	public String getSignUpEmail() {
		return signUpEmail;
	}
	public void setSignUpEmail(String signUpEmail) {
		this.signUpEmail = signUpEmail;
	}
	public int getEmailFlag() {
		return emailFlag;
	}
	public void setEmailFlag(int emailFlag) {
		this.emailFlag = emailFlag;
	}
	public String getSignUppassword() {
		return signUppassword;
	}
	public void setSignUppassword(String signUppassword) {
		this.signUppassword = signUppassword;
	}
	public String getSignUpName() {
		return signUpName;
	}
	public void setSignUpName(String signUpName) {
		this.signUpName = signUpName;
	}
	public String getSignUpPhone() {
		return signUpPhone;
	}
	public void setSignUpPhone(String signUpPhone) {
		this.signUpPhone = signUpPhone;
	}
	@Override
	public String toString() {
		return "SignUpVo [signUpEmail=" + signUpEmail + ", emailFlag=" + emailFlag + ", signUppassword="
				+ signUppassword + ", signUpName=" + signUpName + ", signUpPhone=" + signUpPhone + "]";
	}
	
	
}
