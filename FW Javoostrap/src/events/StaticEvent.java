package events;

import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import colors.ColorsDFT;

public class StaticEvent {
	
	private static Point initialClick;
	
	/* Cerrar Frame */
	public static void eventCerrar(JFrame frame) {
		frame.dispose();
	}
	
	/* Minimizar Frame */
	public static void eventMinimizar (JFrame frame) {
		frame.setState(Frame.ICONIFIED);
	}
	
	
	/* Label Minimizar */
	public static void eventLblMinimizarEntry (JLabel lbl) {
		lbl.setOpaque(true);
		lbl.setBackground(ColorsDFT.COLOR_B_GRAY);
		lbl.setForeground(ColorsDFT.COLOR_B_DARK);
	}
	
	public static void eventLblMinimizarExit (JLabel lbl) {
		lbl.setOpaque(false);
		lbl.setBackground(ColorsDFT.COLOR_B_DARK);
		lbl.setForeground(ColorsDFT.COLOR_B_WHITE);
	}
	
	
	/* Label Cerrar */
	public static void eventLblCerrarEntry (JLabel lbl) {
		lbl.setOpaque(true);
		lbl.setBackground(ColorsDFT.COLOR_B_DANGER);
	}
	
	public static void eventLblCerrarExit (JLabel lbl) {
		lbl.setOpaque(false);
		lbl.setBackground(ColorsDFT.COLOR_B_DARK);
		lbl.setForeground(ColorsDFT.COLOR_B_WHITE);
	}
	
	
	/* Frame Deslizable */
	
	public static void eventSetPoint (JFrame frame, MouseEvent e) {
		initialClick = e.getPoint();
		frame.getComponentAt(initialClick);
	}
	
	public static void eventFramePositionChange (JFrame frame, MouseEvent e) {
		if (initialClick == null)
			initialClick = new Point(frame.getX(), frame.getY());
		
		int thisX = frame.getLocation().x;
		int thisY = frame.getLocation().y;
		
		int xMoved = ((thisX + e.getX()) - (thisX + initialClick.x));
		int yMoved = ((thisY + e.getY()) - (thisY + initialClick.y));
		
		int x = thisX + xMoved;
		int y = thisY + yMoved;
		frame.setLocation(x, y);
	}
}
