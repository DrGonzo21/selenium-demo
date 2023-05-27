package STACK;
import java.util.*;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {


        //Stack is a Last in / First out (LIFO) data structure

        Stack<String> books = new Stack<>();

        books.push("Gone with the wind");
        books.push("The Silent Man");
        books.push("The Light we carry");
        books.push("The great Gatsby");
        books.push("The Lords of the Ring");
        books.push("The Crime and Punishment");

        System.out.println(books);

        System.out.println("The book at the top of the stack is: " + books.peek());
        System.out.println("The book at the top of the stack is removed: " + books.pop());
        System.out.println("The stack after removal: " + books);

        System.out.println("The position of The Silent Man in the stack of books is: " + books.search("The Silent Man"));
        // returns the 1-based position where an object is on this stack
        System.out.println();


        // Extract all the books in the order of LIFO order
        System.out.println("Extract all the books in LIFO order: ");
        while (!books.isEmpty()) {
            System.out.println(books.pop());


//            String input = "Hello, World!";
//            String reversed = reverse(input);
//            System.out.println("Original string: " + input);
//            System.out.println("Reversed string: " + reversed);


//        public static String reverse(String str) {
//
//            }
//            char[] charArray = str.toCharArray();
//
//            Stack<Character> characterStack = new Stack<>();
//
//            for (char c : charArray) {
//                characterStack.push(c);
//            }
//
//            StringBuilder sb = new StringBuilder();
//
//            while (!characterStack.isEmpty()) {
//                sb.append(characterStack.pop());
//            }
//
//            return sb.toString();
//        }
//    }


            // Given this string of parenthese {{[[()]]}} you can use stack because you could pop items in a specific order

        }
    }
}

