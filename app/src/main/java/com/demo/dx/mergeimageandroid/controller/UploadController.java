package com.demo.dx.mergeimageandroid.controller;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;

import com.demo.dx.mergeimageandroid.define.Constants;
import com.demo.dx.mergeimageandroid.tool.JavaScriptInterface;
import com.demo.dx.mergeimageandroid.tool.StringProcess;

public class UploadController extends Controller{

    public UploadController(Activity activity, WebView webView, JavaScriptInterface javaScriptInterface, String pageName) {
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
            case Constants.SELECT_IMAGE_FILE_COMMAND:
                selectImageFile();
//                controlModel.logServerDB();
//                getFunctionList();
                break;
            default:
        }
    }

    private void updateWebView() {
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.getSettings().setDomStorageEnabled(true);
        mainWebView.loadUrl(Constants.UPLOAD_WEB_URL);
        mainWebView.addJavascriptInterface(controlJavaScriptInterface, Constants.ANDROID_PARAMETER_FOR_JAVASCRIPT);
    }

    public void selectImageFile(){
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
                controlModel.toastString("selectImageFile");
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                controlActivity.startActivityForResult(intent, Constants.PHOTO);
            }
        });
    }

    public void receiveImage(final String imageByte){
        controlModel.toastString("upload img receive　222");

//        controlActivity.runOnUiThread(new Runnable() {
//            //  @Override
//            public void run() {
//                uploadImage(imageByte);
//            }
//        });
        controlHttpClient.uploadImage(imageByte,this);
    }

    private void uploadImage(String imageByte){
        controlHttpClient.uploadImage(imageByte,this);
    }

    public void uploadImageResponse(final String receiveMessage){
        if (controlModel.getHttpResult(receiveMessage)) {
            controlModel.toastString("圖片上傳成功");
        } else {
            controlModel.toastString("圖片上傳失敗");
        }
    }

}
