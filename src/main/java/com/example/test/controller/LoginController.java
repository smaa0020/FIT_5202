package com.example.test.controller;

import com.example.test.bean.*;
import com.example.test.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @Autowired
    VegetationService vegetationService;

    @Autowired
    WildlifeService wildlifeService;

    @Autowired
    ActivityService activityService;

    @Autowired
    OrganizationService organizationService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping("/green_design")
    public String design(){
        return "green_design";
    }

    @RequestMapping("/decorative-sample")
    public String decorativeSample(){
        return "decorative-sample-all";
    }

    @RequestMapping("/decorative-type")
    public String decorativeType(){
        return "decorative-type";
    }

    @RequestMapping("/planting-guide")
    public String plantingGuide(){
        return "planting-guide";
    }

    @RequestMapping("/decorative-sample-all")
    public String decorativeSampleAll(){
        return "decorative-sample-all";
    }

    @RequestMapping("/decorative-sample1")
    public String decorativeSample1(){
        return "decorative-sample1";
    }

    @RequestMapping("/decorative-sample2")
    public String decorativeSample2(){
        return "decorative-sample2";
    }

    @RequestMapping("/decorative-sample3")
    public String decorativeSample3(){
        return "decorative-sample3";
    }

    @RequestMapping("/decorative-sample4")
    public String decorativeSample4(){
        return "decorative-sample4";
    }

    @RequestMapping("/decorative-sample5")
    public String decorativeSample5(){
        return "decorative-sample5";
    }

    @RequestMapping("/decorative-sample6")
    public String decorativeSample6(){
        return "decorative-sample6";
    }

    @RequestMapping("/novice-level")
    public String noviceLevel(){
        return "novice-level";
    }

    @RequestMapping("/advanced-beginner")
    public String advancedBeginner(){
        return "advanced-beginner";
    }

    @RequestMapping("/expert")
    public String expert(){
        return "expert";
    }

    @RequestMapping("/video")
    public String video(){
        return "video";
    }

    @RequestMapping("/plant-sample-all")
    public String plantSampleAll(){
        return "plant-sample-all";
    }

    @RequestMapping("/plant-sample1")
    public String recommendPlant1(){
        return "plant-sample1";
    }

    @RequestMapping("/plant-sample2")
    public String recommendPlant2(){
        return "plant-sample2";
    }

    @RequestMapping("/plant-sample3")
    public String recommendPlant3(){
        return "plant-sample3";
    }

    @RequestMapping("/plant-sample4")
    public String recommendPlant4(){
        return "plant-sample4";
    }

    @RequestMapping("/plant-sample5")
    public String recommendPlant(){
        return "plant-sample5";
    }

    @RequestMapping("/plant-sample6")
    public String recommendPlant6(){
        return "plant-sample6";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/nature-area")
    public String natureArea(){
        return "nature-area";
    }

    @RequestMapping("/water-area")
    public String waterArea(){
        return "water-area";
    }

    @RequestMapping("/navigation-bar")
    public String navigationBar(){
        return "navigation-bar";
    }

    @RequestMapping("/wild-life")
    public String wildLife(){
        return "wild-life";
    }

    @RequestMapping("/vegetation")
    public String vegetation(){
        return "vegetation";
    }

    @RequestMapping("/testing")
    public String testing(){
        return "testing";
    }

    @RequestMapping("/wildlife-anatidae")
    public String wildlifeAnatidae(Model model){
        List<WildlifeBean> wildlifeBeanList = wildlifeService.getInfo();
        model.addAttribute("anatidae", wildlifeBeanList);
        return "wildlife-anatidae";
    }

    @RequestMapping("/wildlife-artamidae")
    public String wildlifeArtamidae(Model model){
        List<WildlifeBean> wildlifeBeanList = wildlifeService.getInfo();
        model.addAttribute("artamidae", wildlifeBeanList);
        return "wildlife-artamidae";
    }

    @RequestMapping("/wildlife-corvidae")
    public String wildlifeCorvidae(Model model){
        List<WildlifeBean> wildlifeBeanList = wildlifeService.getInfo();
        model.addAttribute("corvidae", wildlifeBeanList);
        return "wildlife-corvidae";
    }

    @RequestMapping("/wildlife-meliphagidae")
    public String wildlifeMeliphagidae(Model model){
        List<WildlifeBean> wildlifeBeanList = wildlifeService.getInfo();
        model.addAttribute("meliphagidae", wildlifeBeanList);
        return "wildlife-meliphagidae";
    }

    @RequestMapping("/wildlife-noctuidae")
    public String wildlifeNoctuidae(Model model){
        List<WildlifeBean> wildlifeBeanList = wildlifeService.getInfo();
        model.addAttribute("noctuidae", wildlifeBeanList);
        return "wildlife-noctuidae";
    }

    @RequestMapping("/wildlife-possum")
    public String wildlifePossum(Model model){
        List<WildlifeBean> wildlifeBeanList = wildlifeService.getInfo();
        model.addAttribute("opossum", wildlifeBeanList);
        return "wildlife-possum";
    }

    @RequestMapping("/vege-araucariaceae")
    public String vegeAraucariaceae(Model model){
        List<VegetationBean> vegetationBeanList = vegetationService.getInfo();
        model.addAttribute("araucariaceae", vegetationBeanList);
        model.addAttribute("s", "msq");
        return "vege-araucariaceae";
    }

    @RequestMapping("/vege-betulaceae")
    public String vegeBetulaceae(Model model){
        List<VegetationBean> vegetationBeanList = vegetationService.getInfo();
        model.addAttribute("betulaceae", vegetationBeanList);
        return "vege-betulaceae";
    }

    @RequestMapping("/vege-cupressaceae")
    public String vegeCupressaceae(Model model){
        List<VegetationBean> vegetationBeanList = vegetationService.getInfo();
        model.addAttribute("cupressaceae", vegetationBeanList);
        return "vege-cupressaceae";
    }

    @RequestMapping("/vege-malvaceae")
    public String vegeMalvaceae(Model model){
        List<VegetationBean> vegetationBeanList = vegetationService.getInfo();
        model.addAttribute("malvaceae", vegetationBeanList);
        return "vege-malvaceae";
    }

    @RequestMapping("/vege-ulmaceae")
    public String vegeUlmaceae(Model model){
        List<VegetationBean> vegetationBeanList = vegetationService.getInfo();
        model.addAttribute("ulmaceae", vegetationBeanList);
        return "vege-ulmaceae";
    }

    @RequestMapping("/vege-pinaceae")
    public String vegePinaceae(Model model){
        List<VegetationBean> vegetationBeanList = vegetationService.getInfo();
        model.addAttribute("pinaceae", vegetationBeanList);
        return "vege-pinaceae";
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public String activityInfo(Model model, String keyword, String select){
        List<ActivityBean> activityBeanList = activityService.getInfo();
        List<OrganizationBean> organizationBeanList = organizationService.getInfo();
        model.addAttribute("activities", activityBeanList);

        if (keyword == null)
            model.addAttribute("organizations", organizationBeanList);
        else if(select != null)
        {
            if(select.equals("Biodiversity") || select.equals("Lands") || select.equals("Natural") || select.equals("Garden") || select.equals("Vegetation") || select.equals("Wildlife"))
                model.addAttribute("organizations", organizationService.findByFeature(select));
            else
                model.addAttribute("organizations", organizationService.findByKeyword(keyword));
        }
        else{
            model.addAttribute("organizations", organizationService.findByKeyword(keyword));
        }

        return "activity";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
//    public String login(String name,String password){
    public String login(String password){
        UserBean userBean = userService.loginIn(password);
        if(userBean != null){
            return "index";
        }else {
            return "error";
        }
    }

}