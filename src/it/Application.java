package it;

import java.io.*;
import java.lang.reflect.Field;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Emloyee employee1 = new Emloyee("Stepan", 13, 5300);
        Emloyee employee2 = new Emloyee("Petro", 19, 6700);

        File file = new File("employers.txt");
        backUpEmployers(file, employee1);
        Serializable employee3 = restoreEmployers(file);

        List<Emloyee> employers = new ArrayList<>();
        employers.add(employee1);
        employers.add(employee2);
        employers.add((Emloyee) employee3);

        backUpEmployers(file, (Serializable) employers);
        System.out.println(restoreEmployers(file));

        System.out.println(" Fields in Class Employee have annotation:");
        getFieldsAnnotation(Emloyee.class);
        LocalTime lt = LocalTime.now();
        System.out.println("Local time is = " + lt);
    }

    public static void backUpEmployers(File file, Serializable data) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(data);
        oos.close();
        os.close();

    }

    public static Serializable restoreEmployers(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        return (Serializable) ois.readObject();

    }

    public static void getFieldsAnnotation (Class<?> someClass) {
        Field[] fields = someClass.getDeclaredFields();
        for (Field field: fields) {
            System.out.println("Field - " + field.getName() + " have annotation: " + field.getAnnotation(EmployeeAnnotation.class));
        }
    }


}





