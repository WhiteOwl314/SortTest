package interfaceex;

public class CalcTest {

    public static void main(String[] args){

        CompleteCalc calc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1,n2));
        System.out.println(calc.subtract(n1,n2));
        System.out.println(calc.times(n1,n2));
        System.out.println(calc.divided(n1,n2));

        calc.description();

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
    }
}