package com.example.kmklein.dimsum;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by kmklein on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
    }

    public void test_first() {
        mainActivity = getActivity();

        assertEquals(0, mainActivity.sum(0, 0));
    }
}
