package kr.or.dgit.book_project.ui.component;

import java.awt.GridLayout;

import javax.swing.JPanel;

import kr.or.dgit.book_project.ui.common.InputComp;

@SuppressWarnings("serial")
public class PublisherInfoP extends JPanel {

	private InputComp pPCode;
	private InputComp pPublisher;
	private InputComp pPName;
	private InputComp pPTel;
	private InputComp pPZipCode;
	private InputComp pPAddress;

	/**
	 * Create the panel.
	 */
	public PublisherInfoP() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelPub = new JPanel();
		add(panelPub);
		panelPub.setLayout(new GridLayout(0, 1, 0, 10));
		
		pPCode = new InputComp();
		pPCode.setTitle("출판사코드");
		panelPub.add(pPCode);
		
		pPublisher = new InputComp();
		pPublisher.setTitle("출 판 사 명");
		panelPub.add(pPublisher);
		
		pPName = new InputComp();
		pPName.setTitle("담 당 자 명");
		panelPub.add(pPName);
		
		pPTel = new InputComp();
		pPTel.setTitle("연   락   처");
		panelPub.add(pPTel);
		
		pPZipCode = new InputComp();
		pPZipCode.setTitle("우 편 번 호");
		panelPub.add(pPZipCode);
		
		pPAddress = new InputComp();
		pPAddress.setTitle("주         소");
		panelPub.add(pPAddress);
	}
	
		public void clear(){
			pPCode.setTFValue("");
			pPublisher.setTFValue("");
			pPName.setTFValue("");
			pPTel.setTFValue("");
			pPZipCode.setTFValue("");
			pPAddress.setTFValue("");
		}
	

}
