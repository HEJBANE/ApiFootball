package apiConnector;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;


public class ApiConnector {

    public String request(String endpoint){
        String result="";
        OkHttpClient client =new OkHttpClient();

        Request request= new Request.Builder()
                .url("https://api.football-data.org/v2/"+endpoint)
                .get()
                .addHeader("X-Auth-Token",System.getenv("TOKEN"))
                .build();
        try {
            Response response =client.newCall(request).execute();
            if(response.code()==200){
                result=response.body().string();

            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return result;
    }


}