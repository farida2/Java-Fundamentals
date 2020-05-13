package labs_examples.exception_handling.labs;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        try{
            addNewMember();
        }catch(MemberException e){
            System.out.println(e.toString());
        }

    }

    public static void addNewMember() throws MemberException{
        Scanner input = new Scanner(System.in);
      System.out.println("Are you new Member ? (y/n)");
      String response = input.next();
        if (response.equalsIgnoreCase("y")) {
            // manually throw new custom exception
            throw new MemberException();
        }
        System.out.println("welcome back");
    }
}

