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
public Car(String mk, String md){

    make = mk;
    model = md;
    year = 1995;
    price = 5000;
    topSpeed = 350;
    kilometres = 3000;
}
public Car(String mk, String md, int yr, int pr, int ts, int km ){

    make = mk;
    model = md;
    year = yr;
    price = pr;
    topSpeed = ts;
    kilometres = km;
}
public String honk(){
   String output = "HONK! HONK!";
    
   return output;
}
public String toString(){
    String output = "Your car is a "+ make+"\n";
    output+="And the model of "+make+" is "+model+"\n";
    output+="The year of your car is "+year+"\n";
    output+="The prices of your car is a whopping "+price+"\n";
    output+="The top speed is "+topSpeed+"\n";
    output+="The mileage of your car is"+kilometres+"\n";
    
    return output;
}
}
