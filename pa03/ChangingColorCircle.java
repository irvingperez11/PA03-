package pa03;

import java.util.Random;
import java.awt.Color;
/**
* Subclass of CircleShape
* This circle changes to a different color depending on 
* what wall it hits
*
* The constructor accesses the instant variable color to 
* change the shape's color
* The ifs in the keepOnBoard have been extended to include
* the color change
*
* @author Lorraine Jemal (lbjemal@brandeis.edu)
*/

public class ChangingColorCircle extends CircleShape {
	// Fields
	private Color pink = new java.awt.Color(255,192,203); // PINK
	private Color orange = new java.awt.Color(255,165,0); // ORANGE
	private Color red = new java.awt.Color(255,69,0); // RED
	private Color gold = new java.awt.Color(255,215,0); // GOLD
	
	/**
	* Constructor
	* @override
	*/
	public ChangingColorCircle() {
		super();

		// choose what color to start as
		Random rand = new Random();
		int color = rand.nextInt(3)+1;
		if (color == 1) this.color = pink;
		else if (color == 2) this.color = orange;
		else if (color == 3) this.color = red;
		else this.color = gold;

	}

	/**
	* change the values of x,y,vx,vy to keep the circle on the board
	* also change the shape's color:
	* 	pink (top), orange (left), red (right), gold (bottom) (sunset colors)
	* @override
	*/
	public void keepOnBoard(){
		if (this.x < this.radius) {
			// it went off the left edge! do something!
    		this.vx = -this.vx;
			this.x = this.radius;

			// CHANGE COLOR
			this.color = orange;

		}else if (this.x > CircleShape.boardWidth-this.radius) {
			// it went off the right edge! do something!
    		this.vx = -this.vx;
			this.x = CircleShape.boardWidth-this.radius;

			// CHANGE COLOR
			this.color = red;
		}

		if (this.y < this.radius){
			// it went above the top edge!
    		this.vy = -this.vy;
			this.y = this.radius;

			// CHANGE COLOR
			this.color = pink;

		} else if (this.y > CircleShape.boardHeight-this.radius) {
			// it went below the bottom edge!
    		this.vy = -this.vy;
			this.y = CircleShape.boardHeight-this.radius;

			// CHANGE COLOR
			this.color = gold;
		}
	}

}