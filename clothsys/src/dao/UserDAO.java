package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.User;

import util.JDBCUtil;

/**
 * ���ݷ���  CRUD
 * @author �콨ǿ
 *
 */
public class UserDAO {
	//ȫ�ֱ���  3������   ���Ķ���
		ResultSet rs = null;//���ؽ����
		PreparedStatement ps=null;//Ԥ����ִ������  sql
		Connection conn =null;//����
		
		/**
		 * 
		 * @param uname
		 * @param upwd
		 * @return ע���û�
		 */
		public int  createUser(String uname,String upwd,String unum) {
			int count=0;
			String sql ="insert  t_user (uname,upwd,unum) values(?,?,?)";
			conn =JDBCUtil.getConntion();
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1, uname);
				ps.setString(2, upwd);
				ps.setString(3, unum);
				count=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
		
		public int  deleteUser(int uid) {
			int count=0;
			String sql ="delete from t_user where uid=?";
			conn =JDBCUtil.getConntion();
			try {
				ps=conn.prepareStatement(sql);
				ps.setInt(1,uid);
				count=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
		
		public int  updateUser(int uid,String uname,String upwd,String unum) {
			int count=0;
			String sql ="update  t_user set uname=?,upwd=?,unum=? where uid=?";
			conn =JDBCUtil.getConntion();
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1, uname);
				ps.setString(2, upwd);
				ps.setString(3, unum);
				ps.setInt(4, uid);
				count=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}

		public User searchUserByNameAndPwd(String uname, String upwd) {
			User user=null;
			//1.�������
			 //2.sql����д
			String sql ="select uid,uname,upwd,unum from t_user where uname=? and upwd=?";
			//3.��ȡ����
			conn =JDBCUtil.getConntion();
			try {
				//4.����ִ���������
				ps=conn.prepareStatement(sql);
				//5.���ò���
				ps.setString(1,uname);
				ps.setString(2,upwd);
				//6.ִ��sql�����ؽ����
				rs=ps.executeQuery();
				//7.ѭ��ȡֵ
				while(rs.next()) {
					int rid=rs.getInt("uid");
					String rname=rs.getString("uname");
					String rpwd=rs.getString("upwd");
					String rnum=rs.getString("unum");
					user =new User(rid,rname,rpwd,rnum);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return user;
		}
		public List<User> searchUsers() {
			List<User> list=new ArrayList<User>();
			User user=null;
			//1.�������
			 //2.sql����д
			String sql ="select uid,uname,upwd,unum from t_user";
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
					int rid=rs.getInt("uid");
					String rname=rs.getString("uname");
					String rpwd=rs.getString("upwd");
					String rnum=rs.getString("unum");
					user =new User(rid,rname,rpwd,rnum);
					list.add(user);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		public List<User> searchUsersLike(String uname) {
			List<User> list=new ArrayList<User>();
			User user=null;
			//1.�������
			 //2.sql����д
			String sql ="select uid,uname,upwd,unum from t_user where uname like ?";
			//3.��ȡ����
			conn =JDBCUtil.getConntion();
			try {
				//4.����ִ���������
				ps=conn.prepareStatement(sql);
				//5.���ò���
				ps.setString(1,"%"+uname+"%");
				//6.ִ��sql�����ؽ����
				rs=ps.executeQuery();
				//7.ѭ��ȡֵ
				while(rs.next()) {
					int rid=rs.getInt("uid");
					String rname=rs.getString("uname");
					String rpwd=rs.getString("upwd");
					String rnum=rs.getString("unum");
					user =new User(rid,rname,rpwd,rnum);
					list.add(user);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
}
