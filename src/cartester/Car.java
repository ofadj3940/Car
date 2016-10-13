/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author ofadj3940
 */
public class Car {

    private String make, model;
    private int year, price, topSpeed, kilometres;


public Car(){

make  = "honda";
model = "civic";
year = 2016;
price = 10000;
topSpeed = 200;
kilometres = 78; 


}
public Car(String mk, String md, int yr, int pr, int ts, int km ){

    make = mk;
    model = md;
    year = yr;
    price = pr;
    topSpeed = ts;
    kilometres = km;
}

}
