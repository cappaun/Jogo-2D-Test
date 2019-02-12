package com.mateusdev.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.mateusdev.main.Game;

public class Tile {

	public static BufferedImage TILE_FLOOR = Game.spritesheet.getSprite(18, 141, 16, 16);
	public static BufferedImage TILE_WALL = Game.spritesheet.getSprite(149, 277, 16, 16);
	
	public static BufferedImage TREE00 = Game.spritesheet.getSprite(18, 158, 16, 16);
	public static BufferedImage TREE01 = Game.spritesheet.getSprite(1, 158, 16, 16);
	public static BufferedImage TREE02 = Game.spritesheet.getSprite(1, 175, 16, 16);
	public static BufferedImage TREE03 = Game.spritesheet.getSprite(18, 175, 16, 16);
	
	public static BufferedImage TILE_TREE = Game.spritesheet.getSprite(93, 140, 16, 16);
	public static BufferedImage TILE_TREE1 = Game.spritesheet.getSprite(110, 140, 16, 16);
	public static BufferedImage TILE_TREE2 = Game.spritesheet.getSprite(178, 140, 16, 16);

	public static BufferedImage TILE_TREE3 = Game.spritesheet.getSprite(93, 157, 16, 16);
	public static BufferedImage TILE_TREE4 = Game.spritesheet.getSprite(161, 157, 16, 16);
	public static BufferedImage TILE_TREE5 = Game.spritesheet.getSprite(178, 157, 16, 16);

	public static BufferedImage TILE_TREE6 = Game.spritesheet.getSprite(93, 174, 16, 16);
	public static BufferedImage TILE_TREE7 = Game.spritesheet.getSprite(110, 174, 16, 16);
	public static BufferedImage TILE_TREE8 = Game.spritesheet.getSprite(178, 174, 16, 16);

	public static BufferedImage TILE_TREE9 = Game.spritesheet.getSprite(93, 191, 16, 16);
	public static BufferedImage TILE_TREE10 = Game.spritesheet.getSprite(110, 191, 16, 16);
	public static BufferedImage TILE_TREE11 = Game.spritesheet.getSprite(178, 191, 16, 16);

	public static BufferedImage TREE = Game.spritesheet.getSprite(93, 208, 16, 16);
	public static BufferedImage TREE1 = Game.spritesheet.getSprite(110, 208, 16, 16);
	public static BufferedImage TREE2 = Game.spritesheet.getSprite(127, 208, 16, 16);

	public static BufferedImage TREE3 = Game.spritesheet.getSprite(93, 225, 16, 16);
	public static BufferedImage TREE4 = Game.spritesheet.getSprite(110, 225, 16, 16);
	public static BufferedImage TREE5 = Game.spritesheet.getSprite(127, 225, 16, 16);

	public static BufferedImage TREE6 = Game.spritesheet.getSprite(93, 242, 16, 16);
	public static BufferedImage TREE7 = Game.spritesheet.getSprite(110, 242, 16, 16);
	public static BufferedImage TREE8 = Game.spritesheet.getSprite(127, 242, 16, 16);

	public static BufferedImage TREE9 = Game.spritesheet.getSprite(93, 259, 16, 16);
	public static BufferedImage TREE10 = Game.spritesheet.getSprite(110, 259, 16, 16);
	public static BufferedImage TREE11 = Game.spritesheet.getSprite(127, 259, 16, 16);

	public static BufferedImage TREE12 = Game.spritesheet.getSprite(93, 276, 16, 16);
	public static BufferedImage TREE13 = Game.spritesheet.getSprite(110, 276, 16, 16);
	public static BufferedImage TREE14 = Game.spritesheet.getSprite(127, 276, 16, 16);
	
	public static BufferedImage TILE_TREE00 = Game.spritesheet.getSprite(59, 140, 16, 16); 
	public static BufferedImage TILE_TREE01 = Game.spritesheet.getSprite(76, 140, 16, 16); 
	public static BufferedImage TILE_TREE02 = Game.spritesheet.getSprite(93, 140, 16, 16);

	public static BufferedImage TILE_TREE03 = Game.spritesheet.getSprite(59, 157, 16, 16); 
	public static BufferedImage TILE_TREE04 = Game.spritesheet.getSprite(76, 157, 16, 16); 
	public static BufferedImage TILE_TREE05 = Game.spritesheet.getSprite(93, 157, 16, 16);

	public static BufferedImage TILE_TREE06 = Game.spritesheet.getSprite(59, 174, 16, 16);
	public static BufferedImage TILE_TREE07 = Game.spritesheet.getSprite(76, 174, 16, 16);
	public static BufferedImage TILE_TREE08 = Game.spritesheet.getSprite(93, 174, 16, 16);

	public static BufferedImage TILE_TREE09 = Game.spritesheet.getSprite(59, 191, 16, 16);
	public static BufferedImage TILE_TREE010 = Game.spritesheet.getSprite(76, 191, 16, 16);
	public static BufferedImage TILE_TREE011 = Game.spritesheet.getSprite(93, 191, 16, 16);
	
	private BufferedImage sprite;
	private int x, y;
	
	public Tile(int x, int y, BufferedImage sprite)
	{
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}
	
	public void render(Graphics g)
	{
		g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
	}
}
