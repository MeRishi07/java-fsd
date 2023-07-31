package Assisted_Practice_Projects;

public class Practice_Project7 {
    private int outerData;

    public Practice_Project7(int outerData) {
        this.outerData = outerData;
    }

    // Inner class
    public class InnerClass {
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        public void display() {
            System.out.println("Outer Data: " + outerData);
            System.out.println("Inner Data: " + innerData);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        Practice_Project7 outerObj = new Practice_Project7(10);

        // Creating an instance of the inner class
        InnerClass innerObj = outerObj.new InnerClass(20);

        // Calling the display method of the inner class
        innerObj.display();
    }
}

