public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5]; //5 memory location allocate kiya hai
//        myArr[0] = 12;
//        myArr[1] = 13;
//        myArr[2] = 16;
//        myArr[3] = 19;
//        myArr[4] = 52;
        int[] myArr = {12,13,14,2,53};
//        int index = 2;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        // Array Traversal
        int index = 0;
        while (index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        // String ka array bana na ho to
        String[] strArr = new String[2];
        strArr[0] = "My String";
        System.out.println(strArr[0]);

        String[] newArr = {"first" , "second", "Third" , "Fourth" , "Fiveth"};
        System.out.println(newArr[0] + " And Length of the whole array is " + newArr.length);
    }
}
