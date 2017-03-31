package kr.or.dgit.book_project.frame;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import kr.or.dgit.book_project.view_panel.BookInsertView;
import kr.or.dgit.book_project.view_panel.CodenManageView;
import kr.or.dgit.book_project.view_panel.CodenView;
import kr.or.dgit.book_project.view_panel.MemberInsertView;
import kr.or.dgit.book_project.view_panel.PublisherView;

public class SubMenuPage1 extends JTabbedPane {

private JPanel pMember;
private JPanel pBook;
private JPanel pManager;
private JPanel pPublisher;
private JPanel pCoden;

	public SubMenuPage1() {		
		pBook = new JPanel();		
		addTab("도서관리", null, pBook, null);
		pBook.setLayout(new GridLayout(0, 1, 0, 0));
		BookInsertView bookInsertview = new BookInsertView();
		pBook.add(bookInsertview);
		
		pMember = new JPanel();
		addTab("회원등록", null, pMember, null);		
		pMember.setLayout(new GridLayout(0, 1, 0, 0));
		MemberInsertView memberInsertView = new MemberInsertView();
		pMember.add(memberInsertView);		
				
		
		JPanel pMemberManager = new JPanel();
		addTab("회원관리", null, pMemberManager, null);
		pMemberManager.setLayout(new GridLayout(0, 1, 0, 0));
		
		pManager = new JPanel();
		addTab("직원관리", null, pManager, null);
		pManager.setLayout(new GridLayout(1, 0, 0, 0));
		MemberInsertView memberInsertViewEmp = new MemberInsertView();
		pManager.add(memberInsertViewEmp);
		
		
		pPublisher = new JPanel();
		addTab("출판사관리", null, pPublisher, null);
		pPublisher.setLayout(new GridLayout(0, 1, 0, 0));
		PublisherView publisherView = new PublisherView();
		pPublisher.add(publisherView);
		
		pCoden = new JPanel();
		addTab("분류관리", null, pCoden, null);
		pCoden.setLayout(new GridLayout(0, 1, 0, 0));
		CodenManageView codenManagerView = new CodenManageView();
		pCoden.add(codenManagerView);
	}	
}
