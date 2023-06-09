package First_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reg {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg window = new Reg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 505, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Registration");
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setBounds(219, 10, 129, 22);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Name");
		label_1.setFont(new Font("Dialog", Font.BOLD, 13));
		label_1.setBounds(23, 70, 120, 22);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("Roll No");
		label_2.setFont(new Font("Dialog", Font.BOLD, 13));
		label_2.setBounds(23, 144, 120, 22);
		frame.getContentPane().add(label_2);
		
		Label label_3 = new Label("Email");
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(23, 217, 120, 22);
		frame.getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l=new Login();
				l.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(215, 286, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(188, 72, 186, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 144, 186, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(188, 217, 186, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
