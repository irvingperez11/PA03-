package pa03;


public class MayasCircle extends CircleShape{

  private double rc = 10;

  public MayasCircle(){
    super();
    this.color = new java.awt(78,251,197);

  }

  public void update(double dt){
    if(dt%10 < 5){
      this.radius = this.radius - rc;
    }
    else{
      this.radius = this.radius + rc;
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
