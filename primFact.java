import java.util.*;
import java.math.*;

public class primFact {

	primFact() {
	}

	private int i = 1;
	private int sums = 0;
	private List multList = new ArrayList();
	private	List<Integer> fibList = new ArrayList<Integer>();
	private List<Integer> primList = new ArrayList<Integer>();

	public static void main(String[] args){
		System.out.println("starting to run...");
		primFact run = new primFact();
		List<Integer> hi = run.genPrimList(2000);
		//BigInteger myNum = new BigInteger("600851475143");
		BigInteger myNum = new BigInteger("1100");
		String res = run.getHighestPrimeFactor(myNum);
		System.out.println("finished running... result is "+res);
	}


	public int calcMult() {
		System.out.println("calculating...");
		i = 0;
		while (i < fibList.size()) {
			if ((fibList.get(i) % 2) == 0) {
				sums += fibList.get(i);
				System.out.println("added "+fibList.get(i)+" to sums");
			}
			i++;
		}
		return sums;
	}

	public List<Integer> genFibList () {
		System.out.println("generating list of fibonacci sequence below 4M");
		fibList.add(1);
		fibList.add(2);
		int nextVal = 3;
		int index = 1;
		while (nextVal < 4000000) {
			nextVal = fibList.get(index - 1) + fibList.get(index);
			if (nextVal < 4000000) {
				fibList.add(nextVal);
				System.out.println("adding "+nextVal+" as the next number in seq");
			}
			index++;
		}

		return fibList;

	}

	public List<Integer> genPrimList (int y) {
		//generates list of primes that is equal or less than y via sieve of Earatosthenes
		int primeNum = 2;
		int index = 2;

		System.out.println("populating primeList arraylist");
		for (i = 0; i <= y; i++) {
			primList.add(i);
		}
		System.out.println("primList is now size "+primList.size());
	
		index = 3;	
		while (primeNum * primeNum < y) {
			if (primeNum > 0) {
			for (i = 2; i*primeNum <=y; i++) {
				if (primList.get(primeNum*i) != 0){	
					primList.set(primeNum*i, 0);
				}
			}
			}
			if (primList.get(index) > 0) {
				primeNum = primList.get(index);
			}
			System.out.println("next prime number factor found: "+primeNum);
			index++;
		}
		
		for (i=primList.size()-1 ; i>=2 ; i--){
			if (primList.get(i)==0){
//				System.out.println("removing "+i");
				primList.remove(i);
			}
		}
		System.out.println("largest prime number found under "+y+" is: "+primList.get(primList.size()-1));
		System.out.println("size of primList is "+primList.size());
		System.out.println("the first prime number is "+primList.get(2));
		
		BigInteger k = BigInteger.valueOf(0);
		for (i = 2; i < primList.size(); i++) {
			System.out.println("k is currently "+k+" and adding nth prime number n = "+i+" which is "+primList.get(i));
			k = k.add(BigInteger.valueOf(primList.get(i)));
		}
		System.out.println("sum of all primes under 2,000,000 is "+k.toString());

		return primList;
	}

	public String getHighestPrimeFactor(BigInteger x) {
		System.out.println("about to do some stuff with "+x);
		BigInteger A, B;
		
		for (i = 2; i < primList.size(); i++) {
			A = BigInteger.valueOf(primList.get(i));
			if (x.mod(A).compareTo(BigInteger.valueOf(0)) == 0) {
				System.out.println(A+" is a prime factor of "+x);
			}

		}
		
		return "OK";
		
	}
}
