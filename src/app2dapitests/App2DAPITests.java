/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
