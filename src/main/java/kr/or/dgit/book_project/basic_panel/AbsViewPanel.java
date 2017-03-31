package kr.or.dgit.book_project.basic_panel;

import java.awt.Rectangle;

import javax.swing.JPanel;
import java.awt.GridLayout;

public class AbsViewPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AbsViewPanel() {
		setBounds(new Rectangle(0, 0, 775, 600));
		setLayout(new GridLayout(0, 1, 0, 0));
	}

}
