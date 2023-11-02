/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
        return super.getLabel() + "," + super.getType() + "," + step;
    }
    
    public void setData() {
        super.setLabel(super.getLabel().substring(0, super.getLabel().length() - 4) + step + super.getLabel().substring(1));
    }
    
    public int getValue() {
        if( super.getType()<3 && (super.getLabel().contains("A"))) {
            return step;
        }
        else return step + 2;
    }
    
}
