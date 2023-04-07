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
 * 数据访问  CRUD
 * @author 朱建强
 *
 */
public class UserDAO {
	//全局变量  3个大佬   核心对象
		ResultSet rs = null;//返回结果集
		PreparedStatement ps=null;//预编译执行命令  sql
		Connection conn =null;//链接
		
		/**
		 * 
		 * @param uname
		 * @param upwd
		 * @return 注册用户
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
			//1.申请变量
			 //2.sql语句编写
			String sql ="select uid,uname,upwd,unum from t_user where uname=? and upwd=?";
			//3.获取链接
			conn =JDBCUtil.getConntion();
			try {
				//4.创建执行命令对象
				ps=conn.prepareStatement(sql);
				//5.设置参数
				ps.setString(1,uname);
				ps.setString(2,upwd);
				//6.执行sql并返回结果集
				rs=ps.executeQuery();
				//7.循环取值
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
			//1.申请变量
			 //2.sql语句编写
			String sql ="select uid,uname,upwd,unum from t_user";
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
			//1.申请变量
			 //2.sql语句编写
			String sql ="select uid,uname,upwd,unum from t_user where uname like ?";
			//3.获取链接
			conn =JDBCUtil.getConntion();
			try {
				//4.创建执行命令对象
				ps=conn.prepareStatement(sql);
				//5.设置参数
				ps.setString(1,"%"+uname+"%");
				//6.执行sql并返回结果集
				rs=ps.executeQuery();
				//7.循环取值
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
