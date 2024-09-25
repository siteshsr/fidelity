import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int marks;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks");
    String grade="";
    marks=sc.nextInt();
    if(marks>=90){
        grade="A+";
    }
    if(marks>=80){
        grade="A";
    }
    if(marks>=70){
        grade="B";
    }
    if(marks>=60){
        grade="C";
    }
    else if(marks>=50){
        grade="D";
    }
    if (marks>=40){
        grade="E";
    }
    if (marks<40){
        grade="F";
    }
    switch(grade){
        case "A+":
            System.out.println("very good");
        case "B":
            System.out.println("good");
        case "C":
            System.out.println("average");
        case "D":
            System.out.println("need improvement");
    }
        }
    }