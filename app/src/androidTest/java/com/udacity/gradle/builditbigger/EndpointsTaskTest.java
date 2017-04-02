package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;

import static java.security.AccessController.getContext;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;


/**
 * Created by avinashdavid on 3/1/17.
 */

public class EndpointsTaskTest extends AndroidTestCase {

    public void testAsync(){
        try {
            String returnString = new EndpointsAsyncTask().execute(getContext()).get();
            Log.e("TEST",returnString);
            assertNotNull(returnString);
            assertTrue(returnString.length()>0);
        } catch (Exception e){
            Log.e("TEST",e.getMessage());
        }
    }
}
