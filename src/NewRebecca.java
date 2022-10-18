public class NewRebecca {
    public static int findMaxVal(int[] arr) {
        int maxvalue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        // Write your code here
        return maxvalue;
    }

        public static int[] sortAsc(int[] arr) {
            int temp = 0; //a variable to store temporary value while swapping

            for (int i = 0; i < arr.length-1; i++) //for loop to hold the current element to be compared
            {
                for (int j = i + 1; j < arr.length; j++) //for loop to iterate over the other elements
                { //to get them compared with the current element
                    if (arr[i] > arr[j]) //if any of the higher index element is smaller than
                    { //the current element
                        temp = arr[i]; //store the current element to temp
                        arr[i] = arr[j]; //store the smaller element to the lower index position
                        arr[j] = temp; //store the current element to greater index position
                    }
                }
            }
            return arr; //return the sorted array
        }
    public static void printMat(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) { //assign values to the arr
            for (int j = 0; j < arr.length; j++) {
                if (i == j) { //if row=column=> fill the matrix with 0
                    arr[i][j] = 0;
                } else if (i > j) { //if row>columns=> fill matrix with -1
                    arr[i][j] = -1;
                } else { //if row<columns=> fill matrix with 1
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) { //print the array
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int []testarr={23, 45 ,785,4,44};
//        System.out.println(findMaxVal(testarr));
//        for(int i:sortAsc(testarr)){
//            System.out.println(i);
//        }

        printMat(2);

//
//
//                int[] arr = {
//                        1,
//                        2,
//                        3,
//                        4,
//                        5
//                }; //initialize
//                System.out.println("The Values before calling the method are:");
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(arr[i] + " "); //printing the array before calling method
//
//                }
//                int[] returnedArr = multiply(arr, 3); //storing the returned array
//                System.out.println();
//                System.out.println("The Values from the returned Array are:");
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(returnedArr[i] + " "); //printing the returned array
//
//                }
            } //end of main()

            static int[] multiply(int[] arr, int num) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr[i] * num;
                }
                return arr; //returning Array
            }
}
