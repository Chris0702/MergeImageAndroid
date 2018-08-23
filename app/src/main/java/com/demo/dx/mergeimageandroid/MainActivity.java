package com.demo.dx.mergeimageandroid;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.dx.mergeimageandroid.define.Constants;
import com.demo.dx.mergeimageandroid.fragment.MainWebViewFragment;
import com.demo.dx.mergeimageandroid.tool.Factory;
import com.demo.dx.mergeimageandroid.tool.Model;

import java.io.FileNotFoundException;

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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //藉由requestCode判斷是否為開啟相機或開啟相簿而呼叫的，且data不為null
        if (requestCode == Constants.PHOTO && data != null) {
            //取得照片路徑uri
            Uri uri = data.getData();
            ContentResolver cr = getContentResolver();
            try {
                //讀取照片，型態為Bitmap
                Bitmap bmp = BitmapFactory.decodeStream(cr.openInputStream(uri));

//                bmp.toString()
//                Bitmap2Bytes(bmp)
//                controlModel.toastString("uri  "+uri);
                byte[] imageByte =controlModel.Bitmap2Bytes(bmp);


                mainWebViewFragment.receiveImage(new String(imageByte));
//                controlModel.toastString("resrers");

            } catch (FileNotFoundException e) {
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
