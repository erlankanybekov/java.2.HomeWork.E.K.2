package com.company;

public class English_book extends Books{
    private String Genre;

    public English_book(int page, String size,String genre,String color) {
        super(page, size,color);
        this.Genre = genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void print(){
        System.out.println("\uD83D\uDCD5");
    }
    public void getInfo(){
        System.out.println("Sherlock Holmes "+ " страниц:"+ getPage() + ", размер: "+ getSize()
                + ", цвет: "+ getColor()+ ", жанр:"+getGenre());
    }
}
