int z=10;
int y=1;
int xPosition=250;
int yPosition=250;

void setup()
{
  size(500,500);
  background(0);
}
void draw()
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