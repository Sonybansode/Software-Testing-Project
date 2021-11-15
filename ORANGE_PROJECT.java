import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//  AUTOMATION PROJECT ON ORANGE HRM 

public class ORANGE_PROJECT 
{

	public static void main(String[] args)      //throws InterruptedException --> this for pause in millisecond//
	{

     System.setProperty("webdriver.chrome.driver", "S:\\chromedriver.exe"); // LAUNCH CHROME DRIVER
     WebDriver w=new ChromeDriver();
     w.get("https://opensource-demo.orangehrmlive.com/");                   // OPEN URL
     
    // FOR MAXIMUM SCREEN
    
     w.manage().window().maximize();
		
     
     //FOR LOGIN USERNAME AND PASSWORD
     
     w.findElement(By.id("txtUsername")).sendKeys("Admin");
     w.findElement(By.id("txtPassword")).sendKeys("admin123");
     w.findElement(By.id("btnLogin")).click();
     
     //***** FOR ADMIN BUTTON( MODULE-1) *****
     w.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
 
    
     // *********** !! 1.0 FOR SYSTEM USERS ****************
      //WebElement we= w.findElement(By.id("searchSystemUser_userName"));
   
     w.findElement(By.id("searchSystemUser_userName")).sendKeys("Aatmaram");
     
    
     
       Select s1=new Select(w.findElement(By.name("searchSystemUser[userType]")));// this is parent for  dropdown button
       s1.selectByValue("2");
       w.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Alice Duval");
       Select s2=new Select(w.findElement(By.name("searchSystemUser[status]"))); //DROPDOWN BUTTON 2
       s2.selectByValue("1");
       w.findElement(By.id("searchBtn")).click();
       
       
       // FOR RESET BUTTON
        
       w.findElement(By.id("searchSystemUser_userName")).sendKeys("Aravind");
       Select s3=new Select(w.findElement(By.name("searchSystemUser[userType]")));
       s3.selectByValue("2");
       w.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Dominic Chase");
       Select s4=new Select(w.findElement(By.name("searchSystemUser[status]"))); //DROPDOWN BUTTON 2
       s4.selectByValue("1");
       w.findElement(By.id("resetBtn")).click();
       
       //FOR ADD BUTTON
        
       
       w.findElement(By.id("btnAdd")).click();
       Select s5= new Select(w.findElement(By.id("systemUser_userType")));
       w.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Goutam Ganesh");
       w.findElement(By.id("systemUser_userName")).sendKeys("EDUBRIDGE PLATFORM");
       w.findElement(By.id("systemUser_status")).click();
       w.findElement(By.id("systemUser_password")).sendKeys("GodisGrate@123456*");
       w.findElement(By.id("systemUser_confirmPassword")).sendKeys("GodisGrate@123456*");
       w.findElement(By.id("btnSave")).click();
       
       //*************FOR JOB (SECTION :2)***********
       
       Actions a=new Actions(w); // FOR MOVEBALE CURSOR
       a.moveToElement(w.findElement(By.id("menu_admin_Job"))).build().perform(); //SYNTAX FOR PARENT BUTTON 
       
       //  !! 2.1.JOB TITLES
        
       
       w.findElement(By.id("menu_admin_viewJobTitleList")).click();
       //w.findElement(By.id("btnAdd")).click();//
      // w.findElement(By.id("ohrmList_chkSelectRecord_26")).click();//
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.name("jobTitle[jobTitle]")).sendKeys(" HOME_JOB 500");                //CHECK AFTER EXECUTION
      // w.findElement(By.id("btnAdd")).click();//
      // w.findElement(By.id("jobTitle[jobDescription]")).sendKeys("THIS IS VERY NICE JOB RELATED TO BANKING SECTOR");//
      // w.findElement(By.id("jobTitle_note")).sendKeys("DO THE WORK HAPPILY");//
       w.findElement(By.id("btnSave")).click();
     
     
     // !! 2.2.PAY GRADES
       
