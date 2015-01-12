package org.apache.http.impl.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Map;
import java.lang.*;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class NejibeRegistration {

/*This main method will set my endpoint 
    as the url and also create a string called output*/

    public static void main (String[] args) throws IOException {
        String endPoint = "http://challenge.code2040.org/api/register";
        String output;

        NejibeRegistration nejibe = new NejibeRegistration();

        HttpPost post = new HttpPost(endPoint); 
        Gson gson = new Gson();
        CloseableHttpClient httpclient = HttpClients.createDefault();

        //set the email and github private instances
        nejibe.setEmail("njabir@luc.edu");
        nejibe.setGithub("https://github.com/nejibe/Code-2040.git");

        /* Use  gson to convert to json and
         * Set the data to be sent via HttpPost
         * */
        StringEntity data = new StringEntity(gson.toJson(nejibe));
        post.setEntity(data);
        post.setHeader("Content-type", "application/json");
        HttpResponse result = httpclient.execute(post);
        System.out.println(result);

        //use BufferedReader to extract the string containing json from the http response
        BufferedReader br = new BufferedReader(new InputStreamReader((result.getEntity().getContent())));
        while ((output = br.readLine()) != null){
            System.out.println(output);     

            System.out.println("" + result);
            }

        }   


    private void setGithub(String string) {
        // TODO Auto-generated method stub

    }

    private void setEmail(String string) {
        // TODO Auto-generated method stub

    }
}