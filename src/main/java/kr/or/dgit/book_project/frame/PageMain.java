package kr.or.dgit.book_project.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
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

public class PageMain extends JFrame {

	private JPanel contentPane;
	private Object ActionEvent;
	private PageSub sub;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");

		}catch (Exception e) {}
		PageMain frame = new PageMain();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageMain frame = new PageMain();
					frame.setVisible(true);


				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PageMain() {
		setTitle("도서관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnMenu1 = new JButton("자료관리");
		btnMenu1.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		btnMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnMenu1(e);
			}
		});
		btnMenu1.setBounds(116, 193, 190, 190);
		contentPane.add(btnMenu1);

		JButton btnMenu2 = new JButton("출납관리");
		btnMenu2.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		btnMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnMenu2(e);
			}
		});
		btnMenu2.setBounds(398, 193, 190, 190);
		contentPane.add(btnMenu2);

		JButton btnMenu3 = new JButton("출납통계");
		btnMenu3.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		btnMenu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnMenu3(e);
			}
		});
		btnMenu3.setBounds(671, 193, 190, 190);
		contentPane.add(btnMenu3);
	}
	protected void actionPerformedBtnMenu1(ActionEvent e) {
		sub = new PageSub();
		sub.getpTabSub().add(new SubMenuPage1());
		sub.setVisible(true);
	}
	protected void actionPerformedBtnMenu2(ActionEvent e) {
		sub = new PageSub();
		sub.getpTabSub().add(new SubMenuPage2());
		sub.setVisible(true);	
	}
	protected void actionPerformedBtnMenu3(ActionEvent e) {
		sub = new PageSub();
		sub.getpTabSub().add(new SubMenuPage3());
		sub.setVisible(true);	
	}
}
