package RiverCrossingPuzzle;

import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginScreen extends JPanel {
	
	JFrame window = new JFrame();
	LoginScreen(){
		window.add(this);
		
		try {
			File sound = new File("sounds//sound.wav");
		AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
		}catch (Exception e) {System.out.println(e);}
		
		
		
		window.setLocation(50,50);
		window.setUndecorated(true);
		window.setSize(800,300);
		window.setVisible(true);
		
		try {
			Thread.sleep(5000);
			window.dispose();
			MenuR m=new MenuR();
		}catch(Exception e) {System.out.println(e);}
		
	}
	
	public void paint(Graphics g) {
		 ImageIcon background=new ImageIcon("images//menu.jpg");
		 g.drawImage(background.getImage(),0,0,null);
	}

}
