public class Main {

    public static void main(String[] args) throws Exception {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.calculate();
        AgricultureCreditManager agricultureCreditManager = new AgricultureCreditManager();
        agricultureCreditManager.calculate();
        CreditUI creditUI = new CreditUI();
        creditUI.CreditCalculate(teacherCreditManager);
        creditUI.CreditCalculate(agricultureCreditManager);
    }
    
}
