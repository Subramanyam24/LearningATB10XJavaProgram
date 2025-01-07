import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First {
    private static int fibonacci(int num) {
        if(num <=1) {
            return num;
        }
        else
            return fibonacci(num-2)+fibonacci(num-1);
    }


    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        int[] a = new int[9];
        System.out.println("Fibonacci series for "+a.length+" is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(fibonacci(i)+ ", ");
            a[i] = n1;
            sum += n1;
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        System.out.println();
        System.out.println("Fibonaci series for " + a.length + " numbers :" + Arrays.toString(a));
        System.out.println("Sum of the first " + a.length + " fibonacci series numbers is :" + sum);

        String pal = "Maddam";
        int n = (pal.length() / 2);
        String flag = " is a Palindrome Word";
        for (int i = 0; i <= n; i++) {
            String x = String.valueOf(pal.charAt(i));
            String y = String.valueOf(pal.charAt(pal.length() - (i + 1)));
            if (!x.equalsIgnoreCase(y)) {
                flag = " Not a palindromeword ";
                break;
            }
        }
        System.out.println(pal + flag);
        // Reversing a string Method1
        String actWord = "tyrbvbvpp";
        String revWord = "";
        StringBuffer sb = new StringBuffer(actWord);
        StringBuffer sb1 = new StringBuffer();
        String revWord1 = sb.reverse().toString();
        // method2
        for (int i = actWord.length() - 1; i >= 0; i--) {
            char c = actWord.charAt(i);
            revWord += c;
            sb1.append(c);

        }
        if (actWord.matches(".*[aeiouAEIOU].*"))
            System.out.println("Word Contains Vowels letter");
        else
            System.out.println("Word doesn't contain Vowel letter ");
        ;
        System.out.println(revWord1);
        System.out.println(revWord);
        System.out.println(sb1);

        int num1 = 88;
        int num2 = 23;

        num2 = num2 + num1;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("number1 : " + num1);
        System.out.println("number2 : " + num2);
        int prime = 0;
        for (int i = 2; i <= (num1 / 2); i++) {
            if ((num1 % i) == 0) {
                prime = 1;
                break;
            }
        }
        if (prime == 0) {
            System.out.println("number is prime");
        } else
            System.out.println("number is not a prime");

        int []b = {1,2,7,5,6,5,8,7,9,11};

        List<Integer> l1 = Arrays.stream(b).boxed().collect(Collectors.toList());
        boolean x = l1.parallelStream().anyMatch(s-> s % 2 ==0);
        List<Integer> l2 = l1.stream().filter(s->s%2!=0).collect(Collectors.toList());
        int []c =l2.stream().mapToInt(s->s).toArray();
        System.out.println(x);
        l2.forEach(s->System.out.print(s));
        System.out.println();
        System.out.println(Arrays.toString(c));

    }
}