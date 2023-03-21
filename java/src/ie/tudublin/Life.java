package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet
{

	LifeBoard board;
	boolean pause = false;
	boolean clear = false;


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

		if (key == 49) //ASCII for 1
		{
			board.randomise();
		}

		if (key == 50) //ASCII for 2
		{
			clear = !clear;
			if (clear == true)
			{
				board.clearBoard();
			}
			else
			{
				board.randomise();
			}
		}
	}
}
