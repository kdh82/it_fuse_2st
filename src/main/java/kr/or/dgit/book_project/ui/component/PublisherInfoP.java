package kr.or.dgit.book_project.ui.component;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import kr.or.dgit.book_project.dto.PublisherInfo;
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
/*	public boolean isVaildCheck(){
		try{
			pPCode.isEmptyCheck();
			pPublisher.isEmptyCheck();
			pPName.isEmptyCheck();
			
		}
	}*/
		public PublisherInfo addCheck(){
	
			if(pPCode.getTFValue().trim().equals("")){
				JOptionPane.showMessageDialog(null, "출판사코드를 입력해주세요");
				pPCode.getTF().requestFocus();
			}else if(pPublisher.getTFValue().trim().equals("")){
				JOptionPane.showMessageDialog(null, "출판사명을 입력해주세요");
				pPublisher.getTF().requestFocus();
			}else if(pPName.getTFValue().trim().equals("")){
				JOptionPane.showMessageDialog(null, "담당자명을 입력해주세요");
				pPName.getTF().requestFocus();
			}else if(!pPTel.getTFValue().trim().matches("^[0-9]{3}-{1}[0-9]{3,4}-{1}[0-9]{4}$")){
				JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요 000-0000-0000");
				pPTel.getTF().requestFocus();
			}else if(!pPZipCode.getTFValue().matches("^[0-9]{5}$")){
				JOptionPane.showMessageDialog(null, "우편번호를 입력해주세요 5자리");
				pPZipCode.getTF().requestFocus();
			}else if(pPAddress.getTFValue().trim().equals("")){
				JOptionPane.showMessageDialog(null, "주소를 입력해주세요");
				pPAddress.getTF().requestFocus();
			}else{
				JOptionPane.showMessageDialog(null, "등록완료");
			}
			return getObject();
			
		}
		public PublisherInfo getObject(){
			String pCode = pPCode.getTFValue();
			String publisher = pPublisher.getTFValue();
			String pName = pPName.getTFValue();
			String pTel = pPTel.getTFValue();
			Integer pZipCode = Integer.parseInt(pPZipCode.getTFValue());
			String pAddress = pPAddress.getTFValue();	
			return new PublisherInfo(pCode, publisher, pName, pTel, pZipCode, pAddress);
		}
		

}
