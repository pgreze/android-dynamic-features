# Test of instrumented tests

When using Android Studio to run app android tests, no issues but when running ./run_app_android_tests.sh:

```
INSTRUMENTATION_STATUS: class=com.google.android.samples.dynamicfeatures.MainActivityTest
INSTRUMENTATION_STATUS: current=1
INSTRUMENTATION_STATUS: id=AndroidJUnitRunner
INSTRUMENTATION_STATUS: numtests=2
INSTRUMENTATION_STATUS: stream=
com.google.android.samples.dynamicfeatures.MainActivityTest:
INSTRUMENTATION_STATUS: test=navigateToJava
INSTRUMENTATION_STATUS_CODE: 1
INSTRUMENTATION_STATUS: class=com.google.android.samples.dynamicfeatures.MainActivityTest
INSTRUMENTATION_STATUS: current=1
INSTRUMENTATION_STATUS: id=AndroidJUnitRunner
INSTRUMENTATION_STATUS: numtests=2
INSTRUMENTATION_STATUS: stack=androidx.test.espresso.base.DefaultFailureHandler$AssertionFailedWithCauseError: Wanted to match 1 intents. Actually matched 0 intents.

IntentMatcher: has component: has component with: class name: is "com.google.android.samples.dynamicfeatures.ondemand.JavaSampleActivity" package name: an instance of java.lang.String short class name: an instance of java.lang.String

Matched intents:[]

Recorded intents:[]
	at dalvik.system.VMStack.getThreadStackTrace(Native Method)
	at java.lang.Thread.getStackTrace(Thread.java:1720)
	at androidx.test.espresso.base.DefaultFailureHandler.getUserFriendlyError(DefaultFailureHandler.java:96)
	at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:59)
	at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:324)
	at androidx.test.espresso.ViewInteraction.check(ViewInteraction.java:306)
	at androidx.test.espresso.intent.Intents.intended(Intents.java:190)
	at androidx.test.espresso.intent.Intents.intended(Intents.java:170)
	at com.google.android.samples.dynamicfeatures.MainActivityTest.navigateToJava(MainActivityTest.kt:25)
	at java.lang.reflect.Method.invoke(Native Method)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at androidx.test.rule.ActivityTestRule$ActivityStatement.evaluate(ActivityTestRule.java:531)
	at org.junit.rules.RunRules.evaluate(RunRules.java:20)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at androidx.test.ext.junit.runners.AndroidJUnit4.run(AndroidJUnit4.java:104)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at androidx.test.internal.runner.TestExecutor.execute(TestExecutor.java:56)
	at androidx.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:392)
	at android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:2189)
Caused by: junit.framework.AssertionFailedError: Wanted to match 1 intents. Actually matched 0 intents.

IntentMatcher: has component: has component with: class name: is "com.google.android.samples.dynamicfeatures.ondemand.JavaSampleActivity" package name: an instance of java.lang.String short class name: an instance of java.lang.String

Matched intents:[]

Recorded intents:[]
	at junit.framework.Assert.fail(Assert.java:50)
	at androidx.test.espresso.intent.VerificationModes$Times.verify(VerificationModes.java:80)
	at androidx.test.espresso.intent.Intents.internalIntended(Intents.java:346)
	at androidx.test.espresso.intent.Intents$2.check(Intents.java:194)
	at androidx.test.espresso.ViewInteraction$SingleExecutionViewAssertion.check(ViewInteraction.java:425)
	at androidx.test.espresso.ViewInteraction$2.call(ViewInteraction.java:288)
	at androidx.test.espresso.ViewInteraction$2.call(ViewInteraction.java:272)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at android.os.Handler.handleCallback(Handler.java:883)
	at android.os.Handler.dispatchMessage(Handler.java:100)
	at android.os.Looper.loop(Looper.java:214)
	at android.app.ActivityThread.main(ActivityThread.java:7356)
	at java.lang.reflect.Method.invoke(Native Method)
	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)

INSTRUMENTATION_STATUS: stream=
Error in navigateToJava(com.google.android.samples.dynamicfeatures.MainActivityTest):
androidx.test.espresso.base.DefaultFailureHandler$AssertionFailedWithCauseError: Wanted to match 1 intents. Actually matched 0 intents.
```

