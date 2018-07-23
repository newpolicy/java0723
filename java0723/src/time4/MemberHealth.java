package time4;

import java.io.Serializable;

public class MemberHealth implements Serializable {
	private String email;
	private String pw;
	private String phone;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MemberHealth [email=" + email + ",\n pw=" + pw + ",\n phone=" + phone + "]";
	}
}
