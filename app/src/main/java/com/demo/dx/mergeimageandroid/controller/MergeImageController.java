package com.demo.dx.mergeimageandroid.controller;

import android.app.Activity;
import android.util.Log;
import android.webkit.WebView;

import com.demo.dx.mergeimageandroid.define.Constants;
import com.demo.dx.mergeimageandroid.tool.JavaScriptInterface;

public class MergeImageController  extends Controller{

    public MergeImageController(Activity activity, WebView webView, JavaScriptInterface javaScriptInterface, String pageName) {
        super(activity, webView, javaScriptInterface, pageName);

    }

    public void executeCtrl() {
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
                updateWebView();
            }
        });
    }

    public void executeCmd(String cmd, Object[] arg) {
        Log.d("debug", "home  exe");
        switch (cmd) {
            case Constants.GET_FUNCTION_LIST_COMMAND:
//                controlModel.logServerDB();
//                getFunctionList();
                break;
            case Constants.GET_LANGUAGE_COMMAND:
//                insertLanguage();
                break;
            default:
        }
    }

    private void updateWebView() {
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.getSettings().setDomStorageEnabled(true);
        mainWebView.loadUrl(Constants.MERGE_IMAGE_WEB_URL);
        mainWebView.addJavascriptInterface(controlJavaScriptInterface, Constants.ANDROID_PARAMETER_FOR_JAVASCRIPT);
    }
}
