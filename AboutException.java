public class AboutException {

    public static void main(String[] args) {
        
        int i=2,j=0;
      
        int nums[]= new int[5];
        String str= null;
        try
        {
            j= 18/i;
            System.out.println(nums[4]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index out of bound...");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.."+e);
        }

        System.out.println(i+","+j);

    }
    
}
