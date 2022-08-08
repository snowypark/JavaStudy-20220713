package j19_익명클래스.WindowBuilder;

//자바 swing 공부 / GUI

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {

		JButton btnNewButton = new JButton(" 검색");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("여기서만 검색기능 사용");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스");
			}

		});

		btnNewButton.setBounds(34, 28, 97, 23);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("확인 버튼 클릭");
			}
		});
		btnNewButton_1.setBounds(157, 28, 97, 23);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(288, 28, 97, 23);
		getContentPane().add(btnNewButton_2);
	}
}
