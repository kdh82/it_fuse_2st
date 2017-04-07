package kr.or.dgit.book_project.ui.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.service.BookInfoService;
import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.BookSearchPanel;
import kr.or.dgit.book_project.ui.component.CheckSearchDesign;
import kr.or.dgit.book_project.ui.table.AbsTable;
import kr.or.dgit.book_project.ui.table.BookSearchTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookSearchView extends AbsViewPanel implements ActionListener {

	private BookSearchTable pTable;
	private CheckSearchDesign pContent;
	private BookSearchPanel bsp;
	private Map<String, Object> map;
	private BookInsertView bookInsertView;

	public BookSearchView() {

		JPanel pMainSub = new JPanel();
		pMain.add(pMainSub);
		GridBagLayout gbl_pMainSub = new GridBagLayout();
		gbl_pMainSub.columnWidths = new int[] { 300, 0 };
		gbl_pMainSub.rowHeights = new int[] { 150, 250, 0 };
		gbl_pMainSub.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pMainSub.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pMainSub.setLayout(gbl_pMainSub);

		pContent = new CheckSearchDesign();
		pContent.getBtnSearch().addActionListener(this);
		GridBagConstraints gbc_pContent = new GridBagConstraints();
		gbc_pContent.weighty = 1.0;
		gbc_pContent.weightx = 1.0;
		gbc_pContent.fill = GridBagConstraints.BOTH;
		gbc_pContent.insets = new Insets(0, 0, 5, 0);
		gbc_pContent.gridx = 0;
		gbc_pContent.gridy = 0;
		pMainSub.add(pContent, gbc_pContent);
		GridBagLayout gbl_pContent = (GridBagLayout) pContent.getLayout();
		gbl_pContent.columnWidths = new int[] { 300, 0 };
		gbl_pContent.rowHeights = new int[] { 150 };

		bsp = new BookSearchPanel();
		pContent.getpContent().add(bsp);

		pTable = new BookSearchTable();
		GridBagConstraints gbc_pTable = new GridBagConstraints();
		gbc_pTable.weighty = 1.0;
		gbc_pTable.weightx = 1.0;
		gbc_pTable.fill = GridBagConstraints.BOTH;
		gbc_pTable.gridx = 0;
		gbc_pTable.gridy = 1;

		map = new HashMap<>();
		map.put("onlyBook", "onlyBook");
		pTable.setMap(map);
		pTable.loadData();

		pMainSub.add(pTable, gbc_pTable);

	}

	public BookSearchTable getpTable() {
		return pTable;
	}

	public CheckSearchDesign getpContent() {
		return pContent;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pContent.getBtnSearch()) {
			actionPerformedPContentBtnSearch(e);
		}
	}

	protected void actionPerformedPContentBtnSearch(ActionEvent e) {
		Map<String, Object> param = bsp.getValueForSearch();
		if (param.isEmpty()) {
			// 검색 조건이 체크되어있지 않은 경우
			((BookSearchTable) pTable).setMap(map);
			pTable.loadData();
			JOptionPane.showMessageDialog(null, "검색하고 싶은 항목을 선택해주세요");
		} else {
			// 검색하기
			((BookSearchTable) pTable).setMap(param);
			pTable.loadData();
			bsp.clearAll();
		}
	}
}
