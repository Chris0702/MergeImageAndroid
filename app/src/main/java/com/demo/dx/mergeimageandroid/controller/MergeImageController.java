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
                getMergeImageAllSrc();
                break;
            case Constants.MERGE_IMAGE_EXE_COMMAND:
                mergeImageExe(arg[0].toString(),arg[1].toString());
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

    private void mergeImageExe(String mergeImageArr, String targetImage){
        mergeImageArr=StringProcess.filter(mergeImageArr,Constants.BACKSLASH_CHAR);
        targetImage=StringProcess.filter(targetImage,Constants.BACKSLASH_CHAR);
        controlHttpClient.mergeImage(mergeImageArr,targetImage,this);
    }

    private void getMergeImageAllSrc(){
        controlHttpClient.getLocalPathAll(Constants.MERGE_IMAGE_FOLDER,this);
    }

    public void getLocalPathAllResponse(final String receiveMessage){
//        controlModel.toastString(receiveMessage);
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
                String setMergeImageAllUrl = StringProcess.getJavascriptFunctionStringByArrayStringAndString(Constants.IMAGE_ARRAY, receiveMessage, Constants.SERVER_URL_STRING, Constants.SERVER_URL, Constants.SET_MERGE_IMAGE_ALL_JAVASCRIPT);
                Log.d("debug", "setMergeImageAllUrl ok       " + setMergeImageAllUrl);
                mainWebView.loadUrl(setMergeImageAllUrl);
                Log.d("debug", "setMergeImageAllUrl ok");
            }
        });
    }

    public void mergeImageExeResponse(final String receiveMessage){
        if (controlModel.getHttpResult(receiveMessage)) {
//                controlModel.toastString("server is exist");

            controlActivity.runOnUiThread(new Runnable() {
                //  @Override
                public void run() {
                    String result = controlModel.getJSONProtString(Constants.RES_STRING_REST_API, receiveMessage);
                    String setMergeImageResultUrl = StringProcess.getJavascriptFunctionStringByString(Constants.RESULT, result, Constants.SERVER_URL_STRING, Constants.SERVER_URL, Constants.SET_MERGE_IMAGE_RESULT_JAVASCRIPT);
                    Log.d("debug", "setMergeImageResultUrl ok       " + setMergeImageResultUrl);
                    mainWebView.loadUrl(setMergeImageResultUrl);
                    Log.d("debug", "setMergeImageResultUrl ok");
                }
            });
        } else {
            controlModel.toastString("merge fail");
        }



    }
}
