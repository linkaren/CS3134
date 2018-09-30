//calculates running time for different algorithms

public class Problem3{
   
    //manually input values for n and k
    private static int n = 100000;
    private static int k = 100;
    
    public static final void main(String[] args){
        
        //First problem
        int sum1 = 0;
        long startTime = System.nanoTime();
        
        for (int i = 0; i < 23; i++){
            
            for (int j = 0; j < n; j++)
                sum1 = sum1 + 1;
        }
        
        long endTime = System.nanoTime();
        
        System.out.println("Elapsed time for 1: " + (endTime - startTime));
        
        //Second problem
        int sum2 = 0;
        startTime = System.nanoTime();
        
        for ( int i = 0; i < n ; i ++){
            
            for ( int k = i ; k < n ; k ++)
                sum2 = sum2 + 1;
        }
        
        endTime = System.nanoTime();
       
        System.out.println("Elapsed time for 2: " + (endTime - startTime));
        
        //Third problem
        startTime = System.nanoTime();
        
        //calls the third fragment method; k = 2
        foo(n, 2);       
        
        endTime = System.nanoTime();
   
        System.out.println("Elapsed time for 3: " + (endTime - startTime));
    }
       
    public static int foo(int n, int k) {     
        
        if(n <= k)
            return 1;
        else
            return foo(n / k, k) + 1;
    }     
}
