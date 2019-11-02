package com.homeWorks;


public class Main {

    public static void main(String[] args) {
        Person vasja = new Person("Vasja", "M", 20);
        Student katja = new Student("Katja", "F", 30, "765234", 4.2);
        Teacher jenja = new Teacher("Jenja", "M", 28, 2000, "Java");
        CollegeStudent sasha = new CollegeStudent("Sasha", "M", 31, 1, "Java", "756259", 0.1);

        Person persons[] = new Person[]{vasja, katja, jenja, sasha};
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());

            try {
                katja.drinkUp(5.0);
            }catch (StudentCanNotDrinkException e){
                e.printStackTrace();
            }


        }
    }
}
