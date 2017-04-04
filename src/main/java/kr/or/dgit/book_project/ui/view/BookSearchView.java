package kr.or.dgit.book_project.ui.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.service.BookInfoService;
import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.BookSearchPanel;
import kr.or.dgit.book_project.ui.component.CheckSearchDesign;
import kr.or.dgit.book_project.ui.table.AbsTable;
import kr.or.dgit.book_project.ui.table.BookInfoTable;

public class BookSearchView extends AbsViewPanel {

	private AbsTable<BookInfo> pTable;

	public BookSearchView() {

		JPanel pMainSub = new JPanel();
		pMain.add(pMainSub);
		GridBagLayout gbl_pMainSub = new GridBagLayout();
		gbl_pMainSub.columnWidths = new int[] { 300, 0 };
		gbl_pMainSub.rowHeights = new int[] { 200, 200, 0 };
		gbl_pMainSub.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pMainSub.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pMainSub.setLayout(gbl_pMainSub);

		CheckSearchDesign pContent = new CheckSearchDesign();
		GridBagConstraints gbc_pContent = new GridBagConstraints();
		gbc_pContent.weighty = 1.0;
		gbc_pContent.weightx = 1.0;
		gbc_pContent.fill = GridBagConstraints.BOTH;
		gbc_pContent.insets = new Insets(0, 0, 5, 0);
		gbc_pContent.gridx = 0;
		gbc_pContent.gridy = 0;
		pMainSub.add(pContent, gbc_pContent);
		GridBagLayout gbl_pContent = (GridBagLayout) pContent.getLayout();
		gbl_pContent.rowHeights = new int[] { 227 };

		BookSearchPanel bsp = new BookSearchPanel();
		pContent.getpContent().add(bsp);

		pTable = new BookInfoTable();

		GridBagConstraints gbc_pTable = new GridBagConstraints();
		gbc_pTable.weighty = 1.5;
		gbc_pTable.weightx = 1.0;
		gbc_pTable.fill = GridBagConstraints.BOTH;
		gbc_pTable.gridx = 0;
		gbc_pTable.gridy = 1;
		pTable.loadData();
		pMainSub.add(pTable, gbc_pTable);
	}


	public void setMyMouseListener(BookInsertView bookInsertView) {
		pTable.getTable().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				BookInfo bi = pTable.getSelectedObject();
				BookInfoService bis = new BookInfoService();
				Map<String, Object> param = new HashMap<>();
				param.put("searchBy", "bCode");
				param.put("bCode", bi.getbCode());
				int cnt = bis.selectBookInfoCountBy(param);
			/*	bookInsertView.getpContent().getpBCode().setTfBCode(bi.getbCode());
				bookInsertView.getpContent().getpBCode().setEnabled(false);
				bookInsertView.getpContent().getpBCode().setTfBSubCode(cnt+"");*/
				setVisible(false);
			}

		});
	}

}
