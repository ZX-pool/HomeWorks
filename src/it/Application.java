package it;

import java.io.*;
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


}





