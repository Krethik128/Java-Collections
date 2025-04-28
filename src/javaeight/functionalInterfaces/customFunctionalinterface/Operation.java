package javaeight.functionalInterfaces.customFunctionalinterface;

// Defining a custom functional interface
@FunctionalInterface //Using Function interface Annotation this allows only one abstract method in the interface
interface Operation<T extends Number> { //Using Generics where a datatype extends subclasses of Number
    T calculate(T a, T b); // Single abstract method
}
