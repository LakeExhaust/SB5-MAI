/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.List;
import java.util.Set;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;

/**
 *
 * @author lake
 */
class givenFigure extends Stage<givenFigure> {

   @ProvidedScenarioState
    private Figure fig;
 
    
 
    givenFigure getFigure() {
     // 
    fig = new SVGRectFigure();
    
   
       

   return this;
        
    }
    
   
   
    
}
