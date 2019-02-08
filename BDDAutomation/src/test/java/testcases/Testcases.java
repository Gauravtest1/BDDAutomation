package testcases;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
features="./testcases/testcases",
format= {"pretty","html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"})
public class Testcases {

}
