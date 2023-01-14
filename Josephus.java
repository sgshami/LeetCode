import java.util.*;

public class Josephus {
	int n;
	ArrayList<Integer> order;
	LinkedList<Person> p;
	
	private class Person{
		int original;
		
		Person(int o){
			original = o;
		}
		private int pos() {
			return original;
		}
	}
	
	public Josephus(int n) {
		order = new ArrayList<Integer>();
		p = new LinkedList<Person>();
		for(int i = 1; i<=n; i++) {
			p.add(new Person(i));
		}
	}
	
	public void reset(int n) {
		order = new ArrayList<Integer>();
		p = new LinkedList<Person>();
		for(int i = 1; i<=n; i++) {
			p.add(new Person(i));
		}
	}
	
	public void execute(int i) {
		order.add(p.remove(i).pos());
	}
	
	public int spot(int n, int m, int j) {
		return ((j+m-1) % n);
	}
	
	public void runner(int m) {
		int spot = (m-1)%p.size();
		//System.out.println("j: " + spot + " size " + p.size());
		execute(spot);
		while(p.size() >= 1) {
			spot = spot(p.size(), m, spot);
			//System.out.println("j: " + spot + " size " + p.size());
			execute(spot);
		}
		//execute(0);
	}
	
	public static void main(String[] args) {
		
		//Part A: Find m such that the J-(5, m)-Permutation is (3, 1, 5, 4, 2).  If you cannot determine such, give the range of your search.
		int n = 5;
		int m = 3;
		boolean match = false;
		//int[] arr = {3, 5, 4, 2, 1};
		ArrayList<Integer> sol = new ArrayList<Integer>();
		sol.add(3);
		sol.add(1);
		sol.add(5);
		sol.add(4);
		sol.add(2);
		Josephus j = new Josephus(n);
		while(!match) {
			j.runner(m);
			if(sol.equals(j.order))
				match = true;
			System.out.print("m: " + m + " And array is: ");
			for(int i: j.order) {
				System.out.print(i + " ");
			}
			System.out.println();
			j.reset(n);
			m += 5;
		}
		
		
		/*
		//For Part B
		int n = 7;
		int m = 5;
		boolean match = false;
		ArrayList<Integer> sol = new ArrayList<Integer>();
		sol.add(5);
		sol.add(2);
		sol.add(7);
		Josephus j = new Josephus(n);
		for(int i = 0; i<2000; i++) {
			m = 5;
			while(!match & m<101) {
				j.runner(m);
				if(j.order.get(0) == 5 && j.order.get(1) == 2 && j.order.get(2) == 7)
					match = true;
				System.out.print("m: " + m + "; n: " + n +  "; And array is: ");
				for(int s: j.order) {
					System.out.print(s + " ");
				}
				System.out.println();
				m += 5;
				j.reset(n);
			}
			n++;
		}
		*/
	}

}
