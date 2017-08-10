package notepad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyNotepad_Hoc extends JFrame {

	JMenuBar mnbBar;
	JMenu mnuFile, mnuFormat;
	JMenuItem mniOpen, mniExit, mniChangeBgColor, mniChangeFontColor;
	JTextArea txaContent;
	JScrollPane scrPane;

	public MyNotepad_Hoc() {
		setTitle("Text Editor");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

		initializeMenu();

		txaContent = new JTextArea();
		scrPane = new JScrollPane(txaContent);
		getContentPane().add(scrPane);

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mniOpen) {
					openFile();
				} else if (e.getSource() == mniExit) {
					closeApplication();
				} else if (e.getSource() == mniChangeBgColor) {
					changeBGColor();
				} else if (e.getSource() == mniChangeFontColor) {
					changFontColor();
				}

			}
		};

		mniOpen.addActionListener(action);
		mniExit.addActionListener(action);
		mniChangeBgColor.addActionListener(action);
		mniChangeFontColor.addActionListener(action);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				closeApplication();
			}
		});

	}

	public void initializeMenu() {
		mnbBar = new JMenuBar();
		mnuFile = new JMenu("File");
		mnuFormat = new JMenu("Format");
		mniOpen = new JMenuItem("Open");
		mniExit = new JMenuItem("Exit");
		mniChangeBgColor = new JMenuItem("Change BG color");
		mniChangeFontColor = new JMenuItem("Change Font color");

		mnuFile.add(mniOpen);
		mnuFile.addSeparator();
		mnuFile.add(mniExit);

		mnuFormat.add(mniChangeBgColor);
		mnuFormat.add(mniChangeFontColor);

		mnbBar.add(mnuFile);
		mnbBar.add(mnuFormat);

		setJMenuBar(mnbBar);

	}

	public void openFile() {
		JFileChooser fchOpenFile = new JFileChooser();
		int result = fchOpenFile.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			try {
				Scanner in = new Scanner(fchOpenFile.getSelectedFile());
				while (in.hasNextLine()) {
					txaContent.append(in.nextLine() + "\n");
				}
				in.close();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Selected file is NOT FOUND");
			}
		}
	}

	public void changeBGColor() {
		Color newColor = JColorChooser.showDialog(this, "Choose new BG COLOR", txaContent.getBackground());
		txaContent.setBackground(newColor);
	}

	public void changFontColor() {
		Color newColor = JColorChooser.showDialog(this, "Choose new BG COLOR", txaContent.getForeground());
		txaContent.setForeground(newColor);
	}

	public void closeApplication() {
		int result = JOptionPane.showConfirmDialog(null, "EXIT ? SURE ?", "EXIT",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	/**
	 * @param Hoc Nguyen
	 */
	public static void main(String[] args) {
		MyNotepad_Hoc gui = new MyNotepad_Hoc();
		gui.setVisible(true);

	}

}
