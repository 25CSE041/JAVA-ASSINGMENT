class Patient
{
    String name;
    double height;
    double weight;

    Patient(String n, double h, double w)
    {
        name = n;
        height = h;
        weight = w;
    }

    public void show()
    {
        System.out.println("Patient name" + name);
        System.out.println("height" + height);
        System.out.println("Patient weight" + weight);
    }

    public double computeBMI()
    {
        return weight / (height * height);
    }

    public static void main(String args[])
    {
        Patient ob = new Patient("Sima", 1.6, 60);

        ob.show();

        System.out.println("BMI = " + ob.computeBMI());
    }
}