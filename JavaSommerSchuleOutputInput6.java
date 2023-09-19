package JavaSommerSchuleStepik;

import java.util.Scanner;
public class JavaSommerSchuleOutputInput6 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
        System.out.println(a + " * " + b + " * " + c + " = " + (a*b*c));
        System.out.println("(" + a + " + " + b + ")" +  " * " + c + " = " + ((a+b)*c));
    }
}


/*
Вводится три числа a, b, c, необходимо вывести три строки:
Если a=1, b = 2, c = 3
1 + 2 + 3 = 6
1 * 2 * 3 = 6
(1 + 2) * 3 = 9
Sample Input:

1 2 3
Sample Output:

1 + 2 + 3 = 6
1 * 2 * 3 = 6
(1 + 2) * 3 = 9
*/


/*
Three numbers a, b, c are entered and three lines must be output:
If a=1, b = 2, c = 3
1 + 2 + 3 = 6
1 * 2 * 3 = 6
(1 + 2) * 3 = 9
Sample Input:

1 2 3
Sample Output:

1 + 2 + 3 = 6
1 * 2 * 3 = 6
(1 + 2) * 3 = 9
*/