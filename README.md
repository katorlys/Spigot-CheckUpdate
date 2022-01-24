# Spigot-CheckUpdate
[![License](https://img.shields.io/badge/license-GPLv3-blue?style=flat-square)](https://www.gnu.org/licenses/gpl-3.0.html) [![Pull Requests](https://img.shields.io/github/issues-pr-closed/katorlys/CleanJunkFiles?style=flat-square)](https://github.com/katorlys/CleanJunkFiles/pulls) [![Issues](https://img.shields.io/github/issues-closed/katorlys/CleanJunkFiles?style=flat-square)](https://github.com/katorlys/CleanJunkFiles/issues) [![Lines](https://img.shields.io/tokei/lines/github/katorlys/CleanJunkFiles?style=flat-square)](https://github.com/katorlys/CleanJunkFiles)

## Introduction
Check plugin update automatically when enabling it.

## Usage
1. Create a TXT file in your Github repository, and write down your plugin's latest version number in it.<br>
2. Use the method in `onEnable()` or anywhere you want, and remember to change `%Github-user-name%` into your username and `%Github-repo%` into your repo name:<br>
```java
PluginUpdater.check(this, "%Github-user-name%", "%Github-repo%");
```
3. Change the version number in the TXT file when you update your plugin version. Remember to update the version of your plugin every time you publish it.<br>
