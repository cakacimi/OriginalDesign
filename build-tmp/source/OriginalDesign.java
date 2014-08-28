import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class originalDesign extends PApplet {

int z=10;
int y=1;
int xPosition=250;
int yPosition=250;

public void setup()
{
  size(500,500);
  background(0);
}
public void draw()
{
  frameRate(10);
  background(0);
  smooth();

  //red circle//
  fill(255-y,0,0,100);
  ellipse(xPosition,yPosition,z,z);
  
  //orange circle//
  fill(255-y,140,0,100);
  ellipse(xPosition,yPosition,z-50,z-50);
  
  //yellow circle//
  fill(255-y,255,0,100);
  ellipse(xPosition,yPosition,z-100,z-100);
  
  //green circle//
  fill(0,255-y,0,100);
  ellipse(xPosition,yPosition,z-150,z-150);
  
  //blue circle//
  fill(0,0,255-y,100);
  ellipse(xPosition,yPosition,z-200,z-200);
  
  //purple circle//
  fill(186,85,211-y,100);
  ellipse(xPosition,yPosition,z-250,z-250);
  
  //indigo circle//
  fill(138,43,226-y,100);
  ellipse(xPosition,yPosition,z-300,z-300);
  
  
  //change//
  
  z= z+10;
  y=y+3;
  if (z>490)
  {
    z=10;
  }
  if (y<50)
  {
    y=1;
  }

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "originalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
