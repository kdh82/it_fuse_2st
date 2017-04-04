package kr.or.dgit.book_project.ui.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.CheckSearchDesign;
import kr.or.dgit.book_project.ui.component.MemberSearchPanel;
import java.awt.GridLayout;
import kr.or.dgit.book_project.ui.common.SearchComboPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Component;

public class MemberSearchComboView extends AbsViewPanel {

	/**
	 * Create the panel.
	 */
	public MemberSearchComboView() {
		GridBagLayout gridBagLayout_2 = new GridBagLayout();
		gridBagLayout_2.columnWidths = new int[]{735, 0};
		gridBagLayout_2.rowHeights = new int[]{560, 0};
		gridBagLayout_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pMain.setLayout(gridBagLayout_2);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.weightx = 1.0;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		pMain.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		CheckSearchDesign panel = new CheckSearchDesign();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_2.add(panel);
		GridBagLayout gridBagLayout_1 = (GridBagLayout) panel.getLayout();
		gridBagLayout_1.columnWidths = new int[] {0};
		gridBagLayout_1.rowHeights = new int[] {98};
		panel.getpContent().setLayout(new GridLayout(0, 1, 0, 0));
		SearchComboPanel msp = new SearchComboPanel();
		panel.getpContent().add(msp);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		panel.getpBtnSub().setLayout(gridBagLayout);
		
		JPanel pTable = new JPanel();
		panel_2.add(pTable);
		GridBagLayout gbl_pTable = new GridBagLayout();
		gbl_pTable.columnWidths = new int[]{0};
		gbl_pTable.rowHeights = new int[]{0};
		gbl_pTable.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_pTable.rowWeights = new double[]{Double.MIN_VALUE};
		pTable.setLayout(gbl_pTable);
		GridBagConstraints gbc_pTable = new GridBagConstraints();
		gbc_pTable.weighty = 2.0;
		gbc_pTable.weightx = 1.0;
		gbc_pTable.fill = GridBagConstraints.BOTH;
		gbc_pTable.gridx = 0;
		gbc_pTable.gridy = 1;

	}
}
