package RiverCrossingPuzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuR extends JPanel implements ActionListener, KeyListener {
	JFrame window =new JFrame();
	
	JButton playButton = new JButton();
	JButton exitButton = new JButton();
	JLabel centerImageLabel= new JLabel();
	
	MenuR(){
		this.setBackground(Color.lightGray);
		this.setForeground(Color.pink);
		
		window.add(this);
		
		playButton.setBackground(Color.WHITE);
		playButton.setIcon (new ImageIcon("images//play.png"));
		playButton.addActionListener(this);
		playButton.addKeyListener(this);
		playButton.setSize(5, 5);
		window.add(playButton,BorderLayout.EAST);
		
		exitButton.setBackground(Color.WHITE);
		exitButton.setIcon (new ImageIcon("images//exit3.png"));
		exitButton.addActionListener(this);
		exitButton.addKeyListener(this);
		window.add(exitButton,BorderLayout.PAGE_END);
		window.setUndecorated(true);
		
		//centerImageLabel.setBackground(Color.DARK_GRAY);
		centerImageLabel.setIcon(new ImageIcon("images//canyou.jpg"));
		window.add(centerImageLabel,BorderLayout.CENTER);
		
		window.setLocation(50, 50);
		window.setSize(650,550);
		window.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent kp) {
		if(kp.getKeyCode()==KeyEvent.VK_ESCAPE) {
			window.dispose();
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
		if(ae.getSource()==exitButton) {
			window.dispose();
		}
		else if(ae.getSource()==playButton) {
			window.dispose();
			LevelWindow lw =new LevelWindow(); 
		}
		
	}

}
