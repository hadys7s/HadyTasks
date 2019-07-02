package com.andalus.hady;

public class Data {
    private  String Name;
    private  int Size;
    private  int Image;
    public  Data(String name,int size,int image)
    {
        Name=name;
        Size=size;
        Image=image;

    }


    public int getImage() {
        return Image;
    }

    public int getSize() {
        return Size;
    }

    public String getName() {
        return Name;
    }
}
