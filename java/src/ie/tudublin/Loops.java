package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;
	int type = 0;

	public void settings() {
		size(500, 500);
		// fullScreen(SPAN);
	}

	public void setup() {
		colorMode(RGB, 255, 255, 255);
	}

	public void keyPressed() {
		mode = key - '0';
	}

	public void mousePressed() {
		if (type == 1)
		{
			type = 0;
		}
		else
		{
			type++;
		}
	}

	float off = 0;

	public void draw() {
		background(0);
		fill(0, 255, 0);
		noStroke();
		switch (mode) {
			case 0: // Circles
				int numCircles = (int) max(1, mouseX / 50.0f);
				float d = width / numCircles;
				for (int j = 0; j < numCircles; j++) {
					for (int i = 0; i < numCircles; i++) {
						float x = (d * 0.5f) + (d * i);
						float y = (d * 0.5f) + (d * j);
						float c = ((i + j) / ((numCircles - 1) * 2.0f)) * 255.0f;
						fill((c + off) % 256, 255, 255);
						circle(x, y, d);
					}
				}
				off += (mouseY / 50.0f);
				break;

			case 1: // Rectangles and squares
				switch (type)
				{
					case 0:
						fill(0, 255, 0);
						if(mouseX < 250)
						{
							rect(0, 0, 250, 500);
						}
						else 
						{
							rect(250, 0, 250, 500);
						}
						break;


					case 1:
						fill(0, 255, 0);
						if(mouseX < 250 && mouseY < 250)
						{
							rect(0, 0, 250, 250);
						}
						else if(mouseX > 250 && mouseY < 250)
						{
							rect(250, 0, 250, 250);
						}
						else if(mouseX < 250 && mouseY > 250)
						{
							rect(0, 250, 250, 250);
						}
						else 
						{
							rect(250, 250, 250, 250);
						}
						break;

					default:
						break;
				}
				break;

			case 2:

				break;

			default:
				break;
		}

	}
}
