package gr.aueb.cf.ch14.reflection;

import java.lang.reflect.Constructor;

public class Reflection {

    public static void main(String[] args) {
        try {
            Class<?> classStudent = Class.forName("gr.aueb.cf.ch14.reflection.Student");

            Constructor<?> defaultConstr = classStudent.getConstructor();
            Student student = (Student) defaultConstr.newInstance();

        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
