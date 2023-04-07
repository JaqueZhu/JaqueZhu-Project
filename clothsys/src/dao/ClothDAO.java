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
 * ���ݷ���  CRUD
 * @author �콨ǿ
 *
 */
public class ClothDAO {
	//ȫ�ֱ���  3������   ���Ķ���
		ResultSet rs = null;//���ؽ����
		PreparedStatement ps=null;//Ԥ����ִ������  sql
		Connection conn =null;//����
		/**
		 * 
		 * @param clothid
		 * @param clothsort
		 * @param clothbrand
		 * @param clothstyle
		 * @param clothprice
		 * @return ����·�
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
			//1.�������
			 //2.sql����д
			String sql ="select clothid,clothsort,clothbrand,clothstyle,clothprice from t_cloth";
			//3.��ȡ����
			conn =JDBCUtil.getConntion();
			try {
				//4.����ִ���������
				ps=conn.prepareStatement(sql);
				//5.���ò���
				//6.ִ��sql�����ؽ����
				rs=ps.executeQuery();
				//7.ѭ��ȡֵ
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
			//1.�������
			 //2.sql����д
			String sql ="select clothid,clothsort,clothbrand,clothstyle,clothprice from t_cloth where clothsort like ?";
			//3.��ȡ����
			conn =JDBCUtil.getConntion();
			try {
				//4.����ִ���������
				ps=conn.prepareStatement(sql);
				//5.���ò���
				ps.setString(1,"%"+clothsort+"%");
				//6.ִ��sql�����ؽ����
				rs=ps.executeQuery();
				//7.ѭ��ȡֵ
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
