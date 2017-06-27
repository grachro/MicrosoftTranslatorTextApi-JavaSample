package sample;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Token {
    public static String get(String キー管理のキー１) throws Exception {
        HttpPost request = new HttpPost("https://api.cognitive.microsoft.com/sts/v1.0/issueToken");
        request.setHeader("Ocp-Apim-Subscription-Key", キー管理のキー１);
        return EntityUtils.toString(HttpClients.createDefault().execute(request).getEntity());
    }
}



