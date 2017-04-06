package kr.or.dgit.book_project.ui.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.ui.common.AbsViewPanel;
import kr.or.dgit.book_project.ui.component.BookInfoBasic;
import kr.or.dgit.book_project.ui.component.BookLendMemberDetail;
import kr.or.dgit.book_project.ui.table.BookLendTable;

public class BookLendView extends AbsViewPanel {

	
	private BookLendTable blv4;
	private BookInfoBasic panel_3;
	public BookLendView() {
		/*GridLayout gridLayout = (GridLayout) getLayout();
		gridLayout.setVgap(10);*/
		
		JPanel blv1 = new JPanel();
		pMain.add(blv1);
		blv1.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_3 = new BookInfoBasic();
		panel_3.getpBCode().getTfBCode().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mousePressedPanel_3PBCodeTfBCode(e);
			}
		});
		panel_3.getpBCode().getTfBCode().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedPanel_3PBCodeTfBCode(arg0);
			}
		});
		blv1.add(panel_3);
		
		JPanel blv2 = new JPanel();
		blv1.add(blv2);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] {350, 10};
		gbl_panel_5.rowHeights = new int[] {150, 100, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		blv2.setLayout(gbl_panel_5);
		
		BookLendMemberDetail panel_4 = new BookLendMemberDetail();
		panel_4.getpMCode().getTF().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedPanel_4PMCodeTF(arg0);
			}
		});
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.weighty = 2.0;
		gbc_panel_4.weightx = 1.0;
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		blv2.add(panel_4, gbc_panel_4);
		
		JPanel blv3 = new JPanel();
		blv3.setBorder(new EmptyBorder(20, 100, 20, 100));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.weighty = 1.0;
		gbc_panel_2.weightx = 1.0;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		blv2.add(blv3, gbc_panel_2);
		blv3.setLayout(new GridLayout(1, 1, 10, 0));
		
		JButton btnLend = new JButton("대여");
		btnLend.setFont(new Font("굴림", Font.PLAIN, 18));
		blv3.add(btnLend);
		
		blv4 = new BookLendTable();
		blv4.loadData();
		blv4.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				mouseClickedBlv4Table(e);
			}
		});
		
		pMain.add(blv4);
	}
	protected void actionPerformedPanel_3PBCodeTfBCode(ActionEvent arg0) {
		BookSearchView bsv = new BookSearchView();
		/*blv4.loadData();// 테이블 끌어오는거?
*/		JFrame jf = new JFrame();
		/*jf.add(bsv);*/
		jf.setVisible(true);
	}
	protected void actionPerformedPanel_4PMCodeTF(ActionEvent arg0) {
		MemberSearchView msv = new MemberSearchView();
		/*blv4.loadData();// 테이블 끌어오는거?
*/		JFrame jf = new JFrame();
		jf.setBounds(100, 100, 400, 500);
		jf.getContentPane().add(msv);
		jf.setVisible(true);
	}
	protected void mouseClickedBlv4Table(MouseEvent e) {
		if(e.getClickCount() == 2){
			panel_3.setObject(blv4.getSelectedObject());
		}
	}
	protected void mousePressedPanel_3PBCodeTfBCode(MouseEvent e) {
		BookSearchView bsv = new BookSearchView();
		/*blv4.loadData();// 테이블 끌어오는거?
*/		JFrame jf = new JFrame();
		jf.setBounds(100, 100, 400, 500);
		jf.getContentPane().add(bsv);
		jf.setVisible(true);
	}
}
