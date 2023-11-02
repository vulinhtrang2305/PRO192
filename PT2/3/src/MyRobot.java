
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chucken
 */
public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> t) {
        int sum = 0;
        for (Robot robot : t) {
            String label = robot.getLabel();
            if (!label.contains("A") && !label.contains("B")) {
                sum += robot.getStep();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Robot> t) {
        int max = t.get(0).getStep();
        int pos = 0;
        
        for (int i = 0; i<t.size(); i++) {
            if(t.get(i).getStep() > max) {
                max = t.get(i).getStep();
                pos = i;
                t.remove(i);
            }
        }
    }

    @Override
    public void f3(List<Robot> list) {
         Collections.sort(list.subList(1, 4), new Comparator<Robot>(){
            @Override
            public int compare(Robot o1, Robot o2) {
                if ((o1.getLabel()).compareTo(o2.getLabel()) != 0){
                    return (o1.getLabel()).compareTo(o2.getLabel());
                }
            return o1.getStep()-(o2.getStep());
            }
            
        });

    }
    
}
