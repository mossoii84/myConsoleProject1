package com.company.products;

public class Fruit implements Food {

    public String name ="Fruit";

    public Fruit(String name) {
        this.name = name;
    }
    public Fruit() {
//        System.out.println("фрукты: Созданы!!");
        //будет выводиться у всех наследников
    }

    public String getName(String name) {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }



    //собственные методы класса Fruit
    public void inStock(){
        System.out.println("Доступен для покупки");
    }




    //из interface Food переопределили
    @Override
    public void srokGodnosti(Fruit fruit) {
        System.out.println("всежий продукт" + fruit.getName(name));
    }


}
