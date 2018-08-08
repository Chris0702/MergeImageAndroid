package com.demo.dx.mergeimageandroid.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.demo.dx.mergeimageandroid.define.Constants;
import com.demo.dx.mergeimageandroid.tool.Factory;
import com.demo.dx.mergeimageandroid.tool.Model;
import com.demo.dx.mergeimageandroid.R;
import com.demo.dx.mergeimageandroid.tool.JavaScriptInterface;
import com.demo.dx.mergeimageandroid.tool.StringProcess;


/**
 * Created by Chris.Wu on 2016/11/1.
 */
public class MainWebViewFragment extends Fragment {
    private WebView mainWebView;
    private Model controlModel;
    private Factory factory = Factory.getInstance();
    private JavaScriptInterface controlJavaScriptInterface;
    private ScrollView mainWebViewScroll;
    private boolean isAlarmSummary;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View returnView = inflater.inflate(R.layout.main_webview, container, false);
//        isAlarmSummary=false;
        createObj(returnView);
//        setListener();
//        controlModel.logSystemInfoDB();
        return returnView;
    }

    @Override
    public void onResume() {
        Log.d("debug","MainWebViewFragment    onResume");
        super.onResume();
    }

    public void setIsAlarmSummary(boolean status)
    {
        isAlarmSummary=status;
    }

    public boolean getIsAlarmSummary(boolean status)
    {
        return isAlarmSummary;
    }

    public void goToLoginPage()
    {
        controlJavaScriptInterface.changePage(StringProcess.getChangePageURL(Constants.HOME_PAGE_NAME));
    }

    private void createObj(View view) {
        //factory = new Factory();
        controlModel = factory.createModel(getActivity());
        mainWebView = (WebView) view.findViewById(R.id.mainWebviewContent);
        mainWebViewScroll = ((ScrollView) view.findViewById(R.id.mainWebviewScroll));
        controlJavaScriptInterface = factory.createJavaScriptInterface(getActivity(), mainWebView, controlModel,mainWebViewScroll);

    }

}
