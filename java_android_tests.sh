./gradlew app:packageDebugUniversalApk java:assembleDebugAndroidTest
adb install -r -t app/build/outputs/universal_apk/debug/app-debug-universal.apk
adb install -r -t features/java/build/outputs/apk/androidTest/debug/java-debug-androidTest.apk
adb shell am instrument -w -r -e debug false com.google.android.samples.dynamicfeatures.ondemand.java.test/androidx.test.runner.AndroidJUnitRunner
