package com.highnoon.jazzlink;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by bilal.nazir on 2/26/2018.
 */

public class viewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);

        return true; // as mentioned in below notes, for your case., you do 'return false'
    }

}