About Java or kotlin dynamic feature module, Android Studio cannot be used due to this issue:
https://issuetracker.google.com/issues/115569342
and when running from ./run_kotlin_android_tests.sh:

```
INSTRUMENTATION_STATUS: class=com.google.android.samples.dynamicfeatures.ondemand.KotlinSampleActivityTest
INSTRUMENTATION_STATUS: current=1
INSTRUMENTATION_STATUS: id=AndroidJUnitRunner
INSTRUMENTATION_STATUS: numtests=1
INSTRUMENTATION_STATUS: stream=
com.google.android.samples.dynamicfeatures.ondemand.KotlinSampleActivityTest:
INSTRUMENTATION_STATUS: test=display
INSTRUMENTATION_STATUS_CODE: 1
INSTRUMENTATION_STATUS: class=com.google.android.samples.dynamicfeatures.ondemand.KotlinSampleActivityTest
INSTRUMENTATION_STATUS: current=1
INSTRUMENTATION_STATUS: id=AndroidJUnitRunner
INSTRUMENTATION_STATUS: numtests=1
INSTRUMENTATION_STATUS: stack=java.lang.IllegalStateException: This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.
	at androidx.appcompat.widget.ResourceManagerInternal.checkVectorDrawableSetup(ResourceManagerInternal.java:507)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:137)
	at androidx.appcompat.widget.AppCompatDrawableManager.getDrawable(AppCompatDrawableManager.java:411)
	at androidx.appcompat.widget.TintTypedArray.getDrawableIfKnown(TintTypedArray.java:86)
	at androidx.appcompat.app.AppCompatDelegateImpl.attachToWindow(AppCompatDelegateImpl.java:647)
	at androidx.appcompat.app.AppCompatDelegateImpl.ensureWindow(AppCompatDelegateImpl.java:623)
	at androidx.appcompat.app.AppCompatDelegateImpl.onCreate(AppCompatDelegateImpl.java:350)
	at androidx.appcompat.app.AppCompatActivity.onCreate(AppCompatActivity.java:105)
	at com.google.android.samples.dynamicfeatures.ondemand.KotlinSampleActivity.onCreate(KotlinSampleActivity.kt:27)
	at android.app.Activity.performCreate(Activity.java:7802)
	at android.app.Activity.performCreate(Activity.java:7791)
	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
	at androidx.test.runner.MonitoringInstrumentation.callActivityOnCreate(MonitoringInstrumentation.java:702)
	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
	at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
	at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
	at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
	at android.os.Handler.dispatchMessage(Handler.java:107)
	at android.os.Looper.loop(Looper.java:214)
	at android.app.ActivityThread.main(ActivityThread.java:7356)
	at java.lang.reflect.Method.invoke(Native Method)
	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)

INSTRUMENTATION_STATUS: stream=
Process crashed while executing display(com.google.android.samples.dynamicfeatures.ondemand.KotlinSampleActivityTest):
java.lang.IllegalStateException: This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.
	at androidx.appcompat.widget.ResourceManagerInternal.checkVectorDrawableSetup(ResourceManagerInternal.java:507)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:137)
	at androidx.appcompat.widget.AppCompatDrawableManager.getDrawable(AppCompatDrawableManager.java:411)
	at androidx.appcompat.widget.TintTypedArray.getDrawableIfKnown(TintTypedArray.java:86)
	at androidx.appcompat.app.AppCompatDelegateImpl.attachToWindow(AppCompatDelegateImpl.java:647)
	at androidx.appcompat.app.AppCompatDelegateImpl.ensureWindow(AppCompatDelegateImpl.java:623)
	at androidx.appcompat.app.AppCompatDelegateImpl.onCreate(AppCompatDelegateImpl.java:350)
	at androidx.appcompat.app.AppCompatActivity.onCreate(AppCompatActivity.java:105)
	at com.google.android.samples.dynamicfeatures.ondemand.KotlinSampleActivity.onCreate(KotlinSampleActivity.kt:27)
	at android.app.Activity.performCreate(Activity.java:7802)
	at android.app.Activity.performCreate(Activity.java:7791)
	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
	at androidx.test.runner.MonitoringInstrumentation.callActivityOnCreate(MonitoringInstrumentation.java:702)
	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
	at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
	at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
	at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
	at android.os.Handler.dispatchMessage(Handler.java:107)
	at android.os.Looper.loop(Looper.java:214)
	at android.app.ActivityThread.main(ActivityThread.java:7356)
	at java.lang.reflect.Method.invoke(Native Method)
	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
```
A ressource error which is similar to another one I'm facing when introducing instrumented tests for another project dynamic feature module:
```
INSTRUMENTATION_STATUS: stack=android.content.res.Resources$NotFoundException: Drawable com.kouzoh.myapplication:id/gone with resource ID #0x7f07005b
Caused by: android.content.res.Resources$NotFoundException: Resource "com.kouzoh.myapplication:id/gone" (7f07005b) is not a Drawable (color or path): TypedValue{t=0x12/d=0x0 a=6 r=0x7f07005b}
	at android.content.res.ResourcesImpl.loadDrawableForCookie(ResourcesImpl.java:814)
	at android.content.res.ResourcesImpl.loadDrawable(ResourcesImpl.java:659)
	at android.content.res.Resources.getDrawableForDensity(Resources.java:906)
	at android.content.res.Resources.getDrawable(Resources.java:845)
	at android.content.Context.getDrawable(Context.java:687)
	at androidx.core.content.ContextCompat.getDrawable(ContextCompat.java:454)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:144)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:132)
	at androidx.appcompat.widget.ResourceManagerInternal.checkVectorDrawableSetup(ResourceManagerInternal.java:504)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:137)
	at androidx.appcompat.widget.AppCompatDrawableManager.getDrawable(AppCompatDrawableManager.java:411)
	at androidx.appcompat.widget.TintTypedArray.getDrawableIfKnown(TintTypedArray.java:86)
	at androidx.appcompat.app.AppCompatDelegateImpl.attachToWindow(AppCompatDelegateImpl.java:647)
	at androidx.appcompat.app.AppCompatDelegateImpl.ensureWindow(AppCompatDelegateImpl.java:623)
	at androidx.appcompat.app.AppCompatDelegateImpl.onCreate(AppCompatDelegateImpl.java:350)
	at androidx.appcompat.app.AppCompatActivity.onCreate(AppCompatActivity.java:105)
	at com.kouzoh.mercari.kyc.KycActivity.onCreate(KycActivity.kt:10)
	at android.app.Activity.performCreate(Activity.java:7802)
	at android.app.Activity.performCreate(Activity.java:7791)
	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
	at androidx.test.runner.MonitoringInstrumentation.callActivityOnCreate(MonitoringInstrumentation.java:702)
	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
	at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
	at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
	at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
	at android.os.Handler.dispatchMessage(Handler.java:107)
	at android.os.Looper.loop(Looper.java:214)
	at android.app.ActivityThread.main(ActivityThread.java:7356)
	at java.lang.reflect.Method.invoke(Native Method)
	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
```

# On-Demand modules codelab

This is the code repository for the [Android On-Demand modules
codelab](https://codelabs.developers.google.com)

Read more at http://g.co/androidappbundle

## Introduction

The sample contains several modules.

## Screenshots

<img src="screenshots/main.png" width="30%" />


## Getting Started

Clone this repository, enter the top level directory and run <code>./gradlew tasks</code>
to get an overview of all the tasks available for this project.

## License

```
Copyright 2018 Google LLC.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```
