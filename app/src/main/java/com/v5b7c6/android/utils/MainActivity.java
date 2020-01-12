package com.v5b7c6.android.utils;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


        textView.setText(getInfo());
    }

    private String getInfo() {
        return "AppName：" + AppUtils.getAppName() + "\n"
                + "VersionName：" + AppUtils.getVersionName() + "\n"
                + "VersionCode：" + AppUtils.getVersionCode() + "\n"
                + "DeviceRoot：" + DeviceUtils.isDeviceRoot() + "\n"
                + "AndroidID：" + DeviceUtils.getAndroidID() + "\n"
                + "Manufacturer：" + DeviceUtils.getManufacturer() + "\n"
                + "Model：" + DeviceUtils.getModel() + "\n"
                + "SDKVersionName：" + DeviceUtils.getSDKVersionName() + "\n"
                + "SDKVersion：" + DeviceUtils.getSDKVersion() + "\n"
                + "NetworkConnected：" + NetworkUtils.isNetworkConnected() + "\n"
                + "NetworkType：" + NetworkUtils.getNetworkType() + "\n"
                + "ScreenWidth：" + ScreenUtils.getScreenWidth() + "\n"
                + "ScreenHeight：" + ScreenUtils.getScreenHeight() + "\n"
                + "AppScreenWidth：" + ScreenUtils.getAppScreenWidth() + "\n"
                + "AppScreenHeight：" + ScreenUtils.getAppScreenHeight() + "\n"
                + "ScreenDensity：" + ScreenUtils.getScreenDensity() + "\n"
                + "ScreenDensityDpi：" + ScreenUtils.getScreenDensityDpi() + "\n"
                + "checkPhone（15711095907）：" + RegexUtils.checkPhone("15711095907");
    }
}
