package frame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import colors.ColorsDFT;
import events.StaticEvent;
import exceptions.ExceptionsREM;
import utils.PositionSum;

public abstract class FrameDefault extends JFrame{

	private static final Double PERCENTAGE_DFT = 5.0;
	
	// 10, 7, 6, 5, 4, 3, 2, 1
	private static final int PERCENTAGE_350 = 10;
	private static final int PERCENTAGE_550 = 7;
	private static final int PERCENTAGE_650 = 6;
	private static final int PERCENTAGE_750 = 5;
	private static final int PERCENTAGE_950 = 4;
	private static final int PERCENTAGE_1250 = 2;
	private static final int PERCENTAGE_1920 = 1;
	// 750, 950, 1250, 1920
	
	private static final long serialVersionUID = 1L;
	
	private JFrame frameActual = this;
	
	private JPanel contentPane;
	
	private JLabel lblTitleB, lblMinB, lblExitB;
	
	private int widthFrame = 500, heightFrame = 500;
	
	public FrameDefault() {
		setUndecorated(true);
		setBounds(0, 0, widthFrame, heightFrame);
		
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new MatteBorder(1, 2, 2, 2, ColorsDFT.COLOR_B_CYAN));
		contentPane.setBackground(ColorsDFT.COLOR_B_DARK);
		
		setContentPane(contentPane);
		
		setBarra("", PERCENTAGE_DFT);

		setLocationRelativeTo(null);
	}
	
	private void setBarra(String title, Double percentage) {
		
		/* Title */
		lblTitleB = new JLabel(" "+title);
		lblTitleB.setOpaque(false);
		lblTitleB.setBorder(new MatteBorder(0, 0, 1, 1, ColorsDFT.COLOR_B_WHITE));
		lblTitleB.setForeground(ColorsDFT.COLOR_B_WHITE);
		
		lblTitleB.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				StaticEvent.eventSetPoint(frameActual, e);
			}
			
		});
		
		lblTitleB.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				StaticEvent.eventFramePositionChange(frameActual, e);
			}
			
		});
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
		lblExitB.setBorder(new MatteBorder(0, 1, 1, 0, ColorsDFT.COLOR_B_WHITE));
		lblExitB.setForeground(ColorsDFT.COLOR_B_WHITE);
		lblExitB.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(lblExitB);
		
		setSizeDefaultBarra();
	}
	
	private void setSizeDefaultBarra() {
		
		if (getWidth() <= 350) { 
			lblTitleB.setBounds(0, 0, (int) (80*getWidth())/100, 25);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (PERCENTAGE_350*getWidth())/100, 25);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (10*getWidth())/100, 25);
		}
		else if (getWidth() <= 550) {
			lblTitleB.setBounds(0, 0, (int) (86*getWidth())/100, 25);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (PERCENTAGE_550*getWidth())/100, 25);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (7*getWidth())/100, 25);
		}
		else if (getWidth() <= 650) {
			lblTitleB.setBounds(0, 0, (int) (88*getWidth())/100, (int) 30);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (PERCENTAGE_650*getWidth())/100, 30);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (6*getWidth())/100, 30);
		} 
		else if (getWidth() <= 750){
			lblTitleB.setBounds(0, 0, (int) (90*getWidth())/100, (int) 30);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (PERCENTAGE_750*getWidth())/100, 30);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (5*getWidth())/100, 30);
		}
		else if (getWidth() <= 950) {
			lblTitleB.setBounds(0, 0, (int) (92*getWidth())/100, (int) 30);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (PERCENTAGE_950*getWidth())/100, 30);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (4*getWidth())/100, 30);
		}
		else if (getWidth() <= 1250) {
			lblTitleB.setBounds(0, 0, (int) (94*getWidth())/100, (int) 30);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (PERCENTAGE_1250*getWidth())/100, 30);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (3*getWidth())/100, 30);
		}
		else if (getWidth() <= 1920) {
			lblTitleB.setBounds(0, 0, (int) (96*getWidth())/100, (int) 30);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (PERCENTAGE_1920*getWidth())/100, 30);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (2*getWidth())/100, 30);
		}
		else {
			lblTitleB.setBounds(0, 0, (int) (98*getWidth())/100, (int) 30);
			lblMinB.setBounds(PositionSum.getSumPositionX(lblTitleB), 0, (int) (1*getWidth())/100, 30);
			lblExitB.setBounds(PositionSum.getSumPositionX(lblMinB), 0, (int) (1*getWidth())/100, 30);
		}
		
		setLocationRelativeTo(null);
	}

	@Override
	public void setTitle(String title) {
		lblTitleB.setText(" " + title);
	}
	
	/* Tamaños para Frame */
	
	@Override
	public void setSize (int width, int height) {
		
		while ((width < 200) || (height < 200)) {
			try {
				if (width < 200) {
					width = 200;
					throw new ExceptionsREM("--> if (Width is < 200) then (Width Default = 200)");
				}
				
				if (height < 200) {
					height = 200;
					throw new ExceptionsREM("--> if (Height is < 200) then (Height Default = 200)");
				}
			} catch (ExceptionsREM e) {
				e.printStackTrace();
			}
		}
	
		super.setSize(width, height);
		setSizeDefaultBarra();
	}
	
	public void setFullSize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int)screenSize.getWidth(), (int)screenSize.getHeight());
	}
}
