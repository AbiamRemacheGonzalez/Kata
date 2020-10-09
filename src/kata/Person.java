/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.time.LocalDate;

/**
 *
 * @author abiam
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;    

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()-birthdate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365);
    }
}
