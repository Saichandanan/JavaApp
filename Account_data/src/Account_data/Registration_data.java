package Account_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration_data {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_data window = new Registration_data();
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
	public Registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 492, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(180, 29, 128, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(55, 96, 64, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(55, 159, 64, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Branch");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(55, 214, 64, 16);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Programming\r\n");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(55, 267, 99, 16);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("language");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_4.setBounds(65, 285, 64, 16);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		tb = new JTextField();
		tb.setBounds(167, 95, 168, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setBackground(SystemColor.activeCaption);
		r1.setFont(new Font("Tahoma", Font.BOLD, 13));
		r1.setBounds(167, 157, 81, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male\r\n\r\n\r\n\r\n");
		r2.setBackground(SystemColor.activeCaption);
		r2.setFont(new Font("Tahoma", Font.BOLD, 13));
		r2.setBounds(271, 157, 64, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox co1 = new JComboBox();
		co1.setFont(new Font("Tahoma", Font.BOLD, 13));
		co1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "ECE", "EEE", "IT", "Aiml", "Ds"}));
		co1.setBounds(180, 212, 155, 22);
		frame.getContentPane().add(co1);
		
		JCheckBox c1 = new JCheckBox("Java");
		c1.setFont(new Font("Tahoma", Font.BOLD, 12));
		c1.setBackground(SystemColor.activeCaption);
		c1.setBounds(170, 265, 55, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Python");
		c2.setFont(new Font("Tahoma", Font.BOLD, 12));
		c2.setBackground(SystemColor.activeCaption);
		c2.setBounds(227, 265, 81, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("C");
		c3.setFont(new Font("Tahoma", Font.BOLD, 12));
		c3.setBackground(SystemColor.activeCaption);
		c3.setBounds(306, 265, 55, 23);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if (r1.isSelected())
				{
					g="Female";
				}
				else if(r2.isSelected())
				{
					g="Male";
				}
				else
				{
					g="Invalid!";
				}
				String b=(String) co1.getSelectedItem();
				String p = "";
				
				
				if(c1.isSelected())
				{
					p=p+"Java";
				}
				 if(c2.isSelected())
				{
					p=p+"Python";
				}
				 if(c3.isSelected())
				{
					p=p+"C";
				}
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiml","root","mrec");
					String q="insert into account values('"+n+"','"+g+"','"+b+"','"+p+"')";
					 Statement sta=con.createStatement();
					 sta.execute(q);
					 con.close();
					 JOptionPane.showMessageDialog(btnNewButton, "Done!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(124, 331, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
