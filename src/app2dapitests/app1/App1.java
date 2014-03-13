package app2dapitests.app1;

import app2dapi.App2D;
import app2dapi.Device;
import app2dapi.geometry.G2D;
import app2dapi.geometry.G2D.Polygon;
import app2dapi.geometry.G2D.PolygonBuilder;
import app2dapi.graphics.Canvas;
import app2dapi.graphics.ColorFactory;
import app2dapi.input.mouse.MouseListener;
import app2dapi.input.mouse.MouseMovedEvent;
import app2dapi.input.mouse.MousePressedEvent;
import app2dapi.input.mouse.MouseReleasedEvent;
import app2dapi.input.mouse.MouseWheelEvent;

/**
 *
 * @author tog
 */
public class App1 implements App2D, MouseListener
{
    private Polygon p;
    private ColorFactory cf;
    private Polygon arrow;
    private G2D geo;
    
    @Override
    public boolean initialize(Device device)
    {
        device.getMouse().addMouseListener(this);
        this.geo = device.getGeometry2D();
        PolygonBuilder bld = geo.getPolygonBuilder();
        bld.addPoint(geo.newPoint2D(10, 10));
        bld.addPoint(geo.newPoint2D(110, 10));
        bld.addPoint(geo.newPoint2D(60, 60));
        p = bld.build();
        arrow = null; //geo.createArrow(geo.newPoint2D(60, 60), geo.newPoint2D(400, 200), 10);
        cf = device.getScreen().getColorFactory();
        return true;
    }

    @Override
    public boolean update(double time)
    {
        return true;
    }

    @Override
    public void draw(Canvas canvas)
    {
        //Transformation2D t = geo.translate(100, 50);
        //canvas.setTransformation(t);
        canvas.clear(cf.getWhite());
        canvas.setColor(cf.getBlack());
        canvas.drawFilledPolygon(p);
        if(arrow != null)
        {
            canvas.setColor(cf.getGreen());
            canvas.drawFilledPolygon(arrow);
        }
        canvas.setColor(cf.getRed());
        canvas.drawPoint(geo.newPoint2D(400,400), 20);
    }

    @Override
    public void destroy()
    {
        //Do nothing
    }

    @Override
    public void onMouseMoved(MouseMovedEvent e)
    {
        arrow = geo.createArrow(geo.newPoint2D(60, 60), geo.newPoint2D(e.getX(), e.getY()), 10);
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
