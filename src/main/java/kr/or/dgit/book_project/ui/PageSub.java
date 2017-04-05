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
import javax.swing.JLabel;

public class PageSub extends JFrame implements ActionListener {

	private JPanel contentPane;	
	private JPanel pTabSub;	
	private JPanel panel;
	private JPanel panel_1;
	private JTree tree;

	public PageSub() {
		setTitle("도서관리프로그램");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(400, 200, 1084, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout contentPaneGridBagLayout = new GridBagLayout();
		contentPaneGridBagLayout.columnWidths = new int[]{225, 529, 0};
		contentPaneGridBagLayout.rowHeights = new int[]{660, 0};
		contentPaneGridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPaneGridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(contentPaneGridBagLayout);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout panel_1GridBagLayout = new GridBagLayout();
		panel_1GridBagLayout.columnWidths = new int[]{0, 0};
		panel_1GridBagLayout.rowHeights = new int[]{0, 0};
		panel_1GridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1GridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(panel_1GridBagLayout);
		
		tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("도서관리프로그램") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("기초자료관리");
						node_1.add(new DefaultMutableTreeNode("도서등록"));
						node_1.add(new DefaultMutableTreeNode("도서관리"));
						node_1.add(new DefaultMutableTreeNode("분류관리"));
						node_1.add(new DefaultMutableTreeNode("출판사관리"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("인적자원관리");
						node_1.add(new DefaultMutableTreeNode("회원등록"));
						node_1.add(new DefaultMutableTreeNode("회원관리"));
						node_1.add(new DefaultMutableTreeNode("직원등록"));
						node_1.add(new DefaultMutableTreeNode("직원관리"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("도서출납관리");
						node_1.add(new DefaultMutableTreeNode("대여관리"));
						node_1.add(new DefaultMutableTreeNode("반납관리"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("도서출납통계");
						node_1.add(new DefaultMutableTreeNode("누적 베스트지수"));
						node_1.add(new DefaultMutableTreeNode("분야별 베스트지수"));
						node_1.add(new DefaultMutableTreeNode("월별 베스트지수"));
						node_1.add(new DefaultMutableTreeNode("분야별 월별 베스트 지수"));
						node_1.add(new DefaultMutableTreeNode("분야별 권수 비율"));
						node_1.add(new DefaultMutableTreeNode("분야별 대여 비율"));
					add(node_1);
				}
			}
		));
		
		
		
		
		GridBagConstraints gbc_tree = new GridBagConstraints();
		gbc_tree.fill = GridBagConstraints.BOTH;
		gbc_tree.gridx = 0;
		gbc_tree.gridy = 0;
		panel_1.add(tree, gbc_tree);
		
		pTabSub = new JPanel();
		GridBagConstraints gbc_pTabSub = new GridBagConstraints();
		gbc_pTabSub.fill = GridBagConstraints.BOTH;
		gbc_pTabSub.gridx = 1;
		gbc_pTabSub.gridy = 0;
		contentPane.add(pTabSub, gbc_pTabSub);
		GridBagLayout gbl_pTabSub = new GridBagLayout();
		gbl_pTabSub.columnWidths = new int[]{832, 0};
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
