package it;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //echo(System.in);

        File file = new File("temp.txt");
        writeToFile(file, "Hello, writing to file");
        readFromFile(file);


    }

    public static void echo(InputStream is) throws IOException {
        try {
            while (true) {
                int i = is.read();
                if (i == -1)
                    break;
                Character c = (char) i;
                if (c.compareTo('q') == 0) {
                    System.out.println("GoodBay");
                    break;
                }
                System.out.print(c);

            }
        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.println("ooo");

    }

    public static void writeToFile(File file, String data) throws IOException {
        Writer wr = new FileWriter(file);
        wr.write(data);
        wr.close();
    }

    public static void readFromFile(File file) throws IOException {
        Reader rd = new FileReader(file);
        StringBuilder sb = new StringBuilder();
        char [] charArray = new char[(int)file.length()];
        rd.read(charArray);
        rd.close();
        for (char c: charArray) {
            sb.append(c);
        }
        System.out.println(sb);

    }
}

