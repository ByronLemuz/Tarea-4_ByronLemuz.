/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg4_byronlemuz;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author lesly
 */
public class Tarea4_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> conjunto1 = new ArrayList<Integer>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(4);
        conjunto1.add(5);

        ArrayList<Integer> conjunto2 = new ArrayList<Integer>();
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);
        conjunto2.add(6);
        conjunto2.add(7);

        ArrayList<Integer> interseccion = new ArrayList<Integer>();

        //Recorremos cada elemento del primer conjunto
        for (Integer num1 : conjunto1) {
            //Recorremos cada elemento del segundo conjunto
            for (Integer num2 : conjunto2) {
                //Si el elemento del primer conjunto esta en el segundo y es impar, lo agregamos a la intersección
                if (num1.equals(num2) && num1 % 2 != 0) {
                    interseccion.add(num1);
                }
            }
        }

        //Ordenamos la intersección en orden descendente
        Collections.sort(interseccion, Collections.reverseOrder());

        //Imprimimos los elementos de la intersección
        System.out.println("Números impares de la intersección: " + interseccion);
    }
}
