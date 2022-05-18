/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lake
 */
class whenFigure {
    @ProvidedScenarioState
    private DefaultDrawingView ddv;
    
    @ProvidedScenarioState
    private Drawing drawing;
    
    @ExpectedScenarioState
    private Figure fig;

    @ProvidedScenarioState
    private List<Figure> deletedFigures;
    @BeforeStage
    public void before() {
    ddv = new DefaultDrawingView();
    ddv.setDrawing(new QuadTreeDrawing());
    drawing = ddv.getDrawing();
    deletedFigures = ddv.getDeletedFigures();
    drawing.add(fig);
    
       
    }
    
    whenFigure getDeletedFigure() {
    
       drawing.remove(fig);
       deletedFigures.add(fig);
         
         
         return this;
        
    }
    
}
