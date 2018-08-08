package com.demo.dx.mergeimageandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.dx.mergeimageandroid.fragment.MainWebViewFragment;
import com.demo.dx.mergeimageandroid.tool.Factory;
import com.demo.dx.mergeimageandroid.tool.Model;

public class MainActivity extends AppCompatActivity {
    private Factory factory = Factory.getInstance();
    private Model controlModel;
    private MainWebViewFragment mainWebViewFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createObj();
        setMainFragment();
        setContentView(R.layout.activity_main);
    }
    private void createObj() {
        //factory = new Factory();
        controlModel = factory.createModel(this);
        mainWebViewFragment = factory.createMainWebViewFragment();
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        controlModel.setLoadingViewSize(Constants.WIDTH_LOADING_VIEW,Constants.HEIGHT_LOADING_VIEW);
    }

    private void setMainFragment() {
        controlModel.changeFragment(getFragmentManager(), R.id.content_main, mainWebViewFragment);
    }
}
