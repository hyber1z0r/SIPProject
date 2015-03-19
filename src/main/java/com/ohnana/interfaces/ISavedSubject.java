package com.ohnana.interfaces;

import java.util.List;

/**
 *
 * @author jakobgaardandersen
 */
public interface ISavedSubject {

    List<IElectiveSubject> getDay1();

    List<IElectiveSubject> getDay2();
    
    int getId();
}
