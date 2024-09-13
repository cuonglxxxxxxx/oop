/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide6_bt;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Iterator;

/**
 *
 * @author Lenovo
 */
public class ComparatorEx {
    public static void main(String[] args) {
        ArrayList<Person> lst=new ArrayList<Person>();
        SortedMap<Integer,Person>  mp=new TreeMap<Integer,Person>();
        Person p=new Person();
        p.setAge(20);
        p.setName("A");
        lst.add(p);
        mp.put(5,p);
        p=new Person();
        p.setAge(19);
        p.setName("B");
        lst.add(p);
        mp.put(2,p);
        p=new Person();
        p.setAge(22);
        p.setName("C");
        lst.add(p);
        mp.put(3,p);
        System.out.println("Chua xep:");
        for(Person ps:lst){
            System.out.println(ps.getAge()+" x"+ps.getName());
        }
        System.out.println("Da xep:");
        Collections.sort(lst,new AgeComparator());
        for(Person ps:lst){
            System.out.println(ps.getAge()+" "+ps.getName());
        }
        System.out.println(mp.firstKey());
        Iterator<Person> itr=lst.iterator();
        System.out.println(lst.get(1).getAge());
        
       
    }
}
