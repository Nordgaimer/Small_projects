/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main_package;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import patterns.Stage_About;
import patterns.Stage_Homework;
import patterns.Stage_Video_Lections;
import patterns.WebBrowser;
import resources.*;


/**
 * FXML Controller class
 *
 * @author Елена
 */
public class MainframeController implements Initializable {
    @FXML
    private Image image;
    @FXML
    private HBox TopBox;
    @FXML
    private VBox LectionBox;
    @FXML
    private Font x1;
    @FXML
    private VBox PracticeBox;
    @FXML
    private Font x3;
    @FXML
    private Font x2;
    @FXML
    private Color x4;
    @FXML
    private Button JobBox;
    @FXML
    private InnerShadow x6;
    @FXML
    private Color x5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Btn_Core_Intro(ActionEvent event) throws InterruptedException {
       new Stage_Video_Lections("Intro to Java",
               Lections_Info.intro_txt, Urls_golovach_Lections.url_intro_p1, Urls_golovach_Lections.url_intro_p2);

    }

    @FXML
    private void Btn_Core_Platform(ActionEvent event) {
        new Stage_Video_Lections("CORE",
                Lections_Info.core_txt,
                Urls_golovach_Lections.url_core_p1,
                Urls_golovach_Lections.url_core_p2,
                Urls_golovach_Lections.url_core_p3,
                Urls_golovach_Lections.url_core_p4);
    }

    @FXML
    private void Btn_Core_Exceptions(ActionEvent event) {
        new Stage_Video_Lections("Exceptions",Lections_Info.exception_txt, Urls_golovach_Lections.url_exception_p1, Urls_golovach_Lections.url_exception_p2, Urls_golovach_Lections.url_exception_p3, Urls_golovach_Lections.url_exception_p4);
    }

    @FXML
    private void Btn_Core_IO(ActionEvent event) {
        new Stage_Video_Lections("Input | Output",
                Lections_Info.io_txt,
                Urls_golovach_Lections.url_io_p1,
                Urls_golovach_Lections.url_io_p2,
                Urls_golovach_Lections.url_io_p3,
                Urls_golovach_Lections.url_io_p4,
                Urls_golovach_Lections.url_io_p5);
    }

    @FXML
    private void Btn_Core_Threads(ActionEvent event) {
        new Stage_Video_Lections("Threads",
                Lections_Info.multy_txt,
                Urls_golovach_Lections.url_multi_p1,
                Urls_golovach_Lections.url_multi_p2,
                Urls_golovach_Lections.url_multi_p3,
                Urls_golovach_Lections.url_multi_p4);

    }

    @FXML
    private void Btn_Core_Coll(ActionEvent event) {
        new Stage_Video_Lections("Collections",
                Lections_Info.collections_txt,
                Urls_golovach_Lections.url_coll_p1,
                Urls_golovach_Lections.url_coll_p2,
                Urls_golovach_Lections.url_coll_p3,
                Urls_golovach_Lections.url_coll_p4);
    }

    @FXML
    private void Btn_Core_OOP(ActionEvent event) {
        new Stage_Video_Lections("OOP",
                Lections_Info.oop_txt,
                Urls_golovach_Lections.url_oop_p1,
                Urls_golovach_Lections.url_oop_p2,
                Urls_golovach_Lections.url_oop_p3,
                Urls_golovach_Lections.url_oop_p4);
    }

    @FXML
    private void Btn_Core_GoF(ActionEvent event) {
        new Stage_Video_Lections("OOP",
                Lections_Info.patterns_txt,
                Urls_golovach_Lections.url_patterns_p1,
                Urls_golovach_Lections.url_patterns_p2);

    }

    @FXML
    private void Btn_Core_JDBC(ActionEvent event) {
        new Stage_Video_Lections("JDBC",
                Lections_Info.jdbc_txt,
                Urls_golovach_Lections.url_jdbc_p1,
                Urls_golovach_Lections.url_jdbc_p2,
                Urls_golovach_Lections.url_jdbc_p3,
                Urls_golovach_Lections.url_jdbc_p4,
                Urls_golovach_Lections.url_jdbc_p5);

    }

