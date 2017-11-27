var webdriver  = require('selenium-webdriver');
//var assert = require('assert');
var driver = new webdriver.Builder().withCapabilities(webdriver.Capabilities.chrome()).build();
        driver.get('https://app.yaware.com.ua/');

        driver.findElement(webdriver.By.id('email')).sendKeys('s983843@mvrht.net');

        driver.findElement(webdriver.By.id('password')).sendKeys('Test123456789');

        driver.findElement(webdriver.By.id('login-submit')).click();
        
driver.wait(function () {
    return driver.isElementPresent(webdriver.By.id("welcome-add-employees"));
}, 3000);
        //driver.findElement(webdriver.By.id('welcome-add-employees')).click();

/*driver.findElement(webdriver.By.id('lastname'))
      .getText().then(textValue => {
    var assert = assert();
        assert.equal('Test', Test);
      });*/
        driver.quit();