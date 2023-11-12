public class Rectangle {

    //good practice to make parameters private

    //int length;
    private int length;
    //int width;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    //making public signature- area

    public int area() {
        return length * width;
    }

    public boolean isRectangle() {
        return this.length == this.width;
    }

}
