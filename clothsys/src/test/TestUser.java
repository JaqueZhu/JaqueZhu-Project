package test;

import pojo.User;
import dao.UserDAO;

public class TestUser {

	/**
	 * 测试用户模块增删查改
	 * @param args
	 */
	public static void main(String[] args) {
		TestUser.login();
	}
	public static void insertUser() {
	 
		UserDAO    userDAO = new UserDAO();
		String uname="朱建强";
		String upwd ="666666";
		String unum ="19552990782";
		int count=userDAO.createUser(uname, upwd ,unum);
		if(count==1){
			System.out.println("新用户注册成功");
		}else{
			System.out.println("新用户注册失败");
		}
	}
public static void login(){
	UserDAO userDAO=new UserDAO();
	User user=userDAO.searchUserByNameAndPwd("朱建强","666666");
	if(user==null){
		System.out.println("用户登录失败");
	}else{
		System.out.println("用户登录成功");
	}
}
}