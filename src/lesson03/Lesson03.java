package lesson03;

public class Lesson03 {
    static String vinstance(Object o) {
    	String vs ="";
    	if (o instanceof NJTax) {vs = "NJTax";}
    	else if(o instanceof Tax) { vs = "Tax"; }
    	else if (o instanceof Object) { vs = "Object"; }
    	return vs;
    }
	public static void main(String[] args) {
      System.out.println("Lesson03");
      double gi = 70000;
      String st = "MA";
      int dep = 2;
      Tax ct = new Tax(gi, st, dep);
      double vt = ct.calcTax();
      System.out.println(st + " Tax for $" +gi+" is " + 
        ct.calcTax());
      NJTax cnjt1 = new NJTax(gi, dep);
      Tax cnjt2 = new NJTax(gi, dep); // upcasting
      Object cnjt3 = new NJTax(gi, dep); // upcasting
      System.out.println("types; mytax:"+((Object) vt).getClass().getName()+
    		" cnjt1:" + vinstance(cnjt1) +
    		" cnjt2:" + vinstance(cnjt2) +
    		" cnjt3:" + vinstance(cnjt3));
      
      Person workers[] = new Person [100];
      
      workers[0] = new Employee("Yakov", "Fain");
      workers[1] = new Employee("Mary", "Lou");
      workers[2] = new Contractor("Bill", "Shaw");
      System.out.println("types;"+
    		" workers[0]:" + workers[0].getClass().getName() 
    		);
      // populate the array workers here ..
      for (int i1=0; i1<100; i1++) {
    	  Employee currentEmployee;
    	  Contractor currentContractor;
    	  // downcasting
    	  if (workers[i1]  instanceof Employee) {
    		  currentEmployee = (Employee) workers[i1];
    	  } else if (workers[i1] instanceof Contractor) {
    		  currentContractor = (Contractor) workers[i1];
    	  }
      }
      
	}

}