    @FXML
    private void Btn_Core_Servlet(ActionEvent event) {
        new Stage_Video_Lections("Servlets",
                Lections_Info.servlet_txt,
                Urls_golovach_Lections.url_servlet_p1,
                Urls_golovach_Lections.url_servlet_p2,
                Urls_golovach_Lections.url_servlet_p3,
                Urls_golovach_Lections.url_servlet_p4);

    }

    @FXML
    private void Btn_Core_HTTP(ActionEvent event) {
        new Stage_Video_Lections("HTTP",
                Lections_Info.http_txt,
                Urls_golovach_Lections.url_http_p1,
                Urls_golovach_Lections.url_http_p2);

    }

    @FXML
    private void Btn_Core_DILoc(ActionEvent event) {
        new Stage_Video_Lections("Di-Loc",
                Lections_Info.diloc_txt,
                Urls_golovach_Lections.url_diloc);


    }

    @FXML
    private void Btn_Core_Maven(ActionEvent event) {
        new Stage_Video_Lections("Maven - Log4u",
                Lections_Info.maven_log4u_txt,
                Urls_golovach_Lections.url_maven_1,
                Urls_golovach_Lections.url_maven_2,
                Urls_golovach_Lections.url_log4u);

    }

    @FXML
    private void Btn_Core_TDD(ActionEvent event) {
        new Stage_Video_Lections("TDD",
                Lections_Info.tdd_txt,
                Urls_golovach_Lections.url_tdd_p1,
                Urls_golovach_Lections.url_tdd_p2,
                Urls_golovach_Lections.url_tdd_p3);

    }

    @FXML
    private void Btn_Core_Spring(ActionEvent event) {
        new Stage_Video_Lections("Spring -- REST",
                Lections_Info.rest_mvc_spring_txt,
                Urls_golovach_Lections.url_spr_framework,
                Urls_golovach_Lections.url_spr_mvc);

    }

