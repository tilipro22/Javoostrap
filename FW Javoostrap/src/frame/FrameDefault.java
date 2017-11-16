package frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import colors.ColorsDFT;

public abstract class FrameDefault extends JFrame{

	private static final Double PERCENTAGE_DFT = 7.0;
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private JLabel lblTitleB;
	
	public FrameDefault() {
		setUndecorated(true);
		setBounds(0, 0, 500, 500);
		
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new MatteBorder(1, 2, 2, 2, ColorsDFT.COLOR_B_CYAN));
		contentPane.setBackground(ColorsDFT.COLOR_B_DARK);
		
		setContentPane(contentPane);
		
		setBarra(" Prueba", PERCENTAGE_DFT);

		setLocationRelativeTo(null);
	}
	
	private void setBarra(String title, Double percentage) {
		lblTitleB = new JLabel(title);
		lblTitleB.setOpaque(false);
		lblTitleB.setBounds(0, 0, (int) (70*getWidth())/100, (int) (percentage*getHeight())/100);
		lblTitleB.setBorder(new LineBorder(Color.white));
		
		contentPane.add(lblTitleB);
		
		System.out.println((int) (percentage*getHeight())/100);
		
	}
	
	/*
	 	lblTitulo.setBorder(new MatteBorder(2, 2, 0, 0, Color.CYAN));
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(0, 0, getWidth()-50, ALTURABF_DEFAULT);
	 */
}
