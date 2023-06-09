package First_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ee {

	private JFrame frame;
    int i=0;
    int j=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ee window = new ee();
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
	public ee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 686, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel cart = new JLabel("cart:0");
		cart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cart.setBounds(557, 11, 69, 31);
		frame.getContentPane().add(cart);
		
		JLabel price = new JLabel("price:0");
		price.setFont(new Font("Tahoma", Font.PLAIN, 15));
		price.setBounds(557, 53, 80, 23);
		frame.getContentPane().add(price);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Desktop\\Screenshot 2023-05-02 144459.png"));
		lblNewLabel.setBounds(43, 68, 121, 182);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Desktop\\book3.png"));
		lblNewLabel_1.setBounds(199, 68, 111, 182);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\onlinelab\\Desktop\\book2.png"));
		lblNewLabel_2.setBounds(363, 68, 121, 182);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs.120");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(85, 293, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs.200");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(227, 293, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs.150");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(391, 293, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select ", "pdf", "paper"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(78, 332, 64, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "paper", "pdf"}));
		comboBox_1.setBounds(213, 332, 54, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"select", "paper", "pdf"}));
		comboBox_2.setBounds(383, 332, 54, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				j=j+120;
				cart.setText("Cart:" +i);
				price.setText("price:"+j);
				
			}
		});
		btnNewButton.setBounds(64, 374, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				j=j+200;
				cart.setText("Cart:" +i);
				price.setText("price:"+j);
			}
		});
		btnNewButton_1.setBounds(194, 374, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				j=j+150;
				cart.setText("Cart:" +i);
				price.setText("price:"+j);
			}
		});
		btnNewButton_2.setBounds(363, 374, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Amazon");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(269, 19, 95, 31);
		frame.getContentPane().add(lblNewLabel_6);
		
		
	}
}
