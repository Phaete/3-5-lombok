package com.phaete;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student johnCena = new Student(
                "1",
                "John",
                "1 Main St",
                new BigDecimal("2.4")
        );
        Student tonyStark = new Student(
                "2",
                "Tony",
                "2 Main St",
                new BigDecimal("1.0")
        );
        Student peterParker = new Student(
                "3",
                "Peter",
                "3 Main St",
                new BigDecimal("1.7")
        );
        Student bruceBanner = new Student(
                "4",
                "Bruce",
                "4 Main St",
                new BigDecimal("1.3")
        );
        Student sansaStark = new Student(
                "5",
                "Sansa",
                "5 Main St",
                new BigDecimal("2.9")
        );
        Student theMountain = new Student(
                "6",
                "The Mountain",
                "6 Main St",
                new BigDecimal("3.0")
        );

        Teacher gregoryHouse = new Teacher(
                "1",
                "Gregory",
                "Biology"
        );
        Teacher johnSnow = new Teacher(
                "2",
                "John",
                "Swordmanship"
        );

        Course bio = Course.builder()
                .id("1")
                .name("Biology")
                .teacher(gregoryHouse)
                .students(new ArrayList<>())
                .build();
        bio.addStudent(johnCena);
        bio.addStudent(tonyStark);
        bio.addStudent(peterParker);
        bio.addStudent(bruceBanner);

        Course sword = Course.builder()
                .id("2")
                .name("Swordmanship")
                .teacher(johnSnow)
                .students(new ArrayList<>())
                .build();
        sword.addStudent(sansaStark);
        sword.addStudent(theMountain);


        // Check if the generated lombok methods work correctly
        // Students
        System.out.println("____________________________");
        System.out.println(johnCena);
        System.out.println(johnCena.getId());
        System.out.println(johnCena.getName());
        System.out.println(johnCena.getAddress());
        System.out.println(johnCena.getGrade());
        System.out.println("____________________________");
        System.out.println(tonyStark);
        System.out.println(tonyStark.getId());
        System.out.println(tonyStark.getName());
        System.out.println(tonyStark.getAddress());
        System.out.println(tonyStark.getGrade());
        System.out.println("____________________________");
        System.out.println(peterParker);
        System.out.println(peterParker.getId());
        System.out.println(peterParker.getName());
        System.out.println(peterParker.getAddress());
        System.out.println(peterParker.getGrade());
        System.out.println("____________________________");
        System.out.println(bruceBanner);
        System.out.println(bruceBanner.getId());
        System.out.println(bruceBanner.getName());
        System.out.println(bruceBanner.getAddress());
        System.out.println("____________________________");
        System.out.println(sansaStark);
        System.out.println(sansaStark.getId());
        System.out.println(sansaStark.getName());
        System.out.println(sansaStark.getAddress());
        System.out.println(sansaStark.getGrade());
        System.out.println("____________________________");
        System.out.println(theMountain);
        System.out.println(theMountain.getId());
        System.out.println(theMountain.getName());
        System.out.println(theMountain.getAddress());
        System.out.println(theMountain.getGrade());
        System.out.println("____________________________");
        // Setter
        johnCena.setId("10");
        System.out.println(johnCena.getId());
        System.out.println("____________________________");

        // Equals
        System.out.println(johnCena.equals(tonyStark));
        System.out.println("____________________________");

        // Teachers
        System.out.println(gregoryHouse);
        System.out.println(johnSnow);
        System.out.println("____________________________");
        // Course
        System.out.println(bio);
        System.out.println(bio.getId());
        System.out.println(bio.getName());
        System.out.println(bio.getTeacher());
        System.out.println(bio.getStudents());
        System.out.println("____________________________");
        System.out.println(sword);
        System.out.println(sword.getId());
        System.out.println(sword.getName());
        System.out.println(sword.getTeacher());
        System.out.println(sword.getStudents());
        System.out.println("____________________________");
        System.out.println("____________________________");

        // Create additional objects with the builder
        Student atticusFinch = Student.builder()
                .id("7")
                .name("Atticus")
                .address("7 Main St")
                .grade(new BigDecimal("4.0"))
                .build();
        System.out.println(atticusFinch);
        System.out.println("____________________________");

        Teacher fredFlintstones = Teacher.builder()
                .id("3")
                .name("Fred")
                .subject("Geology")
                .build();
        System.out.println(fredFlintstones);
        System.out.println("____________________________");

        Teacher scoobyDoo = Teacher.builder()
                .id("4")
                .subject("Spirits")
                .build();
        System.out.println(scoobyDoo);
        System.out.println("____________________________");

        Student lexLuthor = new Student();
        System.out.println(lexLuthor);
        System.out.println("____________________________");

        Teacher barneyRubblesBestFriend = fredFlintstones.withSubject("Crane Operation");
        System.out.println(barneyRubblesBestFriend);
        System.out.println("____________________________");
    }
}