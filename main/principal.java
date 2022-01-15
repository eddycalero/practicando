/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controll.control2;
import controll.controll;
import model.logica;
import view.view1;
import view.view2;

/**
 *
 * @author Eddy
 */
public class principal {

    public static void main(String[] args) {

        view1 view1 = new view1();
        logica logica = new logica();
        controll m = new controll(logica, view1);
        view1.venta();
        view1.setVisible(true);
    }
}
