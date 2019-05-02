package com.nds.nwjms.vo;

// 이부분에 implements Serializable 을 구현하면, 
// 조각 단위로 정보를 보내지 않고, 객체 단위로 정보를 보낸다고함.
// 구현하지 않은 이유는 Serializable 을 사용하기 위해서는 
// The serializable class Admin_infoVO does not declare a static final serialVersionUID field of type long
// static final 변수로 seriialVersionUID 필드를 long 타입으로 선언해줘야 함.
// 알아본 뒤에 추가하도록 하자.

public class Admin_infoVO {
	
	private String admin_id;
	private String admin_pw;
	
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_pw() {
		return admin_pw;
	}
	public void setAdmin_pw(String admin_pw) {
		this.admin_pw = admin_pw;
	}
}
