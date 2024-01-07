package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by bhavesh
 */
@RunWith(SerenityRunner.class)
public class StudentCURDTestWithSteps extends TestBase {

    @Steps
    StudentSteps studentSteps;

    @Title("This will create a new student")
    @Test
    public void test001() {

    }

    @Title("verify if student is created")
    @Test
    public void test002() {

    }

    @Title("update the user information")
    @Test
    public void test003() {

    }
    @Title("Delete student info by StudentID and verify its deleted")
    @Test
    public void test004(){

    }

}
