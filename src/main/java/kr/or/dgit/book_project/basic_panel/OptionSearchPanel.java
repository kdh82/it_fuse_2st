package kr.or.dgit.book_project.basic_panel;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class OptionSearchPanel extends BasicPanel {

	protected JCheckBox chbTitle;
	protected JPanel panel;

	/**
	 * Create the panel.
	 */
	public OptionSearchPanel() {
		
		chbTitle = new JCheckBox("title");
		pTitle.add(chbTitle);
		chbTitle.setMargin(new Insets(2, 30, 2, 2));
		
		panel = new JPanel();
		pContent.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

	}
	
	public void setTitle(String title){
		chbTitle.setText(title);
	}

}
