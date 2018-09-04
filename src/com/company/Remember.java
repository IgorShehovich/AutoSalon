package com.company;

import java.io.Serializable;

public class Remember {

}

class Human {
    String name;
    int age;
static private Human instance;
    private Human(String name, int age) {
       this();
        this.name = name;
        this.age = age;
       // new Human("wewe",23);error
    }

    private Human() {

        System.out.println("Work constructotr  default( po zamov)");
    }

    static Human getInstance(String name, int age){
        if(instance==null){
         instance=new Human(name,age);
        }
        return instance;
    }

    public static void main(String[] args) {

        Human human = new Human("Petro",40);
        System.out.println("name " + human.name + " age " + human.age);
    }
}

class Student {
    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.proba();

        Human  p1=Human.getInstance("Petrov",25);
        Human p2=Human.getInstance("Sidorov",50);

        System.out.println("p1" + p1.name + " " + p1.age);
        System.out.println("p1" + p2.name + " " + p2.age);
        qw aaa=new qw() {
            @Override
            public void qwerty() {
                super.qwerty();
            }
        };
        One q=()->{
            System.out.println("ssdsd");
        };
    }

}

class Fruit {
    int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }
     void met2(){
         System.out.println("Працює метод met2()");
     }

//    Fruit(){
//      System.out.println("work fruit constructor");
//  }
}
class Orange extends  Fruit{

    Orange(){
super(55);
        this.weight=90;
    }
void proba(){
        met2();
}
//    @Override
//    void met2() {
//        super.met2();
//        System.out.println(" work met2 classa Orange");
//    }
}

interface  One extends   Two,Serializable{
   void qwerty();
   default  int metod(){
     return 5;
   }
}

abstract class qw implements One {
    @Override
    public void qwerty() {

    }
}

class wwww extends  qw{

    @Override
    public void qwerty() {

    }
}
