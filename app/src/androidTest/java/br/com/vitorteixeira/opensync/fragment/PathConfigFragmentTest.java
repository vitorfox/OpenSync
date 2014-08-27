package br.com.vitorteixeira.opensync.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import br.com.vitorteixeira.opensync.R;
import br.com.vitorteixeira.opensync.activity.GenericFragmentActivity;
import br.com.vitorteixeira.opensync.activity.PathConfigActivity;
import br.com.vitorteixeira.opensync.util.FragmentTestFramework;

/**
 * Created by vitorteixeira on 8/20/14.
 */
public class PathConfigFragmentTest extends FragmentTestFramework {

    public TextView mConfigAcitivityText;

    protected void setUp() throws Exception {
        super.setUp();
        mConfigAcitivityText = (TextView) this.getActivity().findViewById(R.id.fragment_path_config_title);
    }

    public void testPreconditions() {
        super.testPreconditions();
        assertNotNull("mConfigAcitivityText is null",mConfigAcitivityText);
    }

    public void testPathConfigTextView_labelText() {
        final String expected = getActivity().getString(R.string.hello_world);
        assertEquals(expected, mConfigAcitivityText.getText().toString());
    }

    @Override
    protected Fragment getCustomFragment() {
        return new PathConfigFragment();
    }
}
