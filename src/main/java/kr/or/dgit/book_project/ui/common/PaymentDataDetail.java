package kr.or.dgit.book_project.ui.common;

import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PaymentDataDetail extends JPanel {

	protected JLabel lblTitle;
	protected JPanel pResult;
	
	public PaymentDataDetail() {
		setLayout(new BorderLayout(10, 10));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{430, 0};
		gbl_panel.rowHeights = new int[] {100, 350, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel pTitle = new JPanel();
		GridBagConstraints gbc_pTitle = new GridBagConstraints();
		gbc_pTitle.weighty = 1.0;
		gbc_pTitle.weightx = 1.0;
		gbc_pTitle.fill = GridBagConstraints.BOTH;
		gbc_pTitle.insets = new Insets(0, 0, 5, 0);
		gbc_pTitle.gridx = 0;
		gbc_pTitle.gridy = 0;
		panel.add(pTitle, gbc_pTitle);
		FlowLayout flowLayout = (FlowLayout) pTitle.getLayout();
		flowLayout.setVgap(10);
		
		lblTitle = new JLabel("New label");
		pTitle.add(lblTitle);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		
		pResult = new JPanel();
		GridBagConstraints gbc_pResult = new GridBagConstraints();
		gbc_pResult.weighty = 1.0;
		gbc_pResult.weightx = 1.0;
		gbc_pResult.fill = GridBagConstraints.BOTH;
		gbc_pResult.gridx = 0;
		gbc_pResult.gridy = 1;
		panel.add(pResult, gbc_pResult);
		pResult.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		add(panel_4, BorderLayout.NORTH);

	}

}
