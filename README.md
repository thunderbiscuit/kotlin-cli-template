# Readme

This is a simple template to kickstart new Kotlin-based cli projects.

It uses Clikt 5.0.3 and Kotlin 2.1.10, and produces a native executable (macOS or Linux) cli.

## Building and usage

Build for testing and run using

```shell
./gradlew linkReleaseExecutableMacosArm64
./build/bin/macosArm64/releaseExecutable/ks.kexe
```

You can rename it and move it to a directory in your `$PATH` to make it easier to use.

```shell
cd ./build/bin/macosArm64/releaseExecutable
mv ks.kexe ks
```

## Building for JVM

To build for the JVM target instead, use the [`variant/jvm`] branch. Note that this branch uses Kotlin Native to produce binaries that fire up much faster than their JVM-based counterparts, making them a great choice for command line tools if the libraries you depend on are KMP-compatible.

[`variant/jvm`]: https://github.com/thunderbiscuit/kotlin-cli-template/tree/variant/jvm
