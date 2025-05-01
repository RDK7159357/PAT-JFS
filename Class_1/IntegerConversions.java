package Class_1;
public class IntegerConversions{
    public static void main(String[] args) {
        String sage = args[0];

        // 1 way
        int age = Integer.parseInt(sage);
        System.out.println(age);

        // 2 way
        @SuppressWarnings("removal")
        Integer in = new Integer(sage);
        age = in.intValue();
        System.out.println(age);

        // 3 way
        in = Integer.valueOf(sage);
        age = in.intValue();
        System.out.println(age);
    }
}