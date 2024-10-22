public class Ball {
    public float x;
    public float y;
    public int radius;
    public float xDelta;
    public float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public float getxDelta(){
        return xDelta;
    }
    public void setxDelta(float xDelta){
        this.xDelta = xDelta;
    }
    public float getyDelta(){
        return yDelta;
    }
    public void setyDelta(float yDelta){
        this.yDelta = yDelta;
    }
    public void move(){
        x += xDelta;
        y += yDelta;
    }
    public void reflecHorizontal(){
        xDelta = -xDelta;
    }
    public void reflecVertical(){
        yDelta = -yDelta;
    }
    public String toString(){
        return "Ball[(" + x + y+"), speed=("+ xDelta + ", " + yDelta + ")]";
    }
}
