package wrapperIntroduction;

/*
* Conversion to and from Strings:-
    *valueOf(): Converts a string representation to the corresponding wrapper class object.
    *toString(): Returns a string representation of the object.

    * Parsing:  parseXxx(): Converts a string to the primitive type Xxx.
    * For example, Integer.parseInt().
    *
    * Value Retrieval:-
    * xxxValue(): Returns the value of the wrapper class object as a primitive type.
    * For example, intValue(), doubleValue().
*/


public class IntegerWrapperClass {
    public static void main(String[] args) {
        Integer num = Integer.valueOf("42"); // Conversion from String
        int primitiveNum = num.intValue();  // Retrieving primitive value

// Autoboxing and Unboxing
        Integer autoboxed = 10;  // Autoboxing
        int unboxed = autoboxed; // Unboxing

// Equals and HashCode
        Integer x = 5;
        Integer y = 5;
        boolean isEqual = x.equals(y);  // true
        int hashCodeX = x.hashCode();
        int hashCodeY = y.hashCode();

    }
}
