package kr.or.dgit.book_project.ui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.ui.common.InformDetailPanel;
import kr.or.dgit.book_project.ui.component.BookInfoBasic;

public class BookDetailViewFrame extends JFrame {

	private JPanel contentPane;

	public BookDetailViewFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		InformDetailPanel bookInformDetailPanel = new InformDetailPanel();
		bookInformDetailPanel.setOption("- 도서정보 -", "폐기");
		BookInfoBasic panel = new BookInfoBasic();
		bookInformDetailPanel.getpContent().add(panel);
		contentPane.add(bookInformDetailPanel);
	}

}
