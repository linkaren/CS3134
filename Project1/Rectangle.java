//A rectangle!!!

public class Rectangle implements Comparable<Rectangle>{
    
    private double width;
    private double length;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getPerimeter(){
        return 2 * (width + length);
    }
    
    public int compareTo(Rectangle other) {
        
        if (this.getPerimeter() > other.getPerimeter())
            return 1;
        
        else if (this.getPerimeter() < other.getPerimeter())
            return -1;
        
        else 
            return 0;
    }

    public String toString(){
        return "Length: " + length + ", Width: " + width + ", and Perimeter: " + getPerimeter();
    }
}
