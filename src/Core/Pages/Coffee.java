package Pages;

import Elements.BaseMethods;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Coffee {

    BaseMethods actions =new BaseMethods();

    private String base_page = "https://pokofemanim.ru/";
    private By search_field = By.name("s");

    //рубрики
    private By all_about = By.partialLinkText("Все статьи");
    private By health = By.linkText("Здоровье");
    private By top_health = By.xpath("//li[contains(@id, 'menu-item-12211')]");
    private By diet = By.xpath("//*[@id=\"categories-3\"]/ul//li[contains (@class,53)]");
    private By good_or_bad = By.xpath("//*[@id=\"categories-3\"]/ul//li[contains (@class,56)]");
    private By cosmo = By.linkText("Косметология");
    private By body_and_other = By.xpath("//*[@id=\"categories-3\"]/ul//li[contains (@class,54)]");

    private By for_figure = By.linkText("Кофе для похудения");
    private By result_set = By.className("posts__item posts__item_second");
    private By extend_results = By.xpath("//main//span");
    private By top_menu_future = By.xpath("//li[contains(@class, 'menu-item-53')]");
    private By nearest_future = By.xpath("//div[contains(@class, 'posts__item posts__item_first')]");
    private By next_future = By.xpath("//div[contains(@class, 'posts__item posts__item_second')]");
    private By main_first = By.xpath("//li[contains(@id, 'menu-item-25')]");
    private By main_first_1 = By.xpath("//li[contains(@id, 'menu-item-27')]//a");
    private By main_first_2 = By.xpath("//li[contains(@id, 'menu-item-26')]//a");
    private By main_first_3 = By.xpath("//li[contains(@id, 'menu-item-28')]//a");
    private By main_first_4 = By.xpath("//li[contains(@id, 'menu-item-29')]//a");
    private By main_first_5 = By.xpath("//li[contains(@id, 'menu-item-30')]//a");
    private By main_first_6 = By.xpath("//li[contains(@id, 'menu-item-31')]//a");
    private By main_first_7= By.xpath("//li[contains(@id, 'menu-item-32')]//a");
    private By main_first_8= By.xpath("//li[contains(@id, 'menu-item-33')]//a");
    private By main_first_9= By.xpath("//li[contains(@id, 'menu-item-34')]//a");
    private By main_first_10= By.xpath("//li[contains(@id, 'menu-item-35')]//a");
    private By main_first_11= By.xpath("//li[contains(@id, 'menu-item-36')]//a");
    private By main_first_12= By.xpath("//li[contains(@id, 'menu-item-37')]//a");
    private By receipts = By.xpath("//li[contains(@id, 'menu-item-38')]");
    private By receipts_1 = By.xpath("//li[contains(@id, 'menu-item-39')]//a");
    private By receipts_2 = By.xpath("//li[contains(@id, 'menu-item-40')]//a");
    private By receipts_3 = By.xpath("//li[contains(@id, 'menu-item-41')]//a");
    private By receipts_4 = By.xpath("//li[contains(@id, 'menu-item-42')]//a");
    private By receipts_5 = By.xpath("//li[contains(@id, 'menu-item-43')]//a");
    private By receipts_6 = By.xpath("//li[contains(@id, 'menu-item-44')]//a");
    private By receipts_7 = By.xpath("//li[contains(@id, 'menu-item-45')]//a");
    private By receipts_8 = By.xpath("//li[contains(@id, 'menu-item-46')]//a");
    private By receipts_9 = By.xpath("//li[contains(@id, 'menu-item-48')]//a");
    private By receipts_10 = By.xpath("//li[contains(@id, 'menu-item-49')]//a");
    private By receipts_11 = By.xpath("//li[contains(@id, 'menu-item-47')]//a");
    private By twits = By.xpath("//li[contains(@id, 'menu-item-51')]");

    private By main_first_list = By.xpath("//li[contains(@id, 'menu-item-25')]//li[contains(@class, 'menu-item')]");
    private By main_receipts_list = By.xpath("//li[contains(@id, 'menu-item-38')]//li[contains(@class, 'menu-item')]");
    private By main_twits_list = By.xpath("//li[contains(@id, 'menu-item-51')]//li[contains(@class, 'menu-item')]");
    private By healht_list = By.xpath("//li[contains(@id, 'menu-item-12211')]//li[contains(@class, 'menu-item')]");
    private By cosmetics = By.xpath("//li[contains(@id, 'menu-item-12212')]");
    private By cosmetics_body_and_hair = By.xpath("//li[contains(@id, 'menu-item-57')]");
    private By slider_block = By.xpath("//div[contains(@class, 'ms-view ms-basic-view ms-grab-cursor')]");
    private String logo = "https://pokofemanim.ru/wp-content/themes/darkfire13/images/logo.png";
    private By footer = By.xpath("//div[contains(@class, 'copy')]");
    private By slide_up_button = By.xpath("//footer//div[contains(@id, 'up')]");
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

    @Step("Verify footer text")
    public void assertion_footer_text(){actions.assertion(actions.readText(footer), sample_footer );}

    @Step("Verify count")
    public void assertion_count(){actions.assertion(actions.readText(footer), sample_footer );}

    @Step("All articles")
    public void all_about (){actions.click(all_about);}

    @Step("Good_or_bad")
    public void good_or_bad(){actions.click(good_or_bad);}

    @Step("Cosmo")
    public void cosmo(){actions.click(cosmo);}

    @Step("For body and other")
    public void body_and_other(){actions.click(body_and_other);}

    @Step("Rubric for figure")
    public void figure(){actions.click(for_figure);}

    @Step("To the Future")
    public void with_honey_and_strawberry(){actions.click(nearest_future);}

    @Step("To the Diet")
    public void diet(){actions.click(diet);}

    @Step("To the Health")
    public void health(){actions.click(health);}

    @Step("To the Health")
    public void top_health(){actions.hover(top_health);}

    @Step("Extend List")
    public void display_more(){actions.click(extend_results);}

    @Step("Access future")
    public void top_menu_future(){actions.click(top_menu_future);}

    @Step("Nearest future")
    public void nearest_future(){actions.click(nearest_future);}

    @Step("Hover first menu")
    public void first_menu(){actions.hover(main_first);}

    @Step("Select first menu first element")
    public void first_menu_1(){actions.click(main_first_1);}

    @Step("Select first menu second element")
    public void first_menu_2(){actions.click(main_first_2);}

    @Step("Select first menu third element")
    public void first_menu_3(){actions.click(main_first_3);}

    @Step("Select first menu forth element")
    public void first_menu_4(){actions.click(main_first_4);}

    @Step("Select first menu fifth element")
    public void first_menu_5(){actions.click(main_first_5);}

    @Step("Select first menu sixth element")
    public void first_menu_6(){actions.click(main_first_6);}

    @Step("Select first menu seventh element")
    public void first_menu_7(){actions.click(main_first_7);}

    @Step("Select first menu eighth element")
    public void first_menu_8(){actions.click(main_first_8);}

    @Step("Select first menu nineth element")
    public void first_menu_9(){actions.click(main_first_9);}

    @Step("Select first menu tenth element")
    public void first_menu_10(){actions.click(main_first_10);}

    @Step("Select first menu eleventh element")
    public void first_menu_11(){actions.click(main_first_11);}

    @Step("Select first menu twelveth element")
    public void first_menu_12(){actions.click(main_first_12);}

    @Step("Hover receipts")
    public void receipts(){actions.hover(receipts);}

    @Step("Select receipts first element")
    public void receipts_1(){actions.click(receipts_1);}

    @Step("Select receipts second element")
    public void receipts_2(){actions.click(receipts_2);}

    @Step("Select receipts third element")
    public void receipts_3(){actions.click(receipts_3);}

    @Step("Select receipts fourth element")
    public void receipts_4(){actions.click(receipts_4);}

    @Step("Select receipts fifth element")
    public void receipts_5(){actions.click(receipts_5);}

    @Step("Select receipts sixth element")
    public void receipts_6(){actions.click(receipts_6);}

    @Step("Select receipts seventh element")
    public void receipts_7(){actions.click(receipts_7);}

    @Step("Select receipts eighth element")
    public void receipts_8(){actions.click(receipts_8);}

    @Step("Select receipts nineth element")
    public void receipts_9(){actions.click(receipts_9);}

    @Step("Select receipts tenth element")
    public void receipts_10(){actions.click(receipts_10);}

    @Step("Select receipts eleventh element")
    public void receipts_11(){actions.click(receipts_11);}

    @Step("Hover twits")
    public void twits(){actions.hover(twits);}

    @Step("First menu size")
    public void first_menu_verification(){actions.assertion(actions.elem_list(main_first_list).size(),12);}

    @Step("First menu size")
    public void receipts_verification(){actions.assertion(actions.elem_list(main_receipts_list).size(),11);}

    @Step("First menu size")
    public void health_verification(){actions.assertion(actions.elem_list(healht_list).size(),2);}

    @Step("Twits menu size")
    public void twits_verification(){actions.assertion(actions.elem_list(main_twits_list).size(),6);}

    @Step("Hover cosmetics menu")
    public void cosmetics(){actions.hover(cosmetics);}

    @Step("Select body cosmetics")
    public void cosmetics_body_and_hair(){actions.click(cosmetics_body_and_hair);}

    @Step("Get Logo")
    public void get_logo(){actions.get_logo_picture(logo, created_file);}

    @Step("Compare Logo")
    public void compare_logo(){actions.compare_files(created_file,sample_logo);}

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
