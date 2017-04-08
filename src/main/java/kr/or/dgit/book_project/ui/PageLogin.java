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

	/*
	 * public static void main(String[] args) { try {
	 * UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
	 * 
	 * } catch (Exception e) { } PageMain frame = new PageMain();
	 * 
	 * EventQueue.invokeLater(new Runnable() { public void run() { try {
	 * 
	 * PageMain frame = new PageMain(); frame.setVisible(true);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } } }); }
	 */

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
		pID.setTitle("아이디");
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

	protected void actionPerformedBtnEnter(ActionEvent e) {
	/*	// 입력받은 ID
		String id = pID.getTFValue();

		// 입력받은 PW
		String pw = pPW.getPwField().getPassword().toString();

		// 로그인 버튼을 눌렀을때
		if ("해당 회원코드 존재하지 않을 시") {
			JOptionPane.showMessageDialog(null, "해당 아이디가 존재하지 않습니다");
		} else if ("해당 회원코드 존재하고 비밀번호 안 맞음") {
			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다");
		} else{
			//화면을 띄움
		}

		if (pID.getTFValue().equals("DB아이디 값") && pPW.getPwField().getPassword().toString().equals("비밀번호")) {
			// 화면을 띄움

		} else if (!pID.getTFValue().equals("아이디 값")) {

		}*/
	}
}
