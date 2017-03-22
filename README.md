# galendemo


## On Windows
* System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32.exe");
* WebDriver driver = new ChromeDriver();
* -Dwebdriver.chrome.driver=src/test/resources/drivers/chromedriver_win32.exe


## CLI cmds
Run Test
* galen check src/test/resources/specs/tutorial1.gspec --url http://samples.galenframework.com/tutorial1/tutorial1.html --size 640x480 --htmlreport output/singletest

Run Test Suite
* galen test src/test/resources/tests/demotest.test --htmlreport "output/testsuites"

Dump page
* galen dump "src/test/resources/specs/welcomePage.gspec" --url http://testapp.galenframework.com --size 1024x768 --export output/dumps
* galen dump "src/test/resources/specs/tutorial1.gspec" --url http://samples.galenframework.com/tutorial1/tutorial1.html --size 640x480 --export output/dumps


## Resources
* http://galenframework.com/docs/getting-started-install-galen/
* http://galenframework.com/docs/getting-started-configuration/
* http://galenframework.com/docs/reference-working-in-command-line/
* http://galenframework.com/docs/browsers/
* http://galenframework.com/docs/tutorial-first-project/
* http://galenframework.com/docs/reference-galen-spec-language-guide/
* http://galenframework.com/docs/reference-galen-test-suite-syntax/