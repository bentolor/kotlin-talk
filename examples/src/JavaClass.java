public class JavaClass {
    public static void main(String[] args) {
        new JavaClass().callKotlinClass();
    }

    void callKotlinClass() {
        KotlinClass kotlinClass = new KotlinClass(this);
        kotlinClass.callJavaClassMethod();
    }

    public String getValueFromJavaClass() {
        return "Hi from Java!";
    }

    public void printInJavaClass(String text) {
        System.out.println(text);
    }
}
