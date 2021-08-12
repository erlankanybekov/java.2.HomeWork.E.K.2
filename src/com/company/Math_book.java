package com.company;

public class Math_book extends Books{
    private int number;

    public Math_book(int page, String size,int number,String color) {
        super(page, size,color);
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void print(){
        System.out.println("\uD83D\uDCD8");
    }
    public void getInfo(){
        System.out.println("Calculus "+ " страниц:"+ getPage() + ", размер: "+ getSize()
                + ", цвет: "+ getColor()+", №"+getNumber());
    }
}
