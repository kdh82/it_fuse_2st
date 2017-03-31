package kr.or.dgit.book_project.view_panel;

import java.awt.Rectangle;

import javax.swing.JPanel;

import kr.or.dgit.book_project.book_panel.BookInfoBasic;
import kr.or.dgit.book_project.basic_panel.AbsViewPanel;
import kr.or.dgit.book_project.book_panel.BookLendMemberDetail;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class BookLendView extends AbsViewPanel {

	
	public BookLendView() {
		GridLayout gridLayout = (GridLayout) getLayout();
		gridLayout.setVgap(10);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		BookInfoBasic panel_3 = new BookInfoBasic();
		panel.add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] {350, 10};
		gbl_panel_5.rowHeights = new int[] {150, 100, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		BookLendMemberDetail panel_4 = new BookLendMemberDetail();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.weighty = 2.0;
		gbc_panel_4.weightx = 1.0;
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		panel_5.add(panel_4, gbc_panel_4);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.weighty = 1.0;
		gbc_panel_2.weightx = 1.0;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel_5.add(panel_2, gbc_panel_2);
		panel_2.setLayout(null);
		
		JButton btnLend = new JButton("대여");
		btnLend.setBounds(147, 20, 100, 50);
		panel_2.add(btnLend);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
	}
}
