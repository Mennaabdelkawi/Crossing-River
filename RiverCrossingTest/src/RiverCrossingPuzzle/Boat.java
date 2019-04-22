package RiverCrossingPuzzle;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Boat {

	 private int xAxis;
	 private int yAxis;
	 private String ImagePath;
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
	public Boat(int xAxis, int yAxis, String imagePath) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		ImagePath = imagePath;
	}
	public void drawBoat(Graphics g) {
		ImageIcon Boat =new ImageIcon(ImagePath);
		g.drawImage(Boat.getImage(), xAxis, yAxis,null);
	}
}
