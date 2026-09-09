# Readme

This is a simple template to kickstart new Kotlin-based cli projects.

It uses [Clikt], is built with the [Kotlin Toolchain], and produces a native executable (macOS or Linux) cli.

## Project layout

The Kotlin Toolchain builds one executable per module, and a module targets a single operating system. The project is therefore split into three modules:

```
project.yaml                  # lists the modules
shared/                       # all the cli code (kmp/lib), plus the dependencies
  module.yaml
  src/me/tb/...
ks-macos/module.yaml          # macos/app, links shared into ks-macos.kexe
ks-linux/module.yaml          # linux/app, links shared into ks-linux.kexe
```

## Building and usage

Run the cli directly (debug build):

```shell
./kotlin run --module ks-macos -- scream hello
```

Build a release binary and run it:

```shell
./kotlin build --module ks-macos --variant release
./build/tasks/_ks-macos_linkMacosArm64Release/ks-macos.kexe
```

Use `--module ks-linux` for the Linux target; the executable lands in `./build/tasks/_ks-linux_linkLinuxX64Release/ks-linux.kexe`. Dropping the `--module` argument builds every module.

You can rename the binary and move it to a directory in your `$PATH` to make it easier to use.

```shell
cp ./build/tasks/_ks-macos_linkMacosArm64Release/ks-macos.kexe ~/.local/bin/ks
```

## Renaming the cli

The name of the executable comes from the module name (`ks-macos` → `ks-macos.kexe`); there is no `baseName` setting in the toolchain. To change it, rename the `ks-macos`/`ks-linux` directories and update `project.yaml`. The name shown in the help output comes from the Clikt command class (`KS` in `shared/src/me/tb/Main.kt`).

## Building for JVM

To build for the JVM target instead, use the [`variant/jvm`] branch. Note that this branch uses Kotlin
Native to produce binaries that fire up much faster than their JVM-based counterparts, making them a
great choice for command line tools if the libraries you depend on are KMP-compatible.

[Clikt]: https://ajalt.github.io/clikt/
[Kotlin Toolchain]: https://kotlin-toolchain.org/latest/
[`variant/jvm`]: https://github.com/thunderbiscuit/kotlin-cli-template/tree/variant/jvm
