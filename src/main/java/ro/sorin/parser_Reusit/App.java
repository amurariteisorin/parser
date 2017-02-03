package ro.sorin.parser_Reusit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws Exception
    {
     
   Document doc = Jsoup.connect("http://dentcafe.com/instrumentar/bisturie-cutite-foarfece").get();
   Elements categ = doc.getElementsByClass("category-info");
   Elements media = doc.getElementsByClass("first-image");
   Elements nume = doc.getElementsByClass("description");
   Elements pret = doc.getElementsByClass("price");
   Elements link = doc.getElementsByClass("name");
    
    for (Element cat : categ) {
     System.out.println("Category: "+ cat.text());
    }
    for (Element img:media){
    
      System.out.println("Pictures= "+ img.attr("data-src"));

}
   
    for (Element num: nume){
   
     System.out.println("Titlul= "+num.text());
    
  
    }
    
    for (Element price: pret){
    
     System.out.println("Pret= "+ price.text());
    
    
    }
   
    for (Element img:link){
   
     System.out.println("Links= " + img.select("a").attr("href"));
     }
 
}
}