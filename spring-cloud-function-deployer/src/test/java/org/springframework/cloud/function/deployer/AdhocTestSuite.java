/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.function.deployer;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * A test suite for probing weird ordering problems in the tests.
 *
 * @author Dave Syer
 */
@RunWith(Suite.class)
@SuiteClasses({ FunctionCreatorConfigurationTests.FunctionCompositionTests.class,
		FunctionCreatorConfigurationTests.SingleFunctionTests.class,
		FunctionCreatorConfigurationTests.ManualSpringFunctionTests.class,
		ContextRunnerTests.class,
		SpringFunctionAppConfigurationTests.ProcessorTests.class,
		SpringFunctionAppConfigurationTests.SourceTests.class,
		FunctionCreatorConfigurationTests.ConsumerCompositionTests.class,
		SpringFunctionAppConfigurationTests.CompositeTests.class,
		ApplicationRunnerTests.class, SpringFunctionAppConfigurationTests.SinkTests.class,
		FunctionCreatorConfigurationTests.SupplierCompositionTests.class })
@Ignore
public class AdhocTestSuite {

}
