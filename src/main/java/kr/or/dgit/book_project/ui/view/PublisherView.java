package kr.or.dgit.book_project.ui.view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.book_project.service.PublisherInfoService;
import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.PublisherInfoP;

public class PublisherView extends AbsViewPanel implements ActionListener {

	protected JPanel panel_5;
	private JButton btnSave;
	private JButton btnCancel;
	private PublisherInfoP panel_2;

	public PublisherView() {
		
		JPanel panel = new JPanel();
		pMain.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{775, 0};
		gbl_panel.rowHeights = new int[]{300, 300, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_2 = new PublisherInfoP();
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panel.add(panel_3, gbc_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 775, 65);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(this);
		btnSave.setLocation(281, 5);
		panel_4.add(btnSave);
		btnSave.setSize(104, 55);
		
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(390, 5, 112, 55);
		panel_4.add(btnCancel);
		
		panel_5 = new JPanel();
		panel_5.setBounds(0, 69, 775, 203);
		panel_3.add(panel_5);
		panel_5.setAlignmentY(100);
		panel_5.setLayout(new BorderLayout(0, 0));
		

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancel) {
			actionPerformedBtnCancel(arg0);
		}
		if (arg0.getSource() == btnSave) {
			actionPerformedBtnSave(arg0);
		}
	}
	protected void actionPerformedBtnSave(ActionEvent arg0) {
			PublisherInfoService.insertAllPublisherInfo(panel_2.addCheck());
			panel_2.clear();
	}
	protected void actionPerformedBtnCancel(ActionEvent arg0) {
			panel_2.clear();
	}
}
