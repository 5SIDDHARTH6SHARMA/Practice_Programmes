// Challenging Problem
// Here’s a problem that will make you think and apply what you’ve learned! 

// Problem Statement:
//  Create a functional interface StringModifier with one method modify(String s).
//  Implement this interface using: 
//   1️. An anonymous inner class
//   2️. A lambda expression
//  Both implementations should modify the string in this way:

// If the string length is even, return the string in uppercase.
// If the string length is odd, return the string in reverse.
@FunctionalInterface
interface StringModifier {
  void modify(String s);
}

public class InnerClass {
  public static void main(String args[]) {
    StringModifier stringModifier = new StringModifier() {
      @Override
      public void modify(String s) {
        if (s.length() % 2 == 0)
          System.out.println(s.toUpperCase());
        else {
          StringBuilder newString = new StringBuilder();
          for (char a : s.toCharArray())
            newString.insert(0, a);
          System.out.println(newString.toString());

        }

      }
    };

    stringModifier.modify("Tomate");
  }
}