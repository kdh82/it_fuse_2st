package kr.or.dgit.book_project.ui.component;

import javax.swing.JPanel;

import kr.or.dgit.book_project.ui.common.InputComp;

import java.awt.GridLayout;

@SuppressWarnings("serial")
public class CodenP extends JPanel {

	/**
	 * Create the panel.
	 */
	public CodenP() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panelC = new JPanel();
		add(panelC);
		panelC.setLayout(new GridLayout(2, 0, 0, 10));
		
		InputComp pCName = new InputComp();
		pCName.setTitle("분      류");
		panelC.add(pCName);
		
		InputComp pCCode = new InputComp();
		pCCode.setTitle("코      드");
		panelC.add(pCCode);

	}

}
