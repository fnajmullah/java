import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Rebbeca {

    static String string;

    public static void main(String[] args) {
//        System.out.println(checkSum(23,45));
//        System.out.println(letterToGPA("A+"));
//        System.out.println(sumOfDig(5454));
//        System.out.println(test("kdj"));



    }
    public static String test(String x) {
        int xlenght=x.length();
//        System.out.println(xlenght);
        if (xlenght%2==0){
        return x.toUpperCase();
        }
        else
        {
       return x.toLowerCase();
        }
    }



    public static int sumOfDig(int var) {
       int suminteger=0;
       while(var>0){
           suminteger=suminteger+var%10;
           var/=10;
       }
        return suminteger; // return the resultant sum
    }

    public static int checkSum(int one, int two){
        int check=one+two;
        if(check<100){
            check=0;
        }
        else if(check>100){
            check=1;
        }
        else if (check==100){
            check=2;
        }
        else{
            System.out.println("Something went wrong...");
        }
        return check;
    }
    static void gojava22(){


//        class CharArr {
//            public static void main(String args[]) {
//                char[] chArray1 = {
//                        'a',
//                        'b',
//                        'c'
//                }; //initialization of first char array
//                char[] chArray2 = new char[5]; //instantiation of second char array
//                int index = 0;
//                for (char i = 'v'; i <= 'z'; i++) { //Assiging char values to second array using loop
//
//                    chArray2[index] = i;
//                    index++;
//                }
//                //printing out the stored values in the arrays
//                System.out.print("The Values stored in ChArray1 are: ");
//
//                for (int i = 0; i < chArray1.length; i++) {
//
//                    System.out.print(chArray1[i] + " ");
//                }
//
//                System.out.println();
//                System.out.print("The Values stored in ChArray2 are: ");
//
//                for (int i = 0; i < chArray2.length; i++) {
//
//                    System.out.print(chArray2[i] + " ");
//                }
//            }
//        }
//            for(int i=0;i<5;i++){
//                for(int j=1;j<=i;j++){
//                    System.out.print("#");
//                }
//                String str="#";
//                System.out.println(str);
//            }
//
//            String fib = "";
//            int n = 6;
//            int first = 0, second = 1, fibonacci = 0;
//            System.out.println("Fibonacci Series upto " + n + " Terms ");
//
//            for (int c = 0; c < n; c++) {
//                if (c <= 1) {
//                    fibonacci = c;
//                    fib += String.valueOf(fibonacci) + " ";
//                } else {
//                    fibonacci = first + second;
//                    first = second;
//                    second = fibonacci;
//                    fib += String.valueOf(fibonacci) + " ";
//                }
//                System.out.println(fibonacci + " ");
//            }

            //            int x=5;
//            for(int i=1;i<=10;i++){
//                System.out.print(" "+x*i);
//            }


            //            int input = 5;
//
//            System.out.println("How many missiles will you fire?");
//            System.out.println("I will fire: " + input + " missiles");
//
//            for (int i = 0; i < input; i++) { // outer for loop
//                for (int j = 3; j > 0; j--) { // inner for loop
//                    System.out.println(j + " ");
//                }
//                System.out.println("Missile " + (i + 1) + " has launched.");
//            }
//
//            System.out.println("All missiles have been launched.");
//            gojava22();
//            String answer = "";
//            int x=4;
            //            int x = 4;
//            int temp;
//            switch (x) {
//
//                case 1:
//                case 2:
//                case 3:
//                    temp = 0;
//                    break;
//                case 4:
//                    temp = 4;
//                    break;
//                default:
//                    temp = 5;
//                    break;
//            }
//            System.out.println("Value of temp: " + temp);



//            String greet = "HeLlo WoRld";
//
//            //Returns new string in which all characters are converted to upper case
//            System.out.println(greet.toUpperCase());
//
//            //Returns new string in which all characters are converted to lower case
//            System.out.println(greet.toLowerCase());
//            System.out.println("greet length: "+greet.length());
//String text="     zAAOKaEWad";
//            String answer="";
//            answer=text.trim().substring(0,6).toUpperCase();


//            String choice = "CoffeeOrTea";
//            //First: Only one argument
//            System.out.println(choice.substring(8));
//
//            //Second: Two arguments
//            System.out.println(choice.substring(0, 6));


//            String greet="Hello World, My name is fridoon , How are you?";
//            String[] greetings=greet.split(",");
//            for (String x:greetings){
//                System.out.println(x);
//            }


//            String text = "       Cut string";
//            // The trim function is meant to eliminate leading & trailing spaces
//            System.out.println(text.trim());

//            // Without assigning the text variable to the trimmed string
//            System.out.println(text);
//
//            // Assigning trimmed string to the variable
//            text = text.trim();
//            System.out.println(text);

//            answer=!(!x^x&&y);
//            Backspace	\b
//            Tab	\t
//            NULL character	\0
//            Newline	\n
//            Carriage Control	\r
//            Double Quote	\ "
//            Single Quote	\ ’
//            Backslash	\ \
            //
//            answer=Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));

//            System.out.println("Absolute value of -2: " + Math.abs(-2));
//            System.out.println("Absolute value of 2: " + Math.abs(2));

//            System.out.println("Maximum between 2.04 and 2.05: " + Math.max(2.04, 2.05));
//            System.out.println("Minimum between 2 and 23: " + Math.min(2, 23));

//            System.out.println(string);
//            operatorExercise();

//            bodmas();

//            System.out.println("2 raised to the power 3 is " + Math.pow(2, 3));
//            System.out.println("Exponent squared is " + Math.exp(2));
//            System.out.println("The square root of 16 is " + Math.sqrt(16));
//            System.out.println("The cube root of 27 is " + Math.cbrt(27));

//            System.out.println("log of 2 is " + Math.log(2));
//            System.out.println("log to the base 10 of 100 is " + Math.log10(100));

//            System.out.println("tan(45) =" + Math.tan(Math.toRadians(45)));
//            System.out.println("sin(45) =" + Math.sin(Math.toRadians(45)));
//            System.out.println("cos(45) =" + Math.cos(Math.toRadians(45)));

            // The method Math.toRadians() converts a degree number to a radian number and Math.toDegrees() does vice versa.



        }
    static void bodmas(){
        int x = 5;
        int y = 10;
        int z = 7;
        int w = 6;
        int answer;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);

        System.out.println("Calculating Expressions with Multiple Operators");

        System.out.println("(x-z) + y*y = " + ((x - z) + y * y));
        answer = (w / y + (x * z));

        System.out.println("w/y + (x*z) = " + answer);
    }
    static int findMissing(List<Integer> input) {
        int actualSum = 0;
        for (Integer x : input) {
            actualSum += x;
        }
        int n = input.size();
        int sumOfN = (n * (n + 1)) / 2;
        return sumOfN - actualSum;
    }
    public static void exercise1(){
        Integer[][] vLst = {{0}, {3, 7, 1, 2, 0, 4, 5}, {9, 6, 4, 2, 3, 5, 7, 0, 1}};
        for (int i = 0; i < vLst.length; i++) {
            List<Integer> v = Arrays.asList(vLst[i]);
            System.out.println((i + 1) + ". Original: " + v);
            int missingNumber = findMissing(v);
            System.out.println("   The missing number is: " + missingNumber);
        }
    }
    public static void operatorExercise(){
        int answer;
        System.out.println("ADDITION");
        int add = 20;
        System.out.println("Initial value: " + add);
        answer = add + 2;
        System.out.println("add + 2 = " + answer);
        answer = add;
        System.out.println("add = " + answer);
        System.out.println();
        System.out.println("SUBTRACTION");
        int sub = 15;
        System.out.println("Initial value: " + sub);
        System.out.println("sub - 4 = " + (sub - 4));
        System.out.println("sub = " + sub);
        System.out.println();
        System.out.println("MULTIPLICATION");
        int mult = 25;
        System.out.println("Initial value: " + mult);
        answer = mult * 3;
        System.out.println("mult * 3 = " + answer);
        answer = mult;
        System.out.println("mult = " + mult);
        System.out.println();
        System.out.println("DIVISION (INT)");
        int div_int = 15;
        System.out.println("Initial value: " + div_int);
        System.out.println("div_int / 2 = " + (div_int / 2));
        System.out.println("div_int = " + div_int);
        System.out.println();
        System.out.println("MODULO (REMINDER)");
        int rem = 5;
        System.out.println("Initial value: " + rem);
        answer = rem % 2;
        System.out.println("rem % 2 = " + answer);
        answer = rem;
        System.out.println("rem = " + answer);
        System.out.println();
        System.out.println("PREINCREMENT BY ONE");
        int pre_inc = 5;
        System.out.println("Initial value: " + pre_inc);
        System.out.println("++pre_inc   = " + (++pre_inc));
        System.out.println("pre_inc = " + pre_inc);
        System.out.println();
        System.out.println("PREDECREMENT BY ONE");
        int pre_dec = 5;
        System.out.println("Initial value: " + pre_dec);
        answer = --pre_dec;
        System.out.println("--pre_dec   = " + answer);
        answer = pre_dec;
        System.out.println("pre_dec = " + answer);
        System.out.println();
        System.out.println("POST INCREMENT BY ONE");
        int post_inc = 5;
        System.out.println("Initial value: " + post_inc);
        System.out.println("post_inc++   = " + (post_inc++));
        System.out.println("post_inc = " + post_inc);
        System.out.println();
        System.out.println("POSTDECREMENT BY ONE");
        int post_dec = 5;
        System.out.println("Initial value: " + post_dec);
        answer = post_dec--;
        System.out.println("post_dec--   = " + answer);
        answer = post_dec;
        System.out.println("post_dec = " + answer);
        System.out.println();


        //            exercise1();
//            System.out.print("The movie quote is: My name is Bond. James Bond!");
//
//            char c='a';
//            System.out.println(" 'a' "+c);
//            char int_to$text=65;
//            System.out.println("=65int to text"+int_to$text);
//            char intonly='2';
//            System.out.println("'2'"+intonly);
    }
}