package kr.or.dgit.book_project.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PageSubForCgroup extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel pTabSub;
	private JButton btnHome;
	private JButton btnBookInfo;
	private JButton btnMyInfo;
	
	public static void main(String[] args) {
		try {
	         UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

	      } catch (Exception e) {
	      }
		PageMain frame = new PageMain();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					PageSubForCgroup frame = new PageSubForCgroup();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PageSubForCgroup() {
		setTitle("도서관리프로그램");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		
		pTabSub = new JPanel();
		getContentPane().add(pTabSub, BorderLayout.CENTER);	
		pTabSub.setLayout(new GridLayout(1, 0, 0, 0));			
		
		JPanel pSideMenu = new JPanel();
		pSideMenu.setBorder(new EmptyBorder(20, 20, 20, 20));
		getContentPane().add(pSideMenu, BorderLayout.WEST);
		pSideMenu.setLayout(new GridLayout(0, 1, 0, 20));
		
		btnHome = new JButton("HOME");
		pSideMenu.add(btnHome);
		
		btnBookInfo = new JButton("도서검색");
		pSideMenu.add(btnBookInfo);
		
		btnMyInfo = new JButton("내정보");
		pSideMenu.add(btnMyInfo);
	
	}

	public void actionPerformed(ActionEvent e) {
	}

	public JPanel getpTabSub() {
		return pTabSub;
	}

	public void setpTabSub(JPanel pTabSub) {
		this.pTabSub = pTabSub;
	}
	
	
	
}
