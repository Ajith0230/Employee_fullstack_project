package dto_emp;

public class User {
	
	private int userid;
	private String username;
	private String usermail;
	private long usercontact;
	private String userpassword;
	private String code;
	private String department;
	private int sal;
	private String hiredate;
	private String shift;
	
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public User(int userid, String username, String usermail, long usercontact, String department, int sal,
			String hiredate, String shift) {
		super();
		this.userid = userid;
		this.username = username;
		this.usermail = usermail;
		this.usercontact = usercontact;
		this.department = department;
		this.sal = sal;
		this.hiredate = hiredate;
		this.shift = shift;
	}
	public User(int userid, String username, String usermail, long usercontact, String userpassword, String code) {
		super();
		this.userid = userid;
		this.username = username;
		this.usermail = usermail;
		this.usercontact = usercontact;
		this.userpassword = userpassword;
		this.code = code;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public long getUsercontact() {
		return usercontact;
	}
	public void setUsercontact(long usercontact) {
		this.usercontact = usercontact;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
		
	}
	

