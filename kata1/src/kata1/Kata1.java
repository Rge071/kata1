/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Usuario
 */
public class Kata1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Joel", LocalDate.of(2001, Month.APRIL,16)); 
        System.out.println(person.getName() + " " + person.getAge());
    }
}
