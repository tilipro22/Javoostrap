package colors;

import java.awt.Color;

public class UtilsColors {
	
	public static Color hex2RGB(String colorStr) {
		return new Color(
				Integer.valueOf(colorStr.substring(1, 3), 16), 
				Integer.valueOf(colorStr.substring(3, 5), 16),
				Integer.valueOf(colorStr.substring(5, 7), 16));
	}

}
