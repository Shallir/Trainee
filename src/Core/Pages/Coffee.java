package Pages;

import Elements.BaseMethods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Coffee {

    BaseMethods actions =new BaseMethods();

    private String base_page = "https://pokofemanim.ru/";
    private By search_field = By.name("s");
    private By all = By.xpath("//*[@id=\"categories-3\"]/ul/li[1]");
    private By diet = By.linkText("Кофейная диета");
    private By health = By.linkText("Здоровье");
    private By for_figure = By.linkText("Кофе для похудения");
    private By result_set = By.className("posts__item posts__item_second");
    private By extend_results = By.xpath("//main//span");
    private By top_menu_future = By.xpath("//li[contains(@class, 'menu-item-53')]");
    private By nearest_future = By.xpath("//div[contains(@class, 'posts__item posts__item_first')]");
    private By next_future = By.xpath("//div[contains(@class, 'posts__item posts__item_second')]");
    private By main_first = By.xpath("//li[contains(@id, 'menu-item-25')]");
    private By main_first_list = By.xpath("//li[contains(@id, 'menu-item-25')]//li[contains(@class, 'menu-item')]");
    private By cosmetics = By.xpath("//li[contains(@id, 'menu-item-12212')]");
    private By cosmetics_body_and_hair = By.xpath("//li[contains(@id, 'menu-item-57')]");
    private By slider = By.xpath("//div[contains(@class, 'slider_text ')]");
    private By slider_block = By.xpath("//div[contains(@class, 'ms-view ms-basic-view ms-grab-cursor')]");
    private String logo = "https://pokofemanim.ru/wp-content/themes/darkfire13/images/logo.png";
    private By footer = By.xpath("//div[contains(@class, 'copy')]");
    private String created_file = "D:\\Project\\TraineeFramework\\src\\resources\\coffee_files\\logo2.png";
    private String sample_logo = "D:\\Project\\TraineeFramework\\src\\resources\\coffee_files\\logo.png";
    private String sample_footer = "© 2020 Сайт о кофе: рецепты, выбор посуды, кофеварок и кофемашин.";
    //    private By  = By.xpath("");

    @Step("Access site")
    public void open_base_page(){actions.open_page(base_page);}

    @Step("Use search to find text")
    public void searchFor(String value) {actions.write_text(search_field,value);}

    @Step("Verity search target")
    public void check_search (String value){actions.assertion(actions.getPageName().contains(value), true);}

    @Step("Find footer")
    public void verify_footer (){
        actions.assertion(actions.readText(footer)==sample_footer,true);}

    @Step("Rubric for figure")
    public void figure (){actions.click(for_figure);}

    @Step("To the Diet")
    public void with_honey_and_strawberry(){
        actions.click(nearest_future);
    }

    @Step("To the Diet")
    public void diet(){
        actions.click(diet);
    }

    @Step("To the Health")
    public void health(){
        actions.click(health);
    }

    @Step("Extend List")
    public void display_more(){
        actions.click(extend_results);
    }

    @Step("Access future")
    public void top_menu_future(){actions.click(top_menu_future);}

    @Step("Nearest future")
    public void nearest_future(){actions.click(nearest_future);}

    @Step("Hover first menu")
    public void first_menu(){actions.hover(main_first);}

    @Step("First menu size")
    public void first_menu_verification(){actions.assertion(actions.elem_list(main_first_list).size()==12,true);}

    @Step("Hover cosmetics menu")
    public void cosmetics(){actions.hover(cosmetics);}

    @Step("Select body cosmetics")
    public void cosmetics_body_and_hair(){actions.click(cosmetics_body_and_hair);}

    @Step("Get Logo")
    public void get_logo(){actions.get_logo_picture(logo, created_file);}

    @Step("Compare Logo")
    public void compare_logo(){actions.compare_files(created_file,sample_logo);}



    @Step("Slider list size")
    public void slider_list_size(){
        int result = actions.elem_list(slider).size();
        actions.assertion(result==5,true);
    }
    @Step("Slider list size")
    public void slider_list_dimensions(){
        int width = actions.get_width(slider_block);
        int height = actions.get_height(slider_block);
        actions.assertion(width==1000,true);
        actions.assertion(height==480,true);
    }

    @Step("Nearest future")
    public void next_future(){actions.click(next_future);}

    @Step("Check results count")
    public void check_results  (){
        int result = actions.elem_list(result_set).size();
        System.out.println(result);
        actions.assertion(result==9,true);
    }

}
