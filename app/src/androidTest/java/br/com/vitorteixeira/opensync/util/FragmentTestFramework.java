package br.com.vitorteixeira.opensync.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import br.com.vitorteixeira.opensync.R;
import br.com.vitorteixeira.opensync.activity.GenericFragmentActivity;

/**
 * Created by vitorteixeira on 8/27/14.
 */
public abstract class FragmentTestFramework extends ActivityInstrumentationTestCase2<GenericFragmentActivity> {

    protected GenericFragmentActivity mActivity;
    private Fragment frag;

    public FragmentTestFramework() {
        super(GenericFragmentActivity.class);
    }

    @Override
    protected void setUp() throws Exception {

        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.activity_test_fragment_linearlayout, this.getCustomFragment(), "tag");
        transaction.commit();
        getInstrumentation().waitForIdleSync();
        frag = getActivity().getSupportFragmentManager().findFragmentByTag("tag");

    }

    public void testPreconditions(){
        assertNotNull("getSupportFragmentManager fragment is null",frag);
        assertEquals(getCustomFragment().getClass().getName(),frag.getClass().getName());
    }

    protected abstract Fragment getCustomFragment();
}
