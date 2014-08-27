package br.com.vitorteixeira.opensync.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import br.com.vitorteixeira.opensync.R;

/**
 * Created by vitorteixeira on 8/20/14.
 */
public class PathConfigActivityTest extends ActivityInstrumentationTestCase2<PathConfigActivity> {

    private PathConfigActivity mConfigActivity;

    public PathConfigActivityTest() {
        super(PathConfigActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mConfigActivity = getActivity();
    }

    public void testPreconditions() {
        assertNotNull("mConfigActivity is null",mConfigActivity);
    }

    public void testPathConfigTextView_labelText() {
        assertTrue(true);
    }
}
