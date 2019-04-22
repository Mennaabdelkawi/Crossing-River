package RiverCrossingPuzzle;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Animal {
	
		 private int xAxis;
		 private int yAxis;
		 private String ImagePath;
		
		public Animal(int xAxis, int yAxis, String imagePath) {
			super();
			this.xAxis = xAxis;
			this.yAxis = yAxis;
			ImagePath = imagePath;
		}
		public int getxAxis() {
			return xAxis;
		}
		public void setxAxis(int xAxis) {
			this.xAxis = xAxis;
		}
		public int getyAxis() {
			return yAxis;
		}
		public void setyAxis(int yAxis) {
			this.yAxis = yAxis;
		}
		public String getImagePath() {
			return ImagePath;
		}
		public void setImagePath(String imagePath) {
			ImagePath = imagePath;
		}
		public void drawAnimal(Graphics g) {
			ImageIcon Animal =new ImageIcon(ImagePath);
			g.drawImage(Animal.getImage(), xAxis, yAxis,null);
		}
	}

