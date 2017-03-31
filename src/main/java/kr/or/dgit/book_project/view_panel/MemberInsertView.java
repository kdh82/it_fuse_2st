package kr.or.dgit.book_project.view_panel;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.AbsViewPanel;
import kr.or.dgit.book_project.book_panel.MemberInfo;

public class MemberInsertView extends AbsViewPanel {

	/**
	 * Create the panel.
	 */
	public MemberInsertView() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 775, 36);
		panel_5.add(panel_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 35, 775, 338);
		panel_5.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		MemberInfo panel_1 = new MemberInfo();
		panel.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 372, 775, 78);
		panel_5.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnSave = new JButton("저장");
		btnSave.setBounds(286, 10, 100, 50);
		panel_3.add(btnSave);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(389, 10, 100, 50);
		panel_3.add(btnCancel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 460, 775, 130);
		panel_5.add(panel_2);

	}
}
