package kr.or.dgit.book_project.ui.view;

import kr.or.dgit.book_project.ui.common.InformDetailPanel;
import kr.or.dgit.book_project.ui.component.MemberInfoP;

public class MemberSearchMemberDetailViewFrame extends InformDetailPanel {


	public MemberSearchMemberDetailViewFrame() {
		
		MemberInfoP panel = new MemberInfoP();
		pContent.add(panel);
		setOption("- 회원정보 -", "탈퇴");

	}

}
