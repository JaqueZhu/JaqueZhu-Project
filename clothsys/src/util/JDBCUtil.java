package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * �������ݿ����
 * @author �콨ǿ
 *
 */

public class JDBCUtil {
 private static final String DRIVER="com.mysql.jdbc.Driver";
 private static final String URL="jdbc:mysql://127.0.0.1:3306/java1";
 private static final String NANE="root";
 private static final String PASS="6";
 /**
  * ��ȡ����
  * @return
  */
 public static Connection getConntion(){
	  Connection conn=null;
	  try{
	  Class.forName(DRIVER);//ָ����������  
      conn = DriverManager.getConnection(URL,NANE,PASS);//��ȡ���� 
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	  return conn;
 }
 /**
  * �ر����ݿ�
  * @param rs
  * @param ps
  * @param conn
  */
 public  static void closeAll(ResultSet rs,PreparedStatement ps,Connection conn){
	try{
		 if(rs!=null){
			 rs.close();
		 }

		 if(rs!=null){
			 ps.close();
		 }

		 if(rs!=null){
			 conn.close();
		 }
	}catch(Exception e){
		e.printStackTrace();
	}
 }
}