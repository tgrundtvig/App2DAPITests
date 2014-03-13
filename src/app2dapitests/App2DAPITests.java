package app2dapitests;

import app2dapi.App2D;
import app2dapi.Platform;
import app2dapitests.app1.App1;
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
        p.runApplication(a);
    }
}
