/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;
import java.util.Comparator;
/**
 *
 * @author Lenovo
 */
public class AgeComparator implements Comparator  {
    @Override
    public int compare(Object ob1,Object ob2){
    int ob1Age=((Person)ob1).getAge();
    int ob2Age=((Person)ob2).getAge();
    if(ob1Age>ob2Age){
    return 1;
    }else if(ob1Age<ob2Age){
    return -1;
    }else 
        return 0;
    }
}
