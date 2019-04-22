package RiverCrossingPuzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class LevelWindow extends JPanel implements ActionListener, KeyListener {
	
	JFrame window=new JFrame();
	String[]s= {"First-Level","Second-Level"};
	JComboBox nameOfLevels = new JComboBox(s);
	JButton enterButton= new JButton();
	JButton backButton = new JButton();
	
	Font customFont= new Font("Italic",Font.ITALIC,30);
	Font comboFont = new Font("Italic",Font.ITALIC,25);


	LevelWindow(){
		setBounds(0, 0, 0, 0);
		window.getContentPane().setLayout(null);
		this.setBackground(Color.black);
		window.getContentPane().add(this);
		nameOfLevels.setBounds(379, 382, 353, 73);
		nameOfLevels.setFont(comboFont);
		window.getContentPane().add(nameOfLevels);
		backButton.setBounds(0, 456, 732, 47);
				
		
		backButton.setFont(customFont);
		backButton.setText("Back");
		backButton.setForeground(Color.BLACK);
		backButton.setBackground(Color.gray);
		backButton.addKeyListener(this);
		backButton.addActionListener(this);
		window.getContentPane().add(backButton);
		
		enterButton.setBounds(0, 0, 732, 382);
		enterButton.setIcon(new ImageIcon("images//rivers.jpg"));
		enterButton.addKeyListener(this);
		enterButton.addActionListener(this);
		window.getContentPane().add(enterButton);
		
		JLabel lblNewLabel = new JLabel("ClLICK TO SELECT LEVEL :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(0, 380, 378, 75);
		window.getContentPane().add(lblNewLabel);
		
		window.setSize(750,550);
		window.setLocation(50,50);
		window.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent kp) {
		if(kp.getKeyCode()==KeyEvent.VK_ESCAPE)
		{
			window.dispose();
			MenuR m= new MenuR();
		}
	
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==backButton) {
			window.dispose();
			MenuR m=new MenuR();
		}
		else if(ae.getSource()==enterButton&&nameOfLevels.getSelectedIndex()==0) {
			FirstLevel fl= new FirstLevel();
			
		}
		else if(ae.getSource()==enterButton&&nameOfLevels.getSelectedIndex()==1) {
			SecondLevel sl=new SecondLevel();
		}
		
		
	}
}
