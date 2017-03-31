package kr.or.dgit.book_project.view_panel;

import kr.or.dgit.book_project.book_panel.InformDetailPanel;
import kr.or.dgit.book_project.book_panel.MemberInfo;

public class MemberSearchMemberDetailViewFrame extends InformDetailPanel {


	public MemberSearchMemberDetailViewFrame() {
		
		MemberInfo panel = new MemberInfo();
		pContent.add(panel);
		setOption("- 회원정보 -", "탈퇴");

	}

}
