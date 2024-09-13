
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SendHttpProcess {
    public String sendHttpRequest(String urlpath, String message) {
        String result = "";
        message = message.replaceAll(" ", "%20");
//        byte[] postData = message.getBytes(Charset.forName("UTF-8"));
        try {
            OkHttpClient client = new OkHttpClient();
            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
            RequestBody body = RequestBody.create(mediaType, message);
            Request request = new Request.Builder()
                    .url(urlpath)
                    .post(body)
                    .addHeader("content-type", "application/x-www-form-urlencoded")
                    .addHeader("cache-control", "no-cache")
                    .addHeader("postman-token", "fc6a6f72-1c97-7dd1-9fdf-dee8f83e1d34")
                    .build();
            okhttp3.Response res = client.newCall(request).execute();
            result = res.body().string().toString();
        } catch (SocketTimeoutException ex) {
//            log.error(ex.getMessage());
            ex.printStackTrace();
            return "timeout";

        } catch (IOException ex) {
//            log.error(ex.getMessage());
            ex.printStackTrace();
            return "error";
        }
//            log.error(ex.getMessage());
//            log.error(ex.getMessage());
        System.out.println("result : " + result);
        return result;


    }
    
}
