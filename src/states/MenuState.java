package states;

import java.awt.Graphics;

import gfx.Assets;
import tilegame.Handler;

public class MenuState extends State{

	public MenuState(Handler handler) {
		super(handler);
		
	}
	
	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.grass, 50, 50, null);
	}

}
