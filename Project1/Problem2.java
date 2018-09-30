//Uses binary search to find a rectangle in an array

import java.util.Arrays;

public class Problem2{
    
    public static final void main(String[] args){
        
        Rectangle[] r = new Rectangle[5];
    
        //manually input values for rectangles
        r[0] = new Rectangle(1, 1);
        r[1] = new Rectangle(42, 4);
        r[2] = new Rectangle(42, 6);
        r[3] = new Rectangle(21, 1);
        r[4] = new Rectangle(5, 4);
        
        Arrays.sort(r);
        
        System.out.println("Sorted by Perimeter:");
        
        //prints out sorted list of rectangles
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
        
        System.out.println();
        System.out.println("Rectangle of " + new Rectangle(5, 4) + " is found at index " 
                           + binarySearch(r, new Rectangle(5, 4)));
    }
    
    public static <AnyType extends Comparable <AnyType>> 
        int binarySearch(AnyType[] a, AnyType x) {
        return binarySearch(a, 0, a.length - 1, x);
    }

    private static <AnyType extends Comparable <AnyType>> 
        int binarySearch(AnyType[] arr, int start, int end, AnyType target) {
    
        int mid = (start + end) / 2;
        int result = target.compareTo(arr[mid]);
		
		if(end < start)
			 return -1;
		
		if (result < 0)
			return binarySearch(arr, start, mid - 1, target);
		
		if (result > 0)
			return binarySearch(arr, mid + 1, end, target);
		
		else
			return mid;
	}
}
