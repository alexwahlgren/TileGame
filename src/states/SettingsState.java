package states;

import java.awt.Graphics;

import gfx.Assets;
import tilegame.Handler;

public class SettingsState extends State{

	public SettingsState(Handler handler) {
		super(handler);
	}
	
	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.enemy, 100, 100, null);
	}

}
