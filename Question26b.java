public class Question26b {
    static int multiple(int a, int b){
        int c = a*b;
        return c;
    }

    static long multiple(long a, long b){
        long c = a*b;
        return c;
    }

    static float multiple(float a, float b){
        float c = a*b;
        return c;
    }
    public static void main(String[] args) {
        int a = 7, b=5;
        int x= multiple(a, b);

        long c = 9, d=7;
        long y = multiple(c,d);

        float e = 11.7f, f=44.7f;
        float z= multiple(e, f);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
