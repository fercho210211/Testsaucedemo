package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemoAutomation {
    public static void main(String[] args) {
        // Establecer la ubicación del controlador de Selenium WebDriver para Chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fernando\\Desktop\\InstalaciónProject\\Project\\SeleniumTest2\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navegar a la página web de DemoBlaze
        driver.get("https://www.saucedemo.com/");

        // 1: Autentificación con usuario y contraseña
        String username = "standard_user";
        String password = "secret_sauce";

        WebElement usernameImput = driver.findElement(By.id("user-name"));
        WebElement passwordImput = driver.findElement(By.id("password"));
        WebElement loginBtn2 = driver.findElement(By.id("login-button"));

        usernameImput.sendKeys(username);
        passwordImput.sendKeys(password);
        loginBtn2.click();

        // 2: Agregar dos productos al carrito
        WebElement firstProduct = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        firstProduct.click();
        WebElement seconddtProduct = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        seconddtProduct.click();

        // 3: Visializar el producto al carrito
        WebElement viewToCartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        viewToCartButton.click();

        // 4: Completar el formulario de compras
        WebElement compForm = driver.findElement(By.id("checkout"));
        compForm.click();

        String firtname = "Luisfernando";
        String lastname = "gonzales";
        String postcode = "0000";

        WebElement firtsnameImput = driver.findElement(By.id("first-name"));
        WebElement lastsnameImput = driver.findElement(By.id("last-name"));
        WebElement postcodeImput = driver.findElement(By.id("postal-code"));
        WebElement contiImputBtn = driver.findElement(By.id("continue"));

        firtsnameImput.sendKeys(firtname);
        lastsnameImput.sendKeys(lastname);
        postcodeImput.sendKeys(postcode);
        contiImputBtn.click();

        WebElement FinishBtn = driver.findElement(By.id("finish"));
        FinishBtn.click();

        // 5: Finalizar la compra hasta la confirmación
        WebElement elementoTexto = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        String texto = elementoTexto.getText();

        String textoDeseado = "Thank you for your order!";
        if (texto.equals(textoDeseado)) {
            System.out.println("El texto coincide");
        } else {
            System.out.println("El texto no coincide");
        }
        // Cerrar el navegador
        driver.quit();
    }
}
