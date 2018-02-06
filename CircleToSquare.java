package pa03;



/**
 * CircleToSquare are blue circles which move at a constant velocity
 * on the board and bounce off the edges, but alternate from circle to square
 * every time they hit the wall.
*/
public class CircleToSquare extends CircleShape{

  private boolean c = true;    //creates variable for alternating circle to square

  public CircleToSquare(){
    super();
    this.color = new java.awt.Color(51,153,255,100); // transparent blue
  }

  /*public static void main(String[] args){
    CircleToSquare x = new CircleToSquare.toString();
    System.out.println("My circles is "+x);
    private boolean c = true;
  }*/

  //public String toString(){
  //  return "CircleToSquare:"+super.toString();


	/**
	 * Keep circle on the board as usual, but change it also alternates shape.
*/
  public void keepOnBoard(boolean c){
    // change the properties of the CircleShape when it hits the wall
    super();
    if (this.x < this.radius||this.x > CircleShape.boardWidth-this.radius) {
      if (c = false) {
        c = true;
      }else if (c = true) {
        c = false;
      }

    }else if(this.y < this.radius||this.y > CircleShape.boardHeight-this.radius){
      if (c = false) {
        c = true;
      }else if (c = true) {
        c = false;
      }
    }
    draw(boolean c);
  }

  public void draw(Graphics g, boolean c) {
    super();
    super.g = g.drawRect();
    if(c = false){
      g.drawRect();
      g.fillRect();
    }else {
      g.drawOval();
      g.fillOval();
    }
  }


}
