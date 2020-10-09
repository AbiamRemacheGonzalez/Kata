/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author abiam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Abiam", LocalDate.of(1971, Month.MARCH, 21));
        System.out.println(person.getName() +" "+person.getName());
    }
    
}
