 class Premium
 {
     public static void main(String[]args)
         {
            int age=25;
            System.out.println("Enter your age="+age);
            String  gender="male";
            System.out.println("Enter your gender="+gender);
            int healthinsurens=50000;
            System.out.println("Enter your Health Insurens="+healthinsurens);
            byte policyterm=3;
            System.out.println("Enter your policy Term="+policyterm);
            String region="city";
            String healthcondition="Good";
            double premiumrate=0.004;
            System.out.println("Enter your Premium Rate="+premiumrate);      
            double healthinsurensprice=healthinsurens*premiumrate;
            System.out.println("Enter your Health Insurens Price ="+ healthinsurensprice);
                 if(25>=age && age<=35 && region=="city" && healthcondition=="Good" && policyterm>=2 && gender=="Female")
                  {
                        System.out.println("The Male person is eligible for 2 lakh Health Insurens");
                  }
                     else
                      {
                        System.out.println("The Female person is  eligible for 1 lakh Health Insurens");
                      }
      }
}

