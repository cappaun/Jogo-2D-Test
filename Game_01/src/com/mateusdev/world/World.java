package com.mateusdev.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.mateusdev.main.Game;

public class World {
	
	public static BufferedImage enviroment;
	
	private Tile[] tiles;
	public static int WIDTH, HEIGHT;

	public World(String path)
	{
		try {
			BufferedImage map = ImageIO.read(getClass().getResource(path));
			
			int[] pixels = new int[map.getWidth() * map.getHeight()];
			tiles = new Tile[map.getWidth() * map.getHeight()];
			
			WIDTH = map.getWidth();
			HEIGHT = map.getHeight();
			
			map.getRGB(0, 0, map.getWidth(), map.getHeight(), pixels, 0, map.getWidth());
			for(int xx = 0; xx < map.getWidth(); xx++)
			{
				for(int yy = 0; yy < map.getHeight(); yy++)
				{
					int pixelAtual = pixels[xx + (yy * map.getWidth())];
					
					if (pixelAtual == 0xFFBCB380)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE);
					}
					else if(pixelAtual == 0xFFBCB381)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE1);
					}
					else if(pixelAtual == 0xFFBCB382)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE2);
					}
					else if(pixelAtual == 0xFFBCB383)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE3);
					}
					else if(pixelAtual == 0xFFBCB384)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE4);
					}
					else if(pixelAtual == 0xFFBCB385)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE5);
					}
					else if(pixelAtual == 0xFFBCB386)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE6);
					}
					else if(pixelAtual == 0xFFBCB387)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE7);
					}
					else if(pixelAtual == 0xFFBCB388)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE8);
					}
					else if(pixelAtual == 0xFFBCB389)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE9);
					}
					else if(pixelAtual == 0xFFBCB390)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE10);
					}
					else if(pixelAtual == 0xFFBCB391)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE11);
					}
					else if (pixelAtual == 0xFFBCB350)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE);
					}
					else if(pixelAtual == 0xFFBCB351)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE1);
					}
					else if(pixelAtual == 0xFFBCB352)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE2);
					}
					else if(pixelAtual == 0xFFBCB353)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE3);
					}
					else if(pixelAtual == 0xFFBCB354)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE4);
					}
					else if(pixelAtual == 0xFFBCB355)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE5);
					}
					else if(pixelAtual == 0xFFBCB356)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE6);
					}
					else if(pixelAtual == 0xFFBCB357)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE7);
					}
					else if(pixelAtual == 0xFFBCB358)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE8);
					}
					else if(pixelAtual == 0xFFBCB359)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE9);
					}
					else if(pixelAtual == 0xFFBCB360)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE10);
					}
					else if(pixelAtual == 0xFFBCB361)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE11);
					}
					else if(pixelAtual == 0xFFBCB362)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE12);
					}
					else if(pixelAtual == 0xFFBCB363)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE13);
					}
					else if(pixelAtual == 0xFFBCB364)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE14);
					}
					else if(pixelAtual == 0xFFFFFFFF)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE00);
					}
					else if(pixelAtual == 0xFFFFFFF0)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE01);
					}
					else if(pixelAtual == 0xFF000000)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_FLOOR);
					}
					else if (pixelAtual == 0xFFBCB320)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE00);
					}
					else if(pixelAtual == 0xFFBCB321)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE01);
					}
					else if(pixelAtual == 0xFFBCB322)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE02);
					}
					else if(pixelAtual == 0xFFBCB323)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE03);
					}
					else if(pixelAtual == 0xFFBCB324)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE04);
					}
					else if(pixelAtual == 0xFFBCB325)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE05);
					}
					else if(pixelAtual == 0xFFBCB326)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE06);
					}
					else if(pixelAtual == 0xFFBCB327)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE07);
					}
					else if(pixelAtual == 0xFFBCB328)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE08);
					}
					else if(pixelAtual == 0xFFBCB329)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE09);
					}
					else if(pixelAtual == 0xFFBCB330)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE010);
					}
					else if(pixelAtual == 0xFFBCB331)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_TREE011);
					}
					else if(pixelAtual == 0xFFBCB111)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE02);
					}
					else if(pixelAtual == 0xFFBCB110)
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TREE03);
					}
					else
					{
					    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_FLOOR);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void render(Graphics g)
	{
		int xstart = Camera.x / 16;
		int ystart = Camera.y / 16;
		
		int xfinal = xstart + (Game.WIDTH / 16);
		int yfinal = ystart + (Game.HEIGHT / 16);
		
		for(int xx = xstart; xx <= xfinal; xx++)
		{
			for(int yy = ystart; yy <= yfinal; yy++)
			{
				Tile tile = tiles[xx + (yy * WIDTH)];
				tile.render(g);
			}
		}
	}
	
}
