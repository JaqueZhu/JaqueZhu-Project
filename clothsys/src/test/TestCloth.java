package test;

import java.util.UUID;

import dao.ClothDAO;

public class TestCloth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClothDAO  clothDAO =new ClothDAO();
		String clothid=UUID.randomUUID().toString();//随机生成id
		String clothsort="海澜之家";
		String clothbrand="海澜之家";
		String clothstyle="休闲时尚";
		double clothprice=1688.8;
		int count=clothDAO.createCloth(clothsort, clothbrand, clothstyle, clothprice);
		if(count==1){
			System.out.println("购买新衣服成功");
		}else{
			System.out.println("购买新衣服失败");
		}
	}

}