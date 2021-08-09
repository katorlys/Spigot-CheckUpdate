# Spigot-CheckUpdate
[![License](https://img.shields.io/badge/license-GPLv3-blue?style=for-the-badge)](https://www.gnu.org/licenses/gpl-3.0.html) ![Pull Requests](https://img.shields.io/github/issues-pr-closed/katorlys/Spigot-CheckUpdate?style=for-the-badge) ![Issues](https://img.shields.io/github/issues-closed/katorlys/Spigot-CheckUpdate?style=for-the-badge)

## Introduction
Check plugin update automatically when enabling it.

## Usage
1. Create a TXT file in your Github repository, and write down your plugin's latest version in it.<br>
2. Change the following URLs in the code.<br>
```java
URL url = new URL("https://raw.githubusercontent.com/username/repo-name/master/latest.txt");
```
```java
URL url = new URL("https://cdn.jsdelivr.net/gh/username/repo-name/latest.txt");
```
3. Include this code in `onEnable()` or anywhere you want:<br>
```java
Updater.check();
```
4. Change the version number in the TXT file when you update your plugin version. Remember to update the version of your plugin every time you publish it.<br>