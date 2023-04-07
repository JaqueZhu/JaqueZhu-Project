package pojo;
/*
 * ctrl+i
 * @author zjq 
 * ÐÞ¸Ä×Ö·û¼¯
 *
 */
public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String unum;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUnum() {
		return unum;
	}
	public void setUnum(String unum) {
		this.unum = unum;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String upwd, String unum) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.unum = unum;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ",unum=" + unum + "]";
	}
}