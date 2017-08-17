package D4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;

public class MyTextEdior extends JFrame {
	JMenuBar mnuBar;
	JMenu mnFile, mnFormat;
	JMenuItem mniOpen, mniExit, mniChangBGColor, mniChangeFontColor;
	JTextArea txaContent;
	JScrollPane scrPane;

	public MyTextEdior() {
		// TODO Auto-generated constructor stub
		setTitle("Text Edior");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setSize(500, 600);

		initializeMenu();

		txaContent = new JTextArea();

		scrPane = new JScrollPane(txaContent);

		getContentPane().add(scrPane);

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == mniOpen) {
					openFile();
				} else if (e.getSource() == mniExit) {
					closeApplication();
				} else if (e.getSource() == mniChangBGColor) {
					changBGColor();
				} else if (e.getSource() == mniChangeFontColor) {
					changFontColor();
				}
			}
		};
		mniOpen.addActionListener(action);
		mniExit.addActionListener(action);
		mniChangBGColor.addActionListener(action);
		mniChangeFontColor.addActionListener(action);
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				closeApplication();
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public void openFile() {
		// TODO Auto-generated method stub
		JFileChooser fchOpenFile = new JFileChooser();
		int result = fchOpenFile.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			try {
				Scanner scn = new Scanner(fchOpenFile.getSelectedFile());
				while (scn.hasNextLine()) {
					txaContent.append(scn.nextLine() + "\n");
				}
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Selected file is not found");
			}
		}
	}

	public void changBGColor() {
		// TODO Auto-generated method stub
		Color newColor = JColorChooser.showDialog(this, "Chang new background color", txaContent.getBackground());
		txaContent.setBackground(newColor);
	}

	public void changFontColor() {
		// TODO Auto-generated method stub
		Color newColor = JColorChooser.showDialog(this, "Chang new background color", txaContent.getBackground());
		txaContent.setForeground(newColor);
	}

	public void closeApplication() {
		int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the program", "Confirm",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}

	public void initializeMenu() {
		mnuBar = new JMenuBar();
		mnFile = new JMenu("File");
		mniOpen = new JMenuItem("Open");
		mniExit = new JMenuItem("Exit");
		mnFormat = new JMenu("Format");
		mniChangBGColor = new JMenuItem("Chang BG Color");
		mniChangeFontColor = new JMenuItem("Change Font Color");
		mnuBar.add(mnFile);
		mnuBar.add(mnFormat);
		mnFile.add(mniOpen);
		mnFile.add(mniExit);
		mnFormat.add(mniChangBGColor);
		mnFormat.add(mniChangeFontColor);
		setJMenuBar(mnuBar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTextEdior main = new MyTextEdior();
		main.setVisible(true);
	}

}
