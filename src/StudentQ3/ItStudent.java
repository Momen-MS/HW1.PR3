/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentQ3;

/**
 *
 * @author Momen
 */
public class ItStudent extends Student {
    private  double mid;
    private  double project ;
    private  double finals ;

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getProject() {
        return project;
    }

    public void setProject(double project) {
        this.project = project;
    }

    public double getFinals() {
        return finals;
    }

    public void setFinals(double finals) {
        this.finals = finals;
    }

    public ItStudent(double midS , double projectS , double finalsS ) {
        this.mid = midS ;
        this.project = projectS;
        this.finals = finalsS;
        // grade = mid*0.30 + project*0.30 + final*40
        super.setGrude(mid*0.30 + project*0.30 + finals*40) ;
       
        
    }
    
    
}
