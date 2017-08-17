package D2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;


import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import java.time.Month;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount extends JFrame {
	private JTextField txtFisrtname;
	private JTextField txtLastname;
	private JTextField txtUsername;
	private JTextField txtDay;
	private JTextField txtYear;
	private JTextField txtMobile;
	private JPasswordField txtPass1;
	private JPasswordField txtPass2;
	
	public CreateAccount() {
		setTitle("Regitster New Account");
		
		setSize(500,578);
		
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel addAcccountPane = new JPanel();
		getContentPane().add(addAcccountPane, "name_10336417599054");
		addAcccountPane.setLayout(new BorderLayout(0, 0));
		
		JPanel AccountPane = new JPanel();
		AccountPane.setForeground(Color.BLACK);
		AccountPane.setBackground(new Color(153, 255, 255));
		addAcccountPane.add(AccountPane);
		AccountPane.setLayout(null);
		
		JLabel lblCreateYourAccount = new JLabel("Create Your Account");
		lblCreateYourAccount.setBounds(155, 11, 164, 20);
		lblCreateYourAccount.setFont(new Font("Arial", Font.BOLD, 17));
		AccountPane.add(lblCreateYourAccount);
		
		JLabel lblNewLabel = new JLabel("Fisrt Name");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(55, 50, 72, 14);
		AccountPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBackground(Color.LIGHT_GRAY);
		lblLastName.setForeground(Color.BLACK);
		lblLastName.setBounds(248, 50, 72, 14);
		AccountPane.add(lblLastName);
		
		txtFisrtname = new JTextField();
		txtFisrtname.setBounds(55, 75, 183, 20);
		AccountPane.add(txtFisrtname);
		txtFisrtname.setColumns(10);
		
		txtLastname = new JTextField();
		txtLastname.setBounds(248, 75, 183, 20);
		AccountPane.add(txtLastname);
		txtLastname.setColumns(10);
		
		JLabel lblChooser = new JLabel("Choose your username");
		lblChooser.setBackground(Color.LIGHT_GRAY);
		lblChooser.setForeground(Color.BLACK);
		lblChooser.setBounds(55, 109, 143, 14);
		AccountPane.add(lblChooser);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(55, 128, 376, 20);
		AccountPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblCreateAPassword = new JLabel("Create a password");
		lblCreateAPassword.setBackground(Color.LIGHT_GRAY);
		lblCreateAPassword.setForeground(Color.BLACK);
		lblCreateAPassword.setBounds(55, 159, 143, 14);
		AccountPane.add(lblCreateAPassword);
		
		txtPass1 = new JPasswordField();
		txtPass1.setBounds(55, 184, 376, 20);
		AccountPane.add(txtPass1);
		
		JLabel lblConfirmYourPassword = new JLabel("Confirm your password");
		lblConfirmYourPassword.setBackground(Color.LIGHT_GRAY);
		lblConfirmYourPassword.setForeground(Color.BLACK);
		lblConfirmYourPassword.setBounds(55, 215, 143, 14);
		AccountPane.add(lblConfirmYourPassword);
		
		txtPass2 = new JPasswordField();
		txtPass2.setBounds(55, 240, 376, 20);
		AccountPane.add(txtPass2);
		
		JLabel lblBirthday = new JLabel("Birthday (d/m/y)");
		lblBirthday.setBackground(Color.LIGHT_GRAY);
		lblBirthday.setForeground(Color.BLACK);
		lblBirthday.setBounds(55, 271, 109, 14);
		AccountPane.add(lblBirthday);
		
		txtDay = new JTextField();
		txtDay.setBounds(55, 296, 109, 20);
		txtDay.setColumns(10);
		AccountPane.add(txtDay);
		
		JComboBox cbbMonth = new JComboBox();
		cbbMonth.setModel(new DefaultComboBoxModel(Month.values()));
		cbbMonth.setBounds(173, 296, 97, 20);
		AccountPane.add(cbbMonth);
		
		txtYear = new JTextField();
		txtYear.setBounds(280, 296, 151, 20);
		txtYear.setColumns(10);
		AccountPane.add(txtYear);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBackground(Color.LIGHT_GRAY);
		lblGender.setForeground(Color.BLACK);
		lblGender.setBounds(55, 327, 72, 14);
		AccountPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setOpaque(false);
		rdbtnMale.setBounds(55, 348, 47, 23);
		AccountPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setOpaque(false);
		rdbtnFemale.setBounds(124, 348, 72, 23);
		AccountPane.add(rdbtnFemale);
		
		JRadioButton rdbtnOrther = new JRadioButton("Other");
		rdbtnOrther.setOpaque(false);
		rdbtnOrther.setBounds(208, 348, 72, 23);
		AccountPane.add(rdbtnOrther);
		
		JLabel lblMobile = new JLabel("Mobile Phone");
		lblMobile.setBackground(Color.LIGHT_GRAY);
		lblMobile.setForeground(Color.BLACK);
		lblMobile.setBounds(55, 378, 72, 14);
		AccountPane.add(lblMobile);
		
		txtMobile = new JTextField();
		txtMobile.setBounds(55, 403, 376, 20);
		txtMobile.setColumns(10);
		AccountPane.add(txtMobile);
		
		JCheckBox chckbxAgree = new JCheckBox("I agree to the Terms of Service");
		chckbxAgree.setOpaque(false);
		chckbxAgree.setBounds(65, 440, 303, 23);
		AccountPane.add(chckbxAgree);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(new Color(255, 255, 153));
		buttonPane.setPreferredSize(new Dimension(100,50));
		buttonPane.setForeground(Color.GRAY);
		addAcccountPane.add(buttonPane, BorderLayout.SOUTH);
		buttonPane.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO: //kiem tra thong tin hop le
				
				//TODO: //Luu thong tin vao co so du lieu
				
				//TODO: //chuyen den man hinh thong bao thanh cong
				CardLayout cards = (CardLayout)getContentPane().getLayout();
				cards.next(getContentPane());
				
				
			}
		});
		btnNext.setBounds(201, 16, 101, 23);
		buttonPane.add(btnNext);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "name_11101346649872");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(new Color(153, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Welcome");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label.setBounds(188, 25, 100, 24);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Thanks for creating an account");
		label_1.setFont(new Font("Arial", Font.BOLD, 17));
		label_1.setBounds(122, 329, 271, 45);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(CreateAccount.class.getResource("/image/user.png")));
		label_2.setBounds(112, 67, 262, 251);
		panel_1.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(100, 50));
		panel_2.setForeground(Color.GRAY);
		panel_2.setBackground(new Color(255, 255, 153));
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card = (CardLayout)getContentPane().getLayout();
				card.previous(getContentPane());
			}
		});
		btnBack.setBounds(189, 11, 97, 23);
		panel_2.add(btnBack);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateAccount main = new CreateAccount();
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setVisible(true);
	}
}
