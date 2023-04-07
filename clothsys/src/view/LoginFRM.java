/*
 * LoginFRM.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import javax.swing.JOptionPane;
import pojo.User;
import dao.UserDAO;

/**
 *
 * @author  __朱建强__
 */
public class LoginFRM extends javax.swing.JFrame {

	/** Creates new form LoginFRM */
	public LoginFRM() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		upwd = new javax.swing.JPasswordField();
		login = new javax.swing.JButton();
		register = new javax.swing.JButton();
		uname = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		reset = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u767b\u5f55\u7cfb\u7edf");
		setAlwaysOnTop(true);
		setBackground(new java.awt.Color(255, 51, 204));

		jLabel1.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\Drinker\\MyEclipse-workspace\\java1\\src\\ima\\账号.png")); // NOI18N
		jLabel1.setText("\u8d26\u53f7\uff1a");

		jLabel2.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\Drinker\\MyEclipse-workspace\\java1\\src\\ima\\钥匙.png")); // NOI18N
		jLabel2.setText("\u5bc6\u7801\uff1a");

		upwd.setText("666666");

		login.setText("\u767b\u5f55");
		login.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loginActionPerformed(evt);
			}
		});

		register.setText("\u6ce8\u518c");
		register.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				registerActionPerformed(evt);
			}
		});

		uname.setText("\u6731\u5efa\u5f3a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel3.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\Drinker\\MyEclipse-workspace\\java1\\src\\ima\\用户.png")); // NOI18N
		jLabel3.setText("\u7cfb\u7edf\u767b\u5f55\u754c\u9762");
		jLabel3.setMaximumSize(new java.awt.Dimension(90, 20));

		reset.setText("\u91cd\u7f6e");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(174,
																		174,
																		174)
																.addComponent(
																		register)
																.addGap(148,
																		148,
																		148)
																.addComponent(
																		login)
																.addGap(145,
																		145,
																		145)
																.addComponent(
																		reset))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(282,
																		282,
																		282)
																.addComponent(
																		jLabel3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(120,
																		120,
																		120)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jLabel1))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						upwd,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						473,
																						Short.MAX_VALUE)
																				.addComponent(
																						uname,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						473,
																						Short.MAX_VALUE))))
								.addGap(187, 187, 187)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														uname,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(79, 79, 79)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														upwd,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										56, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(login)
												.addComponent(reset)
												.addComponent(register))
								.addGap(87, 87, 87)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void registerActionPerformed(java.awt.event.ActionEvent evt) {
		new RegisterFRM().setVisible(true);
		this.dispose();
	}

	private void loginActionPerformed(java.awt.event.ActionEvent evt) {
		String name = this.uname.getText();
		String pwd = new String(this.upwd.getPassword());
		UserDAO userDAO = new UserDAO();
		User user = userDAO.searchUserByNameAndPwd(name, pwd);
		if(name.equals("朱建强")&&pwd.equals("666666")){
			JOptionPane.showMessageDialog(null, "管理员登录成功");
			this.dispose();
			new AdminiFRM().setVisible(true);
		}
		else if (user == null) {
			JOptionPane.showMessageDialog(null, "用户登录失败");
		}
		else {
			JOptionPane.showMessageDialog(null, "用户登录成功");
			this.dispose();
			new MiddleFRM().setVisible(true);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginFRM().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JButton login;
	private javax.swing.JButton register;
	private javax.swing.JButton reset;
	private javax.swing.JTextField uname;
	private javax.swing.JPasswordField upwd;
	// End of variables declaration//GEN-END:variables

}