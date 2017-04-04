package kr.or.dgit.book_project.ui.component;

import javax.swing.JPanel;

import kr.or.dgit.book_project.ui.common.InputComp;

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
		
		JPanel brmp1 = new JPanel();
		brmp1.setLayout(new BoxLayout(brmp1, BoxLayout.Y_AXIS));
		
		InputComp pLendDate = new InputComp();
		pLendDate.setTitle("대 여 일");
		brmp1.add(pLendDate);
		
		InputComp pReturnDate = new InputComp();
		pReturnDate.setTitle("반 납 일");
		brmp1.add(pReturnDate);
		
		add(brmp1);
		
		
		
		

	}

}
