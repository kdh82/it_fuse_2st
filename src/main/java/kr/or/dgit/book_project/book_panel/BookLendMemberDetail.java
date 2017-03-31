package kr.or.dgit.book_project.book_panel;

import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import kr.or.dgit.book_project.basic_panel.InputComp;

public class BookLendMemberDetail extends JPanel {

	protected JLabel lblMsg;

	/**
	 * Create the panel.
	 */
	public BookLendMemberDetail() {
		setLayout(new GridLayout(0, 1, 0, 10));
		
		InputComp pMCode = new InputComp();
		add(pMCode);
		pMCode.setTitle("회원코드");
		
		lblMsg = new JLabel();
		add(lblMsg);
		
		InputComp pMName = new InputComp();
		add(pMName);
		pMName.setTitle("성명");
		
		InputComp pMTel = new InputComp();
		add(pMTel);
		pMTel.setTitle("전화번호");
		
		

	}

}
