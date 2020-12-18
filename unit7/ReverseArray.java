/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

/**
 *
 * @author chiadika
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[][] data = {
//            {2, 3, 9, 5},
//            {7, -3, 5},
//            {-1, 5, 12, 13, 14},
//            {1, 0, 0, 15}
//        };
//        String reversed = "";
//        
//        for ( int i = 0 ; i < data.length; i++){
//            System.out.println(" ");
//            for ( int j = data[i].length - 1; j >=0 ; j--){
//                reversed = Integer.toString(data[i][j]) + ", ";
//                System.out.print(reversed);
//            }
//        }
        
String reversed = "";
        int[]rat = {
            2, 3, 9, 5};
        
       // for ( int i = 0 ; i < rat.length ; i++){
            for ( int j = rat.length - 1; j >= 0 ; j--){
                reversed = Integer.toString(rat[j]);
                    System.out.print( reversed + " ");

            }
            
        //}
        
    }

}
