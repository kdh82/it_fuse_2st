package kr.or.dgit.book_project.view_panel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CodenView extends JFrame {

	private JPanel contentPane;

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

	/**
	 * Create the frame.
	 */
	public CodenView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCoden = new JLabel("분류");
		lblCoden.setFont(new Font("굴림", Font.BOLD, 20));
		lblCoden.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoden.setBounds(5, 5, 176, 49);
		panel.add(lblCoden);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 69, 424, 186);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
	}
}
