fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew install fastlane`

# Available Actions
## Android
### android unit_tests
```
fastlane android unit_tests
```
Run unit tests
### android build
```
fastlane android build
```
Build
### android distribute_dev
```
fastlane android distribute_dev
```
Deploy latest Debug build to Firebase App Distribution
### android distribute_qa
```
fastlane android distribute_qa
```
Deploy latest Beta build to Firebase App Distribution
### android playstore
```
fastlane android playstore
```
Deploy latest version to Google Play

----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
