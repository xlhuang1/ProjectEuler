import java.util.*;

public class sumsOfMult {

	sumsOfMult() {
	}

	private int i = 1;
	private int sums = 0;
	private List multList = new ArrayList();

	public static void main(String[] args){
		System.out.println("starting to run..." );
		sumsOfMult run = new sumsOfMult();
		int res = run.calcMult();
		System.out.println(res);
	}


	public int calcMult() {
		System.out.println("calculating...");
		while (i < 1000) {
			if (((i % 3) == 0) || ((i % 5) == 0)) {
				multList.add(i);
				System.out.println("added i "+i+" to list");
			}
			i++;
		}
		for (int x = 0; x < multList.size(); x++) {
			int a = (int) multList.get(x);
			sums += a;
		}
		return sums;
	}

}
