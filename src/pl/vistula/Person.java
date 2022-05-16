package pl.vistula;

import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnameShah56255 , firstNameBhavya56255, street56255 , city56255;
    int zipCode56255;

    void InitiShahze(){
        System.out.println("Please enter your Name: ");
        firstNameBhavya56255 = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnameShah56255 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        street56255 = sr.nextLine();
        System.out.println("Please enter your City: ");
        city56255 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCode56255 = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstNameBhavya56255);
        System.out.println("Surname: "+ surnameShah56255);
        System.out.println("Street Name: "+ street56255);
        System.out.println("City: "+ city56255);
        System.out.println("Zip Code: "+ zipCode56255);
    }

}


class Staff extends pl.vistula.Person {
    String education , Position;
    void InitiShahze1(){
        InitiShahze();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }

}

class main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.InitiShahze1();
        employee.Print1();
    }
}

