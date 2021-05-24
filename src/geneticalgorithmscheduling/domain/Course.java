/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithmscheduling.domain;

import java.util.ArrayList;

/**
 *
 * @author Ibrahim
 */
public class Course {
    private String number = null;
    private String name =  null;
    private int maxNumbOfStudents;
    private ArrayList<Instructor> instructors;
    public Course(String number, String name, ArrayList<Instructor> instructors, int maxNumbOfStudents){
        this.number = number;
        this.name = name;
        this.instructors = instructors;
        this.maxNumbOfStudents = maxNumbOfStudents;
    }
    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Instructor> getInstructors(){
        return instructors;
    }
    public int getMaxNumbOfStudents(){
        return maxNumbOfStudents;
    }
    public String toString(){
        return name;
    }
}
