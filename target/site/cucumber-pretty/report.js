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
  "name": "Do Login New Company Play Online Casino",
  "description": "",
  "id": "check-login;do-login-new-company-play-online-casino",
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
  "name": "I verify my account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I switch Language",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose game and \"\u003cHall\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "check-login;do-login-new-company-play-online-casino;",
  "rows": [
    {
      "cells": [
        "Account",
        "Hall"
      ],
      "line": 13,
      "id": "check-login;do-login-new-company-play-online-casino;;1"
    },
    {
      "cells": [
        "AccPass",
        "SexyHall"
      ],
      "line": 14,
      "id": "check-login;do-login-new-company-play-online-casino;;2"
    },
    {
      "cells": [
        "AccPass",
        "HGHall"
      ],
      "line": 15,
      "id": "check-login;do-login-new-company-play-online-casino;;3"
    },
    {
      "cells": [
        "AccFailed_Pass",
        "HGHall"
      ],
      "line": 16,
      "id": "check-login;do-login-new-company-play-online-casino;;4"
    },
    {
      "cells": [
        "AccFailed_Acc",
        "HGHall"
      ],
      "line": 17,
      "id": "check-login;do-login-new-company-play-online-casino;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Do Login New Company Play Online Casino",
  "description": "",
  "id": "check-login;do-login-new-company-play-online-casino;;2",
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
  "name": "I doLogin with thing \"AccPass\"",
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
  "name": "I verify my account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I switch Language",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose game and \"SexyHall\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 13169720100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AccPass",
      "offset": 22
    }
  ],
  "location": "LoginSteps.i_doLogin_with_thing(String)"
});
formatter.result({
  "duration": 8282051100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 6425743900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyMyAccount()"
});
formatter.result({
  "duration": 2823421200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iSwitchLanguage()"
});
formatter.result({
  "duration": 3059364900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SexyHall",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iChooseGameAnd(String)"
});
formatter.result({
  "duration": 9252125300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "duration": 2740998500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Do Login New Company Play Online Casino",
  "description": "",
  "id": "check-login;do-login-new-company-play-online-casino;;3",
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
  "name": "I doLogin with thing \"AccPass\"",
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
  "name": "I verify my account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I switch Language",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose game and \"HGHall\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 12088792800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AccPass",
      "offset": 22
    }
  ],
  "location": "LoginSteps.i_doLogin_with_thing(String)"
});
formatter.result({
  "duration": 8260813900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 5266145500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyMyAccount()"
});
formatter.result({
  "duration": 2734689600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iSwitchLanguage()"
});
formatter.result({
  "duration": 2902331500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HGHall",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iChooseGameAnd(String)"
});
formatter.result({
  "duration": 6885774000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "duration": 2662904100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Do Login New Company Play Online Casino",
  "description": "",
  "id": "check-login;do-login-new-company-play-online-casino;;4",
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
  "name": "I doLogin with thing \"AccFailed_Pass\"",
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
  "name": "I verify my account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I switch Language",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose game and \"HGHall\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 12614145500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AccFailed_Pass",
      "offset": 22
    }
  ],
  "location": "LoginSteps.i_doLogin_with_thing(String)"
});
formatter.result({
  "duration": 8270527400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 4482260700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyMyAccount()"
});
formatter.result({
  "duration": 3783800,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-CJFLG6H\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteTimeouts.implicitlyWait(RemoteWebDriver.java:780)\r\n\tat com.qa.Pages.HandleException.ElementProxy.checkForPopupAndKill(ElementProxy.java:31)\r\n\tat com.qa.Pages.HandleException.ElementProxy.invoke(ElementProxy.java:24)\r\n\tat com.sun.proxy.$Proxy25.click(Unknown Source)\r\n\tat com.qa.newpages.LoginPages.MyAccount(LoginPages.java:104)\r\n\tat com.qa.newsteps.LoginSteps.iVerifyMyAccount(LoginSteps.java:60)\r\n\tat ✽.And I verify my account(DoLoginNewCompany.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.iSwitchLanguage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "HGHall",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iChooseGameAnd(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "Do Login New Company Play Online Casino",
  "description": "",
  "id": "check-login;do-login-new-company-play-online-casino;;5",
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
  "name": "I doLogin with thing \"AccFailed_Acc\"",
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
  "name": "I verify my account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I switch Language",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose game and \"HGHall\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 12599416400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AccFailed_Acc",
      "offset": 22
    }
  ],
  "location": "LoginSteps.i_doLogin_with_thing(String)"
});
formatter.result({
  "duration": 8275355900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 4307450100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyMyAccount()"
});
formatter.result({
  "duration": 202500,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-CJFLG6H\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteTimeouts.implicitlyWait(RemoteWebDriver.java:780)\r\n\tat com.qa.Pages.HandleException.ElementProxy.checkForPopupAndKill(ElementProxy.java:31)\r\n\tat com.qa.Pages.HandleException.ElementProxy.invoke(ElementProxy.java:24)\r\n\tat com.sun.proxy.$Proxy25.click(Unknown Source)\r\n\tat com.qa.newpages.LoginPages.MyAccount(LoginPages.java:104)\r\n\tat com.qa.newsteps.LoginSteps.iVerifyMyAccount(LoginSteps.java:60)\r\n\tat ✽.And I verify my account(DoLoginNewCompany.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.iSwitchLanguage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "HGHall",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iChooseGameAnd(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Do Login Check Browser",
  "description": "",
  "id": "check-login;do-login-check-browser",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I open Home",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I doLogin with thing \"\u003cAccount\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify my account",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I switch Language",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I choose game and \"\u003cHall\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I close",
  "keyword": "And "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "check-login;do-login-check-browser;",
  "rows": [
    {
      "cells": [
        "Account",
        "Hall"
      ],
      "line": 27,
      "id": "check-login;do-login-check-browser;;1"
    },
    {
      "cells": [
        "AccPass",
        "SexyHall"
      ],
      "line": 28,
      "id": "check-login;do-login-check-browser;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Do Login Check Browser",
  "description": "",
  "id": "check-login;do-login-check-browser;;2",
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
  "line": 19,
  "name": "I open Home",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I doLogin with thing \"AccPass\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify my account",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I switch Language",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I choose game and \"SexyHall\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 12510345500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AccPass",
      "offset": 22
    }
  ],
  "location": "LoginSteps.i_doLogin_with_thing(String)"
});
formatter.result({
  "duration": 8266657600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 5227195300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyMyAccount()"
});
formatter.result({
  "duration": 2621467300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iSwitchLanguage()"
});
formatter.result({
  "duration": 3047877800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SexyHall",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iChooseGameAnd(String)"
});
formatter.result({
  "duration": 9311458000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "duration": 2748006000,
  "status": "passed"
});
});