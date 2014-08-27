package br.com.vitorteixeira.opensync.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.vitorteixeira.opensync.R;

/**
 * Created by vitorteixeira on 8/20/14.
 */
public class PathConfigFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_path_config, container, false);
        return rootView;
    }
}
