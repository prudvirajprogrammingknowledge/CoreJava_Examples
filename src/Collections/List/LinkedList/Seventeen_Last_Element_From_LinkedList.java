/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author prudviraj
 */
/*
Output
First Element: 4
First Element: 4
*/
public class Seventeen_Last_Element_From_LinkedList {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("First Element: " + list.getLast());
        System.out.println("First Element: " + list.peekLast());

    }
    
}
