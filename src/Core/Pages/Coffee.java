package Pages;

import Elements.BaseMethods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Coffee {

    BaseMethods actions =new BaseMethods();

    private String base_page = "https://pokofemanim.ru/";
    private By search_field = By.name("s");
    private By all = By.xpath("//*[@id=\"categories-3\"]/ul/li[1]");
    private By for_fat_man = By.partialLinkText("для похудения");
    private By diet = By.linkText("Кофейная диета");

    @Step("Access site")
    public void open_base_page(){
        actions.open_page(base_page);
    }

    @Step("Use search to find text")
    public void searchFor(String value) {
        actions.write_text(search_field,value);
    }

    @Step("Verity search target")
    public void check_search (String value){

        actions.assertion(actions.getPageName().contains(value), true);
    }

    @Step("Click element")
    public void select_result (){
        actions.click(all);
    }

    @Step("Select next receipt")
    public void select_fat (){

        actions.click(for_fat_man);
    }

    @Step("To the Diet")
    public void diet(){
        actions.click(diet);
    }


}
