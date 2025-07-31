package org.example.Serialization;
import java.io.*;

public class Student implements Serializable {
    int id;
    String name;
    //transient String password;
    //String password;
    static String password;

    public Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);  // Will be null after deserialization
    }
    public static void main(String[] args) {
             Student s1=new Student(101,"Siddhi","123");

        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Student object serialized to student.ser");

        } catch (Exception e) {
            e.printStackTrace();
        }
         password="newPass";
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Student object deserialized from student.ser\n");
            s2.display();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
