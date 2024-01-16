package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calsi {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calsi window = new Calsi();
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
	public Calsi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 426, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("%");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="%";
				textField.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 27));
		btnNewButton.setBounds(208, 102, 89, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation = "+";
				textField.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 27));
		btnNewButton_1.setBounds(306, 102, 89, 58);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="/";
				textField.setText(null);
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 27));
		btnNewButton_2.setBounds(109, 102, 89, 58);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnC.getText();
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Arial Black", Font.BOLD, 27));
		btnC.setForeground(Color.BLACK);
		btnC.setBackground(new Color(128, 255, 255));
		btnC.setBounds(10, 102, 89, 58);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 27));
		btnNewButton_4.setBounds(10, 171, 89, 58);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5.setFont(new Font("Arial Black", Font.BOLD, 27));
		btnNewButton_5.setBounds(109, 171, 89, 58);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_6.setBounds(208, 171, 89, 58);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="-";
				textField.setText(null);
			}
		});
		btnNewButton_7.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_7.setBounds(306, 171, 89, 58);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_8.getText();
				textField.setText(number);
			}
		});
		btnNewButton_8.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_8.setBounds(10, 240, 89, 58);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("5");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_10.getText();
				textField.setText(number);
			}
		});
		btnNewButton_10.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_10.setBounds(109, 240, 89, 58);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_12.getText();
				textField.setText(number);

			}
		});
		btnNewButton_12.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_12.setBounds(208, 240, 89, 58);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="*";
				textField.setText(null);
			}
		});
		btnX.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnX.setBounds(306, 240, 89, 58);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnNewButton_15.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_15.setBounds(306, 309, 89, 124);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("0");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_16.getText();
				textField.setText(number);
			}
		});
		btnNewButton_16.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_16.setBounds(10, 375, 188, 58);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_9.getText();
				textField.setText(number);
			}
		});
		btnNewButton_9.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_9.setBounds(10, 309, 89, 58);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("2");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_11.getText();
				textField.setText(number);
			}
		});
		btnNewButton_11.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_11.setBounds(109, 309, 89, 58);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_13.getText();
				textField.setText(number);
			}
		});
		btnNewButton_13.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_13.setBounds(208, 309, 89, 58);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_17 = new JButton(".");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_17.getText();
				textField.setText(number);
			}
		});
		btnNewButton_17.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_17.setBounds(208, 375, 89, 58);
		frame.getContentPane().add(btnNewButton_17);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 27));
		textField.setBounds(10, 11, 389, 69);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrDesignedByDheen = new JTextArea();
		txtrDesignedByDheen.setText("-Designed by Dheen");
		txtrDesignedByDheen.setBounds(239, 444, 156, 22);
		frame.getContentPane().add(txtrDesignedByDheen);
	}
}
