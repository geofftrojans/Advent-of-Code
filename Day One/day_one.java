import java.io.BufferedReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;

class day_one {
    public static void main(String[] args) throws IOException{
     
        //Read input file, save as String "input_text"
        InputStream is = new FileInputStream(new File(args[0]));
        InputStreamReader input_stream = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(input_stream);
        String input_text = reader.readLine();
        reader.close();

        //total - final answer
        int total = 0;

        //j - index counter to follow i in the for loop (i-1)
        int j = 0;

        for(int i = 1; i < input_text.length(); i++){
            j = i-1;

            //if the two characters (i and i-1) are equal, take the int value of one and add to total
            if(input_text.charAt(i) == input_text.charAt(j)){
                total += Character.getNumericValue(input_text.charAt(i));
            }
        }

        //compare first and last character
        if(input_text.charAt(0) == input_text.charAt(input_text.length()-1)){
            total += Character.getNumericValue(input_text.charAt(0));
        }

        System.out.println(total);

    }
}