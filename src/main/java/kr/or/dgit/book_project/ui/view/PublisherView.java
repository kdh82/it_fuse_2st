package kr.or.dgit.book_project.ui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.PublisherInfoP;
import kr.or.dgit.book_project.ui.table.PublisherInfoTable;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PublisherView extends AbsViewPanel implements ActionListener {
	private PublisherInfoTable pTable;
	private JPanel pSub;
	private PublisherInfoP pPub;
	private JPanel pBtn;
	private JButton btnSave;
	private JButton btnCancel;

	public PublisherView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{735, 0};
		gridBagLayout.rowHeights = new int[]{200, 130, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pMain.setLayout(gridBagLayout);
		
		pSub = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		pMain.add(pSub, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{600, 0};
		gbl_panel_1.rowHeights = new int[]{200, 10, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pSub.setLayout(gbl_panel_1);
		
		pPub = new PublisherInfoP();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.anchor = GridBagConstraints.SOUTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		pSub.add(pPub, gbc_panel_2);
		
		pBtn = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.anchor = GridBagConstraints.WEST;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		pSub.add(pBtn, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {308, 100, 100, 0};
		gbl_panel_3.rowHeights = new int[] {39, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pBtn.setLayout(gbl_panel_3);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(this);
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.fill = GridBagConstraints.BOTH;
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 1;
		gbc_btnSave.gridy = 0;
		pBtn.add(btnSave, gbc_btnSave);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.BOTH;
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 0;
		pBtn.add(btnCancel, gbc_btnCancel);
		
		pTable = new PublisherInfoTable();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		pMain.add(pTable, gbc_panel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == btnSave) {
			actionPerformedBtnSave(e);
		}
	}
	protected void actionPerformedBtnSave(ActionEvent e) {
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {
	}
}	