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
    @Story(value = "Все статьи")
    @Test(description = "Все статьи")
    public void All_articles() {
        basePage.open_base_page();
        basePage.all_about();
        basePage.check_search("recipes-new");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Рубрики")
    @Story(value = "Здоровье")
    @Test(description = "Здоровье")
    public void Health() {
        basePage.open_base_page();
        basePage.health();
        basePage.check_search("zdorovie");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Рубрики")
    @Story(value = "Кофе для похудения")
    @Test(description = "Диета")
    public void Diet() {
        basePage.open_base_page();
        basePage.diet();
        basePage.check_search("kofe_dlya_pohudeniya");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Рубрики")
    @Story(value = "Польза и вред кофе")
    @Test(description = "Польза и вред кофе")
    public void BlackAndWhite() {
        basePage.open_base_page();
        basePage.good_or_bad();
        basePage.check_search("polqza_i_vred_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Рубрики")
    @Story(value = "Косметология")
    @Test(description = "Косметология")
    public void Cosmeto() {
        basePage.open_base_page();
        basePage.cosmo();
        basePage.check_search("cosmetologia");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Рубрики")
    @Story(value = "Кофе для тела, лица, волос")
    @Test(description = "для тела")
    public void For_body() {
        basePage.open_base_page();
        basePage.body_and_other();
        basePage.check_search("kofe_dlya_tela_lica_volos");
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
    @Story(value = "Посуда и техника")
    @Test(description = "Другая полезная техника для кофе")
    public void First_drop_down_1() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_1();
        basePage.check_search("drugaya_poleznaya_tehnika_dlya_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Гейзерные кофеварки")
    public void First_drop_down_2() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_2();
        basePage.check_search("gejzernyee_kofevarki");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Капельные кофеварки")
    public void First_drop_down_3() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_3();
        basePage.check_search("kapelqnyee_kofevarki");
    }
    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Капсульные  кофеварки")
    public void First_drop_down_4() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_4();
        basePage.check_search("kapsulqnyee_kofevarki");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Кофеварки эспрессо")
    public void First_drop_down_5() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_5();
        basePage.check_search("kofevarki_yespresso");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Кофемашины для дома")
    public void First_drop_down_6() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_6();
        basePage.check_search("kofemashiny_dlya_doma");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Полезный кофейный инвентарь")
    public void First_drop_down_7() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_7();
        basePage.check_search("poleznyj_kofejnyj_inventarq");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Посуда для кофе")
    public void First_drop_down_8() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_8();
        basePage.check_search("posuda_dlya_kofe");
    }
    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Ручные кофемолки")
    public void First_drop_down_9() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_9();
        basePage.check_search("ruchnyee_kofemolki");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Сравнение посуды и техники для кофе")
    public void First_drop_down_10() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_10();
        basePage.check_search("sravnenie_posudy_i_tehniki_dlya_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Турки для кофе")
    public void First_drop_down_11() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_11();
        basePage.check_search("turki_dlya_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Посуда и техника")
    @Test(description = "Электрические кофемолки")
    public void First_drop_down_12() {
        basePage.open_base_page();
        basePage.first_menu();
        basePage.first_menu_12();
        basePage.check_search("yelektricheskie_kofemolki");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Дроп-меню")
    public void Receipts_drop_down() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_verification();
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Кофе по-…")
    public void Receipts_1() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_1();
        basePage.check_search("kofe_po");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Кофе с алкоголем")
    public void Receipts_2() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_2();
        basePage.check_search("kofe_s_alkogolem");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Кофе с какао, шоколадом")
    public void Receipts_3() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_3();
        basePage.check_search("kofe_s_kakao_shokoladom");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Кофе с медом")
    public void Receipts_4() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_4();
        basePage.check_search("kofe_s_medom");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Кофе с молоком и молочными продуктами")
    public void Receipts_5() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_5();
        basePage.check_search("kofe_s_molokom_i_molochnymi_produktami");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Кофе со специями")
    public void Receipts_6() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_6();
        basePage.check_search("kofe_so_speciyami");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "На основе растворимого кофе")
    public void Receipts_7() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_7();
        basePage.check_search("na_osnove_rastvorimogo_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Рецепты кофе в турке")
    public void Receipts_8() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_8();
        basePage.check_search("recepty_kofe_v_turke");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Рецепты с кофе")
    public void Receipts_9() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_9();
        basePage.check_search("recepty_s_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Холодный кофе")
    public void Receipts_10() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_10();
        basePage.check_search("holodnyj_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Остальные рецепты приготовления кофе")
    public void Receipts_11() {
        basePage.open_base_page();
        basePage.receipts();
        basePage.receipts_11();
        basePage.check_search("ostalqnyee_recepty_kofe");
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Статьи о кофе")
    @Test(description = "Дроп-меню")
    public void Twits_drop_down() {
        basePage.open_base_page();
        basePage.twits();
        basePage.twits_verification();
    }

    @Epic(value = "Кофе")
    @Feature(value = "Верхнее меню")
    @Story(value = "Рецепты")
    @Test(description = "Дроп-меню")
    public void Health_drop_down() {
        basePage.open_base_page();
        basePage.top_health();
        basePage.health_verification();
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
        basePage.assertion_footer_text();
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