package kr.or.dgit.book_project.frame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageSub extends JFrame implements ActionListener {

	private JPanel contentPane;	
	private SideBar pSubMenu;
	private JPanel pTabSub;

	public PageSub() {
		setTitle("도서관리프로그램");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1000, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pSubMenu = new SideBar();
		pSubMenu.getBtnMenu4().addActionListener(this);
		pSubMenu.btnMenu3.addActionListener(this);
		pSubMenu.btnMenu2.addActionListener(this);
		pSubMenu.btnMenu1.addActionListener(this);
		pSubMenu.setBounds(15, 36, 120, 574);
		contentPane.add(pSubMenu);
		pSubMenu.setLayout(null);
		
		pTabSub = new JPanel();	
		pTabSub.setBounds(147, 10, 825, 600);
		contentPane.add(pTabSub);
		pTabSub.setLayout(new GridLayout(1, 0, 0, 0));				
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pSubMenu.getBtnMenu4()) {
			actionPerformedPSubMenuBtnMenu4(e);
		}
		if (e.getSource() == pSubMenu.btnMenu3) {
			actionPerformedPSubMenuBtnMenu3(e);
		}
		if (e.getSource() == pSubMenu.btnMenu2) {
			actionPerformedPSubMenuBtnMenu2(e);
		}
		if (e.getSource() == pSubMenu.btnMenu1) {
			actionPerformedPSubMenuBtnMenu1(e);
		}
	}
	protected void actionPerformedPSubMenuBtnMenu1(ActionEvent e) {
		pTabSub.removeAll();		
		pTabSub.add(new SubMenuPage1());
		revalidate();
		repaint();
	}
	
	protected void actionPerformedPSubMenuBtnMenu2(ActionEvent e) {
		pTabSub.removeAll();
		pTabSub.add(new SubMenuPage2());
		revalidate();
		repaint();
	}
	
	protected void actionPerformedPSubMenuBtnMenu3(ActionEvent e) {
		pTabSub.removeAll();
		pTabSub.add(new SubMenuPage3());
		revalidate();
		repaint();
	}

	public JPanel getpTabSub() {
		return pTabSub;
	}

	public void setpTabSub(JPanel pTabSub) {
		this.pTabSub = pTabSub;
	}
	
	protected void actionPerformedPSubMenuBtnMenu4(ActionEvent e) {
		setVisible(false);
	}
}
