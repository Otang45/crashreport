### Usage

Add the Jitpack maven repository if you don't have it yet:

``` gradle

allprojects {

    repositories {

        ...

        maven { url 'https://jitpack.io' }

    }

}

```

Reference the library from your module's build.gradle:

``` gradle

dependencies {

    [...]

    implementation 'com.github.Otang45:crashreport:$version'

}

```





Done, will automatic installed
