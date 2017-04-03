package kr.or.dgit.book_project.ui.common;

import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JButton;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class InformDetailPanel extends InformSizePanel {

	protected JButton btnDel;
	protected JLabel lblTitle;
	protected JPanel pContent;
	protected JButton btnModify;

	/**
	 * Create the panel.
	 */
	public InformDetailPanel() {
		setBounds(new Rectangle(0, 0, 650, 450));
		setLayout(new BorderLayout(10, 10));
		
		JPanel panel = new JPanel();
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{610, 0};
		gbl_panel.rowHeights = new int[] {100, 400, 100, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		flowLayout.setHgap(20);
		
		lblTitle = new JLabel("New label");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		lblTitle.setBounds(new Rectangle(20, 20, 0, 0));
		pTitle.add(lblTitle);
		
		pContent = new JPanel();
		GridBagConstraints gbc_pContent = new GridBagConstraints();
		gbc_pContent.weighty = 1.0;
		gbc_pContent.weightx = 1.0;
		gbc_pContent.fill = GridBagConstraints.BOTH;
		gbc_pContent.insets = new Insets(0, 0, 5, 0);
		gbc_pContent.gridx = 0;
		gbc_pContent.gridy = 1;
		panel.add(pContent, gbc_pContent);
		pContent.setLayout(new GridLayout(1, 0, 0, 0));
		pContent.setLayout(new GridLayout(1, 0, 0, 0));
		pContent.setLayout(new BorderLayout(0, 0));
		pContent.setLayout(new BorderLayout(0, 0));
		pContent.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.weighty = 1.0;
		gbc_panel_7.weightx = 1.0;
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 2;
		panel.add(panel_7, gbc_panel_7);
		panel_7.setLayout(new GridLayout(1, 1, 10, 0));
		
		JPanel panel_4 = new JPanel();
		panel_7.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_7.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnModify = new JButton("수정");
		panel_3.add(btnModify);
		
		JPanel panel_6 = new JPanel();
		panel_7.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnDel = new JButton("버튼");
		panel_6.add(btnDel);
		
		JPanel panel_5 = new JPanel();
		panel_7.add(panel_5);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		add(panel_8, BorderLayout.SOUTH);
		
		JPanel panel_9 = new JPanel();
		add(panel_9, BorderLayout.WEST);
		
		JPanel panel_10 = new JPanel();
		add(panel_10, BorderLayout.EAST);

	}
	
	public void setOption(String title, String button){
		lblTitle.setText(title);
		btnDel.setText(button);
	}
}
