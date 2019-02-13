package com.mateusdev.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.mateusdev.entities.Entity;
import com.mateusdev.entities.Player;
import com.mateusdev.graficos.Spritesheet;
import com.mateusdev.world.World;

public class Game extends Canvas implements Runnable, KeyListener{

	private static final long serialVersionUID = 1L;
	public static JFrame frame;
	private Boolean isRunnig;
	private Thread thread;
	public static final int WIDTH = 336;
	public static final int HEIGHT = 208;
	public final int SCALE = 3;

	private BufferedImage image;
	
	public List<Entity> entities;
	public static Spritesheet spritesheet;
	public static World world;
	
	public static Player player;
	
	public Game()
	{
		addKeyListener(this);
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		initFrame();

		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		entities = new ArrayList<Entity>();
		spritesheet = new Spritesheet("/spritesheet.png");
		world = new World("/Environment/map.png");
		
		player = new Player(530, 70, 32, 32, spritesheet.getSprite(0, 32, 32, 32));
		entities.add(player);
	}
	
	public void initFrame()
	{
		frame = new JFrame("Game Teste #1");
		frame.add(this);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public synchronized void start()
	{
		isRunnig = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop()
	{
		isRunnig = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		Game game = new Game();
		game.start();
	}

	public void tick()
	{
		for(int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
		}
	}
	public void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = image.getGraphics();
		g.setColor(new Color(0,0,0));
		g.fillRect(0, 0, WIDTH, HEIGHT);

		world.render(g);
		
		for(int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.render(g);
		}

		/* --------- */
		
		g.dispose();
		
		g.setFont(new Font("Arial", Font.BOLD, 10));
		g.setColor(Color.black);
		g.drawString("Welcome to my Game !!!", 61, 10);
			
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
		bs.show();
	}
	
	public void run() 
	{
		long lastTime = System.nanoTime();
		double ammountOfTicks = 60.0;
		double ns = 1000000000 / ammountOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();

		while(isRunnig)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			
			if(delta >= 1)
			{
				tick();
				render();
				frames ++;
				delta --;
			}
			if(System.currentTimeMillis() - timer >= 1000)
			{
				System.out.println("FPS : " + frames);
				frames = 0;
				timer += 1000;
			}
		}
		stop();
	}
	
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D)
		{
			player.right = true;
		} 
		if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A)
		{
			player.left = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
		{
			player.up = true;
		} 
		if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
		{
			player.down = true;
		}
	}

	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D)
		{
			player.right = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A)
		{
			player.left = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
		{
			player.up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
		{
			player.down = false;
		}
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

