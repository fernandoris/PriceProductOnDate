# PriceProductOnDate

> Microservice to consult prices


[![Build Status](http://img.shields.io/travis/badges/badgerbadgerbadger.svg?style=flat-square)](https://travis-ci.org/badges/badgerbadgerbadger) 
## How to start
To run the microservice you must first make sure that your port 8080 is not in use. Then navigate in the console to the project folder and launch the following command.
```shell
$mvn clean install && java -jar target/ondate-0.0.1-SNAPSHOT.jar com.priceproduct.ondate.OndateApplication
```
## Tests 
Once the microservice is up, to run the tests you can import the postman collection in the file `PriceProductOndate.postman_collection.json` or execute the following commands in the console

### Test 1. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-14-10.00.34&productId=35455&brandId=1'
```
### Test 2. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-14-16.00.34&productId=35455&brandId=1'
```
### Test 3. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-14-21.00.34&productId=35455&brandId=1'
```
### Test 4. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-15-10.00.34&productId=35455&brandId=1'
```
### Test 5. 
```bash
curl --location --request GET 'http://localhost:8080/prices?date=2020-06-16-21.00.34&productId=35455&brandId=1'
```
---

## Execution of mvn verify

```shell
$ mvn verify
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< com.priceproduct:ondate >-----------------------
[INFO] Building ondate 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ ondate ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.5.1:compile (default-compile) @ ondate ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ ondate ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\frodrise\git\PriceProductOnDate\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.5.1:testCompile (default-testCompile) @ ondate ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to C:\Users\frodrise\git\PriceProductOnDate\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ ondate ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
21:08:21.286 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:21.297 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
21:08:21.314 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
21:08:21.418 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.priceproduct.ondate.integration.OndateIntegrationTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
21:08:21.463 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.priceproduct.ondate.integration.OndateIntegrationTest], using SpringBootContextLoader
21:08:21.471 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTest-context.xml] does not exist
21:08:21.472 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTestContext.groovy] does not exist
21:08:21.473 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: no resource found for suffixes {-context.xml, Context.groovy}.
21:08:21.622 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:21.850 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.priceproduct.ondate.integration.OndateIntegrationTest]: using defaults.
21:08:21.851 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
21:08:21.894 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@55634720, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@4b0d79fc, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@4c1909a3, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@428640fa, org.springframework.test.context.support.DirtiesContextTestExecutionListener@d9345cd, org.springframework.test.context.transaction.TransactionalTestExecutionListener@2d710f1a, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@29215f06, org.springframework.test.context.event.EventPublishingTestExecutionListener@59505b48, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@4efac082, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@6bd61f98, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@48aca48b, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@13fd2ccd, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@b9b00e0, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@506ae4d4]
21:08:21.900 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:21.902 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:21.903 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:21.903 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:21.903 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:21.903 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.022 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.022 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
21:08:22.023 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
21:08:22.023 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.priceproduct.ondate.integration.OndateIntegrationTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
21:08:22.025 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.priceproduct.ondate.integration.OndateIntegrationTest], using SpringBootContextLoader
21:08:22.027 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTest-context.xml] does not exist
21:08:22.029 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTestContext.groovy] does not exist
21:08:22.029 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: no resource found for suffixes {-context.xml, Context.groovy}.
21:08:22.037 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.044 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.priceproduct.ondate.integration.OndateIntegrationTest]: using defaults.
21:08:22.046 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
21:08:22.048 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@6fa51cd4, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@2767e23c, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@710c2b53, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@5386659f, org.springframework.test.context.support.DirtiesContextTestExecutionListener@14028087, org.springframework.test.context.transaction.TransactionalTestExecutionListener@cecf639, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@1caa0244, org.springframework.test.context.event.EventPublishingTestExecutionListener@7ce026d3, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@7ce69770, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@1750fbeb, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@5b247367, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@268f106e, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@6e9a5ed8, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@7e057f43]
21:08:22.049 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.049 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.050 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.050 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.050 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:08:22.051 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
[INFO] Running com.priceproduct.ondate.OndateApplicationTests
21:08:22.220 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
21:08:22.221 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
21:08:22.221 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.priceproduct.ondate.OndateApplicationTests] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
21:08:22.222 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.priceproduct.ondate.OndateApplicationTests], using SpringBootContextLoader
21:08:22.224 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.OndateApplicationTests]: class path resource [com/priceproduct/ondate/OndateApplicationTests-context.xml] does not exist
21:08:22.225 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.OndateApplicationTests]: class path resource [com/priceproduct/ondate/OndateApplicationTestsContext.groovy] does not exist
21:08:22.225 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.priceproduct.ondate.OndateApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
21:08:22.230 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.priceproduct.ondate.OndateApplicationTests]
21:08:22.235 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.priceproduct.ondate.OndateApplicationTests]: using defaults.
21:08:22.235 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
21:08:22.236 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@5167f57d, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@64b0598, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@18f8cd79, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@3e2055d6, org.springframework.test.context.support.DirtiesContextTestExecutionListener@50029372, org.springframework.test.context.transaction.TransactionalTestExecutionListener@e3b3b2f, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@50f6ac94, org.springframework.test.context.event.EventPublishingTestExecutionListener@6cc4cdb9, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@28194a50, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@7f2cfe3f, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@1a5b6f42, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@5038d0b5, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@32115b28, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@2ad48653]
21:08:22.245 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@a8ef162 testClass = OndateApplicationTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@2eea88a1 testClass = OndateApplicationTests, locations = '{}', classes = '{interface com.priceproduct.ondate.mapper.OndateMapper, interface com.priceproduct.ondate.mapper.OndateMapper}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@79e2c065, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@7e07db1f, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@59662a0b, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@689604d9, org.springframework.boot.test.context.SpringBootTestArgs@1], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].
21:08:22.328 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}
2020-09-27 21:08:22.798 DEBUG 21456 --- [           main] .c.l.ClasspathLoggingApplicationListener : Application started with classpath: [file:/C:/Users/frodrise/AppData/Local/Temp/surefire5741775760928467308/surefirebooter6328164333641366812.jar]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-27 21:08:23.011  INFO 21456 --- [           main] c.p.ondate.OndateApplicationTests        : Starting OndateApplicationTests on SVQ-D0Z3HR2 with PID 21456 (started by frodrise in C:\Users\frodrise\git\PriceProductOnDate)
2020-09-27 21:08:23.012  INFO 21456 --- [           main] c.p.ondate.OndateApplicationTests        : No active profile set, falling back to default profiles: default
2020-09-27 21:08:23.013 DEBUG 21456 --- [           main] o.s.boot.SpringApplication               : Loading source interface com.priceproduct.ondate.mapper.OndateMapper
2020-09-27 21:08:23.093 DEBUG 21456 --- [           main] o.s.b.c.c.ConfigFileApplicationListener  : Loaded config file 'file:/C:/Users/frodrise/git/PriceProductOnDate/target/classes/application.properties' (classpath:/application.properties)
2020-09-27 21:08:23.095 DEBUG 21456 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Refreshing org.springframework.web.context.support.GenericWebApplicationContext@294a6b8e
2020-09-27 21:08:23.358  INFO 21456 --- [           main] c.p.ondate.OndateApplicationTests        : Started OndateApplicationTests in 1.006 seconds (JVM running for 3.134)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.963 s - in com.priceproduct.ondate.OndateApplicationTests
[INFO] Running com.priceproduct.ondate.domain.PriceTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s - in com.priceproduct.ondate.domain.PriceTest
[INFO] Running com.priceproduct.ondate.integration.OndateIntegrationTest
2020-09-27 21:08:24.140 DEBUG 21456 --- [           main] .c.l.ClasspathLoggingApplicationListener : Application started with classpath: [file:/C:/Users/frodrise/AppData/Local/Temp/surefire5741775760928467308/surefirebooter6328164333641366812.jar]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-27 21:08:24.195  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : Starting OndateIntegrationTest on SVQ-D0Z3HR2 with PID 21456 (started by frodrise in C:\Users\frodrise\git\PriceProductOnDate)
2020-09-27 21:08:24.196  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : No active profile set, falling back to default profiles: default
2020-09-27 21:08:24.196 DEBUG 21456 --- [           main] o.s.boot.SpringApplication               : Loading source interface com.priceproduct.ondate.mapper.OndateMapper
2020-09-27 21:08:24.200 DEBUG 21456 --- [           main] o.s.b.c.c.ConfigFileApplicationListener  : Loaded config file 'file:/C:/Users/frodrise/git/PriceProductOnDate/target/classes/application.properties' (classpath:/application.properties)
2020-09-27 21:08:24.201 DEBUG 21456 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Refreshing org.springframework.web.context.support.GenericWebApplicationContext@3be8821f
2020-09-27 21:08:25.423  INFO 21456 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-09-27 21:08:25.596  INFO 21456 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 153ms. Found 1 JPA repository interfaces.
2020-09-27 21:08:25.827  INFO 21456 --- [           main] beddedDataSourceBeanFactoryPostProcessor : Replacing 'dataSource' DataSource bean with embedded version
2020-09-27 21:08:26.302  INFO 21456 --- [           main] o.s.j.d.e.EmbeddedDatabaseFactory        : Starting embedded database: url='jdbc:h2:mem:019f7f65-8008-43e8-9348-4cdf7d4b4e95;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false', username='sa'
2020-09-27 21:08:27.213  INFO 21456 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-27 21:08:27.335  INFO 21456 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-09-27 21:08:27.466  INFO 21456 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.21.Final
2020-09-27 21:08:27.598  INFO 21456 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-09-27 21:08:28.036  INFO 21456 --- [         task-1] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2020-09-27 21:08:28.554 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2020-09-27 21:08:28.770 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 3 mappings in 'requestMappingHandlerMapping'
2020-09-27 21:08:28.914 DEBUG 21456 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2020-09-27 21:08:28.950 DEBUG 21456 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2020-09-27 21:08:29.467 DEBUG 21456 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2020-09-27 21:08:29.467 DEBUG 21456 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets:
2020-09-27 21:08:29.487  INFO 21456 --- [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2020-09-27 21:08:29.488  INFO 21456 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2020-09-27 21:08:29.527  INFO 21456 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 39 ms
2020-09-27 21:08:29.556  INFO 21456 --- [           main] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositories?
2020-09-27 21:08:30.159  INFO 21456 --- [         task-1] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-09-27 21:08:30.196  INFO 21456 --- [         task-1] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-09-27 21:08:31.163  INFO 21456 --- [           main] DeferredRepositoryInitializationListener : Spring Data repositories initialized!
2020-09-27 21:08:31.182  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : Started OndateIntegrationTest in 7.133 seconds (JVM running for 10.957)
2020-09-27 21:08:31.379 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:08:31.454  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sun Jun 14 10:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:08:31.766 DEBUG 21456 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:08:31.844  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:08:31.854 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:08:31.923 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@29c53c4f]
2020-09-27 21:08:31.999  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":1,"startDate":"2020-06-13T22:00:00.000+00:00","endDate":"2020-12-31T22:59:59.000+00:00","price":35.5,"curr":"EUR"}
2020-09-27 21:08:32.016 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:08:32.017  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sun Jun 14 16:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:08:32.019 DEBUG 21456 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:08:32.024  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:08:32.025 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:08:32.025 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@482f7af0]
2020-09-27 21:08:32.029  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":2,"startDate":"2020-06-14T13:00:00.000+00:00","endDate":"2020-06-14T16:30:00.000+00:00","price":25.45,"curr":"EUR"}
2020-09-27 21:08:32.044 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:08:32.045  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sun Jun 14 21:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:08:32.047 DEBUG 21456 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:08:32.051  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:08:32.051 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:08:32.052 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@2fde9469]
2020-09-27 21:08:32.054  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":1,"startDate":"2020-06-13T22:00:00.000+00:00","endDate":"2020-12-31T22:59:59.000+00:00","price":35.5,"curr":"EUR"}
2020-09-27 21:08:32.071 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:08:32.073  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Mon Jun 15 10:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:08:32.074 DEBUG 21456 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:08:32.080  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:08:32.081 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:08:32.081 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@289f15e9]
2020-09-27 21:08:32.085  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":3,"startDate":"2020-06-14T22:00:00.000+00:00","endDate":"2020-06-15T09:00:00.000+00:00","price":30.5,"curr":"EUR"}
2020-09-27 21:08:32.106 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:08:32.107  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Tue Jun 16 21:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:08:32.109 DEBUG 21456 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:08:32.116  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:08:32.117 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:08:32.117 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@646d810b]
2020-09-27 21:08:32.120  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":4,"startDate":"2020-06-15T14:00:00.000+00:00","endDate":"2020-12-31T22:59:59.000+00:00","price":38.95,"curr":"EUR"}
2020-09-27 21:08:32.137 DEBUG 21456 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:08:32.138  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sat Jun 16 21:00:00 CEST 2018 productId 35455 brandId 1
2020-09-27 21:08:32.140 DEBUG 21456 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:08:32.148  INFO 21456 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:08:32.149 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:08:32.149 DEBUG 21456 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Nothing to write: null body
2020-09-27 21:08:32.154  INFO 21456 --- [           main] c.p.o.integration.OndateIntegrationTest  : response:
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.5 s - in com.priceproduct.ondate.integration.OndateIntegrationTest
2020-09-27 21:08:32.912 DEBUG 21456 --- [extShutdownHook] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@3be8821f, started on Sun Sep 27 21:08:24 CEST 2020
2020-09-27 21:08:32.912 DEBUG 21456 --- [extShutdownHook] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@294a6b8e, started on Sun Sep 27 21:08:23 CEST 2020
2020-09-27 21:08:32.915  INFO 21456 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-09-27 21:08:32.919  INFO 21456 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.1.1:jar (default-jar) @ ondate ---
[INFO] Building jar: C:\Users\frodrise\git\PriceProductOnDate\target\ondate-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:2.3.4.RELEASE:repackage (repackage) @ ondate ---
[INFO] Replacing main artifact with repackaged archive
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  23.898 s
[INFO] Finished at: 2020-09-27T21:08:34+02:00
[INFO] ------------------------------------------------------------------------
```

### Execution of mvn clean install
```shell
$ mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< com.priceproduct:ondate >-----------------------
[INFO] Building ondate 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ ondate ---
[INFO] Deleting C:\Users\frodrise\git\PriceProductOnDate\target
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ ondate ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.5.1:compile (default-compile) @ ondate ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to C:\Users\frodrise\git\PriceProductOnDate\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ ondate ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\frodrise\git\PriceProductOnDate\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.5.1:testCompile (default-testCompile) @ ondate ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to C:\Users\frodrise\git\PriceProductOnDate\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ ondate ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
21:10:40.954 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:40.964 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
21:10:40.976 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
21:10:41.062 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.priceproduct.ondate.integration.OndateIntegrationTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
21:10:41.100 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.priceproduct.ondate.integration.OndateIntegrationTest], using SpringBootContextLoader
21:10:41.105 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTest-context.xml] does not exist
21:10:41.106 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTestContext.groovy] does not exist
21:10:41.106 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: no resource found for suffixes {-context.xml, Context.groovy}.
21:10:41.263 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.479 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.priceproduct.ondate.integration.OndateIntegrationTest]: using defaults.
21:10:41.480 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
21:10:41.517 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@55634720, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@4b0d79fc, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@4c1909a3, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@428640fa, org.springframework.test.context.support.DirtiesContextTestExecutionListener@d9345cd, org.springframework.test.context.transaction.TransactionalTestExecutionListener@2d710f1a, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@29215f06, org.springframework.test.context.event.EventPublishingTestExecutionListener@59505b48, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@4efac082, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@6bd61f98, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@48aca48b, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@13fd2ccd, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@b9b00e0, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@506ae4d4]
21:10:41.521 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.523 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.524 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.524 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.524 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.524 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.640 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.641 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
21:10:41.641 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
21:10:41.641 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.priceproduct.ondate.integration.OndateIntegrationTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
21:10:41.643 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.priceproduct.ondate.integration.OndateIntegrationTest], using SpringBootContextLoader
21:10:41.645 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTest-context.xml] does not exist
21:10:41.647 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: class path resource [com/priceproduct/ondate/integration/OndateIntegrationTestContext.groovy] does not exist
21:10:41.647 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]: no resource found for suffixes {-context.xml, Context.groovy}.
21:10:41.657 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.663 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.priceproduct.ondate.integration.OndateIntegrationTest]: using defaults.
21:10:41.663 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
21:10:41.665 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@6fa51cd4, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@2767e23c, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@710c2b53, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@5386659f, org.springframework.test.context.support.DirtiesContextTestExecutionListener@14028087, org.springframework.test.context.transaction.TransactionalTestExecutionListener@cecf639, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@1caa0244, org.springframework.test.context.event.EventPublishingTestExecutionListener@7ce026d3, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@7ce69770, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@1750fbeb, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@5b247367, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@268f106e, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@6e9a5ed8, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@7e057f43]
21:10:41.666 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.666 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.667 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.668 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.668 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.priceproduct.ondate.integration.OndateIntegrationTest]
21:10:41.668 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.priceproduct.ondate.integration.OndateIntegrationTest]
[INFO] Running com.priceproduct.ondate.OndateApplicationTests
21:10:41.797 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
21:10:41.797 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
21:10:41.799 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.priceproduct.ondate.OndateApplicationTests] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
21:10:41.801 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.priceproduct.ondate.OndateApplicationTests], using SpringBootContextLoader
21:10:41.802 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.OndateApplicationTests]: class path resource [com/priceproduct/ondate/OndateApplicationTests-context.xml] does not exist
21:10:41.803 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.priceproduct.ondate.OndateApplicationTests]: class path resource [com/priceproduct/ondate/OndateApplicationTestsContext.groovy] does not exist
21:10:41.803 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.priceproduct.ondate.OndateApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
21:10:41.806 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.priceproduct.ondate.OndateApplicationTests]
21:10:41.812 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.priceproduct.ondate.OndateApplicationTests]: using defaults.
21:10:41.813 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
21:10:41.814 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@5167f57d, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@64b0598, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@18f8cd79, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@3e2055d6, org.springframework.test.context.support.DirtiesContextTestExecutionListener@50029372, org.springframework.test.context.transaction.TransactionalTestExecutionListener@e3b3b2f, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@50f6ac94, org.springframework.test.context.event.EventPublishingTestExecutionListener@6cc4cdb9, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@28194a50, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@7f2cfe3f, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@1a5b6f42, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@5038d0b5, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@32115b28, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@2ad48653]
21:10:41.822 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@a8ef162 testClass = OndateApplicationTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@2eea88a1 testClass = OndateApplicationTests, locations = '{}', classes = '{interface com.priceproduct.ondate.mapper.OndateMapper, interface com.priceproduct.ondate.mapper.OndateMapper}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@79e2c065, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@7e07db1f, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@59662a0b, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@689604d9, org.springframework.boot.test.context.SpringBootTestArgs@1], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].
21:10:41.887 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}
2020-09-27 21:10:42.242 DEBUG 6952 --- [           main] .c.l.ClasspathLoggingApplicationListener : Application started with classpath: [file:/C:/Users/frodrise/AppData/Local/Temp/surefire4367328196123293312/surefirebooter6193303289591978959.jar]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-27 21:10:42.453  INFO 6952 --- [           main] c.p.ondate.OndateApplicationTests        : Starting OndateApplicationTests on SVQ-D0Z3HR2 with PID 6952 (started by frodrise in C:\Users\frodrise\git\PriceProductOnDate)
2020-09-27 21:10:42.454  INFO 6952 --- [           main] c.p.ondate.OndateApplicationTests        : No active profile set, falling back to default profiles: default
2020-09-27 21:10:42.454 DEBUG 6952 --- [           main] o.s.boot.SpringApplication               : Loading source interface com.priceproduct.ondate.mapper.OndateMapper
2020-09-27 21:10:42.540 DEBUG 6952 --- [           main] o.s.b.c.c.ConfigFileApplicationListener  : Loaded config file 'file:/C:/Users/frodrise/git/PriceProductOnDate/target/classes/application.properties' (classpath:/application.properties)
2020-09-27 21:10:42.542 DEBUG 6952 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Refreshing org.springframework.web.context.support.GenericWebApplicationContext@294a6b8e
2020-09-27 21:10:42.836  INFO 6952 --- [           main] c.p.ondate.OndateApplicationTests        : Started OndateApplicationTests in 0.931 seconds (JVM running for 2.916)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.071 s - in com.priceproduct.ondate.OndateApplicationTests
[INFO] Running com.priceproduct.ondate.domain.PriceTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s - in com.priceproduct.ondate.domain.PriceTest
[INFO] Running com.priceproduct.ondate.integration.OndateIntegrationTest
2020-09-27 21:10:43.742 DEBUG 6952 --- [           main] .c.l.ClasspathLoggingApplicationListener : Application started with classpath: [file:/C:/Users/frodrise/AppData/Local/Temp/surefire4367328196123293312/surefirebooter6193303289591978959.jar]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-09-27 21:10:43.802  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : Starting OndateIntegrationTest on SVQ-D0Z3HR2 with PID 6952 (started by frodrise in C:\Users\frodrise\git\PriceProductOnDate)
2020-09-27 21:10:43.803  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : No active profile set, falling back to default profiles: default
2020-09-27 21:10:43.804 DEBUG 6952 --- [           main] o.s.boot.SpringApplication               : Loading source interface com.priceproduct.ondate.mapper.OndateMapper
2020-09-27 21:10:43.808 DEBUG 6952 --- [           main] o.s.b.c.c.ConfigFileApplicationListener  : Loaded config file 'file:/C:/Users/frodrise/git/PriceProductOnDate/target/classes/application.properties' (classpath:/application.properties)
2020-09-27 21:10:43.809 DEBUG 6952 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Refreshing org.springframework.web.context.support.GenericWebApplicationContext@3be8821f
2020-09-27 21:10:45.409  INFO 6952 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-09-27 21:10:45.663  INFO 6952 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 220ms. Found 1 JPA repository interfaces.
2020-09-27 21:10:45.886  INFO 6952 --- [           main] beddedDataSourceBeanFactoryPostProcessor : Replacing 'dataSource' DataSource bean with embedded version
2020-09-27 21:10:46.355  INFO 6952 --- [           main] o.s.j.d.e.EmbeddedDatabaseFactory        : Starting embedded database: url='jdbc:h2:mem:cc2bd8d3-7acc-4ec1-aa48-57144b6820e5;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false', username='sa'
2020-09-27 21:10:47.464  INFO 6952 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-09-27 21:10:47.634  INFO 6952 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-09-27 21:10:47.833  INFO 6952 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.21.Final
2020-09-27 21:10:48.056  INFO 6952 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-09-27 21:10:48.665  INFO 6952 --- [         task-1] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2020-09-27 21:10:49.168 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2020-09-27 21:10:49.505 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 3 mappings in 'requestMappingHandlerMapping'
2020-09-27 21:10:49.796 DEBUG 6952 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2020-09-27 21:10:49.859 DEBUG 6952 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2020-09-27 21:10:50.488 DEBUG 6952 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2020-09-27 21:10:50.489 DEBUG 6952 --- [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets:
2020-09-27 21:10:50.536  INFO 6952 --- [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2020-09-27 21:10:50.537  INFO 6952 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2020-09-27 21:10:50.588  INFO 6952 --- [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 51 ms
2020-09-27 21:10:50.608  INFO 6952 --- [           main] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositories?
2020-09-27 21:10:51.241  INFO 6952 --- [         task-1] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-09-27 21:10:51.291  INFO 6952 --- [         task-1] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-09-27 21:10:52.238  INFO 6952 --- [           main] DeferredRepositoryInitializationListener : Spring Data repositories initialized!
2020-09-27 21:10:52.259  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : Started OndateIntegrationTest in 8.622 seconds (JVM running for 12.34)
2020-09-27 21:10:52.389 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:10:52.453  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sun Jun 14 10:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:10:52.753 DEBUG 6952 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:10:52.818  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:10:52.824 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:10:52.890 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@3009eed7]
2020-09-27 21:10:52.958  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":1,"startDate":"2020-06-13T22:00:00.000+00:00","endDate":"2020-12-31T22:59:59.000+00:00","price":35.5,"curr":"EUR"}
2020-09-27 21:10:52.974 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:10:52.976  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sun Jun 14 16:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:10:52.977 DEBUG 6952 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:10:52.983  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:10:52.983 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:10:52.984 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@1edfedf1]
2020-09-27 21:10:52.986  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":2,"startDate":"2020-06-14T13:00:00.000+00:00","endDate":"2020-06-14T16:30:00.000+00:00","price":25.45,"curr":"EUR"}
2020-09-27 21:10:52.998 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:10:52.999  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sun Jun 14 21:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:10:53.000 DEBUG 6952 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:10:53.004  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:10:53.004 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:10:53.004 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@1ecf0ac6]
2020-09-27 21:10:53.006  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":1,"startDate":"2020-06-13T22:00:00.000+00:00","endDate":"2020-12-31T22:59:59.000+00:00","price":35.5,"curr":"EUR"}
2020-09-27 21:10:53.018 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:10:53.019  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Mon Jun 15 10:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:10:53.020 DEBUG 6952 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:10:53.024  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:10:53.024 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:10:53.025 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@7f22687e]
2020-09-27 21:10:53.029  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":3,"startDate":"2020-06-14T22:00:00.000+00:00","endDate":"2020-06-15T09:00:00.000+00:00","price":30.5,"curr":"EUR"}
2020-09-27 21:10:53.041 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:10:53.042  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Tue Jun 16 21:00:00 CEST 2020 productId 35455 brandId 1
2020-09-27 21:10:53.043 DEBUG 6952 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:10:53.048  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:10:53.048 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:10:53.049 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Writing [com.priceproduct.ondate.domain.OndateResponse@30508066]
2020-09-27 21:10:53.051  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : response: {"productId":35455,"brandId":1,"priceList":4,"startDate":"2020-06-15T14:00:00.000+00:00","endDate":"2020-12-31T22:59:59.000+00:00","price":38.95,"curr":"EUR"}
2020-09-27 21:10:53.067 DEBUG 6952 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to com.priceproduct.ondate.controller.OndateController#getPrice(Date, Integer, Integer)
2020-09-27 21:10:53.068  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Starting getPrice() method : date Sat Jun 16 21:00:00 CEST 2018 productId 35455 brandId 1
2020-09-27 21:10:53.070 DEBUG 6952 --- [           main] org.hibernate.SQL                        : select price0_.id as id1_0_, price0_.brand_id as brand_id2_0_, price0_.curr as curr3_0_, price0_.end_date as end_date4_0_, price0_.price as price5_0_, price0_.price_list as price_li6_0_, price0_.priority as priority7_0_, price0_.product_id as product_8_0_, price0_.start_date as start_da9_0_ from prices price0_ where price0_.product_id=? and price0_.brand_id=? and price0_.start_date<? and price0_.end_date>? order by price0_.priority desc limit ?
2020-09-27 21:10:53.073  INFO 6952 --- [           main] c.p.ondate.controller.OndateController   : Finishing getPrice() method
2020-09-27 21:10:53.074 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Using 'application/json', given [*/*] and supported [application/json]
2020-09-27 21:10:53.074 DEBUG 6952 --- [           main] o.s.w.s.m.m.a.HttpEntityMethodProcessor  : Nothing to write: null body
2020-09-27 21:10:53.076  INFO 6952 --- [           main] c.p.o.integration.OndateIntegrationTest  : response:
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.813 s - in com.priceproduct.ondate.integration.OndateIntegrationTest
2020-09-27 21:10:53.605 DEBUG 6952 --- [extShutdownHook] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@294a6b8e, started on Sun Sep 27 21:10:42 CEST 2020
2020-09-27 21:10:53.605 DEBUG 6952 --- [extShutdownHook] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@3be8821f, started on Sun Sep 27 21:10:43 CEST 2020
2020-09-27 21:10:53.607  INFO 6952 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-09-27 21:10:53.610  INFO 6952 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.1.1:jar (default-jar) @ ondate ---
[INFO] Building jar: C:\Users\frodrise\git\PriceProductOnDate\target\ondate-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:2.3.4.RELEASE:repackage (repackage) @ ondate ---
[INFO] Replacing main artifact with repackaged archive
[INFO]
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ ondate ---
[INFO] Installing C:\Users\frodrise\git\PriceProductOnDate\target\ondate-0.0.1-SNAPSHOT.jar to C:\Users\frodrise\.m2\repository\com\priceproduct\ondate\0.0.1-SNAPSHOT\ondate-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\frodrise\git\PriceProductOnDate\pom.xml to C:\Users\frodrise\.m2\repository\com\priceproduct\ondate\0.0.1-SNAPSHOT\ondate-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  33.769 s
[INFO] Finished at: 2020-09-27T21:10:55+02:00
[INFO] ------------------------------------------------------------------------
```