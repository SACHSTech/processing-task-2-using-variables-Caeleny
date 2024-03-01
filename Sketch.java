import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    // Background size
      size(800, 800);
    }
  
    // Background color
    public void setup() {
      background(67, 170, 239);
    }
  
    // Different shapes
    public void draw() {
      
      // House
      fill(255, 220, 150);
      rect(width/10, height/2, (float)(width*0.75), height/2);

      // Door
      fill(66, 69, 62);
      rect((float)(width*0.75), (float)(width*0.825), width/10, (float)(width*0.175));
  
      // Window
      fill(120, 205, 255);
      rect((float)(width*0.525), (float)(height*0.575), width/4, (float)(height*0.175));
  
      // Window 2
      fill(120, 205, 255);
      rect((float)(width*0.175), (float)(width*0.575), width/4, (float)(width*0.175));
  
      // Window 3 
      fill(120, 205, 255);
      rect((float)(width*0.175), (float)(width*0.8), (float)(width*0.375), (float)(width*0.175));
  
      // Roof
      fill(163, 112, 49);
      triangle((float)(width*0.075), height/2, width/2, height/4, (float)(width*0.875), height/2);
    
      // Sun
      fill(255, 242, 0);
      ellipse(width/8,height/8, width/4, height/4); 

      
    }
  
}