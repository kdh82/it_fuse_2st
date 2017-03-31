package kr.or.dgit.book_project.book_panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.InputComp;

public class MemberInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberInfo() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelM = new JPanel();
		add(panelM);
		panelM.setLayout(new GridLayout(0, 1, 10, 10));
		
		InputComp pMCode = new InputComp();
		pMCode.setTitle("회원코드");
		panelM.add(pMCode);
		
		InputComp pMName = new InputComp();
		pMName.setTitle("성      명");
		panelM.add(pMName);
		
		InputComp pMTel = new InputComp();
		pMTel.setTitle("전화번호");
		panelM.add(pMTel);
		
		InputComp pMZipCode = new InputComp();
		panelM.add(pMZipCode);
		pMZipCode.setTitle("우편번호");
		
		InputComp pMAddress = new InputComp();
		pMAddress.setTitle("주      소");
		panelM.add(pMAddress);
		
		InputComp panel = new InputComp();
		panel.setTitle("상세주소");
		panelM.add(panel);

	}

}
