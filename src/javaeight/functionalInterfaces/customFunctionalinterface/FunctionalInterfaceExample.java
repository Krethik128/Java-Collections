package javaeight.functionalInterfaces.customFunctionalinterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        // Lambda expression implementing the calculate method
        // Here it performs multiplication of two Integers
        Operation<Integer> multiply = (a, b) -> a * b;

        // Using the lambda
        int result = multiply.calculate(5, 4);
        System.out.println("Multiplication result: " + result); // Output: 20
    }
}

