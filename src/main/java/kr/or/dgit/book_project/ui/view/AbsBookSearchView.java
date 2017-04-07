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
import javax.swing.JPopupMenu;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.service.BookInfoService;
import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.BookSearchPanel;
import kr.or.dgit.book_project.ui.component.CheckSearchDesign;
import kr.or.dgit.book_project.ui.table.AbsTable;
import kr.or.dgit.book_project.ui.table.BookSearchTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public abstract class AbsBookSearchView extends AbsViewPanel implements ActionListener {

	protected BookSearchTable pTable;
	protected BookSearchPanel pContent;
	protected Map<String, Object> map;
	protected BookInsertView bookInsertView;
	protected JPopupMenu popupMenu;

	public AbsBookSearchView() {

		JPanel pMainSub = new JPanel();
		pMain.add(pMainSub);

		pContent = new BookSearchPanel();
		pContent.getBtnSearch().addActionListener(this);
		pMainSub.add(pContent);

		pTable = new BookSearchTable();

		map = new HashMap<>();
		map.put("onlyBook", "onlyBook");
		pTable.setMap(map);
		pTable.loadData();
		pMainSub.setLayout(new GridLayout(0, 1, 0, 20));

		pMainSub.add(pTable);

	}

	public BookSearchTable getpTable() {
		return pTable;
	}

	public BookSearchPanel getpContent() {
		return pContent;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pContent.getBtnSearch()) {
			actionPerformedPContentBtnSearch(e);
		}
	}

	protected void actionPerformedPContentBtnSearch(ActionEvent e) {
		Map<String, Object> param = pContent.getValueForSearch();
		if (param.isEmpty()) {
			// 검색 조건이 체크되어있지 않은 경우
			((BookSearchTable) pTable).setMap(map);
			pTable.loadData();
			JOptionPane.showMessageDialog(null, "검색하고 싶은 항목을 선택해주세요");
		} else {
			// 검색하기
			((BookSearchTable) pTable).setMap(param);
			pTable.loadData();
			pContent.clearAll();
		}
	}

	protected void addPopupMenu() {
		(pTable.getTable()).addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON3) {
					createPopupMenu();
					popupMenu.show(pTable, e.getX(), e.getY());
					// show(활성화될 컴포넌트, X좌표, Y좌표)
				}
			}
		});

	}

	protected abstract void createPopupMenu();
}
