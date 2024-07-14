public class AboutThrow {
    public static void main(String[] args) {
        int i = 20, j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("denominator greater than numerator");  // we can call the catch block with a customized message  with throw keyword !!!
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
            j = 18 / 1;
            System.out.println("Thats the result of a default operation throw exception handling ");
        }

        catch (Exception e) {
            System.out.println("Something went wrong.." + e);
        }

        System.out.println(i + "," + j);
    }

}
