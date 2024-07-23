public class SwapTwoNumberWithoutThirdNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swap a is " + a);
        System.out.println("before swap b is " + b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("after swap a  is " + a);

        System.out.println("before swap b is " + b);
    }

}
