package MyProject.PackageP2;


import MyProject.PackageP1.Package1;

public class Package2 extends Package1 {
    public void show() {
        System.out.println(name);

//        System.out.println(age);

        System.out.println(isMarried);
    }

    static void main(String[] args) {
        Package2 obj = new Package2();
        obj.show();
    }
}
