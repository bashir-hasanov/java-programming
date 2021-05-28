package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(',')); //4
        //last comma
        System.out.println(technologies.lastIndexOf(',')); //41
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index of " + indexOfJava);  //0
        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at index of " + indexOfCss);    //12
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index of " + indexOfCucumber);
        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index of " + indexOfSql);

        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
        
        String word = "hello";
        System.out.println(word.indexOf("h")); //0
        System.out.println(word.indexOf("el")); //1
        System.out.println(word.indexOf("lo")); //3

    }
}
