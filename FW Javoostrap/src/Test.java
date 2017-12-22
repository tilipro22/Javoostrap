import frame.FrameDefault;

// 1920 x 1080

public class Test extends FrameDefault{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		
		int ancho = 850, alto = 300;

		/*Test test = new Test();
		test.setVisible(true);

		test.setTitle("Prueba " + ancho + "x" + alto);
		test.setSize(ancho, alto);*/
		for (int i = 1; i <= 5; i++) {
			Test test = new Test();
			test.setVisible(true);

			test.setTitle("Prueba " + ancho + "x" + alto);
			test.setSize(ancho, alto);

			ancho+=100;
			alto+=100;
		}
	}

}
