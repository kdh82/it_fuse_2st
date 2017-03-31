package kr.or.dgit.book_project.frame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.view_panel.BookLendView;
import kr.or.dgit.book_project.view_panel.BookReturnView;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class SubMenuPage2 extends JTabbedPane {

	public SubMenuPage2() {		
		
		JPanel pPaymentInput = new JPanel();
		addTab("대여관리", null, pPaymentInput, null);		
		BookLendView bLendView = new BookLendView();
		pPaymentInput.add(bLendView);
		
		JPanel pPaymentUpdate = new JPanel();
		addTab("반납관리", null, pPaymentUpdate, null);		
		BookReturnView bRetrunView = new BookReturnView();
		pPaymentUpdate.add(bRetrunView);
		
	}
}
