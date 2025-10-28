package Array;

public class TestArray {

    public static void main(String[] args) {
        ArrayUtils a = new ArrayUtils(3);

        a.append(0);
        a.append(1);
        a.append(2);
        a.append(5);
        System.out.println(a.isFull());
        a.traverseItems();
        a.searchItem(0);
        a.searchItem(7);
        System.out.println(a.isItemFound(0));
        System.out.println(a.isItemFound(9));

        // ArrayUtils b = new ArrayUtils(5);
        ArrayUtils b = new ArrayUtils(10);

        b.append(0);
        b.append(1);
        b.append(3);
        b.append(4);
        b.append(5);
        b.traverseItems();
        b.insert(2, 2);
        b.traverseItems();
        b.deleteLastItem();
        b.traverseItems();
        b.append(5);
        b.traverseItems();
        b.deleteItemAtspecificIndex(3);
        b.traverseItems();



        ArrayUtils c=new ArrayUtils(2);
        c.append(0);
        c.append(1);
        c.enlargeArray(5);
       System.out.println("enlargeeed");
        c.append(5);
        c.append(4);
        a.append(3);
        c.append(0);
        c.traverseItems();
        System.out.println(c.itemsCount);


    }

}

