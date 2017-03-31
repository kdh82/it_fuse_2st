package kr.or.dgit.book_project.book_panel;

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

	public CheckSearchDesign() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {200, 100, 0};
		gridBagLayout.rowHeights = new int[] { 437, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		pContent = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.weightx = 1.0;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(pContent, gbc_panel);
		pContent.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weighty = 1.0;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 10, 10));

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
				JButton btnSearch = new JButton("검색");
				panel_4.add(btnSearch);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);

	}

	public JPanel getpContent() {
		return pContent;
	}

}
