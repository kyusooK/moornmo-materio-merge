package moornmomaterio.common;

import io.cucumber.spring.CucumberContextConfiguration;
import moornmomaterio.SalesApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SalesApplication.class })
public class CucumberSpingConfiguration {}
