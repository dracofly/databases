package cn.sz.dra.pojo;
// Generated 2017-2-21 12:14:01 by Hibernate Tools 3.4.0.CR1

/**
 * NewsUsers generated by hbm2java
 */
public class NewsUsers implements java.io.Serializable {

	private Integer uid;
	private String uname;
	private String upwd;

	public NewsUsers() {
	}

	public NewsUsers(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
