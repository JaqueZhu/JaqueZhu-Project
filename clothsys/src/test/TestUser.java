package test;

import pojo.User;
import dao.UserDAO;

public class TestUser {

	/**
	 * �����û�ģ����ɾ���
	 * @param args
	 */
	public static void main(String[] args) {
		TestUser.login();
	}
	public static void insertUser() {
	 
		UserDAO    userDAO = new UserDAO();
		String uname="�콨ǿ";
		String upwd ="666666";
		String unum ="19552990782";
		int count=userDAO.createUser(uname, upwd ,unum);
		if(count==1){
			System.out.println("���û�ע��ɹ�");
		}else{
			System.out.println("���û�ע��ʧ��");
		}
	}
public static void login(){
	UserDAO userDAO=new UserDAO();
	User user=userDAO.searchUserByNameAndPwd("�콨ǿ","666666");
	if(user==null){
		System.out.println("�û���¼ʧ��");
	}else{
		System.out.println("�û���¼�ɹ�");
	}
}
}