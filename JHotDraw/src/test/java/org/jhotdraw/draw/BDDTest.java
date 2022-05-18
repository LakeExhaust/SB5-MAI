/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;


import com.tngtech.jgiven.junit.ScenarioTest;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author lake
 */
public class BDDTest extends ScenarioTest<givenFigure, whenFigure, thenFigure> {

     @Test
    public void TestdeletedFigures() {
        given().getFigure();
        when().getDeletedFigure();
        then().assertFigureIsDeleted();
   
  }
}
