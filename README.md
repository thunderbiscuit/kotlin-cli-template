# Readme
This is a simple template to kickstart new Kotlin-based cli projects.

It uses Clikt 4.2.1 and Kotlin 1.9.20, and produces native or JVM command line tools.

# Building and usage
Build and run the final executable using
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
To build for the JVM target only, use the [`jvm-only`] branch.

[`jvm-only`]: https://github.com/thunderbiscuit/kotlin-cli-template/tree/jvm-only
