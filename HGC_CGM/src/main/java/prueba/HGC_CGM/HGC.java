package prueba.HGC_CGM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HGC  {
WebDriver driver;
String url="";

Properties p = new Properties();  


public HGC(String url) {
this.url=url;
driverSet();
}

public void driverSet() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\HGC_CGM\\CHROMEDRIVER\\chromedriver.exe");
driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

}

Eliminar driverEliminar;


public void abrirUrl() throws InterruptedException {
driver.manage().window().maximize();
driver.get(url);
driver.findElement(By.xpath("//*[@id=\"usuario\"]")).sendKeys("ESBAPP2");
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Redhat2019");
driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/button")).click();
Thread.sleep(1000);
}



public void creartarea() throws InterruptedException {
driver.findElement(By.xpath("//*[@id=\"btnSalidas\"]")).click();
//Thread.sleep(7000);
driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul/li[1]/form/div/div[2]/ul/li[4]/a")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"EjecucionProgramada\"]/div/div/div[2]/div[2]/button")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"nombre-tarea\"]")).sendKeys("PRUEBA_AUTO");
Thread.sleep(300);
//driver.findElement(By.xpath("(//*[@id=\"select-estado\"]/option[2])[2]")).click(); //inactivo
driver.findElement(By.xpath("(//*[@id=\"select-estado\"]/option[1])[2]")).click(); // activo 
Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"btnPopOver\"]")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"MinutesInput\"]/option[5]")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"btnGenerate\"]")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"btnClosePopover\"]")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"select-tipo-variacion\"]/option[4]")).click();
Thread.sleep(100);
driver.findElement(By.xpath("//*[@id=\"nuevo-automatico\"]/div/div/form/div[1]/div/div/div[2]/div[2]/span/div/div/button")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"nuevo-automatico\"]/div/div/form/div[1]/div/div/div[2]/div[2]/span/div/div/ul/li[17]/a")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//*[@id=\"nuevo-automatico\"]/div/div/form/div[2]/div/div[1]/button")).click();

}

public void Editar() throws InterruptedException{
	
	//driver.findElement(By.xpath("//*[@id=\"btnSalidas\"]")).click();	
	//driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul/li[1]/form/div/div[2]/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"consultaNombre\"]")).sendKeys("PRUEBA_AUTO");
	Thread.sleep(100);
	driver.findElement(By.xpath("//*[@id=\"EjecucionProgramada\"]/div/div/div[2]/div[1]/form/div/div[3]/div[2]/button")).click();
	Thread.sleep(100);
	driver.findElement(By.xpath("//*[@id=\"tablaResultadoBusqueda\"]/table/tbody/tr/td[8]/div/a[1]")).click();
	Thread.sleep(200);
	driver.findElement(By.xpath("(//*[@id=\"select-estado\"]/option[2])[2]")).click(); //inactivo
	//driver.findElement(By.xpath("(//*[@id=\"select-estado\"]/option[1])[2]")).click(); //Activo 
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\"btnPopOver\"]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\"MinutesInput\"]/option[3]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\"btnGenerate\"]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\"btnClosePopover\"]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\"select-tipo-variacion\"]/option[4]")).click();
	Thread.sleep(100);
	driver.findElement(By.xpath("//*[@id=\"nuevo-automatico\"]/div/div/form/div[1]/div/div/div[2]/div[2]/span/div/div/button")).click();
	Thread.sleep(300);
	//driver.findElement(By.xpath("//*[@id=\"nuevo-automatico\"]/div/div/form/div[1]/div/div/div[2]/div[2]/span/div/div/ul/li[1]/div/input")).sendKeys("CALC_TIES");
	driver.findElement(By.xpath("//*[@id=\"nuevo-automatico\"]/div/div/form/div[1]/div/div/div[2]/div[2]/span/div/div/ul/li[21]/a")).click();
	//*[@id="nuevo-automatico"]/div/div/form/div[1]/div/div/div[2]/div[2]/span/div/div/ul/li[8]/a
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\"nuevo-automatico\"]/div/div/form/div[2]/div/div[1]/button")).click();

	
}


public void eliminar() throws InterruptedException {
	
	//driver.findElement(By.xpath("//*[@id=\"btnSalidas\"]")).click();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul/li[1]/form/div/div[2]/ul/li[4]/a")).click();
	//Thread.sleep(300);
	//driver.findElement(By.xpath("//*[@id=\"EjecucionProgramada\"]/div/div/div[2]/div[2]/button")).click();
	//Thread.sleep(300);
	//driver.findElement(By.xpath("//*[@id=\"consultaNombre\"]")).sendKeys("PRUEBA_AUTO");
	//Thread.sleep(300);
	//driver.findElement(By.xpath("//*[@id=\"EjecucionProgramada\"]/div/div/div[2]/div[1]/form/div/div[3]/div[2]/button")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\"tablaResultadoBusqueda\"]/table/tbody/tr/td[8]/div/a[2]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//*[@id=\"modalEliminarSalidaAutomatica\"]/div/div/div[3]/button[1]")).click();
	
	
}





public static void main(String[] args) throws InterruptedException, AWTException, FileNotFoundException, IOException {


HGC demo=new HGC("http://192.168.98.157:8080//xm-hgc/#!/login");
demo.abrirUrl();
demo.creartarea();
//demo.Editar();
//demo.eliminar();
System.out.println("Resultado exitoso");

}


}
