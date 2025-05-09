package userInput;

import java.io.*;

public class BufferReaderDemo {
    public static void main(String []args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("test.txt");
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(streamReader);
        for(String input; (input=reader.readLine())!=null;)
        System.out.println("Entered String is : "+ input);
    }
}
