package test;

import java.util.UUID;

import dao.ClothDAO;

public class TestCloth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClothDAO  clothDAO =new ClothDAO();
		String clothid=UUID.randomUUID().toString();//�������id
		String clothsort="����֮��";
		String clothbrand="����֮��";
		String clothstyle="����ʱ��";
		double clothprice=1688.8;
		int count=clothDAO.createCloth(clothsort, clothbrand, clothstyle, clothprice);
		if(count==1){
			System.out.println("�������·��ɹ�");
		}else{
			System.out.println("�������·�ʧ��");
		}
	}

}