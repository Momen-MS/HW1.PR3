/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQ3;

import java.io.Serializable;

/**
 *
 * @author Momen
 */
public abstract class Student implements Serializable{

    private int id;
    private String Name;
    private String major;
    private double grude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrude() {
        return grude;
    }

    public void setGrude(double grude) {
        this.grude = grude;
    }


}
