/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import java.util.Scanner;
/**
 *
 * @author ofadj3940
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    
    System.out.println("Please select and choose three cars. Enter 1 to reveal\n"
            + "the specs of a default car. Enter 2 to output specs of a car of\n"
            + "your own choosing and enter 3 to reveal your custom car");
    Scanner sc = new Scanner(System.in);
    String userIn = sc.nextLine();
    
    switch(userIn){
        case "1":{
            Car car1= new Car();
            System.out.println(car1.toString());
            break;
        }
        case "2":{
            System.out.println("What brand would you like your car to be?");
            Scanner b =  new Scanner(System.in);
            String bType = b.nextLine();
            
            System.out.println("What model would you like your car to be?");
            String bMod = b.nextLine();
            
            Car car2 = new Car(bType,bMod);
            System.out.println(car2.toString());
            break;
        }
            
        case "3":{
            System.out.println("What brand would you like your car to be?");
            Scanner b =  new Scanner(System.in);
            String bType = b.nextLine();
            
            System.out.println("What model would you like your car to be?");
            String bMod = b.nextLine();
            
            System.out.println("What year would you like your car to be?");
            int yr = b.nextInt();
            
            System.out.println("What price would you like your car to be?");
            int p = b.nextInt();
            
            System.out.println("What top speed would you like your car to be?");
            int ts = b.nextInt();
            
            System.out.println("What model would you like your car to be?");
            int m = b.nextInt();
            
            Car car3 = new Car(bType,bMod, yr,p,ts,m);
            System.out.println(car3.toString());
            break;
        }
            
        default:
        System.out.println("Please enter an integer from 1-3");
    }
     
    
    
    
    
    
    }
    
    
}
