package com.company;

public class Math {

    public static int Sum(int a, int b){
        if(!Validation.IsValid(a,b)){
            return 0;
        }

        return a + b;
    }

    public static int Divide(int a, int b){
        if(!Validation.IsValidForDivide(a,b)){
            return 0;
        }else {
            return a / b;
        }
    }

    //Tim ornekler asagida her biri bir fonksiyonun icinde olacak sekilde
    public void Example1(){
        int a=4;
        int b=6;
        int c=8;

        System.out.println (a+b-c+2*a*b*c-7);
    }

    public void Example2(){
        // matematik islemi 2
        int a=4;
        int b=6;
        int c=8;

        System.out.println (a+b^2-c^3);
    }

    public void Example3(){
        // matematik3
        int a=4;
        int b=6;
        int c=8;

        System.out.println (a-b/c+2*a*c-2/(a+b));
    }

    public void Example4(){
        // mat4
        int a=4;
        int b=6;
        int c=8;

        System.out.println	((a+b)^(1/2)-2*a*b/(b^2-4*a*c));
    }

    public void Example5(){
        int a=4;
        int b=6;
        int c=8;

        System.out.println ((a+b-c)/((a^2+b^3)^(1/2))-2*(a*b+a*c+b*c)/9);
    }

    public void Example6(){
        // Matematik6 islemi
        int a=4;
        int b=6;

        System.out.println ((a^2+b^2)/(2*a*b));
    }

    public void Example7(){
        // Mat7 islem ekranı
        int a=4;
        int b=6;
        int c=8;
        int d=10;
        int e=12;
        int f=13;

        System.out.println (a+(b+c^2)/(d+(e-f)/3*a));
    }

    public void Example8(){
        //Matematik8
        int a=4;
        int b=6;
        int c=8;
        int d=20;

        System.out.println(((a+b)/(c-d)+3*a/(7*b-3*a))/((a+2*b-3*c+4*d)/(a+b+c+d+d)));
    }

    public void Example9(){
        int a=4;
        int b=6;
        int c=8;
        int d=10;


        System.out.println ((a^5+b^3/(c+d))/((a+b^2+c^3+d^4)^(1/4)));
    }

    public void Example10(){
        // matematik9
        int a=4;
        int b=6;
        int c=8;

        System.out.println ((a^2+b^2)^(1/3)+a*b*c/(a+b/((c-b/a^3)^(1/2))));
    }

    public void Example11(){
        // Mat11
        int a=4;
        int b=6;
        int c=8;

        System.out.println (((a-b)^(1/5)/(a+b-c/(a*b))^(1/4))^(1/3)+1/((1+1/(1+1/(a*b*c))^(1/2)))^(1/2));
    }
}