      a.moveToElement(w.findElement(By.id("menu_admin_Job"))).build().perform();
       w.findElement(By.id("menu_admin_viewPayGrades")).click();
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.id("payGrade_name")).sendKeys("GRADE 28882");                     // CHECK AFTER EXECUTION
       w.findElement(By.id("btnSave")).click();
       w.findElement(By.id("btnAddCurrency")).sendKeys("Rupees_Currancy_indian ");            // CHECK AFTER EXECUTION
       
       // !! 2.3 EMPLOYMENT STATUS
       
       a.moveToElement(w.findElement(By.id("menu_admin_Job"))).build().perform();
       w.findElement(By.id("menu_admin_employmentStatus")).click();
      // w.findElement(By.id("ohrmList_chkSelectRecord_3")).click();//
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.id("empStatus_name")).sendKeys("Enternships_500");                 //  CHECK AFTER EXECUTION
       w.findElement(By.id("btnSave")).click();
       
       
       //!! 2.4 JOB CATEGORIES
        
       a.moveToElement(w.findElement(By.id("menu_admin_Job"))).build().perform();
       w.findElement(By.id("menu_admin_jobCategory")).click();
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.id("jobCategory_name")).sendKeys("FACTORY JOB NEW_2222");                     // CHECK AFTER EXECUTION
       w.findElement(By.id("btnSave")).click();
       //w.findElement(By.id("btnDelete")).sendKeys("Educational professionals");//
       
       //!! 2.5 WORK SHIFT
  
       //Actions a=new Actions(w); // FOR MOVEBALE CURSOR
       a.moveToElement(w.findElement(By.id("menu_admin_Job"))).build().perform();
       w.findElement(By.id("menu_admin_workShift")).click();
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.id("workShift_name")).sendKeys("Morning _SHIFT81");                          //CHECK AFTER EXECUTION
       Select s10= new Select(w.findElement(By.id("workShift_workHours_from")));// FOR TIMING
       s10.selectByValue("00:45");
       Select s11=new Select(w.findElement(By.id("workShift_workHours_to")));
       s11.selectByValue("01:00");
       w.findElement(By.xpath("//*[@id=\"frmWorkShift\"]/fieldset/ol/li[2]/input")).click();
       w.findElement(By.id("btnSave")).click();
     
         // ********************FOR ORGANIZATION(SECTION : 3rd) **************** 
       
       //!! 3.1 GENERAL INFORMATION
        
       //Actions a=new Actions(w);// 
       a.moveToElement(w.findElement(By.id("menu_admin_Organization"))).build().perform();
       w.findElement(By.id("menu_admin_viewOrganizationGeneralInformation")).click();
       w.findElement(By.id("btnSaveGenInfo")).click();
       w.findElement(By.id("organization_name")).sendKeys("OrangG_HRM182");                       //CHECK AFTER EXECUTION
       w.findElement(By.id("organization_taxId")).sendKeys("Id 1084524");                           //CHECK AFTER EXECUTION
       w.findElement(By.id("organization_registraionNumber")).sendKeys("1101918091102201");         //CHECK AFTER EXECUTION
       w.findElement(By.id("organization_phone")).sendKeys("9504911891019022292");
       w.findElement(By.id("organization_email")).sendKeys("abcdemfed@example.com");                //CHECK AFTER EXECUTION
       w.findElement(By.id("organization_street1")).sendKeys("GandiM Nagar NEW82");                  //CHECK AFTER EXECUTION

       w.findElement(By.id("organization_zipCode")).sendKeys("code401355218454");                      //CHECK AFTER EXECUTION
       w.findElement(By.id("organization_province")).sendKeys("MH_2424");                            //CHECK AFTER EXECUTION
       w.findElement(By.id("btnSaveGenInfo")).click();
       //Thread.sleep(6000);   
       
       // !! 3.2 LOCATIONS
       
       a.moveToElement(w.findElement(By.id("menu_admin_Organization"))).build().perform();
       w.findElement(By.id("menu_admin_viewLocations")).click();
       w.findElement(By.id("searchLocation_name")).sendKeys("Shivaji_Nagar786");                    //CHECK AFTER EXECUTION
       w.findElement(By.id("searchLocation_city")).sendKeys("PUNE NEW_836");                           //CHECK AFTER EXECUTION
       Select s12=new Select(w.findElement(By.id("searchLocation_country")));
       s12.selectByValue("IN");
       w.findElement(By.id("btnSearch")).click();
       
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.id("location_name")).sendKeys("GRAND HOTEL_202021");                              //CHECK AFTER EXECUTION
        Select s13 =new Select (w.findElement(By.id("location_country")));
        s13.selectByValue("IN");
        w.findElement(By.id("location_province")).sendKeys("MAHARASHTRA 2424");                          //CHECK AFTER EXECUTION
        w.findElement(By.id("location_city")).sendKeys("PARABHANI CITY802");                                 //CHECK AFTER EXECUTION
        w.findElement(By.id("location_address")).sendKeys("MUDHAGLESHWAR a GOD IS GREAT @128312");           //CHECK AFTER EXECUTION
        w.findElement(By.id("location_zipCode")).sendKeys("1239832023");
        w.findElement(By.id("location_phone")).sendKeys("123456780520122");
        w.findElement(By.id("location_fax")).sendKeys("248652633");
        w.findElement(By.id("location_notes")).sendKeys("THIS  LOCATION IS VERY POPOLAR IN INDIA FOR LORD MUDHAGALESHWAR NICE");
        w.findElement(By.id("btnSave")).click();
        w.findElement(By.id("ohrmList_chkSelectAll")).click();
       // w.findElement(By.id("btnDelete")).click();
        
        // !! 3.3 STRUCTURE
        
        a.moveToElement(w.findElement(By.id("menu_admin_Organization"))).build().perform();
        w.findElement(By.id("menu_admin_viewCompanyStructure")).click();
        w.findElement(By.name("btnEdit")).click();
        w.findElement(By.id("btnEdit")).click();
        //w.findElement(By.linkText("treeLink_edit_2")).click();//
        //w.findElement(By.linkText("treeLink_addChild_2")).sendKeys("BUSINESS REQUIREMENT SPECIFICATION");//
        
        
        //***** FOR QUALIFICATION (SECTION:4)
       
        //!! 4.1 SKILLS 
         
        a.moveToElement(w.findElement(By.id("menu_admin_Qualifications"))).build().perform();
        w.findElement(By.id("menu_admin_viewSkills")).click();
        w.findElement(By.id("btnAdd")).click();
        w.findElement(By.id("skill_name")).sendKeys(" S PRAYAS SOFTWARE TESTING 120");                                   //CHECK AFTER EXECUTION
        w.findElement(By.id("btnSave")).click();
        w.findElement(By.name("chkListRecord[]")).click();
        w.findElement(By.id("btnDel")).click();
        
     
        // !! 4.2 EDUCATION
     
        
        a.moveToElement(w.findElement(By.id("menu_admin_Qualifications"))).build().perform();
        w.findElement(By.id("menu_admin_viewEducation")).click();
        w.findElement(By.id("btnAdd")).click();
        w.findElement(By.name("education[name]")).sendKeys("POLYTECHNICALGRWPL");                              //CHECK AFTER EXECUTION
        w.findElement(By.id("btnSave")).click();
       // w.findElement(By.id("chkListRecord[]")).click();//
       // w.findElement(By.id("btnDel")).click();//
       
        // !! 4.3 LINCENSES
       
        a.moveToElement(w.findElement(By.id("menu_admin_Qualifications"))).build().perform();
        w.findElement(By.id("menu_admin_viewLicenses")).click();
        w.findElement(By.id("btnAdd")).click();
        w.findElement(By.name("license[name]")).sendKeys(" SOFTWARE TESTING CERTIFICATE 2021");                  //CHECK AFTER EXECUTION
        w.findElement(By.id("btnSave")).click();
        
  
      // !! 4.4 LANGUAGES
     
        //Actions a =new Actions(w); 
        a.moveToElement(w.findElement(By.id("menu_admin_Qualifications"))).build().perform();
        w.findElement(By.id("menu_admin_viewLanguages")).click();
        w.findElement(By.id("btnAdd")).click();
        w.findElement(By.name("language[name]")).sendKeys("MARATHI_Language24");                               //CHECK AFTER EXECUTION
        w.findElement(By.id("btnSave")).click();
     
     
        // !! 4.5 MEMBERSHIP
     
       //Actions a =new Actions(w); 
       a.moveToElement(w.findElement(By.id("menu_admin_Qualifications"))).build().perform();
       w.findElement(By.id("menu_admin_membership")).click();
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.id("membership_name")).sendKeys("Indian_SOCIETY 424");                                    //CHECK AFTER EXECUTION
       w.findElement(By.id("btnSave")).click();
       
       
       
       // ***** NATIONALITIES ***** (SECTION :5)
       // a.moveToElement(w.findElement(By.id("menu_admin_nationality"))).build().perform();
      // w.findElement(By.id("btnAdd")).click();
       //w.findElement(By.name("nationality[name]")).sendKeys("INDIA1");
       //w.findElement(By.name("btnSave")).click();
       
       // ***** CONFIGURATION *****(SECTION :6)
       
       // !! 6.1 EMAIL CONFIGURATION
       a.moveToElement(w.findElement(By.id("menu_admin_Configuration"))).build().perform();
       w.findElement(By.id("menu_admin_listMailConfiguration")).click();
       w.findElement(By.id("editBtn")).click();
       w.findElement(By.id("emailConfigurationForm_txtMailAddress")).sendKeys("admicsdnad@example.com");             //CHECK AFTER EXECUTION
       w.findElement(By.name("emailConfigurationForm[chkSendTestEmail]")).click();
       w.findElement(By.name("emailConfigurationForm[cmbMailSendingMethod]")).click();
       w.findElement(By.name("emailConfigurationForm[txtTestEmail]")).sendKeys("admidsnoks@example.com");                //CHECK AFTER EXECUTION
       w.findElement(By.id("editBtn")).click();
       
       // !! 6.2 EMAIL SUBSCRIPTION
       
       a.moveToElement(w.findElement(By.id("menu_admin_Configuration"))).build().perform();
       w.findElement(By.id("menu_admin_viewEmailNotification")).click();
      // w.findElement(By.id("btnEdit")).click();
       w.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[1]/a")).click();
       w.findElement(By.id("btnAdd")).click();
       w.findElement(By.name("subscriber[name]")).sendKeys("Students522");                                            //CHECK AFTER EXECUTION
       w.findElement(By.id("subscriber_email")).sendKeys("admidnamabre@example.com");                                     //CHECK AFTER EXECUTION
       w.findElement(By.id("btnSave")).click(); 
       
       // !! 6.3 LOCALIZATION
       a.moveToElement(w.findElement(By.id("menu_admin_Configuration"))).build().perform();
        w.findElement(By.id("menu_admin_localization")).click();
        w.findElement(By.id("btnSave")).click();
         Select s15 = new Select (w.findElement(By.id("localization_dafault_language")));
         s15.selectByValue("nl");
        // w.findElement(By.id("localization[use_browser_language]")).click();
         Select s16= new Select(w.findElement(By.id("localization_default_date_format")));
         s16.selectByValue("Y/m/d");
         w.findElement(By.id("btnSave")).click();
         
       // !! 6.4 LANGUAGE PACKAGES
         //Actions a =new Actions(w); 
        // a.moveToElement(w.findElement(By.id("menu_admin_Configuration"))).build().perform();
       //  w.findElement(By.id("menu_admin_languagePackage")).click();
       //  w.findElement(By.id("btnAdd.")).click();
         //Select s17 = new Select (w.findElement(By.id("addLanguagePackage_name")));
         //s17.selectByValue("en_MY");                                                   // CHECK HERE ONCE AGAIN AFTER EXECUTE THE CODE ar_DZ,ar_TD, ar_KM,ak_GH
        // w.findElement(By.id("btnSave")).click();
         
       // !! 6.5  MODULES  
         a.moveToElement(w.findElement(By.id("menu_admin_Configuration"))).build().perform();
         w.findElement(By.id("menu_admin_viewModules")).click();
         w.findElement(By.name("btnSave")).click();
         w.findElement(By.name("moduleConfig[leave]")).click();
         w.findElement(By.name("moduleConfig[time]")).click();
         w.findElement(By.name("moduleConfig[performance]")).click();
         w.findElement(By.name("moduleConfig[recruitment]")).click();
         w.findElement(By.name("moduleConfig[mobile]")).click();
         w.findElement(By.id("btnSave")).click();
         
         
         // !! 6.6 SOCIAL MEDIA AUTHENTICATION
         
         a.moveToElement(w.findElement(By.id("menu_admin_Configuration"))).build().perform();
         w.findElement(By.id("menu_admin_openIdProvider")).click();
         w.findElement(By.id("btnAdd")).click();
         Select s18 =new Select (w.findElement(By.id("openIdProvider_type")));
         s18.selectByValue("1");
         w.findElement(By.id("openIdProvider_name")).sendKeys("GOD UNIVERSE 112222");                        //CHECK AFTER EXECUTION
         w.findElement(By.id("openIdProvider_url")).sendKeys("https://opensource-demo.orangehrmlive.com/index.php/admin/openIdProvider");
         w.findElement(By.id("btnSave")).click();
         
         // !! 6.7 REGISTER OAUTH CLIENT
         
         a.moveToElement(w.findElement(By.id("menu_admin_Configuration"))).build().perform();
         w.findElement(By.id("menu_admin_registerOAuthClient")).click();
         w.findElement(By.id("oauth_client_id")).sendKeys("1201214");
         w.findElement(By.id("oauth_client_secret")).sendKeys(" AUTOMATION ORANGE HRM WEBSITE");               //CHECK AFTER EXECUTION
         w.findElement(By.id("oauth_redirect_uri")).sendKeys(" *** WELCOME TO EVERYONE***");                   //CHECK AFTER EXECUTION
         w.findElement(By.id("btnSave")).click();
         w.findElement(By.id("btnSave")).click();
         
         System.out.println(" ***** Finish ***** ");
         
         w.close();
         
         
	}

}