    @FXML
    private void Btn_Core_XML(ActionEvent event) {
        new Stage_Video_Lections("XML&Generics",
                Lections_Info.xml_generics_txt,
                Urls_golovach_Lections.url_xml,
                Urls_golovach_Lections.url_generics);

    }
    @FXML
    private void Btn_exers_easy(ActionEvent event){
        new WebBrowser("http://java-faq.do.am/forum/6");

    }
    @FXML
    private void Btn_exers_mid(ActionEvent event){
        new WebBrowser("http://java-faq.do.am/forum/7");

    }
    @FXML
    private void Btn_exers_up(ActionEvent event){
        new WebBrowser("http://java-faq.do.am/forum/8");
    }
    @FXML
    private void Btn_exers_adv(ActionEvent event){
        new WebBrowser("http://java-faq.do.am/forum/9-32-1");
    }
    @FXML
    private void Btn_online_jr(ActionEvent event){
        new WebBrowser("http://www.javarush.ru");

    }
    @FXML
    private void Btn_online_jb(ActionEvent event){
        new WebBrowser("http://www.javabegin.ru");

    }
    @FXML
    private void Btn_online_int(ActionEvent event){
        new WebBrowser("http://www.intuit.ru");

    }
    @FXML
    private void Btn_online_ca(ActionEvent event){
        new WebBrowser("http://www.codeacademy.com");

    }
    @FXML
    private void Btn_test_quiz(ActionEvent event){
    new WebBrowser("http://www.quizful.net/test/java_se_basic");
    }
    @FXML
    private void Btn_test_wiz(ActionEvent event){
        new WebBrowser("http://www.wiziq.com/tests/java");

    }
    @FXML
    private void Btn_test_4t(ActionEvent event){
        new WebBrowser("http://www.4tests.com/java-programmer");

    }
    @FXML
    private void Btn_test_ps(ActionEvent event){
        new WebBrowser("http://www.pskills.org/corejava.jsp");

    }
    @FXML
    private void Btn_books(ActionEvent event){
        new WebBrowser("http://us.ua/1370987/",480,120);

    }
    @FXML
    private void Btn_habra(ActionEvent event){
        new WebBrowser("http://www.habrahabr.ru/hub/java/");
    }
    @FXML
    private void Btn_dou(ActionEvent event){
        new WebBrowser("http://www.dou.ua");
    }
    @FXML
    private void Btn_skipy(ActionEvent event){
        new WebBrowser("http://www.skipy.ru");
    }
    @FXML
    private void Btn_javatalks(ActionEvent event){
        new WebBrowser("http://www.javatalks.ru");
    }
    @FXML
    private void Bar_topic_1 (ActionEvent event){
        new WebBrowser("http://dou.ua/lenta/articles/practice-n-job/?from=jobsrelated");
    }
    @FXML
    private void Bar_topic_2 (ActionEvent event){
        new WebBrowser("http://dou.ua/lenta/articles/work-n-study/?from=jobsrelated");
    }
    @FXML
    private void Bar_topic_3 (ActionEvent event){
        new WebBrowser("http://dou.ua/lenta/articles/pervaya-rabota-studenta/?from=jobsrelated");
    }
    @FXML
    private void Bar_topic_4 (ActionEvent event){
        new WebBrowser("http://dou.ua/columns/chto-nado-znat-pri-prohozhdenii-hr-intervyu/?from=jobsrelated");
    }
    @FXML
    private void Bar_topic_5 (ActionEvent event){
        new WebBrowser("http://dou.ua/lenta/articles/technical-interview/?from=jobsrelated");
    }
    @FXML
    private void Bar_topic_6 (ActionEvent event){
        new WebBrowser("http://dou.ua/lenta/articles/vrednye-sovety/?from=jobsrelated");
    }
    @FXML
    private void Bar_topic_7 (ActionEvent event){
        new WebBrowser("http://dou.ua/lenta/tags/%D0%BA%D1%80%D0%B5%D1%88-%D1%82%D0%B5%D1%81%D1%82%20%D1%80%D0%B5%D0%B7%D1%8E%D0%BC%D0%B5/?from=jobsrelated");
    }
    @FXML
    private void Bar_topic_8 (ActionEvent event){
        new WebBrowser("http://habrahabr.ru/post/203688/");
    }
    @FXML
    private void Bar_topic_9 (ActionEvent event){
        new WebBrowser("https://docs.google.com/document/d/1zkGzlcSIVC4uIk7B5zQGL4kTTK8btIzP-0wTEpCbrRE/edit?pli=1#heading=h.bzx4tfin8ub3");
    }@FXML
    private void Bar_topic_10 (ActionEvent event){
        new WebBrowser("http://habrahabr.ru/post/43293/");
    }@FXML
    private void Bar_topic_11 (ActionEvent event){
        new WebBrowser("http://habrahabr.ru/post/122665/");
    }
    @FXML
    private void Bar_job_1 (ActionEvent event){
        new WebBrowser("http://blog.steptothefuture.net/razrabotka/java/sobesedovanie-na-jr-java-developer-voprosy-chast-i/");
    }
    @FXML
    private void Bar_job_2 (ActionEvent event){
        new WebBrowser("http://victorpotapov.ru/blog/junior_java_developer_podgotovka_k_sobesedovaniju/2012-03-15-40");
    }
    @FXML
    private void Bar_job_3 (ActionEvent event){
        new WebBrowser("http://it-interview.ru/voprosy-java-sobesedovaniya-otvety-na-kotorye-vy-obyazany-znat/");
    }
    @FXML
    private void Bar_story_1 (ActionEvent event){
        new WebBrowser("http://habrahabr.ru/sandbox/78142/");
    }
    @FXML
    private void Bar_story_2 (ActionEvent event){
        new WebBrowser("http://dou.ua/lenta/interviews/vladimir-petrusha-v-programmistyi-iz-shahtyorov/");
    }
    @FXML
    private void Bar_story_3 (ActionEvent event){
        new WebBrowser("http://zelandovka.ru/students/istorii-uspeha-epizod-1-devochka-programmist-kira/");
    }@FXML
    private void Bar_story_4 (ActionEvent event){
        new WebBrowser("");
    }
    @FXML
    private void Bar_our_goal (ActionEvent event){
        new WebBrowser("http://java-faq.do.am/index/0-2");
    }
    @FXML
    private void Bar_contacts (ActionEvent event){
        new WebBrowser("http://java-faq.do.am/index/0-2");
    }
    @FXML
    private void Bar_version (ActionEvent event){
        new Stage_About(315,122);
    }
    @FXML
    private void Link_home_website (ActionEvent event){
        new WebBrowser("http://java-faq.do.am");
    }
    @FXML
    private void Btn_CyberForum (ActionEvent event){
        new WebBrowser("http://www.cyberforum.ru/java/");
    }


}
