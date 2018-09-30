//Makes array or rectangles and finds the one with the largest perimeter

public class Problem1 {
    
    public static final void main(String[] args) {
    
        Rectangle[] r = new Rectangle[5];
    
        //manually input values for rectangles
        r[0] = new Rectangle(10, 1);
        r[1] = new Rectangle(4, 4);
        r[2] = new Rectangle(42, 6);
        r[3] = new Rectangle(1, 1);
        r[4] = new Rectangle(42, 7);
        
        System.out.println(findMax(r));    
    }
    
    public static <AnyType extends Comparable<AnyType>> AnyType findMax(AnyType[] arr) {
        
        int maxIndex = 0;
        
        for (int i = 1; i < arr.length; i++)
            
            if ( arr[i].compareTo(arr[maxIndex]) > 0 )
                maxIndex = i;
        
                    return arr[maxIndex];
    }
}
