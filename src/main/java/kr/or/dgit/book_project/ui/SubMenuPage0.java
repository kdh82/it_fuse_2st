package kr.or.dgit.book_project.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import kr.or.dgit.book_project.ui.view.BookInsertView;
import kr.or.dgit.book_project.ui.view.BookManageView;
import kr.or.dgit.book_project.ui.view.CodenManageView;
import kr.or.dgit.book_project.ui.view.DiscardBookManage;
import kr.or.dgit.book_project.ui.view.PublisherView;
import java.awt.Dimension;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SubMenuPage0 extends JTabbedPane implements ChangeListener {

private JPanel pMember;
private JPanel pBook;
private JPanel pManager;
private JPanel pPublisher;
private JPanel pCoden;
private JPanel pBookManager;
private JPanel pDiscardBook;

	public SubMenuPage0() {
		addChangeListener(this);		
		pBook = new JPanel();		
		addTab("도서등록", null, pBook, null);
		pBook.setLayout(new GridLayout(0, 1, 0, 0));
		BookInsertView bookInsertview = new BookInsertView();
		pBook.add(bookInsertview);
		
		pBookManager = new JPanel();
		addTab("도서관리", null, pBookManager, null);
		pBookManager.setLayout(new GridLayout(0, 1, 0, 0));
		BookManageView bookManageView = new BookManageView();
		pBookManager.add(bookManageView);
		
		pDiscardBook = new JPanel();
		addTab("폐기도서", null, pDiscardBook, null);
		pDiscardBook.setLayout(new BorderLayout(0, 0));
		DiscardBookManage discardBookManage = new DiscardBookManage();
		pDiscardBook.add(discardBookManage);
		
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
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == this) {
			System.out.println(e.getSource());
			JOptionPane.showMessageDialog(null, "도서등록");
		}
		if (e.getSource() == pBookManager) {
			JOptionPane.showMessageDialog(null, "도서관리");
		}
		if (e.getSource() == pDiscardBook) {
			JOptionPane.showMessageDialog(null, "폐기도서");
		}
		if (e.getSource() == pPublisher) {
			JOptionPane.showMessageDialog(null, "출판사");
		}
		if (e.getSource() == pCoden) {
			JOptionPane.showMessageDialog(null, "분류");
		}
	}
	protected void stateChangedThis(ChangeEvent e) {
	
	}
}
