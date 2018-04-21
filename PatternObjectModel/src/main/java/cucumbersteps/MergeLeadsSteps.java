package cucumbersteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class MergeLeadsSteps extends ProjectMethods{

	@Before
	public void before(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getUri());
		System.out.println(sc.getId());
		startResult();
		startTestModule("TC003_MergeLeads", "Merge Leads");	
		test = startTestCase("Leads");
		test.assignCategory("Smoke");
		test.assignAuthor("Raghu");
		startApp("chrome");		

	}

	@After
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
		endResult();
		closeAllBrowsers();
	}

}