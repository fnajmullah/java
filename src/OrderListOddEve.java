import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class OrderListOddEve {


    public static void main(String[] args) {
        List<Integer> num= new LinkedList<Integer>();
        List<Integer> evennum= new LinkedList<Integer>();
        List<Integer> oddnum= new LinkedList<Integer>();
        List<Integer> allnum= new LinkedList<Integer>();

        Random rand= new Random(47);
        for(int i=0;i<7;i++){
            num.add(rand.nextInt(90));
        }

        for(int n:num){
            if(n%2==0){
                evennum.add(n);
            }
            else{
                oddnum.add(n);
            }


        }
        System.out.println(evennum.addAll(oddnum));

        for(int nn:evennum){
            System.out.print(nn+"  ");
        }
//        for(Integer aln:allnum) {
//            System.out.println(aln+"    ");}
//        }

    }
}
