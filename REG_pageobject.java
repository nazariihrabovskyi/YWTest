import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class REG {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "logo")
    @CacheLookup
    private WebElement ;

    @FindBy(css = "a[href='#log-in']")
    @CacheLookup
    private WebElement 1;

    @FindBy(css = "a[href='#forgot-password']")
    @CacheLookup
    private WebElement 1;

    @FindBy(id = "firstname")
    @CacheLookup
    private WebElement 1;

    @FindBy(css = "a[title='Не соромтеся ставити будь-які запитання щодо сервісу Yaware.TimeTracker']")
    @CacheLookup
    private WebElement 10;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement 2;

    @FindBy(id = "lastname")
    @CacheLookup
    private WebElement 2;

    @FindBy(css = "a[href='#register']")
    @CacheLookup
    private WebElement 2;

    @FindBy(id = "registerEmail")
    @CacheLookup
    private WebElement 3;

    @FindBy(id = "login-submit")
    @CacheLookup
    private WebElement 3;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement 3;

    @FindBy(id = "pwd1")
    @CacheLookup
    private WebElement 4;

    @FindBy(id = "rememberMe")
    @CacheLookup
    private WebElement 4;

    @FindBy(css = "a[title='Натисніть тут, щоб створити обліковий запис Yaware.TimeTracker']")
    @CacheLookup
    private WebElement 4;

    @FindBy(css = "a[title='Натисніть тут, щоб нагадати пароль']")
    @CacheLookup
    private WebElement 5;

    @FindBy(css = "a[title='Натисніть тут, щоб увійти в систему як менеджер групи']")
    @CacheLookup
    private WebElement 5;

    @FindBy(id = "coupone_code")
    @CacheLookup
    private WebElement 5;

    @FindBy(id = "remind-password-submit")
    @CacheLookup
    private WebElement 6;

    @FindBy(css = "a[title='Натисніть тут, щоб увійти в систему як партнер']")
    @CacheLookup
    private WebElement 6;

    @FindBy(id = "termsOfService")
    @CacheLookup
    private WebElement 6;

    @FindBy(id = "input-other-text")
    @CacheLookup
    private WebElement 7;

    @FindBy(id = "remindEmail")
    @CacheLookup
    private WebElement 7;

    @FindBy(css = "a[title='Політика конфіденційності']")
    @CacheLookup
    private WebElement 7;

    @FindBy(css = "a[title='Terms Of Service']")
    @CacheLookup
    private WebElement 8;

    @FindBy(css = "a[title='Умови надання послуг']")
    @CacheLookup
    private WebElement 9;

    @FindBy(css = "a.hide-form-element")
    @CacheLookup
    private WebElement couponecode;

    @FindBy(css = "#lang-box div.language_images a:nth-of-type(1)")
    @CacheLookup
    private WebElement english;

    @FindBy(css = "#register-vertical div.social_button a:nth-of-type(1)")
    @CacheLookup
    private WebElement facebook1;

    @FindBy(css = "#register-vertical div.social_button a:nth-of-type(1)")
    @CacheLookup
    private WebElement facebook2;

    @FindBy(css = "#register-vertical div.social_button a:nth-of-type(2)")
    @CacheLookup
    private WebElement google1;

    @FindBy(css = "#register-vertical div.social_button a:nth-of-type(2)")
    @CacheLookup
    private WebElement google2;

    @FindBy(css = "#register-vertical div.social_button a:nth-of-type(3)")
    @CacheLookup
    private WebElement linkedin1;

    @FindBy(css = "#register-vertical div.social_button a:nth-of-type(3)")
    @CacheLookup
    private WebElement linkedin2;

    @FindBy(css = "a[title='Версія сервісу']")
    @CacheLookup
    private WebElement nov23201727822650;

    private final String pageLoadedText = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";

    private final String pageUrl = "/#register";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement russia7ukraine380afghanistan93albaniaShqipri355algeria213american1;

    @FindBy(name = "user-rate")
    @CacheLookup
    private List<WebElement> russia7ukraine380afghanistan93albaniaShqipri355algeria213american2;

    @FindBy(name = "user-rate")
    @CacheLookup
    private List<WebElement> russia7ukraine380afghanistan93albaniaShqipri355algeria213american3;

    @FindBy(name = "user-rate")
    @CacheLookup
    private List<WebElement> russia7ukraine380afghanistan93albaniaShqipri355algeria213american4;

    @FindBy(name = "user-rate")
    @CacheLookup
    private List<WebElement> russia7ukraine380afghanistan93albaniaShqipri355algeria213american5;

    @FindBy(name = "user-rate")
    @CacheLookup
    private List<WebElement> russia7ukraine380afghanistan93albaniaShqipri355algeria213american6;

    @FindBy(id = "user-comment")
    @CacheLookup
    private WebElement russia7ukraine380afghanistan93albaniaShqipri355algeria213american7;

    private final String russia7ukraine380afghanistan93albaniaShqipri355algeria213americanValue = "on";

    private final String russia7ukraine380afghanistan93albaniaShqipri355algeria213americanValue = "on";

    private final String russia7ukraine380afghanistan93albaniaShqipri355algeria213americanValue = "on";

    private final String russia7ukraine380afghanistan93albaniaShqipri355algeria213americanValue = "on";

    private final String russia7ukraine380afghanistan93albaniaShqipri355algeria213americanValue = "on";

    @FindBy(css = "a[title='Відвідайте сайт https://timetracker.yaware.com.ua/']")
    @CacheLookup
    private WebElement yaware;

    public REG() {
    }

    public REG(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public REG(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public REG(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Couponecode Link.
     *
     * @return the REG class instance.
     */
    public REG clickCouponecodeLink() {
        couponecode.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the REG class instance.
     */
    public REG clickEnglishLink() {
        english.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the REG class instance.
     */
    public REG clickFacebook1Link() {
        facebook1.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the REG class instance.
     */
    public REG clickFacebook2Link() {
        facebook2.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the REG class instance.
     */
    public REG clickGoogle1Link() {
        google1.click();
        return this;
    }

    /**
     * Click on Google Link.
     *
     * @return the REG class instance.
     */
    public REG clickGoogle2Link() {
        google2.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink() {
        .click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink1() {
        1.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink10() {
        10.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink2() {
        2.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink3() {
        3.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink4() {
        4.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink5() {
        5.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink5() {
        5.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink6() {
        6.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink6() {
        6.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink7() {
        7.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink8() {
        8.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the REG class instance.
     */
    public REG clickLink9() {
        9.click();
        return this;
    }

    /**
     * Click on Linkedin Link.
     *
     * @return the REG class instance.
     */
    public REG clickLinkedin1Link() {
        linkedin1.click();
        return this;
    }

    /**
     * Click on Linkedin Link.
     *
     * @return the REG class instance.
     */
    public REG clickLinkedin2Link() {
        linkedin2.click();
        return this;
    }

    /**
     * Click on 2.78.22650 Nov 23 2017 Link.
     *
     * @return the REG class instance.
     */
    public REG clickNov232017Link27822650() {
        nov23201727822650.click();
        return this;
    }

    /**
     * Click on Yaware Link.
     *
     * @return the REG class instance.
     */
    public REG clickYawareLink() {
        yaware.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the REG class instance.
     */
    public REG fill() {
        setTextField2();
        setPasswordField3();
        setCheckboxField4();
        setTextField7();
        set1TextField();
        set2TextField();
        set3TextField();
        set4PasswordField();
        setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american1RadioButtonField();
        set5TextField();
        set6CheckboxField();
        set7TextField();
        setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american2RadioButtonField();
        setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american3RadioButtonField();
        setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american4RadioButtonField();
        setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american5RadioButtonField();
        setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american6RadioButtonField();
        setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american7TextareaField();
        return this;
    }

    /**
     * Set default value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set1TextField() {
        return set1TextField(data.get("1_"));
    }

    /**
     * Set value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set1TextField(String 1Value) {
        1.sendKeys(1Value);
        return this;
    }

    /**
     * Set default value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set2TextField() {
        return set2TextField(data.get("2_"));
    }

    /**
     * Set value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set2TextField(String 2Value) {
        2.sendKeys(2Value);
        return this;
    }

    /**
     * Set default value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set3TextField() {
        return set3TextField(data.get("3_"));
    }

    /**
     * Set value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set3TextField(String 3Value) {
        3.sendKeys(3Value);
        return this;
    }

    /**
     * Set default value to . Password field.
     *
     * @return the REG class instance.
     */
    public REG set4PasswordField() {
        return set4PasswordField(data.get("4_"));
    }

    /**
     * Set value to . Password field.
     *
     * @return the REG class instance.
     */
    public REG set4PasswordField(String 4Value) {
        4.sendKeys(4Value);
        return this;
    }

    /**
     * Set default value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set5TextField() {
        return set5TextField(data.get("5_"));
    }

    /**
     * Set value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set5TextField(String 5Value) {
        5.sendKeys(5Value);
        return this;
    }

    /**
     * Set . Checkbox field.
     *
     * @return the REG class instance.
     */
    public REG set6CheckboxField() {
        if (!6.isSelected()) {
            6.click();
        }
        return this;
    }

    /**
     * Set default value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set7TextField() {
        return set7TextField(data.get("7_"));
    }

    /**
     * Set value to . Text field.
     *
     * @return the REG class instance.
     */
    public REG set7TextField(String 7Value) {
        7.sendKeys(7Value);
        return this;
    }

    /**
     * Set  Checkbox field.
     *
     * @return the REG class instance.
     */
    public REG setCheckboxField4() {
        if (!4.isSelected()) {
            4.click();
        }
        return this;
    }

    /**
     * Set default value to  Password field.
     *
     * @return the REG class instance.
     */
    public REG setPasswordField3() {
        return setPasswordField3(data.get("3"));
    }

    /**
     * Set value to  Password field.
     *
     * @return the REG class instance.
     */
    public REG setPasswordField3(String value3) {
        3.sendKeys(value3);
        return this;
    }

    /**
     * Set default value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Radio Button field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american1RadioButtonField() {
        return setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american1RadioButtonField(data.get("RUSSIA_7UKRAINE_380AFGHANISTAN_93ALBANIA_SHQIPRI355ALGERIA_213AMERICAN_1"));
    }

    /**
     * Set value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Radio Button field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american1RadioButtonField(String russia7ukraine380afghanistan93albaniaShqipri355algeria213american1Value) {
        russia7ukraine380afghanistan93albaniaShqipri355algeria213american1.sendKeys(russia7ukraine380afghanistan93albaniaShqipri355algeria213american1Value);
        return this;
    }

    /**
     * Set default value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Radio Button field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american2RadioButtonField() {
        for (WebElement el : russia7ukraine380afghanistan93albaniaShqipri355algeria213american2) {
            if (el.getAttribute("value").equals(russia7ukraine380afghanistan93albaniaShqipri355algeria213american2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Radio Button field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american3RadioButtonField() {
        for (WebElement el : russia7ukraine380afghanistan93albaniaShqipri355algeria213american3) {
            if (el.getAttribute("value").equals(russia7ukraine380afghanistan93albaniaShqipri355algeria213american3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Radio Button field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american4RadioButtonField() {
        for (WebElement el : russia7ukraine380afghanistan93albaniaShqipri355algeria213american4) {
            if (el.getAttribute("value").equals(russia7ukraine380afghanistan93albaniaShqipri355algeria213american4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Radio Button field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american5RadioButtonField() {
        for (WebElement el : russia7ukraine380afghanistan93albaniaShqipri355algeria213american5) {
            if (el.getAttribute("value").equals(russia7ukraine380afghanistan93albaniaShqipri355algeria213american5Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Radio Button field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american6RadioButtonField() {
        for (WebElement el : russia7ukraine380afghanistan93albaniaShqipri355algeria213american6) {
            if (el.getAttribute("value").equals(russia7ukraine380afghanistan93albaniaShqipri355algeria213american6Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Textarea field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american7TextareaField() {
        return setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american7TextareaField(data.get("RUSSIA_7UKRAINE_380AFGHANISTAN_93ALBANIA_SHQIPRI355ALGERIA_213AMERICAN_7"));
    }

    /**
     * Set value to Russia 7ukraine 380afghanistan 93albania Shqipri355algeria 213american Samoa1684andorra376angola244anguilla1264antigua And Barbuda1268argentina54armenia 374aruba297australia61austria Sterreich43azerbaijan Azrbaycan994bahamas1242bahrain 973bangladesh 880barbados1246belarus 375belgium Belgi32belize501benin Bnin229bermuda1441bhutan 975bolivia591bosnia And Herzegovina 387botswana267brazil Brasil55british Indian Ocean Territory246british Virgin Islands1284brunei673bulgaria 359burkina Faso226burundi Uburundi257cambodia 855cameroon Cameroun237canada1cape Verde Kabu Verdi238caribbean Netherlands599cayman Islands1345central African Republic Rpublique Centrafricaine236chad Tchad235chile56china 86colombia57comoros 269congo Drc Jamhuri Ya Kidemokrasia Ya Kongo243congo Republic Congobrazzaville242cook Islands682costa Rica506cte Divoire225croatia Hrvatska385cuba53curaao599cyprus 357czech Republic Esk Republika420denmark Danmark45djibouti253dominica1767dominican Republic Repblica Dominicana1ecuador593egypt 20el Salvador503equatorial Guinea Guinea Ecuatorial240eritrea291estonia Eesti372ethiopia251falkland Islands Islas Malvinas500faroe Islands Froyar298fiji679finland Suomi358france33french Guiana Guyane Franaise594french Polynesia Polynsie Franaise689gabon241gambia220georgia 995germany Deutschland49ghana Gaana233gibraltar350greece 30greenland Kalaallit Nunaat299grenada1473guadeloupe590guam1671guatemala502guinea Guine224guineabissau Guin Bissau245guyana592haiti509honduras504hong Kong 852hungary Magyarorszg36iceland Sland354india 91indonesia62iran 98iraq 964ireland353israel 972italy Italia39jamaica1876japan 81jordan 962kazakhstan 7kenya254kiribati686kuwait 965kyrgyzstan 996laos 856latvia Latvija371lebanon 961lesotho266liberia231libya 218liechtenstein423lithuania Lietuva370luxembourg352macau 853macedonia Fyrom 389madagascar Madagasikara261malawi265malaysia60maldives960mali223malta356marshall Islands692martinique596mauritania 222mauritius Moris230mexico Mxico52micronesia691moldova Republica Moldova373monaco377mongolia 976montenegro Crna Gora382montserrat1664morocco 212mozambique Moambique258myanmar Burma 95namibia Namibi264nauru674nepal 977netherlands Nederland31new Caledonia Nouvellecaldonie687new Zealand64nicaragua505niger Nijar227nigeria234niue683norfolk Island672north Korea 850northern Mariana Islands1670norway Norge47oman 968pakistan 92palau680palestine 970panama Panam507papua New Guinea675paraguay595peru Per51philippines63poland Polska48portugal351puerto Rico1qatar 974runion La Runion262romania Romnia40russia 7rwanda250saint Barthlemy Saintbarthlemy590saint Helena290saint Kitts And Nevis1869saint Lucia1758saint Martin Saintmartin Partie Franaise590saint Pierre And Miquelon Saintpierreetmiquelon508saint Vincent And The Grenadines1784samoa685san Marino378so Tom And Prncipe So Tom E Prncipe239saudi Arabia 966senegal Sngal221serbia 381seychelles248sierra Leone232singapore65sint Maarten1721slovakia Slovensko421slovenia Slovenija386solomon Islands677somalia Soomaaliya252south Africa27south Korea 82south Sudan 211spain Espaa34sri Lanka 94sudan 249suriname597swaziland268sweden Sverige46switzerland Schweiz41syria 963taiwan 886tajikistan992tanzania255thailand 66timorleste670togo228tokelau690tonga676trinidad And Tobago1868tunisia 216turkey Trkiye90turkmenistan993turks And Caicos Islands1649tuvalu688u Textarea field.
     *
     * @return the REG class instance.
     */
    public REG setRussia7ukraine380afghanistan93albaniaShqipri355algeria213american7TextareaField(String russia7ukraine380afghanistan93albaniaShqipri355algeria213american7Value) {
        russia7ukraine380afghanistan93albaniaShqipri355algeria213american7.sendKeys(russia7ukraine380afghanistan93albaniaShqipri355algeria213american7Value);
        return this;
    }

    /**
     * Set default value to  Text field.
     *
     * @return the REG class instance.
     */
    public REG setTextField1() {
        return setTextField1(data.get("1"));
    }

    /**
     * Set value to  Text field.
     *
     * @return the REG class instance.
     */
    public REG setTextField1(String value1) {
        1.click();
        return this;
    }

    /**
     * Set default value to  Text field.
     *
     * @return the REG class instance.
     */
    public REG setTextField2() {
        return setTextField2(data.get("2"));
    }

    /**
     * Set value to  Text field.
     *
     * @return the REG class instance.
     */
    public REG setTextField2(String value2) {
        2.sendKeys(value2);
        return this;
    }

    /**
     * Set default value to  Text field.
     *
     * @return the REG class instance.
     */
    public REG setTextField7() {
        return setTextField7(data.get("7"));
    }

    /**
     * Set value to  Text field.
     *
     * @return the REG class instance.
     */
    public REG setTextField7(String value7) {
        7.sendKeys(value7);
        return this;
    }

    /**
     * Unset . Checkbox field.
     *
     * @return the REG class instance.
     */
    public REG unset6CheckboxField() {
        if (6.isSelected()) {
            6.click();
        }
        return this;
    }

    /**
     * Unset  Checkbox field.
     *
     * @return the REG class instance.
     */
    public REG unsetCheckboxField4() {
        if (4.isSelected()) {
            4.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the REG class instance.
     */
    public REG verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the REG class instance.
     */
    public REG verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
