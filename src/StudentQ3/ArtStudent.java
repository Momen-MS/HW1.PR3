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
public class  ArtStudent extends Student{
    private  double mid;
    private  double report ;
    private  double finals ;

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getReport() {
        return report;
    }

    public void setReport(double report) {
        this.report = report;
    }

    public double getFinals() {
        return finals;
    }

    public void setFinals(double finals) {
        this.finals = finals;
    }

    public ArtStudent(double mid, double report, double finals) {
        this.mid = mid;
        this.report = report;
        this.finals = finals;
//        grade = mid*0.40 + report*0.10 + final*50.
        super.setGrude(mid*0.40 + report*0.10 + finals*50);
       
    }
    
    
}
