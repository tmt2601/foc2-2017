import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Ex1_T133510_Thanh extends JFrame{
	//Khai báo
	JLabel lblUser;
	JTextField txtUser;
	private JPasswordField txtPass;
	//Hàm dựng - constructor
	public Ex1_T133510_Thanh(){
		getContentPane().setBackground(new Color(0, 255, 255));
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 18));
		lblLogin.setBounds(80, 0, 62, 34);
		getContentPane().add(lblLogin);
		
		lblUser = new JLabel("Username");
		getContentPane().add(lblUser);
		txtUser = new JTextField();
		txtUser.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtUser.setBackground(new Color(205, 255, 204));
			}
				
			
			@Override
			public void focusLost(FocusEvent e) {
				txtUser.setBackground(Color.WHITE);
			}
		});
		getContentPane().add(txtUser);
		
		lblUser.setBounds(20, 29, 100, 25);
		txtUser.setBounds(20, 65, 178, 25);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(20, 101, 46, 14);
		getContentPane().add(lblPassword);
		
		JCheckBox chbRemember = new JCheckBox("Remember Me");
		chbRemember.setBackground(new Color(0, 255, 255));
		chbRemember.setBounds(23, 168, 97, 23);
		getContentPane().add(chbRemember);
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login();
			}
		});
		getContentPane().add(btnLogin);
		btnLogin.setBounds(66, 214, 100, 25);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(20, 126, 178, 25);
		txtPass.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtPass.setBackground(new Color(205, 255, 204));
			}
				
			
			@Override
			public void focusLost(FocusEvent e) {
				txtPass.setBackground(Color.WHITE);
			}
		});
		txtPass.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					Login();
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		getContentPane().add(txtPass);
		setLocationRelativeTo(null);
		
	}
	
	
	public static void main(String[] args){
		Ex1_T133510_Thanh main = new Ex1_T133510_Thanh();
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(238,300);
	}


	private void Login() {
		String userName = txtUser.getText();
		char[] passArray = txtPass.getPassword();
		String passWord = new String(passArray);
		if (userName.equals("admin") && passWord.equals("root")){
			//JOptionPane.showMessageDialog(Ex1_T133510_Thanh.this, "Hello" + userName);
			MainWindow mainGUI = new MainWindow();
			mainGUI.setVisible(true);
			Ex1_T133510_Thanh.this.setVisible(false);
		}else{
			JOptionPane.showMessageDialog(Ex1_T133510_Thanh.this, "Fail");
		}
	}
}