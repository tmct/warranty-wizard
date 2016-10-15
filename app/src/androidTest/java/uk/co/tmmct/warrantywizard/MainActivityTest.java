package uk.co.tmmct.warrantywizard;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    public static final String HELLO_WORLD = "Hello World!";

    /**
     * Run MainActivity every time
     */
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void buttonSaysHelloWorld() throws Exception {
        onView(withId(R.id.hello))
                .check(matches(withText(HELLO_WORLD)));
    }
}
