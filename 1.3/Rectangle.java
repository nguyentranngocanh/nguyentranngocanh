public class Rectangle {
    public float length, width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }
    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }
    public void setLength(float l) {
        length = l;
    }
    public void setWidth(float w) {
        width = w;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
