package kr.or.dgit.book_project.frame;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SideBar extends JPanel {

	protected JButton btnMenu1;	
	protected JButton btnMenu2;
	protected JButton btnMenu3;
	private JButton btnMenu4;

	public SideBar() {
		setLayout(null);
		
		JPanel pMenu = new JPanel();
		pMenu.setBounds(0, 0, 120, 600);
		add(pMenu);
		pMenu.setLayout(null);
		
		btnMenu1 = new JButton("자료관리");
		btnMenu1.setBounds(0, 124, 120, 130);
		pMenu.add(btnMenu1);
		
		btnMenu2 = new JButton("출납관리");
		btnMenu2.setBounds(0, 279, 120, 130);
		pMenu.add(btnMenu2);
		
		btnMenu3 = new JButton("출납통계");
		btnMenu3.setBounds(0, 437, 120, 130);
		pMenu.add(btnMenu3);		
		
		btnMenu4 = new JButton("HOME");
		//btnMenu4.addActionListener(this);
		btnMenu4.setBounds(0, 0, 120, 30);
		pMenu.add(btnMenu4);
	}
	/*public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMenu4) {
			actionPerformedBtnMenu4(e);
		}
	}
	protected void actionPerformedBtnMenu4(ActionEvent e) {
		//PageMain main = new PageMain();
		//main.setVisible(true);
		
	}*/

	public JButton getBtnMenu4() {
		return btnMenu4;
	}

	public void setBtnMenu4(JButton btnMenu4) {
		this.btnMenu4 = btnMenu4;
	}
	
	
}
