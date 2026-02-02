public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Vishal" , "omu" , "biku"
        };
//        pritnArray(array);
        pritnArrayForEach(array);
    }

    public static void pritnArrayForEach(String[] array){
        for(String name: array){
            System.out.println(name);
        }
        }

    public static void pritnArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
