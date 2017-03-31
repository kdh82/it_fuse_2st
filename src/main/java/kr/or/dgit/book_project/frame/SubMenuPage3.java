package kr.or.dgit.book_project.frame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class SubMenuPage3 extends JTabbedPane {

	public SubMenuPage3() {
		
		JPanel pAccBest = new JPanel();
		addTab("누적베스트지수", null, pAccBest, null);
		
		JPanel pMonthBest = new JPanel();
		addTab("월별순위", null, pMonthBest, null);
		
		JPanel pPartBest = new JPanel();
		addTab("분야별 순위", null, pPartBest, null);
		
		JPanel pMonthPartBest = new JPanel();
		addTab("분야별 월별 순위", null, pMonthPartBest, null);
		
		JPanel pPartRate = new JPanel();
		addTab("도서 분야별 보유 비율", null, pPartRate, null);
		
		JPanel pLendPartRate = new JPanel();
		addTab("도서 분야별 대여 비율", null, pLendPartRate, null);
	}
}
