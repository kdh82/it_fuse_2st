package kr.or.dgit.book_project.ui.component;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class CheckSearchDesign extends JPanel {

	protected JPanel pContent;
	protected JPanel pBtnSub;
	private JButton btnSearch;

	public CheckSearchDesign() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 400, 0 };
		gridBagLayout.rowHeights = new int[] {200, 100, 0};
		gridBagLayout.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		pContent = new JPanel();
		GridBagConstraints gbc_pContent = new GridBagConstraints();
		gbc_pContent.weighty = 1.0;
		gbc_pContent.weightx = 1.0;
		gbc_pContent.fill = GridBagConstraints.BOTH;
		gbc_pContent.insets = new Insets(0, 0, 5, 0);
		gbc_pContent.gridx = 0;
		gbc_pContent.gridy = 0;
		add(pContent, gbc_pContent);
		pContent.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weighty = 1.0;
		gbc_panel_1.weightx = 1.0;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 10, 10));

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 1, 10, 10));

		JPanel panel_3 = new JPanel();
		panel_4.add(panel_3);

		btnSearch = new JButton("검색");
		panel_4.add(btnSearch);

		pBtnSub = new JPanel();
		panel_4.add(pBtnSub);
		pBtnSub.setLayout(new GridLayout(1, 0, 10, 10));

	}

	public JPanel getpContent() {
		return pContent;
	}

	public JPanel getpBtnSub() {
		return pBtnSub;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}
	
	

}
