/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.cise.interfaces;

import java.util.ArrayList;

/**
 *
 * @author SISTEMA
 */
public interface categoriaDBO<T> {
    public abstract ArrayList<T> categoria(int idcategoria);
}
