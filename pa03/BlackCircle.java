package pa03;

/**
 * BlackCircle is a series of small red circles with radius 15, which move
 * on the board and bounce off the edges, but when colliding with each other,
 * become black.
 */

 import java.awt.Color;
 public class BlackCircle extends CircleShape {
 private int id;
 private static int num;
 private static CircleShape[] circles;

 /**
  * creates a series of red circles and set the color to red
  */

 public BlackCircle(CircleShape[] circles) {
  super(); //calls a base class constructor
  this.circles = circles; //accepts array passes as a parameter to a static variable
  this.id = num; //tracks each red circle and assigns a unique id
  num = num + 1; //increments through ids
  this.radius = 15; //sets circle radius to 15
  this.color = Color.red; //sets circle color to red
 }

/**
* Method toString() returns CircleShape constructer
@return CircleShape constructer
*/
 public String toString(){
   return "Black Circle: " + super.toString();
 }

 /**
  * Updates each circle, but also if it collides with another red circle, changes its
  * color to black. Checks that circle does not collide with itself.
  */
 public void update(double dt) {
  for (int i = 2; i < circles.length; i += 3) {
   if (this.id != i / 3) {
    if (Math.sqrt(Math.pow(this.x - circles[i].x, 2) + Math.pow(this.y - circles[i].y, 2)) < (this.radius + circles[i].radius)) {
     this.color = Color.black;
     break;
    } else {
     this.color = Color.red;
    }
   }
  }
  super.update(dt);
 }

}
