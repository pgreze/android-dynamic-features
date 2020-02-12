./gradlew app:packageDebugUniversalApk kotlin:assembleDebugAndroidTest
adb install -r -t app/build/outputs/universal_apk/debug/app-debug-universal.apk
adb install -r -t features/kotlin/build/outputs/apk/androidTest/debug/kotlin-debug-androidTest.apk
adb shell am instrument -w -r -e debug false com.google.android.samples.dynamicfeatures.ondemand.kotlin.test/androidx.test.runner.AndroidJUnitRunner
