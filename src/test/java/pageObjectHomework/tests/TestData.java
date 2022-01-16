package pageObjectHomework.tests;

import com.github.javafaker.Faker;

import static pageObjectHomework.tests.TestBase.dataComponent;

public class TestData {
    static Faker faker = new Faker();
    public String genderType = "Male";
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String userAdress = faker.address().fullAddress();
    public String userEmail = faker.internet().emailAddress();
    public String userNumber = ("79" + faker.phoneNumber().subscriberNumber(8));
    public String userCity = "Karnal";
    public String userState = "Haryana";
    public static String userPicture = "files/pngTest.png";
    public int userDateDay = dataComponent.day;
    public int userDateMonth = dataComponent.month;
    public String userDateYear = dataComponent.year;
    public String userDateMonthAssert = dataComponent.userMonthAssert;
    public String submitFormText = "Thanks for submitting the form";
    public String[] subjects = {"Chemistry", "Arts", "English", "Commerce"},
            hobbies = {"Sports", "Reading", "Music"};
}