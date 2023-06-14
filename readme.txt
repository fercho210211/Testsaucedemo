Instruciones de instalación
las instrucciones paso a paso para ejecutar la automatización de la página 
https://www.saucedemo.com/ utilizando Selenium WebDriver en Java:

1. Configuración del entorno:

Descargar una copia o clonar el código del repositorio desde GitHub.
Asegúrate de tener instalado Java Development Kit (JDK) en tu sistema.
Descarga e instala Intellij Idea (o cualquier otro IDE de tu elección) para escribir y ejecutar el código Java.
Descarga Selenium WebDriver para Java desde el sitio web oficial de Selenium: https://www.selenium.dev/downloads/
Configura Selenium WebDriver en tu proyecto de Eclipse.

2. Crea un nuevo proyecto en Intellij Idea

Abre Intellij Ideay crea un nuevo proyecto.
Crea una nueva clase Java dentro del proyecto.

3. Importa las bibliotecas necesarias:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

4. Configura el WebDriver:

Descarga el controlador del navegador Chrome (ChromeDriver) compatible 
con la versión de tu navegador Chrome desde: https://chromedriver.chromium.org/home
Extrae el archivo descargado y establece la ubicación del controlador en tu código Java:

System.setProperty("webdriver.chrome.driver", "ruta/del/chromedriver");

5. Inicia la sesión:
-Crea una instancia del controlador de Chrome y abre el sitio web:

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");

6.Incia sesión con las credenciales:
	WebElement usernameField = driver.findElement(By.id("user-name"));
	WebElement passwordField = driver.findElement(By.id("password"));

- Ingresa las credenciales en los campos y envíalas:
	usernameField.sendKeys("standard_user");
	passwordField.sendKeys("secret_sauce");
	passwordField.submit();

7. Selecciona productos y visualízalos en el carrito:

Encuentra los elementos de los productos que deseas agregar al carrito utilizando su identificador o etiqueta única:

	WebElement firstProduct = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        firstProduct.click();
        WebElement seconddtProduct = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        seconddtProduct.click();


- Ve al carrito para verificar los productos agregados:
	WebElement viewToCartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        viewToCartButton.click();

8. Llenado del formulario de compra:

Completa los campos requeridos en el formulario 

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

9. Finaliza la compra:
Envía el formulario para realizar la compra:
	WebElement elementoTexto = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        String texto = elementoTexto.getText();

- Verificar que la compra fue realizada correctamente y cerrar:

        String textoDeseado = "Thank you for your order!";
        if (texto.equals(textoDeseado)) {
            System.out.println("El texto coincide");
        } else {
            System.out.println("El texto no coincide");
        }
	driver.quit();
















