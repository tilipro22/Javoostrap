package utils;

import javax.swing.JLabel;

public class PositionSum {
	
	public static int getSumPositionX(JLabel label) {
		return label.getX()+label.getWidth();
	}
	
	public static int getSumPositionY(JLabel label) {
		return label.getY()+label.getHeight();
	}
}
