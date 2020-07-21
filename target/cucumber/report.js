$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DoLoginNewCompany.feature");
formatter.feature({
  "line": 2,
  "name": "Check Login",
  "description": "",
  "id": "check-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DoLoginNewCompany"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Do Login New Company",
  "description": "",
  "id": "check-login;do-login-new-company",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open Home",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I doLogin with thing \"\u003cAccount\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I close",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "check-login;do-login-new-company;",
  "rows": [
    {
      "cells": [
        "Account"
      ],
      "line": 10,
      "id": "check-login;do-login-new-company;;1"
    },
    {
      "cells": [
        "Now"
      ],
      "line": 11,
      "id": "check-login;do-login-new-company;;2"
    },
    {
      "cells": [
        "New"
      ],
      "line": 12,
      "id": "check-login;do-login-new-company;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Do Login New Company",
  "description": "",
  "id": "check-login;do-login-new-company;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DoLoginNewCompany"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open Home",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I doLogin with thing \"Now\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 18830193300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Now",
      "offset": 22
    }
  ],
  "location": "LoginSteps.i_doLogin_with_thing(String)"
});
formatter.result({
  "duration": 11295211200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 16867944500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "duration": 5700773800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Do Login New Company",
  "description": "",
  "id": "check-login;do-login-new-company;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DoLoginNewCompany"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open Home",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I doLogin with thing \"New\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 11564346700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 22
    }
  ],
  "location": "LoginSteps.i_doLogin_with_thing(String)"
});
formatter.result({
  "duration": 11267082100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 7428796100,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-CJFLG6H\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteTimeouts.implicitlyWait(RemoteWebDriver.java:780)\r\n\tat com.qa.Pages.HandleException.ElementProxy.checkForPopupAndKill(ElementProxy.java:31)\r\n\tat com.qa.Pages.HandleException.ElementProxy.invoke(ElementProxy.java:24)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.qa.newpages.LoginPages.signIn(LoginPages.java:71)\r\n\tat com.qa.newsteps.LoginSteps.i_click_on_submit(LoginSteps.java:47)\r\n\tat ✽.And I click on submit(DoLoginNewCompany.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "status": "skipped"
});
});