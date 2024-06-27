# Test Flutter Module

- Sample code for reported issue on GitHub: https://github.com/firebase/flutterfire/issues/12988

## Instruction Steps:
1. Run `flutter pub get` & `flutter build aar`
2. Replace **{{local_maven_url}}** local maven repository inside Android/settings.gradle.kts
3. Run Android project. The Flutter module contains a loop that will print output when the engine is still alive
4. Click on the floating action button to go back to native screen
5. Observe that Flutter still print the output, in the case that we provide custom FlutterEngine. However, if comment the function `provideFlutterEngine`, the engine stop when we navigate back to native screen.
