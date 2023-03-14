package org.example;

public class Goods {
    public String name;
    public Double prise;
    public Integer rating;


    /***
     *
     * @param name Наименование товара
     * @param prise Цена товара
     * @param rating Рейтинг товара
     */
    public Goods(String name, Double prise, Integer rating) {
        this.name = name;
        this.prise = prise;
        this.rating = rating;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        String s = (name +", "+ prise + ", "+ rating);
        return s;
    }

    public String getName() {
        return name;
    }

    public Double getPrise() {
        return prise;
    }

    public Integer getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
