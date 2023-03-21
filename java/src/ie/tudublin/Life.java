package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet
{

	LifeBoard board;
	boolean pause = false;


	public void settings()
	{
		size(1000, 1000);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		board = new LifeBoard(70, this);
		board.randomise();
	}

	public void draw()
	{	
		background(0);
		board.render();
		
		if (pause == false)
		{
			board.applyRules();
		}
		
		
	}
	public void keyPressed()
	{
		if (key == ' ')
		{
			pause = !pause;
		}
	}
}
