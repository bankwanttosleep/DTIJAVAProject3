package com.sau.dti.method;


public class MyClassMet01 {
    //method คือ function คือการทำงานหนึ่งที่จะไม่ทำหากไม่เรียกใช้ (call method)
    public static void showHi (){
        System.out.println("Hi...");
    }
    public static void showHello (){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        showHello();
        showHi();
        showHey();
    }
    public static void showHey (){
        System.out.println("Hey..");
    }
}
