package kr.or.dgit.book_project.view_panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.AbsViewPanel;
import kr.or.dgit.book_project.book_panel.Coden;

public class CodenManageView extends AbsViewPanel {

	protected JPanel panel_3;

	/**
	 * Create the panel.
	 */
	public CodenManageView() {
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 775, 146);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		Coden panel_5 = new Coden();
		panel_5.setBounds(0, 0, 775, 136);
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 144, 775, 68);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnSave = new JButton("저장");
		btnSave.setBounds(281, 5, 104, 55);
		panel_2.add(btnSave);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(390, 5, 104, 55);
		panel_2.add(btnCancel);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 210, 775, 390);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

	}

}
