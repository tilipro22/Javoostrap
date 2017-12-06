import frame.FrameDefault;

// 1920 x 1080

public class Test extends FrameDefault{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		
		int ancho = 200, alto = 200;
		for (int i = 1; i <= 5; i++) {
			Test test = new Test();
			test.setVisible(true);
			
			test.setTitle("Prueba " + i);
			test.setSize(ancho, alto);
			
			ancho+=100;
			alto+=100;
		}
	}

}
