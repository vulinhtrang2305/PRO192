/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2Slot8;

/**
 *
 * @author chucken
 */
public class SpecRobot extends Robot{
    protected int step;

    public SpecRobot() {
    }
    
    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }
    
    public void setData(){
        super.setLabel(super.getLabel().substring(0, 1) + step + super.getLabel().substring(1));
    }
    
    public int getValue(){
        if ( type < 3 && label.contains("A")) return this.step;     
        else {
            return this.step + 2;
        }
}
}
        