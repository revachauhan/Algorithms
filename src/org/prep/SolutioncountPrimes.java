package org.prep;
/*Count the number of prime numbers less than a non-negative number, n.
 * 
 */
public class SolutioncountPrimes {
	public static void main(String[] args) {
		System.out.println(countPrimes1(17));
	}
    public static int countPrimes(int n) {
    	int count =0;
    	
    	for(int i = 2; i<=n;i++)
    	{
    		if(isPrime(i))
    			count++;
    		
    		
    	}
    	return count;
    	
        
    }
    private static boolean isPrime(int num)
	{
		for(int i =2; i <=Math.sqrt(num); i++)
			{
			if(num%i==0)
				return false;
				
			}
		return true;
		
	}
    
    public static int countPrimes1(int n) {
    	if (n <= 2)
    		return 0;
     
    	// init an array to track prime numbers
    	boolean[] primes = new boolean[n];
    	for (int i = 2; i < n; i++)
    		primes[i] = true;
     
    	//for (int i = 2; i <= Math.sqrt(n - 1); i++) {
    	for (int i = 2; i <= n-1; i++) {
    		if (primes[i]) {
    			for (int j = i + i; j < n; j += i)
    				primes[j] = false;
    		}
    	}
     
    	int count = 0;
    	for (int i = 2; i < n; i++) {
    		if (primes[i])
    			count++;
    	}
    	
    	return count;
    	
    }
    
    	
    	
    
}
