/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.interfaces;

import java.util.List;

/**
 *
 * @author Filipovic
 */
public interface IStudent {

    int getId();
    
    String getName();

    List<String> getFirstP();

    List<String> getSecondP();
    
    void addFirstPrio(String name);
    
    void addSecondPrio(String name);
    
}
