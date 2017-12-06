/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Gustavo Girardon
 */
public class Deserializador {

    public Deserializador() {
    }

    public Object deserializar(String path) throws Exception {
        FileInputStream inFile = new FileInputStream(path);
        ObjectInputStream d = new ObjectInputStream(inFile);
        Object o = d.readObject();
        d.close();
        return o;
    }
}
