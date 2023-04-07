/*
 * MiddleFRM.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

/**
 *
 * @author  __�콨ǿ__
 */
public class AdminiFRM extends javax.swing.JFrame {

	/** Creates new form MiddleFRM */
	public AdminiFRM() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jDesktopPane1 = new javax.swing.JDesktopPane();
		content1 = new javax.swing.JDesktopPane();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu2 = new javax.swing.JMenu();
		jMenu1 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		userAdd = new javax.swing.JMenuItem();
		searchUsers = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		clothAdd = new javax.swing.JMenuItem();
		searchClothes = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u540e\u53f0\u7cfb\u7edf");
		setAlwaysOnTop(true);

		content1.setBackground(new java.awt.Color(204, 255, 255));
		content1.setForeground(new java.awt.Color(102, 102, 255));

		jLabel2.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\Drinker\\MyEclipse-workspace\\java1\\src\\ima\\Ӧ�ý���.png")); // NOI18N
		jLabel2.setBounds(0, 0, 730, 412);
		content1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel1.setText("jLabel1");

		jMenu2.setText("\u5e94\u7528\u4ecb\u7ecd");
		jMenuBar1.add(jMenu2);

		jMenu1.setText("\u7cfb\u7edf\u7ba1\u7406");

		jMenu3.setText("\u7528\u6237\u7ba1\u7406");

		userAdd.setText("\u6dfb\u52a0\u7528\u6237");
		userAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				userAddActionPerformed(evt);
			}
		});
		jMenu3.add(userAdd);

		searchUsers.setText("\u67e5\u8be2\u7528\u6237");
		searchUsers.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchUsersActionPerformed(evt);
			}
		});
		jMenu3.add(searchUsers);

		jMenu1.add(jMenu3);

		jMenu4.setText("\u670d\u88c5\u7ba1\u7406");

		clothAdd.setText("\u6dfb\u52a0\u670d\u88c5");
		clothAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clothAddActionPerformed(evt);
			}
		});
		jMenu4.add(clothAdd);

		searchClothes.setText("\u670d\u88c5\u67e5\u8be2");
		searchClothes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchClothesActionPerformed(evt);
			}
		});
		jMenu4.add(searchClothes);

		jMenu1.add(jMenu4);

		jMenuBar1.add(jMenu1);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				content1, javax.swing.GroupLayout.PREFERRED_SIZE, 729,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				content1, javax.swing.GroupLayout.PREFERRED_SIZE, 414,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void searchClothesActionPerformed(java.awt.event.ActionEvent evt) {
		ClothFRM cloth = new ClothFRM();
		cloth.setVisible(true);
	}

	private void clothAddActionPerformed(java.awt.event.ActionEvent evt) {
		ClothAddFRM clothadd = new ClothAddFRM();
		clothadd.setVisible(true);
	}

	private void searchUsersActionPerformed(java.awt.event.ActionEvent evt) {
		UserFRM user = new UserFRM();
		user.setVisible(true);
	}

	private void userAddActionPerformed(java.awt.event.ActionEvent evt) {
		RegisterFRM register = new RegisterFRM();
		register.setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminiFRM().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem clothAdd;
	private javax.swing.JDesktopPane content1;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem searchClothes;
	private javax.swing.JMenuItem searchUsers;
	private javax.swing.JMenuItem userAdd;
	// End of variables declaration//GEN-END:variables

}