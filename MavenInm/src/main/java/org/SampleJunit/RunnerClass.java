package org.SampleJunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({B.class,gmailAssert.class,A.class})
public class RunnerClass {
	

}
