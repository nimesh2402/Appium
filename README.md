# Appium

APPIUM Design Concepts
Appium is an 'HTTP Server' written using Node.js platform and drives iOS and Android session using Webdriver JSON wire protocol. Hence, before initializing the Appium Server, Node.js must be pre-installed on the system.
When Appium is downloaded and installed, then a server is setup on our machine that exposes a REST API.
It receives connection and command request from the client and execute that command on mobile devices (Android / iOS).
It responds back with HTTP responses. Again, to execute this request, it uses the mobile test automation frameworks to drive the user interface of the apps. Framework like:-
Apple Instruments for iOS (Instruments are available only in Xcode 3.0 or later with OS X v10.5 and later)
Google UIAutomator for Android API level 16 or higher
Selendroid for Android API level 15 or less
Prerequisite to use APPIUM
ANDROID SDK [Link]-
JDK (Java Development Kit) [Link]
TestNG [Link]
Eclipse [Link]
Selenium Server JAR [Link]
Webdriver Language Binding Library [Link]
APPIUM For Windows [Link]
APK App Info On Google Play [Link]
Node.js (Not Required - Whenever Appium server is installed, it by default comes with "Node.exe" & NPM. It's included in Current version of Appium.)      
