package kr.or.dgit.book_project.ui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.dto.Coden;
import kr.or.dgit.book_project.ui.table.CodenTable;

public class CodenView extends JFrame {

	private JPanel contentPane;
	private CodenTable pTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodenView frame = new CodenView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CodenView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 10));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("도서분류표");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(label);
		
		pTable = new CodenTable();
		pTable.loadData();
		contentPane.add(pTable);
		pTable.setLayout(new GridLayout(1, 0, 0, 0));
	}
	
	public void addMyMouseListner(Panel myPanel){
		pTable.getTable().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Coden coden = pTable.getSelectedObject();
				
			}
			
		});
	}
}
