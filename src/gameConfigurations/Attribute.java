package gameConfigurations;

import java.awt.*;

public class Attribute {
	public Color fieldColor;
	public String aiStoneImagePath;
	public String playerStoneImagePath;

	public Attribute() {
		this.fieldColor = new Color(255, 0, 0);
		this.aiStoneImagePath = "Img/white.png";
		this.playerStoneImagePath = "img/black.png";
	}
}