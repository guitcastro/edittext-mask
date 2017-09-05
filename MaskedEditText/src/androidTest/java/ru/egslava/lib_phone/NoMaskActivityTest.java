package ru.egslava.lib_phone;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class NoMaskActivityTest {

    public static final int phone_input = br.com.sapereaude.maskedEditText.test.R.id.vControl;

    @Rule
    public ActivityTestRule<TestNoMaskActivity> mActivityTestRule = new ActivityTestRule<>(TestNoMaskActivity.class);

    @Test
    public void textNoException() {
    }

}
