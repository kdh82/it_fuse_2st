package kr.or.dgit.book_project.ui.view;

import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.CodenP;
import kr.or.dgit.book_project.ui.table.CodenTable;

@SuppressWarnings("serial")
public class CodenManageView extends AbsViewPanel {

	public static CodenTable pTable;

	public CodenManageView() {
		setBounds(100, 100, 450, 300);

		CodenP pCodenMain = new CodenP();
		pMain.add(pCodenMain);

		pTable = new CodenTable();
		pMain.add(pTable);

	}

}
