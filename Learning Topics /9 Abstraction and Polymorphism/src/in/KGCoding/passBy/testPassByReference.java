package in.KGCoding.passBy;

public class testPassByReference {

    public static void main(String[] args) {
        Point first = new Point(4 , 8);
        System.out.println("First: " + first);
        move(first);
        System.out.println("First: " + first);
    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.y = y;
            this.x = x;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
