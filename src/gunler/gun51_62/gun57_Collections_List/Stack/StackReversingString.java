package gunler.gun51_62.gun57_Collections_List.Stack;

import java.util.Stack;


public class StackReversingString {
    public static void main(String[] args) {
        String mesaj = "Merhaba Java.";
        String reversedMesaj = "";

        for (int i = mesaj.length() - 1; i >= 0; i--) {
            reversedMesaj += mesaj.charAt(i);
        }
        System.out.println("Mesaj    : " + mesaj);
        System.out.println("Mesaj(R) : " + reversedMesaj);

        Stack<String> revStack = new Stack<>();

        for (int i = 0; i < mesaj.length(); i++) {
            revStack.push(mesaj.charAt(i) + ""); //adding(push) element to Stack
        }
        System.out.println(revStack);
        String tersStackStr = "";

        //reverse the string and convert in to uppercase form
        while (!revStack.isEmpty()) {
            // System.out.print(revStack.pop());
            tersStackStr += revStack.pop().toUpperCase();
        }
        System.out.println("tersStackStr = " + tersStackStr);

        //Char by char access- getting element of Stack .pop() method
       /* System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());*/

    }
}
