import java.util.ArrayList;
import java.util.List;

public class Relax {


    public static void main(String[] args) {
//        int[] arr={3,2,1,3};
//        findTotalPower(arr);

//        matrixRequested();
//        printPascalTri(10);
        ArrayList<Integer> arrList= new ArrayList<>();        arrList.add(5);        arrList.add(0);        arrList.add(20);        arrList.add(4);        arrList.add(9);
        zerosToStart(arrList);


    }
    public static void zerosToStart(ArrayList<Integer> arrList) {

        for(int i=1;i<arrList.size();i++){
            if(arrList.indexOf(i)==0){
                arrList.set(i,arrList.get(i+1));
                arrList.set(i-1,arrList.get(i));

            }

        }
        for(int i=0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }
    }

    public static void printPascalTri(int size){
        int[][] pascalTr = new int[size][size];
        int row, col;
        //assign zero to every array element
        for (row = 0; row < size; row++)
            for (col = 0; col < size; col++) pascalTr[row][col] = 0;
        //first and second rows are set to 1s
        pascalTr[0][0] = 1;
        pascalTr[1][0] = 1;
        pascalTr[1][1] = 1;

        for (row = 2; row < size; row++) {
            pascalTr[row][0] = 1;
            for (col = 1; col <= row; col++) {
                pascalTr[row][col] = pascalTr[row - 1][col - 1] + pascalTr[row - 1][col];
            }
        }

        //display the Pascal Triangle
        for (row = 0; row < size; row++) {
            for (col = 0; col <= row; col++) {
                System.out.print(pascalTr[row][col] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void matrixRequested(){
        int n=3;
        int [][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    arr[i][j]=0;
                }
                else if(i>j){
                    arr[i][j]=-1;
                }
                else{
                    arr[i][j]=1;
                }
            }
        }

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            }
        }

    public static int findTotalPower(List<Integer> power) {

        return -1;
    }

}
