package com.example.kmklein.lab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.kmklein.lab3.MainActivity;
import com.example.kmklein.lab3.R;

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

        assertEquals(0, sum(0, 0));
    }
}
