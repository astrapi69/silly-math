## Change log
----------------------

Version 2.3
-------------

ADDED:

- new class Fibonacci for resolve fibonacci numbers
- new required version info for dependency 'org.junit.platform:junit-platform-launcher' in current version 1.10.0

CHANGED:

- update of gradle to new version 8.4
- update dependency of com.github.ben-manes.versions.gradle.plugin to new version 0.49.0
- update of gradle-plugin dependency 'org.ajoberstar.grgit:grgit-gradle' to new version 5.2.1
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.22.0
- update of test dependency meanbean to the new milestone version 3.0.0-M9
- update of test dependency junit-juniper-api to new version 5.10.0

Version 2.2
-------------

ADDED:

- new test dependency junit-jupiter-params for enable parameterized unit tests
- new parameterized unit test class MathExtensionsParameterizedTest

CHANGED:

- update of jdk to version 11
- update of gradle to new version 7.5.1
- update of test dependencies of junit-jupiter to new version 5.9.0

Version 2.1
-------------

ADDED:

- new method for the formula from rule of three in a proportional manner created
- new jar area for generate manifest file in generated jar file

CHANGED:

- update gradle to new version 6.8
- update dependency of com.github.ben-manes.versions.gradle.plugin to new version 0.42.0
- update of test dependencies of junit-jupiter to new version 5.8.2
- code coverage increased to 100%
- extracted project gradle plugin versions from buildscript area in to gradle.properties
- change provider of code coverage to codecov.io

Version 1.4
-------------

ADDED:

- new class for handle boolean values

CHANGED:

- update gradle to new version 6.9
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.39.0
- update test-dependency junit-jupiter (junit 5) to new version 5.7.2
- changed to new package io.github.astrapi69

Version 1.3
-------------

ADDED:

- new method for the formula from rule of three in a proportional manner created
- new jar area for generate manifest file in generated jar file

CHANGED:

- update gradle to new version 6.6.1
- code coverage increased to 100%
- extracted project gradle plugin versions from buildscript area in to gradle.properties
- update test-dependency junit-jupiter (junit 5) to new version 5.7.0
- change provider of code coverage to codecov.io

Version 1.2
-------------

ADDED:

- new method that calculates the result of the given percentage, and a given value
- added java area in build.gradle for activate support of module path inference
- added new test-dependency junit-jupiter (junit 5) in version 5.6.2

CHANGED:

- update gradle to new version 6.5
- remove of test-dependency testng
- extracted project properties to gradle.properties

Version 1.1
-------------

ADDED:

- initial version of project
- new CHANGELOG.md file created
- gradle as build system

CHANGED:

- changed project nature from maven to gradle nature
- removed maven related files
- removed lombok dependency

Notable links:
[keep a changelog](http://keepachangelog.com/en/1.0.0/) Don’t let your friends dump git logs into
changelogs
