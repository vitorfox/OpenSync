package br.com.vitorteixeira.opensync.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import java.lang.reflect.Constructor;

import br.com.vitorteixeira.opensync.R;
import br.com.vitorteixeira.opensync.fragment.PathConfigFragment;

/**
 * Created by vitorteixeira on 8/20/14.
 */
public class GenericFragmentActivity extends FragmentActivity{

    private String mFragment;

    public GenericFragmentActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generic_fragment);
    }

}
