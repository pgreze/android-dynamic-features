./gradlew app:packageDebugUniversalApk app:assembleDebugAndroidTest
adb install -r -t app/build/outputs/universal_apk/debug/app-debug-universal.apk
adb install -r -t app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk
adb shell am instrument -w -r -e debug false com.google.android.samples.dynamicfeatures.ondemand.test/androidx.test.runner.AndroidJUnitRunner
