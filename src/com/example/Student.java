package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *Student
 Make a list of 60 students


 sout the list.

 */

public class Student {
    String firstName;
    String lastName;
    int id;
    int grade;

    List<String> students = new ArrayList(60);
    Random rando = new Random();
    public String alphabet = "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";

    public Student(String firstName, String lastName, int id, int grade) {

        firstName = getRandomName(rando, alphabet, 7);
        lastName = getRandomName(rando, alphabet, 5);
        id = getRandomNum();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 1;
    }

    public int getRandomNum() {
        int randID = rando.nextInt(1000);

        return randID;
    }

    public static String getRandomName (Random rando, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rando.nextInt(characters.length()));
        }
        return new String(text);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                ", students=" + students +
                ", rando=" + rando +
                ", alphabet='" + alphabet + '\'' +
                '}';
    }
}
