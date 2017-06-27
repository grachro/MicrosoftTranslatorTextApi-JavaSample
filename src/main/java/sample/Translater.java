package sample;

import org.apache.commons.codec.net.URLCodec;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class Translater {
    public static String translate(String accessToken, String fromLang, String toLang, String text) throws Exception {
        String env = new URLCodec().encode(text, "UTF-8");

        String theRequestURI = "https://api.microsofttranslator.com/v2/Ajax.svc/Translate";
        String url = String.format("%s?from=%s&to=%s&text=%s", theRequestURI, fromLang, toLang, env);

        HttpGet request = new HttpGet(url);
        request.setHeader("Authorization", "Bearer " + accessToken);
        String resultJson = EntityUtils.toString(HttpClients.createDefault().execute(request).getEntity());
        return new Gson().fromJson(resultJson, String.class);
    }
}


