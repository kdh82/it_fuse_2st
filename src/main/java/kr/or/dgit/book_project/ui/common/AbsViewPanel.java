package kr.or.dgit.book_project.ui.common;

import java.awt.Rectangle;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class AbsViewPanel extends JPanel {

	protected JPanel pMain;

	public AbsViewPanel() {
		setBounds(new Rectangle(0, 0, 775, 600));
		setLayout(new BorderLayout(10, 10));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		add(panel_3, BorderLayout.EAST);
		
		pMain = new JPanel();
		add(pMain, BorderLayout.CENTER);
		pMain.setLayout(new GridLayout(0, 1, 0, 0));
	}
	

}
