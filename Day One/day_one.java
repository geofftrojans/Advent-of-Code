import java.io.BufferedReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;

class day_one {
    public static void main(String[] args) throws IOException{
        int first = 0;
        int previous = 0;

        InputStream is = new FileInputStream(new File(args[0]));
        InputStreamReader input_stream = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(input_stream);
        String input_text = reader.readLine();
        reader.close();

        System.out.println(input_text);

    }
}