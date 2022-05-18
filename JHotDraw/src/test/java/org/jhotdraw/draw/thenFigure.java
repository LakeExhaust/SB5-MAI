/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.*;

/**
 *
 * @author lake
 */
class thenFigure {
    @ExpectedScenarioState
    private DefaultDrawingView ddv;
   
    @ExpectedScenarioState
    private Figure fig;
     

    thenFigure assertFigureIsDeleted() {
         //If it doesn't contain the figure it must be deleted
       
             for(int i = 0; i<ddv.getDeletedFigures().size(); i++) {
             if(ddv.getDeletedFigures().get(i) == fig) {
             assertEquals(ddv.getDeletedFigures().get(i), fig);
           
             
             } else {
                fail("No deleted figure");
             }
        
        
           
        
    }
              return this;

    }
    
}
