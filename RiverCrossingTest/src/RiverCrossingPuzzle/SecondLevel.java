package RiverCrossingPuzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SecondLevel extends JPanel implements ActionListener, KeyListener {

	
	JFrame window = new JFrame("First Level");
	Farmer farmer1= new Farmer(210,230,"images//farmer7.png");
	Farmer farmer2= new Farmer(200,330,"images//farmer66.png");
	Farmer farmer3= new Farmer(120,280,"images//farmer8.png");
	Farmer farmer4= new Farmer(340,180,"images//farmer3.png");
	Boat boat = new Boat(400,400,"images//boat.png");
	Animal animal=new Animal(290,360,"images//animal.png");
	
	
	
	JButton instructionsButton = new JButton();
	JButton solutionButton = new JButton();
	

	SecondLevel(){
		window.add(this);
		window.setSize(1300,620);
		window.setLocation(40,20);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		instructionsButton.setBackground(Color.WHITE);
		instructionsButton.setIcon (new ImageIcon("images//instr..jpg"));
		instructionsButton.addActionListener(this);
		instructionsButton.addKeyListener(this);
		instructionsButton.setSize(0,0);
		window.add(instructionsButton,BorderLayout.WEST);
		
		solutionButton.setBackground(Color.WHITE);
		solutionButton.setIcon (new ImageIcon("images//lamp.png"));
		solutionButton.addActionListener(this);
		solutionButton.addKeyListener(this);
		solutionButton.setSize(0,0);
		window.add(solutionButton,BorderLayout.EAST);
		
		
	}	
	public void paint (Graphics g) {
		ImageIcon background = new ImageIcon("images//rivers.jpg");
		g.drawImage(background.getImage(), 0, 0,null);
		
		farmer1.drawFarmer(g);
		farmer2.drawFarmer(g);
		farmer3.drawFarmer(g);
		farmer4.drawFarmer(g);
		boat.drawBoat(g);
		animal.drawAnimal(g);
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void actionPerformed(ActionEvent is) {
		 if(is.getSource()==instructionsButton) {
		JOptionPane.showMessageDialog(null,"Four Farmers need to cross a river in a small raft , Farmer1 weighs 90 kg , Farmer 2 weighs 80kg "+"\n"+" Farmer 3 weighs 60 kg"
				+ ", Farmer 4 weighs 40kg ,Animal weighs 40kg, and have a 20kg animal."+"\n"+"Rules:"+"\n"+"1)- The raft cannot bear a load heavier than 100 kg"+"\n"+"How can they all get to the other side with their animal ?");		
		 }
		
		 if(is.getSource()==solutionButton) {
			 JOptionPane.showMessageDialog(null, "1-40 kg +60 kg (cross)."+"\n"+"2-40kg (return)."+"\n"+"3-90kg (cross)."+"\n"+"4-60kg(return)."+"\n"+"5-40kg+60kg(cross)."+"\n"+"6-40kg(return)."
		 +"\n"+"7-80kg+20kg(cross)."+"\n"+"60kg(return)."+"\n"+"9-40kg+60kg(cross)."+"\n\n"+"Done.");
		 }
		 
	}

}
