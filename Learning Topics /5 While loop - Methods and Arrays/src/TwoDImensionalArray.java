public class TwoDImensionalArray {
    public static void main(String[] args) {
        int[][] myArr = new int[2][3];
        myArr[0][0] = 1;
        myArr[0][1] = 2;
        myArr[0][2] = 3;
        myArr[1][0] = 4;
        myArr[1][1] = 5;
        myArr[1][2] = 6;

        int index = 0;
        while (index < myArr.length){
            int j = 0;
            while(j < myArr[index].length){
                System.out.print(myArr[index][j] + " ");
                j++;
            }
            System.out.println();
            index++;
        }

        System.out.println("\n");

        int[][] newArr = {{1,2,3} , {4,5,6}};
//        System.out.println(newArr[0][1]);
        int i = 0;
        while(i < newArr.length){
            int j = 0;
            while (j < newArr[i].length){
                System.out.print(newArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
