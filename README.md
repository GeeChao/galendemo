# galendemo
A short demo on the Galen-Framework to automate the testing of page element size and relations to one another. Galen is
not deemed as a "proper visual testing tool" if you don't use its explicitly called image comparison feature. Its
strength lies in its fairly easy to use and quick execution, allowing developers or UX designers to easily verify that 
their page layout isn't broken by new changes. It is not as comprehensive as other visual testing tools on the market 
such as Applitools, which unfortunately isn't free like Galen. 

This project contains spec & test files that can be run through command line, alternatively you can also use maven to
execute the tests.

## On Windows
I've noticed issues whereby running this on windows, it does not seem to be able to load the galen.config files properly
and therefore you may need to run the tests with the below commands. Furthermore you may also need to modify the method
to instantiate the browser "@Override public WebDriver createDriver()" that resides in the GalenTestBase class. 

E.g. Create a switch/loop to read from a properties file to execute your preferred driver. 
* System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win32.exe");
* WebDriver driver = new ChromeDriver();

Or alternatively, pass options such as:
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
* http://galenframework.com/docs/tutorial-first-project/
* http://galenframework.com/docs/reference-galen-spec-language-guide/
* http://galenframework.com/docs/reference-galen-test-suite-syntax/