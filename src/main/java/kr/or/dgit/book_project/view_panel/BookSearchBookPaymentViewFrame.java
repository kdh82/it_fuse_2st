package kr.or.dgit.book_project.view_panel;

import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.PaymentDataDetail;

import javax.swing.JLabel;
import java.awt.GridLayout;

public class BookSearchBookPaymentViewFrame extends PaymentDataDetail {

	public BookSearchBookPaymentViewFrame() {
		lblTitle.setText("- 도서대여정보 -");
		
		JPanel pTable = new JPanel(); // 해당 도서의 대여기록들
		pResult.add(pTable);
		
		JPanel pSum = new JPanel(); // 총 합께?
		pResult.add(pSum);
		pSum.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label = new JLabel("총 대여횟수 : XX회");
		pSum.add(label);

	}

}
