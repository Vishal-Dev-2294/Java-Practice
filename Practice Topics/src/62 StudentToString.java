class StudentToString {
    String name;
    int age;
    int rollNo;
    int houseNo;

    public StudentToString(String name, int age, int rollNo, int houseNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentToString{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", rollNo=").append(rollNo);
        sb.append(", houseNo=").append(houseNo);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        StudentToString student = new StudentToString("Vishal" , 21 , 21 , 51);
        System.out.println(student);
    }
}
