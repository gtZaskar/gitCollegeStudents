package com.homeWorks;

public class Student extends Person implements Drinkable {

    public String idNumber;

    public double gpa;

    private double howDrink;

    private final static double LOW_DRINKABLE_MIN = 0.2;

    private final static double LOW_DRINKABLE_MAX = 1.5;

    private final static double MEDIUM_DRINKABLE_MIN = 1.51;

    private final static double MEDIUM_DRINKABLE_MAX = 2.5;

    private final static double HIGH_DRINKABLE_MIN = 2.51;

    private final static double HIGH_DRINKABLE_MAX = 10.0;

    @Override
    public Intoxication drinkUp(double increase) throws StudentCanNotDrinkException {
        if (this.age<18) {
            throw new StudentCanNotDrinkException("Student " + this.name + "too young");

        }
        howDrink += increase;

        if (howDrink >= LOW_DRINKABLE_MIN && howDrink <= LOW_DRINKABLE_MAX) {
            return Intoxication.LOW;

        } else {
            if (howDrink >= MEDIUM_DRINKABLE_MIN && howDrink <= MEDIUM_DRINKABLE_MAX) {
                return Intoxication.MEDIUM;

            } else {
                if (howDrink >= HIGH_DRINKABLE_MIN && howDrink <= HIGH_DRINKABLE_MAX) {
                    return Intoxication.HIGH;

                } else {
                    if (howDrink < LOW_DRINKABLE_MIN) {
                        return Intoxication.GOOD;
                    } else {
                        if (howDrink > HIGH_DRINKABLE_MAX) {
                            return Intoxication.DEATH;

                        }
                    }
                }
            }
        }
        return null;
    }

    public Student(String name, String gender, int age, String idNumber, double gpa) {
        super(name, gender, age);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public Student() {
        System.out.println("I am a student ");
    }

   /* public void drink() {
        System.out.println(howDrink);
    }*/


    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                ", howDrink=" + howDrink +
                '}';
    }


}
