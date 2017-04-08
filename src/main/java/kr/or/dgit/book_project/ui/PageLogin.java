package kr.or.dgit.book_project.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import javax.swing.border.SoftBevelBorder;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

import kr.or.dgit.book_project.dto.MemberInfo;
import kr.or.dgit.book_project.service.MemberInfoService;
import kr.or.dgit.book_project.ui.common.InputComp;
import kr.or.dgit.book_project.ui.common.PasswordPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PageLogin extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Object ActionEvent;
	private PageSub sub;
	private JButton btnEnter;
	private InputComp pID;
	private PasswordPanel pPW;

	public PageLogin() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel pImage = new JPanel();
		pImage.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		contentPane.add(pImage);

		JPanel pLogin = new JPanel();
		pLogin.setBorder(new EmptyBorder(40, 10, 40, 10));
		contentPane.add(pLogin);
		pLogin.setLayout(new BorderLayout(20, 20));

		JPanel pLoginInsert = new JPanel();
		pLogin.add(pLoginInsert);
		pLoginInsert.setLayout(new GridLayout(0, 1, 0, 20));

		pID = new InputComp();
		pID.setTitle("회원코드");
		pLoginInsert.add(pID);

		pPW = new PasswordPanel();
		pPW.setTitle("비밀번호");
		pLoginInsert.add(pPW);

		JPanel panel_3 = new JPanel();
		pLogin.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		btnEnter = new JButton("로그인");
		btnEnter.addActionListener(this);
		panel_3.add(btnEnter);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnter) {
			actionPerformedBtnEnter(e);
		}
	}

	public void actionPerformedBtnEnter(ActionEvent e) {

		String id = pID.getTFValue(); // 입력받은 ID
		String pw = String.valueOf(pPW.getPwField().getPassword());// 입력받은 PW

		// 로그인 버튼을 눌렀을때
		MemberInfo ourMember = MemberInfoService.getInstance().findMemberInfoByCode(new MemberInfo(id));
		if (ourMember == null) {
			JOptionPane.showMessageDialog(null, "해당 아이디가 존재하지 않습니다");
			pID.clear();// 텍스트필드 초기화
			pID.getTF().requestFocus(); // 회원번호 텍스트에 포커스
		} else if (ourMember != null && !pw.equals(ourMember.getmPass())) {
			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다");
			pPW.getPwField().setText("");// 텍스트필드 초기화
			pPW.getPwField().requestFocus(); // 비밀번호텍스트에 포커스
		} else if (ourMember != null && pw.equals(ourMember.getmPass())) {
			// 화면을 띄움
			JOptionPane.showMessageDialog(null, "로그인 성공");
			showMainContent(ourMember.getmGroup());
		}
	}

	public void showMainContent(char mGroup) {
		switch (mGroup) {
		case 'A':
			// 관리자..직원메뉴까지 볼수있음
			break;
		case 'B':
			// 사서.... 직원메뉴 제외 전부 볼 수 있음..
			break;
		case 'C':
			// 일반회원.... 뭘 해야되지.....
			break;
		default:
			break;
		}
	}
}
