package com.skplanet.simplenote;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.pressBack;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.closeSoftKeyboard;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isEnabled;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import android.test.ActivityInstrumentationTestCase2;
import junit.framework.TestCase;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {
	public MainActivityTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		getActivity();
	}

	public void testClickAndButtonEnable() {
		onView(withId(R.id.button2))
			.perform(click())
			.check(matches(not(isEnabled())));
	}
	
	public void testHelpMe() {
		onView(withId(R.id.editText1)).perform(typeText("userid"));
		onView(withId(R.id.editText2)).perform(typeText("password"));
		onView(withId(R.id.button1)).check(matches(withText("Button")));
	}

	public void testFixMe() {
		assertEquals(5, 2 + 3);
	}
}
