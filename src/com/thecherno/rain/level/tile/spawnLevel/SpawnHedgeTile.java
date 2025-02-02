package com.thecherno.rain.level.tile.spawnLevel;

import com.thecherno.rain.graphics.Screen;
import com.thecherno.rain.graphics.Sprite;
import com.thecherno.rain.level.tile.Tile;

public class SpawnHedgeTile extends Tile {

	public SpawnHedgeTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, Sprite.spawnHedge);
	}

	public boolean solid() {
		return true;
	}

	public boolean breakable() {
		return true;
	}
}
