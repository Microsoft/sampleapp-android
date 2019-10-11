package ms.appcenter.sampleapp.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class WelcomeActivity extends Fragment {
    private static final String pageName = "Welcome";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.welcome_root, container, false);
        return rootView;
    }

    public static WelcomeActivity newInstance() {
        Bundle args = new Bundle();
        WelcomeActivity fragment = new WelcomeActivity();
        fragment.setArguments(args);
        return fragment;
    }

    public static CharSequence getPageName() {
        return pageName;
    }
}
