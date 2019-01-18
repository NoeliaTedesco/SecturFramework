package suiteTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;
import components.Hook;
import steps.PildorasStep;

public class Regression extends Hook {


	@Test
	public void TestPildoras(Method method) {
		PildorasStep.Run(method.getName());
	}

}
