
public class Main {
  public static void main (String[]args) {

    Person per1 = new Person();
    System.out.println ("per1\t" + per1);
    
    Person per2 = per1;
    System.out.println ("per2=per1" + per2);
    
    System.out.println ("nulling per2");
    per2 = null;
    
    System.out.println("per1: " + per1);
    System.out.println("per2: " + per2);
    
    /*int var2 = var1;
    var2 = 15;

    System.out.println (var1);
    */
  }
  
}



