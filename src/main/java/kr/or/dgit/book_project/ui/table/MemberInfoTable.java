package kr.or.dgit.book_project.ui.table;

import java.util.List;

import javax.swing.SwingConstants;

import kr.or.dgit.book_project.dto.MemberInfo;
import kr.or.dgit.book_project.service.MemberInfoService;
import kr.or.dgit.book_project.service.PaymentIOService;

public class MemberInfoTable extends AbsTable<MemberInfo> {
	public MemberInfoTable() {
		loadData();
	}

	@Override
	protected void createPopupMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateData(MemberInfo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteItem(MemberInfo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void cellWith() {
		tableSetWidth(80,50,100,50,200,100);
		
	}

	@Override
	protected void CellAlign() {
		tableCellAlignment(SwingConstants.CENTER, 1);
		
	}

	@Override
	protected Object[][] getRowData() {		
		List<MemberInfo> member = MemberInfoService.getInstance().selectMemberByAll();
		Object[][] datas = new Object[member.size()][];
		for(int i=0; i<datas.length; i++){
			datas[i] = member.get(i).toArrayForMemberList();
		}
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new String[] {"이름","회원코드","전화번호","우편번호","주소","대여금지일"};
	}

	@Override
	public MemberInfo getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if(selectedIdx == 1) return null;
		String member= (String) table.getValueAt(selectedIdx, 1);
		MemberInfo mi = MemberInfoService.getInstance().findMemberInfoByCode(new MemberInfo(member));
		System.out.println(mi);
		return mi;
	}
	

	
}
