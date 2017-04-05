package kr.or.dgit.book_project.ui.table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.service.BookInfoService;

public class BookInfoTable extends AbsTable<BookInfo> {

	public BookInfoTable() {
	}

	@Override
	protected void createPopupMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void updateData(BookInfo t) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void deleteItem(BookInfo t) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void cellWith() {
		// return new String[] { "도서코드", "중복코드", "도서명", "분야", "저자", "출판사" };
		tableSetWidth(50, 30, 250, 70, 100, 100);

	}

	@Override
	protected void CellAlign() {
		// tableCellAlignment(SwingConstants.CENTER, 0, 1);

	}

	@Override
	protected Object[][] getRowData() {
		Map<String, Object> param = new HashMap<>();
		param.put("isDel", false);
		List<BookInfo> list = BookInfoService.getInstance().selectAllBookInfo(param);
		Object[][] datas = new Object[list.size()][];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = list.get(i).toArrayForBoookList();
		}
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new String[] { "도서코드", "중복코드", "도서명", "분야", "저자", "출판사" };
	}

	@Override
	public BookInfo getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			return null;
		}
		String bCode = (String) table.getValueAt(selectedIdx, 0);
		String bSubCode = (String) table.getValueAt(selectedIdx, 1);
		BookInfo bookInfo = new BookInfo();
		bookInfo.setbCode(bCode);
		bookInfo.setbSubCode(bSubCode);
		// 잠시 주석
		return null/*BookInfoService.getInstance().selectBookInfoOne(bookInfo)*/;
	}

}
