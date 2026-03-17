class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenateStrings("Vishal"));
        System.out.println(concatenateStrings("Vishal" , "roshan"));
        System.out.println(concatenateStrings("Vishal" , "roshan" , "Bhai"));
    }

    public static String concatenateStrings (String... str1) {
        StringBuilder sb = new StringBuilder();
        for (String str: str1){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
