/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.swing.Action;
import org.jhotdraw.geom.Dimension2DDouble;
import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;

/**
 *
 * @author lake
 */
 public class DeletedFigure {
 private static List<Figure> figure = null;
 
  public static List<Figure> getInstance()
    {
       
           
        return figure;
    
    }
}

