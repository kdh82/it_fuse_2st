package kr.or.dgit.book_project.ui.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import kr.or.dgit.book_project.dto.MemberInfo;
import kr.or.dgit.book_project.service.MemberInfoService;
import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.CheckSearchDesign;
import kr.or.dgit.book_project.ui.component.MemberSearchPanel;
import kr.or.dgit.book_project.ui.table.MemberInfoTable;

import java.awt.GridLayout;
import kr.or.dgit.book_project.ui.common.SearchComboPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberSearchComboView extends AbsViewPanel implements ActionListener {
	private SearchComboPanel pSearch;
	private MemberInfo memberinfo;

	/**
	 * Create the panel.
	 */
	
	public MemberSearchComboView() {
		GridBagLayout gridBagLayout_2 = new GridBagLayout();
		gridBagLayout_2.columnWidths = new int[]{735, 0};
		gridBagLayout_2.rowHeights = new int[]{560, 0};
		gridBagLayout_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pMain.setLayout(gridBagLayout_2);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weighty = 1.0;
		gbc_panel_1.weightx = 1.0;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.weighty = 1.0;
		gbc_panel_2.weightx = 1.0;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		pMain.add(panel_2, gbc_panel_2);
		GridBagLayout panel_2GridBagLayout = new GridBagLayout();
		panel_2GridBagLayout.columnWidths = new int[] {100, 0};
		panel_2GridBagLayout.rowHeights = new int[] {21, 400, 0};
		panel_2GridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2GridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(panel_2GridBagLayout);
		
		pSearch = new SearchComboPanel();
		pSearch.getBtnNewButton().addActionListener(this);
		GridBagLayout gridBagLayout = (GridBagLayout) pSearch.getPanel().getLayout();
		gridBagLayout.rowHeights = new int[] {5};
		GridBagConstraints gbc_pSearch = new GridBagConstraints();
		gbc_pSearch.weighty = 1.0;
		gbc_pSearch.weightx = 1.0;
		gbc_pSearch.insets = new Insets(0, 0, 5, 0);
		gbc_pSearch.fill = GridBagConstraints.BOTH;
		gbc_pSearch.gridx = 0;
		gbc_pSearch.gridy = 0;
		panel_2.add(pSearch, gbc_pSearch);
		
		MemberInfoTable panel_1 = new MemberInfoTable();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panel_2.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		GridBagConstraints gbc_pTable_1 = new GridBagConstraints();
		gbc_pTable_1.weighty = 2.0;
		gbc_pTable_1.weightx = 1.0;
		gbc_pTable_1.fill = GridBagConstraints.BOTH;
		gbc_pTable_1.gridx = 0;
		gbc_pTable_1.gridy = 1;
		}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pSearch.getBtnNewButton()) {
			actionPerformedPanelBtnNewButton(e);
		}
	}
	protected void actionPerformedPanelBtnNewButton(ActionEvent e) {		
		this.memberinfo = new MemberInfo();		
		if(pSearch.gettF().equals("")){
			JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요.");			
		}else if(pSearch.getPanel().getComboBox().getSelectedIndex()==0){
			memberinfo.setmCode((pSearch.gettF().getText()));
			MemberInfoService.getInstance().findMemberInfoByCode(memberinfo);
			}else if(pSearch.getPanel().getComboBox().getSelectedIndex()==1){
			memberinfo.setmName((pSearch.gettF().getText()));
			MemberInfoService.getInstance().findMemberInfoByCode(memberinfo);
			}else if(pSearch.getPanel().getComboBox().getSelectedIndex()==2){
			memberinfo.setmTel((pSearch.gettF().getText()));
			MemberInfoService.getInstance().findMemberInfoByCode(memberinfo);
			}else{
				JOptionPane.showMessageDialog(null, "검색결과가 없습니다");
		}
	}
		//공백체크해서 알림창 띄우기
		//전화번호..... 는 검색이 -를 제외시켜야?
		// 예외처리는 나중에 ㅋㅋㅋ
		// 검색결과 리페인트
	
}

