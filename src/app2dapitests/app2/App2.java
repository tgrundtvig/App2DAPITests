/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2dapitests.app2;

import app2dapi.App2D;
import app2dapi.Device;
import app2dapi.geometry.G2D;
import app2dapi.graphics.Canvas;
import app2dapi.graphics.ColorFactory;
import app2dapi.input.mouse.MouseListener;
import app2dapi.input.mouse.MouseMovedEvent;
import app2dapi.input.mouse.MousePressedEvent;
import app2dapi.input.mouse.MouseReleasedEvent;
import app2dapi.input.mouse.MouseWheelEvent;

/**
 *
 * @author Tobias Grundtvig
 */
public class App2 implements App2D, MouseListener
{
    private G2D g2d;
    private ColorFactory cf;
    private G2D.Point2D mousePos;

    @Override
    public boolean initialize(Device device)
    {
        g2d = device.getGeometry2D();
        cf = device.getScreen().getColorFactory();
        mousePos = g2d.origo();
        device.getMouse().addMouseListener(this);
        return true;
    }
    
    @Override
    public boolean showMouseCursor()
    {
        return false;
    }

    @Override
    public boolean update(double time)
    {
        return true;
    }

    @Override
    public void draw(Canvas canvas)
    {
        canvas.clear(cf.getWhite());
        canvas.setColor(cf.getBlack());
        canvas.drawLine(g2d.origo(), mousePos);
    }

    @Override
    public void destroy()
    {
        
    }

    @Override
    public void onMouseMoved(MouseMovedEvent e)
    {
        mousePos = g2d.newPoint2D(e.getX(), e.getY());
    }

    @Override
    public void onMousePressed(MousePressedEvent e)
    {
        
    }

    @Override
    public void onMouseReleased(MouseReleasedEvent e)
    {
        
    }

    @Override
    public void onMouseWheel(MouseWheelEvent e)
    {
        
    }
    
}
