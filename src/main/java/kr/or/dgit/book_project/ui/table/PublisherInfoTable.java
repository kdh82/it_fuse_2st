package kr.or.dgit.book_project.ui.table;

import java.util.HashMap;
import java.util.Map;

import kr.or.dgit.book_project.dto.PublisherInfo;
import kr.or.dgit.book_project.service.PublisherInfoService;

public class PublisherInfoTable extends AbsTable<PublisherInfo> {
	
	
	public PublisherInfoTable() {
	}

	@Override
	protected void createPopupMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateData(PublisherInfo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteItem(PublisherInfo t) {
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
		Map<String, Object> param = new HashMap<>();/*
		param.put(key, value)*/
		return null;
	}

	@Override
	protected Object[] getColumn() {
		return new String[] {"출판사코드","출판사명","담당자명","연락처","우편번호","주소"};
	}

	@Override
	public PublisherInfo getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if(selectedIdx == -1){
			return null;
		}
		String pCode = (String) table.getValueAt(selectedIdx, 0);
		PublisherInfo publisherinfo = new PublisherInfo();
		publisherinfo.setpCode(pCode);
		return null;/*PublisherInfoService.get;*/
	}

	

}
