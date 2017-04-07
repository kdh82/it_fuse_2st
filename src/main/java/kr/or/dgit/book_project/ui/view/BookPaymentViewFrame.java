package kr.or.dgit.book_project.ui.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.ui.common.PaymentDataDetail;
import kr.or.dgit.book_project.ui.component.BookInfoBasic;

public class BookPaymentViewFrame extends JFrame {
	// 도서 대여현황 정보

	private JPanel contentPane;

	public BookPaymentViewFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		PaymentDataDetail bookPaymentDataDetail = new PaymentDataDetail();
		bookPaymentDataDetail.getLblTitle().setText("- 도서대여정보 -");

		JPanel pTable = new JPanel(); // 해당 도서의 대여기록들
		bookPaymentDataDetail.getpResult().add(pTable);

		JPanel pSum = new JPanel(); // 총 합께?
		pSum.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel label = new JLabel("총 대여횟수 : XX회");
		pSum.add(label);
		bookPaymentDataDetail.getpResult().add(pSum);
		contentPane.add(bookPaymentDataDetail);

	}

}
