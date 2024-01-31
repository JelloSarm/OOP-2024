package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}

	public void draw()
	{	
        background(255, 0, 0);
        ellipse(200, 90, 85, 80); // cx cy
        circle(200, 200, 80); 
        rect(400 , 380, 50, 100); // x, y, w, h
        triangle(10, 200, 200, 200, 300, 400);

	}
}
