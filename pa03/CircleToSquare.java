package pa03;



/**
 * Subclass of CircleShape
 * CircleToSquare are blue circles which move at a constant velocity
 * on the board and bounce off the edges, but alternate from circle to square
 * every time they hit the wall.
 *@author Maddie Marx mmarx@brandeis.edu
*/
public class CircleToSquare extends CircleShape{

  private boolean c;
  this.c = c;
  this.c = true;

  public CircleToSquare(){
    super();
    this.color = new java.awt.Color(51,153,255,100); // transparent blue
  }
  //override toString method @override
  public String toString(){
    return ("Maddie's shape"+super.toString());
  }
	/**
	 * Keep circle on the board as usual, but everytime it hits border
   * also alternates shape to square or circle.
*/
  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.vx = -this.vx;
      this.x = this.radius;
      if (this.c == false) {           //alternate boolean variable
        this.c = true;
      }else if (this.c == true) {
        this.c = false;
      }

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = -this.vx;
      this.x = CircleShape.boardWidth-this.radius;
      if (this.c == false) {             //alternate boolean variable
        this.c = true;
      }else if (this.c == true) {
        this.c = false;
      }
    }


    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = -this.vy;
      this.y = this.radius;
      if (this.c == false) {             //alternate boolean variable
        this.c = true;
      }else if (this.c == true) {
        this.c = false;
      }

    }else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = -this.vy;
      this.y = CircleShape.boardHeight-this.radius;
      if (this.c == false) {            //alternate boolean variable
        this.c = true;
      }else if (this.c == true) {
        this.c = false;
      }
    }
  }

  public void draw(Graphics g) {
    g.setColor(this.color);
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    if(this.c == false){
      g.drawRect(u,v,w,h);
      g.fillRect(u,v,w,h);
    }else if (this.c == true){
      g.drawOval(u,v,w,h);
      g.fillOval(u,v,w,h);
    }
  }


}
