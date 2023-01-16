public class FactorialTest {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
        System.out.println(factorialTailRecursive(1, 5));
    }  

    static int factorial(int value){
        if (value <= 0) {
            return 1;
        }

        int result = 1;
        for (int i = value; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    static int factorialRecursive(int value){
        if(value <= 0){
            return 1;
        }else{
            // 5 * factorial(4)
            // 5 * 4 * factorial(3)
            // 5 * 4 * 3 * factorial(2)
            // 5 * 4 * 3 * 2 * factorial(1)
            // 5 * 4 * 3 * 2 * 1 * factorial(0)
            // 5 * 4 * 3 * 2 * 1
            // factorial(5) * factorial(4) * factorial(3) * factorial(2) * factorial(1) * factorial(0)
            return value * factorialRecursive(value - 1);
        }
    }

    static int factorialTailRecursive(int total, int value){
        if(value <= 0){
            return total;
        }else{
            // factorial(1, 5)
            // factorial(5, 4)
            // factorial(20, 3)
            // factorial(60, 2)
            // factorial(120, 1)
            // factorial(120, 0)
            return factorialTailRecursive(total * value, value - 1);
        }
    }

    // @Test
    // void testFactorial(){
    //     Assertions.assertEquals(1, factorial(0));
    //     Assertions.assertEquals(1, factorial(1));
    //     Assertions.assertEquals(2, factorial(2));
    //     Assertions.assertEquals(6, factorial(3));
    //     Assertions.assertEquals(24, factorial(4));
    //     Assertions.assertEquals(120, factorial(5));
    // }  
}