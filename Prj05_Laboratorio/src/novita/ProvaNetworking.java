package novita;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ProvaNetworking {

    private static final String SITO_WEB =
            "http://www.corriere.it/";

    public static void main(String[] args) throws IOException {

    	URL url = new URL(SITO_WEB);
    	
        try (InputStream stream = url.openStream();
                BufferedInputStream buf = new BufferedInputStream(stream);
        	){

            StringBuilder sb = new StringBuilder();

            while (true) {
                int data = buf.read();

                if (data == -1) {
                    break;
                } else {
                    sb.append((char)data);
                }
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}