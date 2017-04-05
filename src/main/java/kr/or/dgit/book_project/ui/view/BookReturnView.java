package kr.or.dgit.book_project.ui.view;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.BookInfoBasic;
import kr.or.dgit.book_project.ui.component.BookLendMemberDetail;
import kr.or.dgit.book_project.ui.component.BookLendMemberDetailDate;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class BookReturnView extends AbsViewPanel {

	/**
	 * Create the panel.
	 */
	public BookReturnView() {
		GridLayout gridLayout = (GridLayout) getLayout();
		gridLayout.setVgap(10);
		
		JPanel panel = new JPanel();
		pMain.add(panel);
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
		
		BookLendMemberDetailDate panel_4 = new BookLendMemberDetailDate();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.weightx = 1.0;
		gbc_panel_4.weighty = 2.0;
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		panel_5.add(panel_4, gbc_panel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(10, 100, 10, 100));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.weighty = 1.0;
		gbc_panel_2.weightx = 1.0;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel_5.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnLend = new JButton("반납");
		btnLend.setFont(new Font("굴림", Font.PLAIN, 18));
		panel_2.add(btnLend);
		
		JPanel panel_1 = new JPanel();
		pMain.add(panel_1);
	}

}
