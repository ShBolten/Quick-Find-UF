import java.util.Random;
public class DynamicConnectivity {
	
	public static void main(String args[]) {
		int n = 5;
		int connect = count(n);
		System.out.println("Number of Connections: " + connect);
		double connect2 = (.5 * n) * Math.log(n);
		System.out.println("Number of Correct Connections: " + connect2);
		double percentageCor = (connect / connect2) * 100;
		System.out.println("Percentage Correct: % " + percentageCor);
	}

	public static int count(int N) {
		Random rand = new Random();
		//int a = 0;
		//int b = 0;
		int connection = 0;
		QuickFindUF uf = new QuickFindUF(N);
		while (uf.count > 1) {
			int a = rand.nextInt(N);
			int b = rand.nextInt(N);
			if(!uf.connected(a, b)) {
				uf.union(a,b);
				connection++;
					}	
			}
		return connection;
	}
	
}
