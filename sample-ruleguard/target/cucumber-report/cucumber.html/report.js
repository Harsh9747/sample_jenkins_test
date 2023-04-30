$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Ruleguard demo",
  "description": "As a candidate I am showing interviewer my framework",
  "id": "ruleguard-demo",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6099699300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user I am chekcing home page",
  "description": "",
  "id": "ruleguard-demo;as-a-user-i-am-chekcing-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify logo is present or not",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I hover mouse on Solutions tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I hover and click on TASKS \u0026 CHECKLISTS",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the tile of the page \"GRC Management Software | Ruleguard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 179661800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iVerifyLogoIsPresentOrNot()"
});
formatter.result({
  "duration": 327533300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iHoverMouseOnSolutionsTab()"
});
formatter.result({
  "duration": 212749700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnTASKSCHECKLISTS()"
});
formatter.result({
  "duration": 3203516800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GRC Management Software | Ruleguard",
      "offset": 31
    }
  ],
  "location": "MyStepdefs.iVerifyTheTileOfThePage(String)"
});
formatter.result({
  "duration": 32820100,
  "status": "passed"
});
formatter.after({
  "duration": 833009100,
  "status": "passed"
});
});