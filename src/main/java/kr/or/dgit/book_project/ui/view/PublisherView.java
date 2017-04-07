package kr.or.dgit.book_project.ui.view;

import kr.or.dgit.book_project.dto.PublisherInfo;
import kr.or.dgit.book_project.service.PublisherInfoService;
import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.table.PublisherInfoTable;
import java.awt.GridLayout;

import javax.swing.JOptionPane;

import kr.or.dgit.book_project.ui.component.PublisherInfoP;


@SuppressWarnings("serial")
public class PublisherView extends AbsViewPanel {
	
	
	private PublisherInfoTable pTable;
	public PublisherView() {
		setBounds(100, 100, 450, 300);
		
		PublisherInfoP panel = new PublisherInfoP();
		pMain.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		pTable = new PublisherInfoTable();
		pTable.loadData();
		pMain.add(pTable);
		
		/*if(PublisherInfoTable.){
			pTable.loadData();
		}*/
	}

}
