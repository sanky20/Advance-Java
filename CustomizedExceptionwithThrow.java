class MeraException extends Exception {
    public MeraException(String str) {
        super(str);
    }
}

public class CustomizedExceptionwithThrow {
    public static void main(String[] args) {
        int i = 20, j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new MeraException("denominator greater than numerator");

            }

        } catch (MeraException e) {
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
