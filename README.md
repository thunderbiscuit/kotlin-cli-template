# Readme

This is a simple template to kickstart new Kotlin-based cli projects.

It uses Clikt 5.0.3 and Kotlin 2.1.10, and produces a JVM-based cli.

## Building and usage

Build for testing and run using

```shell
./gradlew installDist
./build/install/ks/bin/ks
```

Build and install to custom location using

```shell
./gradlew distTar
cd build/distributions
tar --extract --verbose --file ks-0.1.0-SNAPSHOT.tar -C ~/targetdirectory/
```

From there you can run the application using 

```shell
~/targetdirectory/ks-0.1.0-SNAPSHOT/bin/ks
```

## Building native binaries instead (they start faster)

To build native binaries instead, use the [`variant/kotlin-native`] branch. Note that this other branch uses Kotlin Native to produce binaries that fire up much faster than their JVM-based counterparts, making them a great choice for command line tools if the libraries you depend on are KMP-compatible.

[`variant/kotlin-native`]: https://github.com/thunderbiscuit/kotlin-cli-template/tree/variant/kotlin-native
