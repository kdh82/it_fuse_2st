package kr.or.dgit.book_project.basic_panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PublisherInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	public PublisherInfo() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelPub = new JPanel();
		add(panelPub);
		panelPub.setLayout(new GridLayout(0, 1, 0, 10));
		
		InputComp pPCode = new InputComp();
		pPCode.setTitle("출판사코드");
		panelPub.add(pPCode);
		
		InputComp pPublisher = new InputComp();
		pPublisher.setTitle("출 판 사 명");
		panelPub.add(pPublisher);
		
		InputComp pPName = new InputComp();
		pPName.setTitle("담 당 자 명");
		panelPub.add(pPName);
		
		InputComp pPTel = new InputComp();
		pPTel.setTitle("연   락   처");
		panelPub.add(pPTel);
		
		InputComp pPZipCode = new InputComp();
		pPZipCode.setTitle("우 편 번 호");
		panelPub.add(pPZipCode);
		
		InputComp pPAddress = new InputComp();
		pPAddress.setTitle("주         소");
		panelPub.add(pPAddress);

	}

}
