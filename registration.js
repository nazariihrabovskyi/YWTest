var webdriver  = require('selenium-webdriver');
var assert = require('assert');
var driver = new webdriver.Builder().withCapabilities(webdriver.Capabilities.chrome()).build();
        driver.get('https://app.yaware.com.ua/#register');

        driver.findElement(webdriver.By.id('firstname')).sendKeys('Назар(тест)');

        driver.findElement(webdriver.By.id('lastname')).sendKeys('Test');
        driver.findElement(webdriver.By.id('registerEmail')).sendKeys('10minut@mail.com');
        driver.findElement(webdriver.By.id('pwd1')).sendKeys('pwdqwerty123');
        
driver.findElement(webdriver.By.id('lastname'))
      .getText().then(textValue => {
    var assert = assert();
        assert.equal('Test', Test);
      });
        driver.manage().timeouts().setScriptTimeout(10000);
        return driver;