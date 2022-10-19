package demo1;

import org.openqa.selenium.By;

public interface Locators {
	public String URL="https://the-internet.herokuapp.com/";
	By addHeader=By.xpath("//h3[contains(text(),'Add')]");
	By addButton=By.xpath("//button[.='Add Element']");
	By deleteButton=By.xpath("//button[.='Delete']");
	By addOrRemoveLink=By.linkText("Add/Remove Elements");
	By checkBox=By.xpath("//li/a[text()='Checkboxes']");
	By checkbox1=By.xpath("//input[position()=1]");
	By checkbox2=By.xpath("//input[position()=2]");
}
