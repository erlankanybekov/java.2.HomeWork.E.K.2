package com.company;

public class History_book extends Books{

    public History_book(int page, String size,String color) {
        super(page, size,color);


    }



    public void print(){
        System.out.println("\uD83D\uDCD7");
    }
    public void getInfo(){
        System.out.println("История Европы "+ " страниц:"+ getPage() + ", размер: "+ getSize()
                + ", цвет: "+ getColor());
    }
}
