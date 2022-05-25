/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.ejemploret3;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList();
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(8);
        ArrayList<Integer> B = new ArrayList();
        B.add(1);
        B.add(2);
        B.add(5);
        B.add(5);

        Integer cat = 2;

        Album a = new Album();
        System.out.println(a.clases(A));
        System.out.println(a.meFaltanDeLaClase(A, B, cat));
    }

}
