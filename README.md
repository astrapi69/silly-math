# Overview

<div style="text-align: center">

[![Java CI with Gradle](https://github.com/astrapi69/silly-math/actions/workflows/gradle.yml/badge.svg)](https://github.com/astrapi69/silly-math/actions/workflows/gradle.yml)
[![Coverage Status](https://codecov.io/gh/astrapi69/silly-math/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/silly-math)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/silly-math.svg?style=flat)](https://github.com/astrapi69/silly-math/issues) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/silly-math/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/silly-math)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/silly-math.svg)](http://www.javadoc.io/doc/de.alpharogroup/silly-math)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)
[![Hits Of Code](https://hitsofcode.com/github/astrapi69/silly-math?branch=develop)](https://hitsofcode.com/github/astrapi69/silly-math/view?branch=develop)

</div>

Utility library that holds math functions to make your life easier

> Please support this project by simply putting a Github <!-- Place this tag where you want the button to render. -->
<a class="github-button" href="https://github.com/astrapi69/silly-math" data-icon="octicon-star" aria-label="Star astrapi69/silly-math on GitHub">Star ⭐</a>
>
> Share this library with friends on Twitter and everywhere else you can
>
> If you love this project [![donation](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

## License

The source code comes under the liberal MIT License, making silly-math great for all types of
applications.

## Maven dependency

Maven dependency is now on sonatype. Check
out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~silly-math~~~)
for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core
functionality of silly-math:

For development with jdk 1.8 use following version:

Than you can add the dependency to your dependencies:

	<properties>
			...
		<!-- SILLY-MATH version -->
		<silly-math.version>1.4</silly-math.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- SILLY-MATH DEPENDENCY -->
			<dependency>
				<groupId>io.github.astrapi69</groupId>
				<artifactId>silly-math</artifactId>
				<version>${silly-math.version}</version>
			</dependency>
			...
		</dependencies>

## gradle dependency

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of silly-math:

define version in file gradle.properties

```

sillyMathVersion=1.4
```

or in build.gradle ext area

```
ext {
			...
    sillyMathVersion = "1.4"
			...
}
```

and then add the dependency to the dependencies area

```
dependencies {
			...
compile("io.github.astrapi69:silly-math:$sillyMathVersion")
			...
}
```

If you develop above jdk 11 you can use silly-math version 2.x and above.

## Semantic Versioning

The versions of silly-math are maintained with the Simplified Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning for this project you can visit
this [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Simplified-Semantic-Versioning)
.

## Want to Help and improve it? ###

The source code for silly-math are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/silly-math/fork](https://github.com/astrapi69/silly-math/fork)

To share your
changes, [submit a pull request](https://github.com/astrapi69/silly-math/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the silly-math developers with your questions, concerns, comments, bug
reports, or feature requests.

- Feature requests, questions and bug reports can be reported at
  the [issues page](https://github.com/astrapi69/silly-math/issues).

## Note

No animals were harmed in the making of this library.

# Donations

If you like this library, please consider a donation through bitcoin or over bitcoin-cash with:

36JxRRDfRazLNqUV6NsywCw1q7TK38ukpC

or over ether with:

0x588Aa02De98B1Ef70afeDC3ec5290130a3E5e273

or over flattr:

<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Fastrapi69%2Fsilly-math" target="_blank">
<img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" />
</a>

## Similar projects

Here is a list of awesome similar projects:

Open Source:

* [commons-math](http://commons.apache.org/proper/commons-math/) The Apache Commons Mathematics
  Library
* [Colt](https://dst.lbl.gov/ACSSoftware/colt/) Colt provides a set of Open Source Libraries for
  High Performance Scientific and Technical Computing in Java.

## Credits

|**Travis CI**|
|     :---:      |
|![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png) <img width=500/>|
|Special thanks to [Travis CI](https://travis-ci.com) for providing a free continuous integration service for open source projects|
|     <img width=1000/>     |

|**Nexus Sonatype repositories**|
|     :---:      |
|![sonatype repository](https://avatars1.githubusercontent.com/u/33330803?s=200&v=4)|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**codecov.io**|
|     :---:      |
|[![Coverage Status](https://codecov.io/gh/astrapi69/silly-math/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/silly-math)|
|Special thanks to [codecov.io](https://codecov.io) for providing a free code coverage for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/silly-math.svg)](http://www.javadoc.io/doc/io.github.astrapi69/silly-math)|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |
