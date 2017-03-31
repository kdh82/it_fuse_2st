package kr.or.dgit.book_project.view_panel;

import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.PaymentDataDetail;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class MemberSearchMemberPaymentViewFrame extends PaymentDataDetail {

	/**
	 * Create the panel.
	 */
	public MemberSearchMemberPaymentViewFrame() {
		lblTitle.setText("- 회원대여정보 -");
		
		JPanel pTable = new JPanel();
		pResult.add(pTable);
		
		JPanel pSum = new JPanel();
		pResult.add(pSum);
		
		int res1 = 8;
		int res2 = 3;
		int res3 = 11;
		int res1_1 = 3;
		int res2_1 = 1;
		int res3_1 = 4;
		
		JLabel lblNewLabel = new JLabel("label");
		String text = String.format("총계 : %n반납된 도서 : %d권 (연체 : %d권),",	res1, res1_1);
		pSum.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNewLabel.setText(text);
		pSum.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		String text1 = String.format("\t대출중 도서: %d권(연체 : %d권),", res2, res2_1);
		
		lblNewLabel_1.setText(text1);
		pSum.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		String text2 = String.format("\t총 이용도서: %d권(연체 : %d권)", res3, res3_1);
		
		lblNewLabel_2.setText(text2);
		pSum.add(lblNewLabel_2);

	}

}
