package kr.or.dgit.book_project.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.DropMode;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dialog.ModalExclusionType;

public class PageSub extends JFrame implements ActionListener {

	private JPanel contentPane;	
	private JPanel pTabSub;	
	private JPanel panel;

	public PageSub() {
		setTitle("도서관리프로그램");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(400, 200, 1084, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{266, 875, 0};
		gbl_contentPane.rowHeights = new int[]{661, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		pTabSub = new JPanel();
		GridBagConstraints gbc_pTabSub = new GridBagConstraints();
		gbc_pTabSub.fill = GridBagConstraints.BOTH;
		gbc_pTabSub.gridx = 1;
		gbc_pTabSub.gridy = 0;
		contentPane.add(pTabSub, gbc_pTabSub);
		GridBagLayout gbl_pTabSub = new GridBagLayout();
		gbl_pTabSub.columnWidths = new int[]{378, 0};
		gbl_pTabSub.rowHeights = new int[]{0, 0};
		gbl_pTabSub.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pTabSub.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pTabSub.setLayout(gbl_pTabSub);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 0, 0, 0));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		pTabSub.add(panel, gbc_panel);
	}
	
	public void actionPerformed(ActionEvent e) {
	}

	public JPanel getpTabSub() {
		return pTabSub;
	}

	public void setpTabSub(JPanel pTabSub) {
		this.pTabSub = pTabSub;
	}
}
