public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        boolean[] arr = new boolean[n + 1];
        int p = 2; 
        int count = 0;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = true;  
        }
         while (p*p <= n ){
        
        for (int i = p + 1; i < n + 1; i++) {
            if (i % p == 0) {
              arr[i] = false; 
            }
           
        }
        boolean foundNext = false;
        for (int i = p + 1; i < n + 1; i++) {
            if (arr[i] == true ){
                p = i; 
                foundNext = true;
                break;
            }
       
        } 
        if (!foundNext) {
        break;
        }
       }
       for (int i = 2; i < n + 1; i++){
       if (arr[i] == true){
        System.out.println(i);
        count ++; 
       }
    }
    double precent = ((count * 100.0) / n );
    System.out.println("There are " + count + " primes between 2 and " + n + "(" + precent + "% are primes)" );



    
}
}