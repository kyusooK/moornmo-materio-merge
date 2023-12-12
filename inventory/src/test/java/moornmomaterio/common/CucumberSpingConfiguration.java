package moornmomaterio.common;

import io.cucumber.spring.CucumberContextConfiguration;
import moornmomaterio.InventoryApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InventoryApplication.class })
public class CucumberSpingConfiguration {}
