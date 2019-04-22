package RiverCrossingPuzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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

public class FirstLevel extends JPanel implements ActionListener, KeyListener {
	
	JFrame window = new JFrame("First Level");
	Farmer farmer= new Farmer(270,200,"images//farmer.png");
	Animal fox=new Animal(290,350,"images//fox.png");
	Animal goat=new Animal(200,300,"images//goat7.png");
	Boat boat = new Boat(400,400,"images//boat.png");
	Plant plant=new Plant(230,350,"images//grass.png");
	JButton instructionsButton = new JButton();
	JButton solutionButton=new JButton();
	
	
	
	FirstLevel(){
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
		
		farmer.drawFarmer(g);
		fox.drawAnimal(g);
		goat.drawAnimal(g);
		boat.drawBoat(g);
		plant.drawPlant(g);
		
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
	public void actionPerformed(ActionEvent ib) {
		 if(ib.getSource()==instructionsButton) {
				
				JOptionPane.showMessageDialog(null," A farmer wants to cross a river and take with him a fox,a goat, and a cabbage :" +"\n"+ 
				"Rules :" +"\n"+ "1)- the farmer is the only one who can only take one passenger (the fox,the goat,or the cabbage) in addition to him self " +"\n"+
				"2)- if the wolf and the goat are alone on the same riverbank , the fox will eat the goat."+"\n"+
				 "3)- if the goat and the cabbage are alone on the same bank,the goat will eat the cabbage."+"\n"+ "How can the farmer get the wolf, the goat ,and the cabbage across the river without any of them being eaten ?");
				 
			}
		 else if(ib.getSource()==solutionButton) {
			  JOptionPane.showMessageDialog(null,"1- Farmer with the goat (cross)."+"\n"+"2-Faremer (return)."+"\n"
		 +"3- Farmer with the Fox (cross)"+"\n"+"4-Farmer with the goat(return)."+"\n"+"5-Farmer with cabbage(cross)."+"\n"+
					  "6-Farmer (return)"+"\n"+"7-Farmer with the goat(cross)"+"\n\n"+"Done.");
		  }
		
	}
	

}
