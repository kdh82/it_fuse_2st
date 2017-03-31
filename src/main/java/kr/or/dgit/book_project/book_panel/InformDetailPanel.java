package kr.or.dgit.book_project.book_panel;

import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.InformSizePanel;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JButton;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;

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
		setLayout(null);
		
		JPanel pTitle = new JPanel();
		pTitle.setBounds(0, 0, 650, 41);
		FlowLayout flowLayout = (FlowLayout) pTitle.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(20);
		add(pTitle);
		
		lblTitle = new JLabel("New label");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		lblTitle.setBounds(new Rectangle(20, 20, 0, 0));
		pTitle.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 51, 650, 389);
		add(panel_1);
		panel_1.setLayout(null);
		
		pContent = new JPanel();
		pContent.setBounds(0, 0, 650, 319);
		panel_1.add(pContent);
		pContent.setLayout(new GridLayout(1, 0, 0, 0));
		pContent.setLayout(new GridLayout(1, 0, 0, 0));
		pContent.setLayout(new BorderLayout(0, 0));
		pContent.setLayout(new BorderLayout(0, 0));
		pContent.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 329, 650, 50);
		panel_1.add(panel_7);
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

	}
	
	public void setOption(String title, String button){
		lblTitle.setText(title);
		btnDel.setText(button);
	}

}
