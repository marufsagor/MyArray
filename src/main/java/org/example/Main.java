package org.example;

public class Main {
    public static void main(String[] args)

    {
        // Array_Type [] Array_Name = new Array_Type[]
        int [] marks = new int [5];

        marks [0]=70;
        marks [1]=80;
        marks [2]=90;
        marks [3]=95;
     System.out.println("Show this:"+marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[0]);

     //2nd way: ArrayType ArrayName={1,2,3}

        int [] ResultNumber = {33,40,45,60};
        System.out.println("NewResult:"+ResultNumber[1]);
        System.out.println("Marks Length is: "+marks.length);
        System.out.println("ResultNumber Length is:"+ResultNumber.length);


    }
}