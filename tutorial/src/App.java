import polymorphism.Plant;
import polymorphism.Tree;

public class App {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = plant1;
        Plant plant3 = tree;

        plant2.grow();
        plant3.grow();

        double d = 3.33;
        int i = (int)d;
        System.out.println(i);  //outputs 3;



    }


}
