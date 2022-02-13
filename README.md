# automation-challenge
Java Selenium Cucumber Gradle project

## About

## Prerequisites
MacOS with Chrome Browser version 98 installed 
Gradle installed 
Java 11 


##  How to run Local (MacOs Chrome Driver)
#### Type on terminal
Clone repo
```
git clone https://github.com/UlCopt/selenium-java-cucumber.git
cd automation-challenge
```

Run tests on mac m1 chip
```
gradle test -Dbrowser=local-chrome-macos-m1    
```

Run tests on mac intel chip
```
gradle test -Dbrowser=local-chrome-macos-x64    
```

Report
```
selenium-java-cucumber/target/cucumber/report.html       
```


Troubleshooting webdriver macos Catalina or superior

Open terminal and navigate to path where your chromedriver file is located and execute any one of the below commands     
Example:
```
cd /src/test/resources/webdriver/macos 
$ xattr -d com.apple.quarantine chromedriver
$ xattr -d com.apple.quarantine chromedriverM1  
```


