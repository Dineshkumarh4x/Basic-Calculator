import java.util.*;
class CalculatorApp{
    public void add(double n1,double n2){
        double c=n1+n2;
        System.out.println(c);
    }
    public void subtraction(double n1,double n2){
        double c=n1-n2;
        System.out.println(c);
    }
    public void multiplication(double n1,double n2){
        double c=n1*n2;
        System.out.println(c);
    }
    public void division(double n1,double n2){
        
        double c=n1/n2;
        System.out.println(c);
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      CalculatorApp c1=new CalculatorApp();
      System.out.println("***************************************************************************************");
      System.out.println("**                              C A L C U L A T O R                                  **");
      System.out.println("***************************************************************************************");
      int t=1;
      while(t>0){
      System.out.println("Input:");
      String op=sc.nextLine();
      op= op.replaceAll("\\s","");
      java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(-?\\d*\\.?\\d+)([+\\-*/])(-?\\d*\\.?\\d+)");
       java.util.regex.Matcher matcher = pattern.matcher(op);
   if (matcher.matches()) {
    double n1 = Double.parseDouble(matcher.group(1));
    char s = matcher.group(2).charAt(0);
    double n2 = Double.parseDouble(matcher.group(3));
    System.out.println("Output:");
    switch (s) {
        case '+':
            c1.add(n1, n2);
            break;
        case '*':
            c1.multiplication(n1, n2);
            break;
        case '/':
            if (n2 == 0) {
                System.out.print("Invalid operation");
            } else {
                c1.division(n1, n2);
            }
            break;
        case '-':
            c1.subtraction(n1, n2);
            break;
        default:
            System.out.println("Invalid operator");
    }
} else {
    System.out.println("Invalid expression format");

}
      System.out.println("Press 1 to continue OR 0 to Skip...");
      int n=sc.nextInt();
      t=n;
      sc.nextLine();
      
      }
      sc.close();
    }

}