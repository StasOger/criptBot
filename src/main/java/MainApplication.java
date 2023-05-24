import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

//  av.by, jsoup
        System.out.println("Подключение к главной странице...");
//        Document doc = Jsoup.connect("https://cars.av.by/filter?brands[0][brand]=8&brands[1][brand]=589&brands[2][brand]=2521&brands[3][brand]=6&brands[4][brand]=683&brands[5][brand]=1238&brands[6][brand]=1181&brands[7][brand]=1216&brands[8][brand]=1343&brands[9][brand]=2521&year[min]=2017&sort=4").get();
        Document doc = Jsoup.connect("https://cars.av.by/filter?year[min]=2017&sort=4").get();
        Elements postTitleElements = doc.getElementsByAttributeValue("class", "listing-item__link");
        System.out.println(postTitleElements);
        postTitleElements.forEach(postTitleElement -> System.out.println(postTitleElement.attr("href")));
        for (int i =0 ; i< 1000; i++){
            postTitleElements.forEach(postTitleElement -> System.out.println(postTitleElement.attr("href")));
            System.out.println();
            System.out.println();
            Thread.sleep(5000);
        }
    }
}
