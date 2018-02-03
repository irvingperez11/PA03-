package pa03;

public class MayasCircle extends CircleShape{

  private double rc = 2;
  private boolean alt = true;

  public MayasCircle(){
    super();
    this.color = new java.awt.Color(78,251,197,100);
  }

  public void update(double dt){
    if(alt){
      this.radius = this.radius - rc;
      alt = false;
    }
    else{
      this.radius = this.radius + rc;
      alt = true;
    }
     super.update(dt);
  }

  public void keepOnBoard(){
    if (this.x < this.radius) {
      this.x = 250;
      this.y = 250;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      this.x = 250;
      this.y = 250;
    }

    if (this.y < this.radius){
      this.x = 250;
      this.y = 250;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      this.x = 250;
      this.y = 250;
    }
    super.keepOnBoard();
  }

}
