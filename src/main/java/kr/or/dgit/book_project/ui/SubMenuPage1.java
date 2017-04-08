package kr.or.dgit.book_project.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import kr.or.dgit.book_project.ui.view.BookInsertView;
import kr.or.dgit.book_project.ui.view.BookManageView;
import kr.or.dgit.book_project.ui.view.CodenManageView;
import kr.or.dgit.book_project.ui.view.MemberInsertView;
import kr.or.dgit.book_project.ui.view.MemberSearchComboView;
import kr.or.dgit.book_project.ui.view.PublisherView;

public class SubMenuPage1 extends JTabbedPane {

private JPanel pMember;
private JPanel pManager;

	public SubMenuPage1() {		
	
		pMember = new JPanel();
		addTab("회원등록", null, pMember, null);		
		pMember.setLayout(new GridLayout(0, 1, 0, 0));
		MemberInsertView memberInsertView = new MemberInsertView();
		pMember.add(memberInsertView);		
				
		
		JPanel pMemberManager = new JPanel();
		addTab("회원관리", null, pMemberManager, null);
		pMemberManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		MemberSearchComboView panel = new MemberSearchComboView();
		pMemberManager.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		pManager = new JPanel();
		addTab("직원관리", null, pManager, null);
		pManager.setLayout(new GridLayout(1, 0, 0, 0));
		MemberInsertView memberInsertViewEmp = new MemberInsertView();
		pManager.add(memberInsertViewEmp);
		
		
	}	
}
