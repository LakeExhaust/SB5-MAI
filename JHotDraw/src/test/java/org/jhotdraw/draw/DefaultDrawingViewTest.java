/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.junit.ScenarioTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import org.jhotdraw.samples.svg.figures.SVGEllipseFigure;
import org.jhotdraw.samples.svg.figures.SVGPathFigure;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author lake
 */
public class DefaultDrawingViewTest {
     DefaultDrawingView instance;
    
    public DefaultDrawingViewTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       DrawingEditor editor = new DefaultDrawingEditor();
       instance = new DefaultDrawingView();
        instance.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(instance);
        
      
        
    }
    
    @After
    public void tearDown() {
    }

 
    /**
     * Test of getDrawing method, of class DefaultDrawingView.
     */
    @Test
    public void testGetDrawing() {
        System.out.println("getDrawing");
        //Best case scenario where current drawing is not null
        assertNotNull(instance.getDrawing());
    }

    /**
     * Test of getSortedFigures method, of class DefaultDrawingView.
     */
    @Test
    public void testGetSortedFigures() {
        System.out.println("getSortedFigures");
       //Sorted Figures can be one of these types
        Set<Figure> expResult = instance.getSelectedFigures();
        List result = instance.getSortedFigures();
        if(expResult instanceof SVGRectFigure) {
        assertEquals(expResult, result);
        } else if(expResult instanceof SVGEllipseFigure ) {
             assertEquals(expResult, result);
        } else if(expResult instanceof SVGPathFigure) {
              assertEquals(expResult, result);
        }
     
        
    }

  
    @Test
    public void testGetDeletedFigures() {
        System.out.println("getDeletedFigures");
       
        List result = instance.getDeletedFigures();
        assertNotNull(result);
            
        
      
    }

    /**
     * Test of getDeletedIndices method, of class DefaultDrawingView.
     * The important part of this testing that it shows the deleted indices have a value of -1
     * That must mean a value less -1 or greater is invalid to be deleted figure indices
     */
    @Test
    public void testGetDeletedIndices() {
        System.out.println("getDeletedIndices");  
        List<Figure> deletedFigures = instance.getDeletedFigures();
        int[] result = instance.getDeletedIndices(deletedFigures);
         
     
        }
       
        // TODO review the generated test code and remove the default call to fail.
       
    

    
  
  
    
   

 
    /**
     * Test of getDeleteDrawingEvent method, of class DefaultDrawingView.
     * 
     */
    @Test
    public void testGetDeleteDrawingEvent() {
        System.out.println("getDeleteDrawingEvent");
        
        List<Figure> deletedFigures = instance.getDeletedFigures();
      
        instance.getDeleteDrawingEvent(deletedFigures);
      
    }

  

    /**
     * Test of getDuplicateMap method, of class DefaultDrawingView.
     */
    @Test
    public void testGetDuplicateMap() {
        //Testing Invariant
        //Asserting if the object is null
        System.out.println("getDuplicateMap");
    
        HashMap<Figure, Figure> expResult = null;
        HashMap<Figure, Figure> result = instance.getDuplicateMap();
     
        assertEquals(expResult, result);
        assertNotNull(result);
    
    
    }

    /**
     * Test of getDuplicateArray method, of class DefaultDrawingView.
     */
    @Test
    public void testGetDuplicateArray() {
        System.out.println("getDuplicateArray");
        ArrayList<Figure> expResult = null;
        ArrayList<Figure> result = instance.getDuplicateArray();
        assertNotEquals(expResult, result);
        
        
    }


    /**
     * Test of getDrawingEvent method, of class DefaultDrawingView.
     */
    @Test
    public void testGetDrawingEvent() {
        System.out.println("getDrawingEvent");
        ArrayList<Figure> duplicates = instance.getDuplicateArray();
        instance.getDrawingEvent(duplicates);
     
    }

  
  
    
}
