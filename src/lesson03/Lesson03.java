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
      workers[0] = new Employee("Yakov Fain");
      workers[1] = new Employee("Mary Lou");
      workers[2] = new Contractor("Bill Shaw");
      System.out.println("types;"+
    		" workers[0]:" + workers[0].getClass().getName() 
    		);
      // populate the array workers here while downcasting
      Employee currentEmployee;
	  Contractor currentContractor;
      for (Person p: workers) {
    	  if (p instanceof Employee) {
    		  currentEmployee = (Employee) p;
    		  currentEmployee.increasePay(30);
    		  currentEmployee.addPensionPlan();
    	  } else if (p instanceof Contractor) {
    		  currentContractor = (Contractor) p;
    		  currentContractor.increasePay(30);
    	  }
      }
      PersonA workersA[] = new PersonA[3];
      
      workersA[0] = new EmployeeA("John");
      workersA[1] = new ContractorA("Mary");
      workersA[2] = new EmployeeA("Steve");
      for (PersonA p: workersA) {
    	  p.promote(30);
    	  p.increasePay(30);
      }
      Payable workersI[] = new Payable[3];
      
      workersI[0] = new EmployeeI("John");
      workersI[1] = new ContractorI("Mary");
      workersI[2] = new EmployeeI("Steve");
      for (Payable p: workersI) {
    	  p.increasePay(30);
      }
      Human humans[] = new Human[2];
      humans[0] = new Woman("Marina", true);
      humans[1] = new Man("Alex", true);
      for(Human h: humans) {
    	  h.name();
    	  h.israel();
      }
      
	}

}
