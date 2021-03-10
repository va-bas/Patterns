package com.vabas.patterns.iterator;

public class WebSiteRunner {
    public static void main(String[] args) {
        String properties[] = {"Site type", "Language", "Price", "Difficulty", "Programing type"};

        WebSite webSite = new WebSite("getmaket.ru", properties);

        Iterator iterator = webSite.getIterator(webSite);
        //Iterator iterator = webSite.getIterator();

        System.out.println("Website name is: " + webSite.getName());
        System.out.println("Website properties is:");

        /*while (iterator.hasNext()){
            System.out.println(iterator.getIndex() + ": " + iterator.next().toString());
        }*/

        for (String prop: properties){

            System.out.println(prop);
        }
    }
}
