/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Gustavo Girardon
 */

public class Serializador {

    public Serializador() {
    }

    public void serializar(String path, Object obj) throws Exception {
        FileOutputStream outFile = new FileOutputStream(path);
        ObjectOutputStream s = new ObjectOutputStream(outFile);
        s.writeObject(obj);
        s.close();
    }
}
