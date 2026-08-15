import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 600);
        
    }

    public void setup() {
        frameRate(60);
        rectMode(CENTER); 
        ellipseMode(CENTER);  
    }

    public void draw() {
        background(220);
        translate(300,300);
        int count = 0;

        for(int w = width; w>0;w-= 25){
            if(count %2 == 0){
                fill(50+count*10,100,200);
            } else{
                fill(200,150,50);
            }

            pushMatrix();
            rotate(sin(frameCount *0.01f));

            if(count% 2 == 0){
                square(0,0,w);
            }else{
                ellipse(0,0,w,w);
            }


            popMatrix();
            count++;
        }
    }

}
