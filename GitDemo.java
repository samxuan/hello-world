/*****
 branch2
 * Edit this line to have your name.

 * yongzai xuan
 main
 ******/
public class GitDemo {
    
    private double previousNumber;
 branch2
    
    public GitDemo() {
        previousNumber = 1;

    private double reverseNum;
    
    public GitDemo() {
        previousNumber = 1;
        reverseNum = 0;
 main
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
 branch2
        System.out.print("Add num to previousNumber");
        return 0;

        double sum =0;
        System.out.print("Add num to previousNumber");
        previousNumber += num;
        sum += previousNumber;
        return sum;
 main
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
 branch2
    public double findFactorial(int num) {        
        double factorialNumber = 1;
        
        for(int i = 1; i <= num; ++i){
            factorialNumber = factorialNumber * i;

    public double findFactorial(int num) {
        double factorialNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            factorialNumber = factorialNumber * 10 + temp;
            num /= 10;
 main
        }
        
        return factorialNumber;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
 branch2
        double newNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            newNumber = newNumber * 10 + temp;
            num /= 10;

        double newNumber = 1;
        reverseNum = newNumber;
        
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
 main
        }
        
        return newNumber;
    }
    
}
