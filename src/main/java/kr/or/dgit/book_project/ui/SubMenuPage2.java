package kr.or.dgit.book_project.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.ui.view.BookLendView;
import kr.or.dgit.book_project.ui.view.BookReturnView;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class SubMenuPage2 extends JTabbedPane {

	public SubMenuPage2() {		
		
		JPanel pPaymentInput = new JPanel();
		add("아무거나1",pPaymentInput);		
		pPaymentInput.setLayout(new GridLayout(0, 1, 0, 0));
		BookLendView bLendView = new BookLendView();
		pPaymentInput.add(bLendView);
		
		JPanel pPaymentUpdate = new JPanel();
		add("아무거나2",pPaymentUpdate);
		BookReturnView bRetrunView = new BookReturnView();
		pPaymentUpdate.add(bRetrunView);
		
	}
}
