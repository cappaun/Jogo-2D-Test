package com.mateusdev.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.mateusdev.main.Game;
import com.mateusdev.world.Camera;

public class Player extends Entity
{
	public boolean right;
	public boolean left;
	public boolean up;
	public boolean down;
	
	public double speed = 1.2;
	
	public int right_dir = 0, left_dir = 1;
	public int up_dir = 3, down_dir = 2;
	public int dir = right_dir;
	
	private boolean moved = false;
	
	private int frames = 0;
	private int maxFrames = 4;
	private int index = 0;
	private int maxIndex = 5;
	
	private BufferedImage[] rightPlayer;
	private BufferedImage[] leftPlayer;
	private BufferedImage[] upPlayer;
	private BufferedImage[] downPlayer;
	
	public Player(int x, int y, int width, int height, BufferedImage sprite)
	{
		super(x, y, width, height, sprite);
		
		rightPlayer = new BufferedImage[6];
		leftPlayer = new BufferedImage[6];
		upPlayer = new BufferedImage[6];
		downPlayer = new BufferedImage[6];
		
		for(int i = 0; i < 6; i++)
		{
			rightPlayer[i] = Game.spritesheet.getSprite(0 + (i * 32), 64, 32, 32);
		}
		for(int i = 0; i < 6; i++)
		{
			leftPlayer[i] = Game.spritesheet.getSprite(0 + (i * 32), 96, 32, 32);
		}
		for(int i = 0; i < 6; i++)
		{
			upPlayer[i] = Game.spritesheet.getSprite(0 + (i * 32), 0, 32, 32);
		}
		for(int i = 0; i < 6; i++)
		{
			downPlayer[i] = Game.spritesheet.getSprite(0 + (i * 32), 32, 32, 32);
		}

	}
	
	public void tick()
	{
		moved = false;
		if(right)
		{
			moved = true;
			dir = right_dir;
			x+= speed;
			
			up = false;
			down = false;
			left = false;
		}
		else if(left)
		{
			moved = true;
			dir = left_dir;
			x-= speed;
			
			up = false;
			down = false;
			right = false;
		}
		
		if(up)
		{
			moved = true;
			dir = up_dir;
			y-= speed;
			
			right = false;
			left = false;
			down = false;
		}
		else if(down)
		{
			moved = true;
			dir = down_dir;
			y+= speed;
			
			up = false;
			right = false;
			left = false;
			
		}
		
		if(moved)
		{
			frames ++;
			
			if(frames == maxFrames)
			{
				frames = 0;
				index ++;
				
				if(index == maxIndex)
				{
					index = 0;
				}
			}
		}
		
		Camera.x = this.getX() - (Game.WIDTH / 2);
		Camera.y = this.getY() - (Game.HEIGHT / 2);
	}
	
	public void render(Graphics g)
	{
		if(dir == right_dir)
		{
			g.drawImage(rightPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
		}
		if(dir == left_dir)
		{
			g.drawImage(leftPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
		}
		
		if(dir == up_dir)
		{
			g.drawImage(upPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
		}
		if(dir == down_dir)
		{
			g.drawImage(downPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
		}
	}
}
