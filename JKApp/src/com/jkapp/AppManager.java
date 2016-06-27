package com.jkapp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class AppManager {

	 public static String getVersion(Context context) {
		 try {
	          PackageManager manager = context.getPackageManager();
	          PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
	          String version = info.versionName;
	          return version;
	     } catch (Exception e) {
	         e.printStackTrace();
	         return "1.0.0";
		 }
	 }
}
