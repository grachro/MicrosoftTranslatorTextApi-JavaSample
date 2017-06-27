package sample;

public class SampleTranslate {
    public static void main(String[] args) throws Exception {

        String subscriptionKey = args[0];
        String token = Token.get(subscriptionKey);
        String text = "一流の生産者が作ったおいしい野菜";
        String fromLang = "ja-JP";

        String 簡体字 = Translater.translate(token, fromLang, "zh-CN", text);
        String 繁体字 = Translater.translate(token, fromLang, "zh-HK", text);
        String 英語 = Translater.translate(token, fromLang, "en-US", text);

        System.out.println(簡体字);
        System.out.println(繁体字);
        System.out.println(英語);
    }
}
