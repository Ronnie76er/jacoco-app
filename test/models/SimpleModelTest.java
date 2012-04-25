package models;

import org.junit.*;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.start;
import static play.test.Helpers.stop;
import com.avaje.ebean.Ebean;

import play.test.FakeApplication;



public class SimpleModelTest {

    private static FakeApplication application;

    @BeforeClass
    public static void oneTimeSetup() {
        application = fakeApplication();
        start(application);
    }

    @AfterClass
    public static void oneTimeTearDown() {
        stop(application);
    }

    @Test
    public void test() {
        int i = 1 + 1;

        assertThat(i).isEqualTo(2);
        Ebean.beginTransaction();
        SimpleModel model = new SimpleModel();
        model.name = "Hi";
        model.save();

        SimpleModel retrievedModel = SimpleModel.findById(model.id);
        assertThat(retrievedModel.name).isEqualTo("Hi");
        Ebean.endTransaction();
    }
}