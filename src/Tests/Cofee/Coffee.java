import Driver.Driver;
import Driver.Reports;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.*;

import static Driver.Reports.end_test;
import static Driver.Reports.start_test;

public class Coffee {

    private Pages.Coffee basePage = new Pages.Coffee();

    private String search_for_1 = "Кофе с медом";

    //
    @BeforeClass
    private void classLevelSetup() {
        Driver.driver_here();
        Reports.start_report();
    }
    @BeforeTest
    private void s_test(){
        start_test();
    }

    @Epic(value = "Кофе")
    @Feature(value = "Поиск")
    @Story(value = "С добавками")
    @Test(description = "с медом")
    public void WithHoney() {
        basePage.open_base_page();
        basePage.searchFor(search_for_1);
        basePage.with_honey_and_strawberry();
        basePage.check_search("kofe-s-medom-i-malinoy");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Рубрики")
    @Story(value = "Кофе для похудения")
    @Test(description = "Диета")
    public void Find_fat_burner() {
        basePage.open_base_page();
        basePage.figure();
        basePage.diet();
        basePage.check_search("kofeynaya-dieta");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Рубрики")
    @Story(value = "Здоровье")
    @Test(description = "Диета")
    public void Find_second_fat_burner() {
        basePage.open_base_page();
        basePage.figure();
        basePage.health();
        basePage.display_more();
        basePage.diet();
        basePage.check_search("kofeynaya-dieta");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Дроп-меню")
    public void First_drop_down() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_verification();
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Косметология")
    @Test(description = "Для тела и волос")
    public void Cosmetics() {
        basePage.open_base_page();
        basePage.cosmetics();
        basePage.cosmetics_body_and_hair();
        basePage.check_search("kofe_dlya_tela_lica_volos");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Гадание на кофейной гуще")
    @Test(description = "Пора мыть посуду")
    public void See_the_future() {
        basePage.open_base_page();
        basePage.top_menu_future();
        basePage.nearest_future();
        basePage.check_search("gadanie_na_kofejnoj_guwe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Гадание на кофейной гуще")
    @Test(description = "Пора мыть посуду снова")
    public void See_the_future_again() {
        basePage.open_base_page();
        basePage.top_menu_future();
        basePage.next_future();
        basePage.check_search("gadanie_na_kofejnoj_guwe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Основная страница")
    @Story(value = "Слайдер")
    @Test(description = "Кол-во")
    public void Slider_count() {
        basePage.open_base_page();
        basePage.slider_list_size();
    }

    @Epic(value = "Кофе")
    @Feature(value = "Основная страница")
    @Story(value = "Слайдер")
    @Test(description = "размер")
    public void Slider_size() {
        basePage.open_base_page();
        basePage.slider_list_dimensions();
    }

    @Epic(value = "Кофе")
    @Feature(value = "Основная страница")
    @Story(value = "Колонтитулы")
    @Test(description = "Лого")
    public void Logo() {
        basePage.open_base_page();
        basePage.get_logo();
        basePage.compare_logo();
    }

    @Epic(value = "Кофе")
    @Feature(value = "Основная страница")
    @Story(value = "Колонтитулы")
    @Test(description = "Футер")
    public void Footer() {
        basePage.open_base_page();
        basePage.verify_footer();
    }


    @AfterTest
    private void e_test(){
        end_test();
    }
    @AfterClass
    private void teardown() {
        Driver.quit();
    }
}