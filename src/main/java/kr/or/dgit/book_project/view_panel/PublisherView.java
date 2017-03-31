package kr.or.dgit.book_project.view_panel;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.AbsViewPanel;
import kr.or.dgit.book_project.book_panel.PublisherInfo;

public class PublisherView extends AbsViewPanel {

	protected JPanel panel_5;

	public PublisherView() {
		
		JPanel panel = new JPanel();
		add(panel);
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
		
		PublisherInfo panel_2 = new PublisherInfo();
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
		
		JButton btnSave = new JButton("저장");
		btnSave.setLocation(281, 5);
		panel_4.add(btnSave);
		btnSave.setSize(104, 55);
		
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(390, 5, 112, 55);
		panel_4.add(btnCancel);
		
		panel_5 = new JPanel();
		panel_5.setBounds(0, 69, 775, 203);
		panel_3.add(panel_5);
		panel_5.setAlignmentY(100);
		panel_5.setLayout(new BorderLayout(0, 0));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}

}
