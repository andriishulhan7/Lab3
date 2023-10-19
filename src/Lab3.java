import java.util.Scanner;


public class Lab3 {
    public static void main(String[] args)
    {
        //===============Task 1==========================
        System.out.println("Task1");

        float firstNumber = 0, secondNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        if(input.hasNextFloat())
            firstNumber = input.nextFloat();
        System.out.println("Enter second number");
        if(input.hasNextFloat())
            secondNumber = input.nextFloat();

        float sum = firstNumber + secondNumber;
        float diff = firstNumber - secondNumber;
        float product = firstNumber * secondNumber;
        float quotient = firstNumber / secondNumber;

        System.out.printf("sum = %.2f\n",sum);
        System.out.printf("difference = %.2f\n",diff);
        System.out.printf("product = %.2f\n",product);
        System.out.printf("quotient = %.2f\n",quotient);

        //===============Task 2==========================
        System.out.println("\nTask 2");

        float height = 0, weight = 0, BMI = 0;
        System.out.println("Enter height in cm");
        if(input.hasNextFloat())
            height = input.nextFloat();
        System.out.println("Enter weight in kg");
        if(input.hasNextFloat())
            weight = input.nextFloat();

        BMI = weight / ((float)Math.pow(height * 0.01f,2));
        System.out.printf("Your BMI category is ");
        if(BMI < 16.f)
            System.out.println("starvation");
        else if(BMI >= 16.f && BMI <= 16.99)
            System.out.println("emaciation");
        else if(BMI >= 17.f && BMI <= 18.49)
            System.out.println("underweight");
        else if(BMI >= 18.5f && BMI <= 22.99)
            System.out.println("normal, low range");
        else if(BMI >= 23.f && BMI <= 24.99)
            System.out.println("normal, high range");
        else if(BMI >= 25.f && BMI <= 27.49)
            System.out.println("overweight, low range");
        else if(BMI >= 27.5f && BMI <= 29.99)
            System.out.println("overweight, high range");
        else if(BMI >= 30.f && BMI <= 34.9)
            System.out.println("1st degree obesity");
        else if(BMI >= 35.f && BMI <= 39.9)
            System.out.println("2nd degree obesity");
        else if(BMI >= 40)
            System.out.println("3rd degree obesity");
        System.out.printf("Your BMI index is %.1f\n",BMI);
        //==============================Task3=============================
        System.out.println("\nTask 3");
        System.out.println("Find roots of ax² + bx + c = 0");
        float a = 1, b =1, c = 1;

        System.out.println("Enter a");
        if(input.hasNextFloat())
            a = input.nextFloat();
        System.out.println("Enter b");
        if(input.hasNextFloat())
            b = input.nextFloat();
        System.out.println("Enter c");
        if(input.hasNextFloat())
            c = input.nextFloat();

        float discriminant = ((float)Math.pow(b,2)) - 4 * a * c;
        if(discriminant < 0)
            System.out.println("Equation has no roots");
        else if(discriminant == 0) {
            float x = -b / 2*a;
            System.out.printf("Equation has one root (x = %.1f)",x);
        }
        else if(discriminant > 0) {
            float squared_discriminant = (float)Math.sqrt(discriminant);
            float x1 = (-b + squared_discriminant)/2*a,
                    x2 = (- b - squared_discriminant)/2*a;

            System.out.printf("Equation has two roots (x1 = %.2f) and (x2 = %.2f)",x1,x2);
        }

    }
}
