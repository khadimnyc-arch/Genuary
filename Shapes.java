import processing.core.PApplet;
public class Shapes {
    PApplet app;
    //instance variables
    private float x, y, size, angle;
    private int col;
    private boolean isSquare;

    //constructors 
    public Shapes(PApplet app, float x, float y, float size, int col, boolean isSquare){
        this.app = app;
        this.x = x;
        this.y = y;
        this.size = size;
        this.col = col;
        this.isSquare = isSquare;
        this.angle = 0;

    }

    //my methods
    //rotate
    public void update(){
        angle+=0.02f;
    }

    public void display(){
        app.pushMatrix();
        app.translate(x, y);
        app.rotate(angle);
        app.fill(col);
        
        if (isSquare){
            app.rect(0, 0, size, size);
        } else {
            app.ellipse(0, 0, size, size);
        }
        app.popMatrix();
    }

}
