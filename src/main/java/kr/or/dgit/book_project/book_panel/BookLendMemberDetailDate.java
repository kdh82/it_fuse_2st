package kr.or.dgit.book_project.book_panel;

import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.InputComp;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import java.awt.GridLayout;

public class BookLendMemberDetailDate extends JPanel {

	/**
	 * Create the panel.
	 */
	public BookLendMemberDetailDate() {
		setLayout(new GridLayout(0, 1, 0, 10));
		
		InputComp pMCode = new InputComp();
		add(pMCode);
		pMCode.setTitle("회원코드");
		
		InputComp pMName = new InputComp();
		add(pMName);
		pMName.setTitle("성명");
		
		InputComp pMTel = new InputComp();
		add(pMTel);
		pMTel.setTitle("전화번호");
		
		
		InputComp pLendDate = new InputComp();
		pLendDate.setTitle("대 여 일");
		add(pLendDate);
		
		InputComp pReturnDate = new InputComp();
		pReturnDate.setTitle("반 납 일");
		add(pReturnDate);

	}

}
