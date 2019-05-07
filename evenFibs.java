import java.util.*;

public class evenFibs {

	evenFibs() {
	}

	private int i = 1;
	private int sums = 0;
	private List multList = new ArrayList();
	private	List<Integer> fibList = new ArrayList<Integer>();

	public static void main(String[] args){
		System.out.println("starting to run..." );
		evenFibs run = new evenFibs();
		List<Integer> hi = run.genFibList();
		int res = run.calcMult();
		System.out.println("finished running... result is "+res );
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

}
