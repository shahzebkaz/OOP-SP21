package com.company;

public class Main {

    public static void main(String[] args) {
        int [] r_arr1 = {78, 54, 95, 81, 79};
        Student s1 = new Student("Shahzeb", r_arr1);
        System.out.println("Average of Student 1 is: "+s1.Average());

        int [] r_arr2 = {75, 91, 98, 99, 80};
        Student s2 = new Student("Ali", r_arr2);
        System.out.println("Average of the Student 2 is: "+s2.Average());

        if (s1.Average()>s2.Average()){
            System.out.println("Student 1 has higher Average i.e "+s1.Average());
        }
        else
            System.out.println("Student 2 has higher Average i.e "+s2.Average());

        Student s3 = new Student(s1.getName(),s2.getResult());
        System.out.println("Average of Student 3 is: "+s3.Average());

    }
}
