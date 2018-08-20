package com.demo.dx.mergeimageandroid.controller;

import android.app.Activity;
import android.util.Log;
import android.webkit.WebView;

import com.demo.dx.mergeimageandroid.define.Constants;
import com.demo.dx.mergeimageandroid.tool.JavaScriptInterface;
import com.demo.dx.mergeimageandroid.tool.StringProcess;

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
        Log.d("debug", "mergeimage  exe");
        switch (cmd) {
            case Constants.GET_MERGE_IMAGE_ALL_SRC_COMMAND:
//                controlModel.logServerDB();
//                getFunctionList();
                getMergeImageAllSrc();
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

    private void getMergeImageAllSrc(){
        controlHttpClient.getLocalPathAll(Constants.MERGE_IMAGE_FOLDER,this);
    }

    public void getLocalPathAllResponse(final String receiveMessage){
//        controlModel.toastString(result);
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
//                String setMergeImageAllUrl = StringProcess.getJavascriptFunctionStringBy1WayStringArrayString(receiveMessage, Constants.IMAGE_ARRAY, Constants.SET_MERGE_IMAGE_ALL_JAVASCRIPT);
                String setMergeImageAllUrl = StringProcess.getJavascriptFunctionStringByArrayStringAndString(Constants.IMAGE_ARRAY, receiveMessage, Constants.SERVER_URL_STRING, Constants.SERVER_URL, Constants.SET_MERGE_IMAGE_ALL_JAVASCRIPT);
                Log.d("debug", "setMergeImageAllUrl ok       " + setMergeImageAllUrl);
                mainWebView.loadUrl(setMergeImageAllUrl);
                Log.d("debug", "setMergeImageAllUrl ok");
            }
        });
    }
}
