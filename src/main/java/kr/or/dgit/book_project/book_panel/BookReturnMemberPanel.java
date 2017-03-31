package kr.or.dgit.book_project.book_panel;

import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.InputComp;

import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class BookReturnMemberPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BookReturnMemberPanel() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		BookLendMemberDetail panel = new BookLendMemberDetail();
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		InputComp pLendDate = new InputComp();
		pLendDate.setTitle("대 여 일");
		panel_1.add(pLendDate);
		
		InputComp pReturnDate = new InputComp();
		pReturnDate.setTitle("반 납 일");
		panel_1.add(pReturnDate);
		
		add(panel_1);
		
		
		
		

	}

}
