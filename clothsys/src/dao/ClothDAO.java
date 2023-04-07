package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Cloth;
import pojo.User;

import util.JDBCUtil;
/**
 * 数据访问  CRUD
 * @author 朱建强
 *
 */
public class ClothDAO {
	//全局变量  3个大佬   核心对象
		ResultSet rs = null;//返回结果集
		PreparedStatement ps=null;//预编译执行命令  sql
		Connection conn =null;//链接
		/**
		 * 
		 * @param clothid
		 * @param clothsort
		 * @param clothbrand
		 * @param clothstyle
		 * @param clothprice
		 * @return 添加衣服
		 */
		public int  createCloth(String clothsort,String clothbrand,String clothstyle,double clothprice) {
			int count=0;
			String sql ="insert  t_cloth (clothsort,clothbrand,clothstyle,clothprice) values(?,?,?,?)";
			conn =JDBCUtil.getConntion();
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1, clothsort);
				ps.setString(2, clothbrand);
				ps.setString(3, clothstyle);
				ps.setDouble(4, clothprice);
				count=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
		public int  deleteCloth(int clothid) {
			int count=0;
			String sql ="delete from t_cloth where clothid=?";
			conn =JDBCUtil.getConntion();
			try {
				ps=conn.prepareStatement(sql);
				ps.setInt(1,clothid);
				count=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
		public List<Cloth> searchClothes() {
			List<Cloth> list=new ArrayList<Cloth>();
			Cloth cloth=null;
			//1.申请变量
			 //2.sql语句编写
			String sql ="select clothid,clothsort,clothbrand,clothstyle,clothprice from t_cloth";
			//3.获取链接
			conn =JDBCUtil.getConntion();
			try {
				//4.创建执行命令对象
				ps=conn.prepareStatement(sql);
				//5.设置参数
				//6.执行sql并返回结果集
				rs=ps.executeQuery();
				//7.循环取值
				while(rs.next()) {
					int rid=rs.getInt("clothid");
					String rsort=rs.getString("clothsort");
					String rbrand=rs.getString("clothbrand");
					String rstyle=rs.getString("clothstyle");
					Double rprice=rs.getDouble("clothprice");
					cloth =new Cloth(rid,rsort,rbrand,rstyle,rprice);
					list.add(cloth);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		public List<Cloth> searchClothesLike(String clothsort) {
			List<Cloth> list=new ArrayList<Cloth>();
			Cloth cloth=null;
			//1.申请变量
			 //2.sql语句编写
			String sql ="select clothid,clothsort,clothbrand,clothstyle,clothprice from t_cloth where clothsort like ?";
			//3.获取链接
			conn =JDBCUtil.getConntion();
			try {
				//4.创建执行命令对象
				ps=conn.prepareStatement(sql);
				//5.设置参数
				ps.setString(1,"%"+clothsort+"%");
				//6.执行sql并返回结果集
				rs=ps.executeQuery();
				//7.循环取值
				while(rs.next()) {
					int rid=rs.getInt("clothid");
					String rsort=rs.getString("clothsort");
					String rbrand=rs.getString("clothbrand");
					String rstyle=rs.getString("clothstyle");
					Double rprice=rs.getDouble("clothprice");
					cloth =new Cloth(rid,rsort,rbrand,rstyle,rprice);
					list.add(cloth);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
}
