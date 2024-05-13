package kh.mclass.test1.member.model.dto;

public class MemberRes {
	private String memId;
	private String memPwd;
	private String memEamil;
	
	@Override
	public String toString() {
		return "MemberRes [memId=" + memId + ", memPwd=" + memPwd + ", memEamil=" + memEamil + "]";
	}

	public MemberRes() {
		super();
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getMemEamil() {
		return memEamil;
	}

	public void setMemEamil(String memEamil) {
		this.memEamil = memEamil;
	}

	
	
}
