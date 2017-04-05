package kr.or.dgit.book_project.ui.table;

import java.util.List;

import kr.or.dgit.book_project.dao.BookInfoMapper;
import kr.or.dgit.book_project.dao.BookInfoMapperImpl;
import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.service.BookInfoService;

public class BookLendTable extends AbsTable<BookInfo> {

	@Override
	protected void createPopupMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateData(BookInfo bookinfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteItem(BookInfo bookinfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void cellWith() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void CellAlign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object[][] getRowData() {
		List<BookInfo> bi = BookInfoService.getInstance().selectIslending();
		Object[][] datas = new Object[bi.size()][];
		for(int i =0; i< datas.length; i++){
			datas[i]= bi.get(i).toArray();
		}
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new String[]{"도서코드","도서중복코드","도서명","저자","출판사","총대여 횟수"};
	}

	@Override
	public BookInfo getSelectedObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
