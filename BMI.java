public class BMI {
    static final double KG = 0.45359237;
    static final double METRES = 0.0254;

    private double weight;
    private double height;


    public BMI() {
    }


    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        double weightKg = this.weight * KG;
        double heightMetre = this.height * METRES;
        double bmi = weightKg / (heightMetre * heightMetre);
        return bmi;
    }

    public String getInterpretation(){
        double bmi = this.getBMI();
        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25.0){
            return "Normal";
        }
        else if(bmi >= 25.0 && bmi < 30.0){
            return "Overweight";
        }
        else if(bmi >= 30){
            return "Obese";
        }
        return "Error";
    }
}