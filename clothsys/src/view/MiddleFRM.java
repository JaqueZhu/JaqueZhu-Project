/*
 * Admini.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

/**
 *
 * @author  __�콨ǿ__
 */
public class MiddleFRM extends javax.swing.JFrame {

	/** Creates new form Admini */
	public MiddleFRM() {
		initComponents();
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
		jLabel1 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jDesktopPane1.setBackground(new java.awt.Color(153, 204, 255));
		jDesktopPane1.setForeground(new java.awt.Color(204, 204, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\Drinker\\MyEclipse-workspace\\java1\\src\\ima\\Ӧ�ý���.png")); // NOI18N
		jLabel1.setBounds(0, 0, 730, 412);
		jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jMenu1.setText("\u5e94\u7528\u4ecb\u7ecd");
		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u7cfb\u7edf\u7ba1\u7406");

		jMenu3.setText("\u670d\u88c5\u7ba1\u7406");

		jMenuItem1.setText("\u6dfb\u52a0\u670d\u88c5");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem1);

		jMenuItem2.setText("\u670d\u88c5\u67e5\u8be2");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem2);

		jMenu2.add(jMenu3);

		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		jMenu1.setText("\u5e94\u7528\u4ecb\u7ecd");
		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u7cfb\u7edf\u7ba1\u7406");

		jMenu3.setText("\u670d\u88c5\u7ba1\u7406");

		jMenuItem1.setText("\u6dfb\u52a0\u670d\u88c5");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem1);

		jMenuItem2.setText("\u670d\u88c5\u67e5\u8be2");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem2);

		jMenu2.add(jMenu3);

		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		ClothFRM cloth = new ClothFRM();
		cloth.setVisible(true);
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		ClothAddFRM clothadd = new ClothAddFRM();
		clothadd.setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MiddleFRM().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	// End of variables declaration//GEN-END:variables

}