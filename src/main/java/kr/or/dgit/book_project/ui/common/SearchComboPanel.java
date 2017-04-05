package kr.or.dgit.book_project.ui.common;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JButton;

public class SearchComboPanel extends JPanel {
	private JTextField tF;
	private JButton btnNewButton;
	private SerarchComboBoxPanel panel;

	/**
	 * Create the panel.
	 */
	public SearchComboPanel() {
		setLayout(new GridLayout(1, 0, 10, 0));
		
		panel = new SerarchComboBoxPanel();
		GridBagLayout gridBagLayout = (GridBagLayout) panel.getLayout();
		gridBagLayout.columnWidths = new int[] {0};
		gridBagLayout.rowHeights = new int[] {10};
		panel.getComboBox().setModel(new DefaultComboBoxModel(new String[] {"\t회원코드", "\t성      명", "\t전화번호"}));
		panel.lblTitle.setText("검색조건");
		panel.lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		tF = new JTextField();
		tF.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(tF);
		tF.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNewButton = new JButton("검색");
		panel_2.add(btnNewButton);

	}

	public JTextField gettF() {
		return tF;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public SerarchComboBoxPanel getPanel() {
		return panel;
	}
	
	
	

}
