package com.company;

public class Books implements Printable{
    private int page;
    private String size;
    private String color;

    public Books(int page, String size,String color) {
        this.page = page;
        this.size = size;
        this.color = color;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getInfo(){
        System.out.println(getClass().getSimpleName()+ " страниц:"+ getPage() + ", размер: "+ getSize()
                + ", цвет: "+ getColor());
    }

    @Override
    public void print() {

    }
}
