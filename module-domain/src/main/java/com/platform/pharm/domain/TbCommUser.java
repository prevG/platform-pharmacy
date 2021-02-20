package com.platform.pharm.domain;

public class TbCommUser extends TbCommColumn {

	private long   usrNo;
	private String usrNm;
	private String usrPhnNo;
	private String usrEmlId;
	
	public long getUsrNo() {
		return usrNo;
	}
	public void setUsrNo(long usrNo) {
		this.usrNo = usrNo;
	}
	public String getUsrNm() {
		return usrNm;
	}
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	public String getUsrPhnNo() {
		return usrPhnNo;
	}
	public void setUsrPhnNo(String usrPhnNo) {
		this.usrPhnNo = usrPhnNo;
	}
	public String getUsrEmlId() {
		return usrEmlId;
	}
	public void setUsrEmlId(String usrEmlId) {
		this.usrEmlId = usrEmlId;
	}
}
