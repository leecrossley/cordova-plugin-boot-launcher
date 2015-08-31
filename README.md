# Boot Launcher

Launch your Apache Cordova Android app automatically when the device is booted.

## Install

1. Fork this repository

2. In `src/android/BootLauncher.java` line 13, replace `uk.co.ilee.CordovaApp.class` with `[YOUR_APP_ID].CordovaApp.class`. YOUR_APP_ID is the reverse domain-style identifier you used when you created your cordova project.

3. Add your forked plugin via the CLI:

```
cordova plugin add https://github.com/[YOUR_USERNAME]/cordova-plugin-boot-launcher.git
```

## Notes about main activity class name

Cordova/Phonegap seems to act differently based on the environment when generating the value you must set on the step 2. For example, if you are using Phonegap Build, it's useful if the class name is `[ your app id].[your app name].class`. For example, if your app id is "com.example.app" and your app name is "My Cool App", then the class name will be "com.example.app.MyCoolApp.class" (note that the spaces are removed). However, if you are using Cordova from CLI, it's supposed to use the format `[your app id].MainActivity.class` (on the example above, it would be com.example.app.MainActivity.class).

Anyway, it's easy to get the class name by reading the AndroidManifest.xml. You will find your app id on the tag `<manifest>`, attribute `package`, and the activity name on the tag `<activity>`, attribute `android:name`.

![Where to find](http://i.stack.imgur.com/62gX6.png)

## Platforms

Android only.

## License

[MIT License](http://ilee.mit-license.org)
