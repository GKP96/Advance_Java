package input_output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("E:\\AfterReset\\Advance_Java\\input_output\\input.txt");
            writer = new FileWriter("E:\\AfterReset\\Advance_Java\\input_output\\output.txt");
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