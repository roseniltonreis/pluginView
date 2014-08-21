/*
 * PhoneGap is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 *
 * Copyright (c) 2005-2010, Nitobi Software Inc.
 * Copyright (c) 2011, IBM Corporation
 */

package com.phonegap.plugins.viewer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;


public class Viewer extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args,
                    CallbackContext callbackContext) throws JSONException {
    	System.out.println("Teste");

    }

}

