package First_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 522, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Login");
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setBounds(203, 25, 73, 33);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Email");
		label_1.setFont(new Font("Dialog", Font.BOLD, 13));
		label_1.setBounds(47, 92, 96, 22);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("Password");
		label_2.setFont(new Font("Dialog", Font.BOLD, 13));
		label_2.setBounds(47, 173, 90, 22);
		frame.getContentPane().add(label_2);
		
		t1 = new JTextField();
		t1.setBounds(180, 92, 160, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=t1.getText();
				String password=p1.getText();
				if(email.equals("abc@gmail.com") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Login Done!");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(144, 263, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(179, 173, 161, 20);
		frame.getContentPane().add(p1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
