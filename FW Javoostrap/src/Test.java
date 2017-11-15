import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import colors.ColorsDFT;

public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(800, 600));
		
		JPanel contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(800, 600));
		contentPane.setBackground(ColorsDFT.COLOR_B_GREEN);
		
		frame.setContentPane(contentPane);
	}

}
