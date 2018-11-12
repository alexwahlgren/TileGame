package tiles;

import gfx.Assets;

public class BrickTile extends Tile{

	public BrickTile(int id) {
		super(Assets.brickWall, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
