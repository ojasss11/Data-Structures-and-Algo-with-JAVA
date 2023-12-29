public class typeconversion_casting_promotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println((int) (b - a));
        System.out.println((byte) (a + b + c));
        byte by = 5;
        by = (byte) (by * 2);
        System.out.println(by);
    }
}
