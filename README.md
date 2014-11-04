# Boot Launcher

## Install

1. Fork this repository

2. In `src/android/BootLauncher.java` line 13, replace `uk.co.ilee.CordovaApp.class` with `[YOUR_APP_ID].CordovaApp.class`. YOUR_APP_ID is the reverse domain-style identifier you used when you created your cordova project.

3. Add your forked plugin via the CLI:

```
cordova plugin add https://github.com/[YOUR_USERNAME]/cordova-plugin-boot-launcher.git
```

## Platforms

Android only.

## License

[MIT License](http://ilee.mit-license.org)
