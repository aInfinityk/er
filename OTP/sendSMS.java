import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class sendSMS {
    public static void main(String[] args) {
        int OTP;

        try {
            // Construct data
            String apiKey = "apikey=" + "Njg3ODZlNzUzNDc2NjMzMzQyNTU1MjUyNjEzNzQ4NDQ=";
            Random rand = new Random();
            OTP = rand.nextInt(9999-1000)+1000;
            String message = "&message="+ "Hi there, thank you for sending your first test message from Textlocal. Get 20% off today with our code: "+ OTP + ".";
            String sender = "&sender=" + "600010";
            String numbers = "&numbers=" + "917488401384";

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }
            System.out.println(stringBuffer.toString());
            rd.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}