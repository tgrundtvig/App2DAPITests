package app2dapitests;

import app2dapi.App2D;
import app2dapi.Platform;
import app2dapitests.app1.App1;
import app2dapitests.app2.App2;
import app2dpcimpl.PCPlatformImpl;

/**
 *
 * @author tog
 */
public class App2DAPITests
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Platform p = new PCPlatformImpl();
        App2D a = new App1();
        App2D b = new App2();
        p.runApplication(b);
        p.runApplication(a);
    }
}
