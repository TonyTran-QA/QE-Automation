$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CheckBrowser.feature");
formatter.feature({
  "line": 2,
  "name": "Check Browser",
  "description": "",
  "id": "check-browser",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckBrowser"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#  Scenario Outline: Do Login Check Browser"
    },
    {
      "line": 5,
      "value": "#    Given I open Home"
    },
    {
      "line": 6,
      "value": "#    When I doLogin with thing \"\u003cAccount\u003e\""
    },
    {
      "line": 7,
      "value": "#    And I click on submit"
    },
    {
      "line": 8,
      "value": "#    And I verify my account"
    },
    {
      "line": 9,
      "value": "#    And I choose and add \"\u003cBanks\u003e\""
    },
    {
      "line": 10,
      "value": "#    And I switch Language"
    },
    {
      "line": 11,
      "value": "#    And I click on funds"
    },
    {
      "line": 12,
      "value": "#    And I select \"\u003cFrom\u003e\" \"\u003cTo\u003e\" transfer"
    },
    {
      "line": 13,
      "value": "#    And I choose \"\u003cAmount\u003e\" is transfer"
    },
    {
      "line": 14,
      "value": "#    And I choose game and \"\u003cHall\u003e\""
    },
    {
      "line": 15,
      "value": "#    And I close"
    },
    {
      "line": 16,
      "value": "#    Examples:"
    },
    {
      "line": 17,
      "value": "#      | Account | Hall   | From | To      | Amount | Banks                        |"
    },
    {
      "line": 18,
      "value": "#      | AccPass | AGHall | Main | AG Hall | 55000  | (SCB)-Ngân hàng TMCP Sài Gòn |"
    }
  ],
  "line": 20,
  "name": "Bet Game Grand Hall",
  "description": "",
  "id": "check-browser;bet-game-grand-hall",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I open Home",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I doLogin with thing \"\u003cAccount\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I choose game and \"\u003cHall\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I play game",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I close",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "check-browser;bet-game-grand-hall;",
  "rows": [
    {
      "cells": [
        "Account",
        "Hall"
      ],
      "line": 28,
      "id": "check-browser;bet-game-grand-hall;;1"
    },
    {
      "cells": [
        "AccPass",
        "Grand Hall"
      ],
      "line": 29,
      "id": "check-browser;bet-game-grand-hall;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Bet Game Grand Hall",
  "description": "",
  "id": "check-browser;bet-game-grand-hall;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@CheckBrowser"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I open Home",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I doLogin with thing \"AccPass\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I choose game and \"Grand Hall\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I play game",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I close",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_open_Home()"
});
formatter.result({
  "duration": 16928273900,
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
  "duration": 8347616500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_submit()"
});
formatter.result({
  "duration": 5347202100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Grand Hall",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iChooseGameAnd(String)"
});
formatter.result({
  "duration": 4317140000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iPlayGame()"
});
formatter.result({
  "duration": 6266149700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_close()"
});
formatter.result({
  "duration": 2587288900,
  "status": "passed"
});
});