

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Collection3.Worker;

public class UseWorker {
	public static void main(String [] args ) {
		
		String [] a=args[0].split(",");
		String a1=a[0];
		int a2=Integer.parseInt(a[1]);
		boolean a3=Boolean.parseBoolean(a[2]);
		
		String [] b=args[0].split(",");
		String b1=b[0];
		int b2=Integer.parseInt(b[1]);
		boolean b3=Boolean.parseBoolean(b[2]);
		
		String [] c=args[0].split(",");
		String c1=c[0];
		int c2=Integer.parseInt(c[1]);
		boolean c3=Boolean.parseBoolean(c[2]);
		
		Worker w1=new Worker(a1,a2,a3);
		Worker w2=new Worker(b1,b2,b3);
		Worker w3=new Worker(c1,c2,c3);
		
		ArrayList<Worker>workers=new ArrayList<> ();
		workers.add(w1);
		workers.add(w2);
		workers.add(w3);
		
		//List<Worker>icc=workers.stream().filter(x->x.getIsMarried()==true).collect(Collectors.toList());
	
	//	icc.forEach(y->System.out.println(y));
//		
//		long z=workers.stream().filter(x->x.getAge()>20).count();
//		System.out.println(z);
		
		List<Worker>icc=workers.stream().filter(x->x.getName().endsWith("i")).collect(Collectors.toList());
		
			icc.forEach(y->System.out.println(y));

		
	}

}
