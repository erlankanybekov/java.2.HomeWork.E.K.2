package com.company;

public class Main {

    public static void main(String[] args) {

        //Object 1
     createObject("Math").print();
        // object 2
        createObject("History").print();
        // object 3
        createObject("English").print();

        }

    public static Books createObject(String className) {
        switch (className) {
            case "Math":
                Math_book math_book = new Math_book(456, "84X108/8", 3, "blue");
                math_book.getInfo();
                return math_book;
            case "History":
                History_book history_book = new History_book(452, "70X90/16", "green");
                history_book.getInfo();
                return history_book;
            case "English":
                English_book english_book = new English_book(364, "60X90/16", "detective", "black");
                english_book.getInfo();
                return  english_book;
        }
        return null;
    }
}
