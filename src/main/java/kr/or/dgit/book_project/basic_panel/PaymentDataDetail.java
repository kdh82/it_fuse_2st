package kr.or.dgit.book_project.basic_panel;

import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;

public class PaymentDataDetail extends InformSizePanel {

	protected JLabel lblTitle;
	protected JPanel pResult;
	
	public PaymentDataDetail() {
		setLayout(null);
		
		JPanel pTitle = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pTitle.getLayout();
		flowLayout.setVgap(10);
		pTitle.setBounds(0, 0, 650, 40);
		add(pTitle);
		
		lblTitle = new JLabel("New label");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		pTitle.add(lblTitle);
		
		pResult = new JPanel();
		pResult.setBounds(0, 50, 650, 390);
		add(pResult);
		pResult.setLayout(new GridLayout(0, 1, 0, 0));

	}

}
