/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ow2.pajri.tests;

import org.junit.Test;
import org.ow2.pajri.PAJRIFactory;


/**
 * Tests that the message of warning() is printed in the error writer
 *
 * @author Activeeon Team
 */
public class TestWarningInScript extends testabstract.TestWarningInScript {

    @Test
    public void test() throws Exception {
        super.test(PAJRIFactory.ENGINE_NAME);
    }

}
