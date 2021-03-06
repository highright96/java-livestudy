package com.company;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student = new Student();
        Child child = new Child();

        System.out.println(school instanceof School);
        System.out.println(student instanceof School);
        System.out.println(child instanceof Parent);
        System.out.println(student instanceof Parent);

        System.out.println(student);
        System.out.println(school);

//        Compare compare = new Compare(){
//            @Override
//            public int compareTo(int a, int b) {
//                return a>=b?a:b;
//            }
//        };

        Compare compare = (a, b) -> { return a>=b?a:b; };

        System.out.println(compare.compareTo(2,1));

    }
}

class School {}
interface Parent {}
class Student extends School {}
class Child implements Parent {}

interface Compare {
    int compareTo(int a, int b);
}


