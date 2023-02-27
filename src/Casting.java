public class Casting {
    public static void main(String[] args) {
        double monthlyDogs = 30/12;

        int estimatedMonthyDogs = (int) monthlyDogs;

        System.out.println(estimatedMonthyDogs);

        int a=30;
        int b=12;

        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        double d = a/b;
        System.out.println(d);
    }
}
