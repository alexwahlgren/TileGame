package gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage player_still, enemy, dirt, grass, rock, brickWall; 
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Spritesheet_icons.png"));
		
		player_down = new BufferedImage[2];
		player_up = new BufferedImage[2];
		player_left = new BufferedImage[2];
		player_right = new BufferedImage[2];
		
		player_down[0] = sheet.crop(width*3, height*2, width, height);
		player_down[1] = sheet.crop(width*3, height*3, width, height);
		
		player_up[0] = sheet.crop(width, height * 2, width, height);
		player_up[1] = sheet.crop(width, height * 3, width, height);
		
		player_left[0] = sheet.crop(width * 2, height * 2, width, height);
		player_left[1] = sheet.crop(width * 2, height * 3, width, height);
		
		player_right[0] = sheet.crop(0, height, width, height);
		player_right[1] = sheet.crop(0, height * 2, width, height);
		//player_right[2] = sheet.crop(0, height, width, height);
		//player_right[3] = sheet.crop(0, height * 3, width, height);
		
		
		
		player_still = sheet.crop(width, height, width, height);
		enemy = sheet.crop(width, 0, width, height);
		dirt = sheet.crop(3*width, height, width, height);
		grass = sheet.crop(3*width, 0, width, height);
		rock = sheet.crop(2*width, height, width, height);
		brickWall = sheet.crop(2*width, 0, width, height);
		
		
	}

}
