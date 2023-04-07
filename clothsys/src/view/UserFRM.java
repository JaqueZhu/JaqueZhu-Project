/*
 * UserFRM.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Color;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.User;
import dao.UserDAO;

/**
 *
 * @author  __�콨ǿ__
 */
public class UserFRM extends javax.swing.JFrame {

	/** Creates new form UserFRM */
	public UserFRM() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setBackground(Color.blue);
		DefaultTableModel model = (DefaultTableModel) this.userTable.getModel();
		UserDAO userDao = new UserDAO();
		List<User> list = userDao.searchUsers();
		for (int i = 0; i < list.size(); i++) {
			Vector v = new Vector();
			v.add(list.get(i).getUid());
			v.add(list.get(i).getUname());
			v.add(list.get(i).getUpwd());
			v.add(list.get(i).getUnum());
			model.addRow(v);
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		userTable = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		seoUname = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u7528\u6237\u4e00\u89c8\u754c\u9762");

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel1.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\Drinker\\MyEclipse-workspace\\java1\\src\\ima\\�û�.png")); // NOI18N
		jLabel1.setText("\u7528\u6237\u7ba1\u7406\u754c\u9762");

		userTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "�û����", "����", "����", "�绰" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		userTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				userTableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(userTable);

		jButton1.setText("\u5220\u9664");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});


		jLabel2.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\Drinker\\MyEclipse-workspace\\java1\\src\\ima\\����.png")); // NOI18N
		jLabel2.setText("\u8bf7\u8f93\u5165\u5173\u952e\u5b57\uff1a");

		jButton3.setText("\u641c\u7d22");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel3.setText("\u9009\u4e2d\uff1a");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addGap(267,
																										267,
																										267)
																								.addComponent(
																										jButton1)
																								.addGap(221,
																										221,
																										221)
																								.addComponent(
																										jButton2))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addGap(33,
																										33,
																										33)
																								.addComponent(
																										jLabel3)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jTextField1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										170,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										181,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField3))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addGap(296,
																										296,
																										296)
																								.addComponent(
																										jLabel1))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addGap(257,
																										257,
																										257)
																								.addComponent(
																										jLabel2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										seoUname,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										151,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(37,
																										37,
																										37)
																								.addComponent(
																										jButton3)))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextField4,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		205,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap(
																		122,
																		Short.MAX_VALUE)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		747,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(84, 84, 84)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(39, 39, 39)
								.addComponent(jLabel1)
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jButton3)
												.addComponent(
														seoUname,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										189,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(46, 46, 46)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										67, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addGap(96, 96, 96)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		String uname = this.seoUname.getText();
		DefaultTableModel model = (DefaultTableModel) this.userTable.getModel();
		model.setRowCount(0);
		UserDAO userDao = new UserDAO();
		List<User> list = userDao.searchUsersLike(uname);
		for (int i = 0; i < list.size(); i++) {
			Vector v = new Vector();
			v.add(list.get(i).getUid());
			v.add(list.get(i).getUname());
			v.add(list.get(i).getUpwd());
			v.add(list.get(i).getUnum());
			model.addRow(v);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String uid = this.jTextField1.getText();
		String uname = this.jTextField2.getText();
		String upwd = this.jTextField3.getText();
		String unum = this.jTextField4.getText();
		if ("".equals(uid) || uid.length() == 0) {
			JOptionPane.showMessageDialog(null, "����ѡ��һ������");
			return;
		} else {
			int result = JOptionPane.showConfirmDialog(null, "��ȷ���޸���");
			if (result == 0) {
				UserDAO userDao = new UserDAO();
				int count = userDao.updateUser(Integer.parseInt(uid), uname,upwd, unum);
				if (count > 0) {
					JOptionPane.showMessageDialog(null, "�޸��û����ݳɹ�");
					DefaultTableModel model = (DefaultTableModel) this.userTable
							.getModel();
					model.setRowCount(0);
					List<User> list = userDao.searchUsersLike(uname);
					for (int i = 0; i < list.size(); i++) {
						Vector v = new Vector();
						v.add(list.get(i).getUid());
						v.add(list.get(i).getUname());
						v.add(list.get(i).getUpwd());
						v.add(list.get(i).getUnum());
						model.addRow(v);
					}
				} else {
					JOptionPane.showMessageDialog(null, "�޸��û�����ʧ��");
				}
			}
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String uid = this.jTextField1.getText();
		String uname = this.seoUname.getText();
		if ("".equals(uid) || uid.length() == 0) {
			JOptionPane.showMessageDialog(null, "����ѡ��һ������");
			return;
		} else {
			int result = JOptionPane.showConfirmDialog(null, "��ȷ��ɾ����");
			if (result == 0) {
				UserDAO userDao = new UserDAO();
				int count = userDao.deleteUser(Integer.parseInt(uid));
				if (count > 0) {
					JOptionPane.showMessageDialog(null, "ɾ���û����ݳɹ�");
					DefaultTableModel model = (DefaultTableModel) this.userTable
							.getModel();
					model.setRowCount(0);
					List<User> list = userDao.searchUsersLike(uname);
					for (int i = 0; i < list.size(); i++) {
						Vector v = new Vector();
						v.add(list.get(i).getUid());
						v.add(list.get(i).getUname());
						v.add(list.get(i).getUpwd());
						v.add(list.get(i).getUnum());
						model.addRow(v);
					}
				} else {
					JOptionPane.showMessageDialog(null, "ɾ���û�����ʧ��");
				}
			}
		}
	}

	private void userTableMousePressed(java.awt.event.MouseEvent evt) {
		int row = this.userTable.getSelectedRow();
		this.jTextField1.setText(this.userTable.getValueAt(row, 0).toString());
		this.jTextField2.setText(this.userTable.getValueAt(row, 1).toString());
		this.jTextField3.setText(this.userTable.getValueAt(row, 2).toString());
		this.jTextField4.setText(this.userTable.getValueAt(row, 3).toString());
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserFRM().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField seoUname;
	private javax.swing.JTable userTable;
	// End of variables declaration//GEN-END:variables

}