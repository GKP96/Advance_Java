package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = null;
        FileOutputStream writer = null;
        try {
            reader = new FileInputStream("E:\\AfterReset\\Advance_Java\\input_output\\input.txt");
            writer = new FileOutputStream("E:\\AfterReset\\Advance_Java\\input_output\\output.txt");
            int content;
            while ((content = reader.read()) != -1) {
                writer.write(content);
            }
        } finally {
            if (reader != null)
                reader.close();
            if (writer != null)
                writer.close();
        }
    }
}
