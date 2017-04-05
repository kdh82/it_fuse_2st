package kr.or.dgit.book_project.ui.table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.SwingConstants;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.dto.Coden;
import kr.or.dgit.book_project.service.BookInfoService;

public class CodenTable extends AbsTable<Coden> {

	@Override
	protected void createPopupMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void updateData(Coden t) {
	}

	@Override
	protected void deleteItem(Coden t) {
	}

	@Override
	protected void cellWith() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void CellAlign() {
		tableCellAlignment(SwingConstants.CENTER, 0, 1);
	}

	@Override
	protected Object[][] getRowData() {
		Map<String, Object> param = new HashMap<>();
		param.put("cCode", true);
		List<BookInfo> list = BookInfoService.getInstance().selectAllBookInfo(param);
		Vector<Coden> vt = new Vector<>();
		for (BookInfo bookInfo : list) {
			vt.addElement(bookInfo.getCoden());
		}
		Object[][] datas = new Object[vt.size()][];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = vt.get(i).toArray();
		}
		System.out.println(vt.toString());// 왜  A는 네임이 안 뜨니... 왜니... 왜...
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new String[] { "분류", "분류코드" };
	}

	@Override
	public Coden getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			return null;
		}
		String cName = (String) table.getValueAt(selectedIdx, 0);
		String cCode = (String) table.getValueAt(selectedIdx, 1);
		return new Coden(cName, cCode);
	}

}
