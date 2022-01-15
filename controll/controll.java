  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.logica;
import view.view1;

/**
 *
 * @author Eddy
 */
public class controll implements ActionListener {

    private logica d;
    private view1 v;

    public controll(logica d, view1 v) {
        this.d = d;
        this.v = v;
        this.v.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         d.setA(Integer.parseInt(v.a.getText()));
         d.setB(Integer.parseInt(v.b.getText()));
         d.setC(Integer.parseInt(v.c.getText()));
         d.cuadratica();
         v.respuesta.setText(String.valueOf(d.getR1()));
         v.respuesta2.setText(String.valueOf(d.getR2 ()));
    }

   
}
