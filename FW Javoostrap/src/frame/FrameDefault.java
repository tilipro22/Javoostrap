package frame;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import colors.ColorsDFT;
import events.StaticEvent;
import utils.PositionSum;

public abstract class FrameDefault extends JFrame{

	private static final Double PERCENTAGE_DFT = 5.0;
	private static final long serialVersionUID = 1L;
	
	private JFrame frameActual = this;
	
	private JPanel contentPane;
	
	private JLabel lblTitleB, lblMinB, lblExitB;
	
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
		
		/* Title */
		lblTitleB = new JLabel(title);
		lblTitleB.setOpaque(false);
		lblTitleB.setBounds(0, 0, (int) (90*getWidth())/100, (int) (percentage*getHeight())/100);
		lblTitleB.setBorder(new MatteBorder(0, 0, 1, 1, ColorsDFT.COLOR_B_WHITE));
		lblTitleB.setForeground(ColorsDFT.COLOR_B_WHITE);
		
		contentPane.add(lblTitleB);
		
		/* Minimizar */
		lblMinB = new JLabel("-");
		lblMinB.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				StaticEvent.eventMinimizar(frameActual);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				StaticEvent.eventLblMinimizarEntry(lblMinB);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				StaticEvent.eventLblMinimizarExit(lblMinB);
			}
			
		});
		lblMinB.setOpaque(false);
		lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (5*getWidth())/100, (int) (percentage*getHeight())/100);
		lblMinB.setBorder(new MatteBorder(0, 1, 1, 1, ColorsDFT.COLOR_B_WHITE));
		lblMinB.setForeground(ColorsDFT.COLOR_B_WHITE);
		lblMinB.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(lblMinB);
		
		/* Cerrar */
		lblExitB = new JLabel("x");
		lblExitB.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				StaticEvent.eventCerrar(frameActual);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				StaticEvent.eventLblCerrarEntry(lblExitB);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				StaticEvent.eventLblCerrarExit(lblExitB);
			}
			
		});
		lblExitB.setOpaque(false);
		lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (5*getWidth())/100, (int) (percentage*getHeight())/100);
		lblExitB.setBorder(new MatteBorder(0, 1, 1, 0, ColorsDFT.COLOR_B_WHITE));
		lblExitB.setForeground(ColorsDFT.COLOR_B_WHITE);
		lblExitB.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(lblExitB);
		
		System.out.println((int) (percentage*getHeight())/100);
		
	}
}
