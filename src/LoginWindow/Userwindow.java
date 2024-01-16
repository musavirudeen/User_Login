package LoginWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import Calculator.Calsi;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Userwindow {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userwindow window = new Userwindow();
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
	public Userwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 467, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setBounds(88, 11, 276, 41);
		lblNewLabel.setAutoscrolls(true);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Id");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setAutoscrolls(true);
		lblNewLabel_1.setBounds(28, 83, 121, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1.setAutoscrolls(true);
		lblNewLabel_1_1.setBounds(28, 123, 121, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(159, 91, 170, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getText();
				
				if(username.contains("md_m_deen") && password.contains("7092982946")){
					textField.setText(null);
					passwordField.setText(null);
					Calsi.main(null);
					//JOptionPane.showMessageDialog(null,"Hii dheen","WELCOME",JOptionPane.DEFAULT_OPTION)
				}
				else {
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(28, 182, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnClear.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnClear.setBounds(177, 182, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnExit.setBounds(319, 182, 89, 23);
		frame.getContentPane().add(btnExit);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(10, 64, 383, 0);
		frame.getContentPane().add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBounds(38, 63, 355, 2);
		frame.getContentPane().add(horizontalBox_1);
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		horizontalBox_1_1.setBounds(28, 163, 355, 2);
		frame.getContentPane().add(horizontalBox_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 131, 170, 20);
		frame.getContentPane().add(passwordField);
	}
}
