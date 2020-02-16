/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQ3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Momen
 */
public class Mian {

    /**
     * @param Array
     */
    public static void Sort(Student Array[]) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j].getGrude() > Array[i].getGrude()) {
                    Student Temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = Temp;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student A = new ArtStudent(5, 11, 17);
        
        Student B = new ArtStudent(8, 15, 19);
        
        Student C = new ItStudent(17, 12, 18);
      
        Student D = new ItStudent(9, 17, 11);
     // Create an array of some Student objects from both ItStudent and ArtStudent classes.

        Student [] StudentArray = { A , B , C , D };
    
        
       //Sort the Student objects by grade in descending order using functions.
        Sort(StudentArray);
        
       // Save the sorted objects into file.
            try {
            FileOutputStream out = new FileOutputStream(new File("students.txt"));
            ObjectOutputStream o = new ObjectOutputStream(out);
            for (Student student : StudentArray) {
                o.writeObject(student);
            }
            o.close();
            
        } catch (Exception r) {
            r.printStackTrace();
        }
        }
        
        
    }


