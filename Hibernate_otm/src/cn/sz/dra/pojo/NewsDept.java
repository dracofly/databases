package cn.sz.dra.pojo;
// Generated 2017-3-1 10:42:46 by Hibernate Tools 3.4.0.CR1

/**
 * NewsDept generated by hbm2java
 */
public class NewsDept implements java.io.Serializable {

	private int nid;
	private String dcomments;
	private String dname;

	public NewsDept() {
	}

	public NewsDept(int nid) {
		this.nid = nid;
	}

	public NewsDept(int nid, String dcomments, String dname) {
		this.nid = nid;
		this.dcomments = dcomments;
		this.dname = dname;
	}

	public int getNid() {
		return this.nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getDcomments() {
		return this.dcomments;
	}

	public void setDcomments(String dcomments) {
		this.dcomments = dcomments;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
